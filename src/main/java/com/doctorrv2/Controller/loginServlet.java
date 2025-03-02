package com.doctorrv2.Controller;

import com.doctorrv2.DAO.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class loginServlet extends HttpServlet {
    private UserDAO userDAO;

    @Override
    public void init() throws ServletException {
        userDAO = new UserDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Forward to login page
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        try {
            if (userDAO.validateUser(email, password)) {
                // Valid user → create session and redirect to dashboard
                HttpSession session = req.getSession();
                session.setAttribute("user", email);
                resp.sendRedirect("Dashbord.jsp"); // Ensure filename matches exactly
            } else {
                // Invalid user → return to login page with error message
                req.setAttribute("errorMessage", "User not found. Please check your email and password.");
                req.getRequestDispatcher("login.jsp").forward(req, resp);
            }
        } catch (SQLException e) {
            throw new ServletException("Database error during login", e);
        }
    }
}

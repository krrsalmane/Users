package com.doctorrv2.Controller;

import com.doctorrv2.DAO.UserDAO;
import com.doctorrv2.Model.User;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.SQLException;

@WebServlet("/SignUp")
public class SignUpServlet extends HttpServlet {
    private UserDAO userDAO = new UserDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Forward the request to the existing registration HTML form
        RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
        dispatcher.forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get form parameters
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String role = request.getParameter("role");
        String specialization = request.getParameter("specialization");

        // Create a user object
        User user = new User(fullName, email, password, phone, role, specialization);

        try {
            // Register the user
            userDAO.registerUser(user);
            // Redirect to a success page (or show a success message)
            response.sendRedirect("login.jsp");
        } catch (SQLException e) {
            // Handle any SQL exceptions and show an error message
            e.printStackTrace();
            response.getWriter().println("<h1>Error during registration: " + e.getMessage() + "</h1>");
        }
    }
}

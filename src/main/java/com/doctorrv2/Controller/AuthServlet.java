package com.doctorrv2.Controller;




import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/Dashbord.jsp")
public class AuthServlet implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession(false);


        if (httpRequest.getSession(false).getAttribute("user")==null) {
            httpResponse.sendRedirect("Login.jsp");
        } else {
            chain.doFilter(request, response);
        }
    }


    public void destroy() {}
}






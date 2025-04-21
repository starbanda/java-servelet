package com.bridgeLabz;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/greetings")  // The URL pattern for this servlet
public class GreetingsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello, Welcome to Java Servlet!</h1>");
        out.println("<p>Have a great day!</p>");
        out.println("</body></html>");
    }
}

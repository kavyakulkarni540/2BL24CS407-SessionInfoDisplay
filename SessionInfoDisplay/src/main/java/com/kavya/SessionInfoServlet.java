package com.kavya;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/sessionInfo")
public class SessionInfoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(true);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String action = request.getParameter("action");

        out.println("<html><body>");
        out.println("<h2>Session Information Display</h2>");

        if ("invalidate".equals(action)) {
            session.invalidate();
            out.println("<h3>Session invalidated successfully.</h3>");
            out.println("<br><a href='index.html'>Create New Session</a>");
        } else {
            out.println("<table border='1' cellpadding='10'>");
            out.println("<tr><td>Session ID</td><td>" + session.getId() + "</td></tr>");
            out.println("<tr><td>Is New Session?</td><td>" + session.isNew() + "</td></tr>");
            out.println("<tr><td>Creation Time</td><td>" + new Date(session.getCreationTime()) + "</td></tr>");
            out.println("<tr><td>Last Accessed Time</td><td>" + new Date(session.getLastAccessedTime()) + "</td></tr>");
            out.println("<tr><td>Maximum Inactive Interval</td><td>" + session.getMaxInactiveInterval() + " seconds</td></tr>");
            out.println("</table>");

            out.println("<br><a href='sessionInfo'>Refresh Session Info</a>");
            out.println("<br><br><a href='sessionInfo?action=invalidate'>Invalidate Session</a>");
        }

        out.println("</body></html>");
    }
}
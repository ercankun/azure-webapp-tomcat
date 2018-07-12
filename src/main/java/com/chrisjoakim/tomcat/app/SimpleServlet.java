package com.chrisjoakim.tomcat.app;

import org.apache.log4j.Logger;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 */
public class SimpleServlet extends HttpServlet {

    final static Logger logger = Logger.getLogger(SimpleServlet.class);

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("Cool Beans!");
        out.flush();
        out.close();
    }

}

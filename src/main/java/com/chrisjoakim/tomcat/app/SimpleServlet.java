package com.chrisjoakim.tomcat.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 *
 */
public class SimpleServlet extends HttpServlet {

    final static Logger logger = Logger.getLogger(SimpleServlet.class);

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("Hello World!");
        out.flush();
        out.close();
    }

}

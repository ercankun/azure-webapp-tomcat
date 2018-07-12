package com.chrisjoakim.tomcat.app;

import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 */
public class PingServlet extends HttpServlet {

    final static Logger logger = Logger.getLogger(SimpleServlet.class);

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HashMap<String, Object> obj = new HashMap<String, Object>();
        Date date = new Date();
        obj.put("date", date);
        obj.put("epoch", date.getTime());
        
        Enumeration<String> e = getServletConfig().getInitParameterNames();
        while (e.hasMoreElements()) {
          String name = (String)e.nextElement();
          obj.put("init_param_" + name, getServletConfig().getInitParameter(name));
        }
        
        e = request.getHeaderNames();
        while (e.hasMoreElements()) {
			String name = (String) e.nextElement();
			obj.put("header_" + name, request.getHeader(name));
        }
        
        obj.put("server_name",    request.getServerName());
        obj.put("server_port",    request.getServerPort());
        obj.put("remote_address", request.getRemoteAddr());
        obj.put("remote_host",    request.getRemoteHost()); 
        
        ObjectMapper objectMapper= new ObjectMapper();

        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_OK);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(objectMapper.writeValueAsString(obj));
    }

}

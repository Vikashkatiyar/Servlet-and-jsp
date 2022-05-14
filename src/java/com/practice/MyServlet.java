/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vikash katiyar
 */
public class MyServlet extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        System.out.println("this is my doget method that extends to HttpServlet");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h1> this is get method in mYservlet</h1>");
        out.println(new Date().toString());
        
    }

    
    
}

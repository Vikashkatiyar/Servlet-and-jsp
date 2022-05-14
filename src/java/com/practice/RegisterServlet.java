/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.practice;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;        

/**
 *
 * @author vikash katiyar
 */
public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
      out.println("<h2>Welcome to Register Servlet</h2>");
      
      String name=request.getParameter("user_name");
      String password=request.getParameter("user_password");
      String email=request.getParameter("user_email");
      String gender=request.getParameter("user_gender");
      String course=request.getParameter("user_course");
      String cond=request.getParameter("condition");
      out.println(cond);
      
      
      if(cond!=null){
            if(cond.equals("checked")){
                out.println("<h2> Name : "+ name +"</h2>");
                out.println("<h2> Password : "+ password +"</h2>");
                out.println("<h2> Email : "+ email +"</h2>");
                out.println("<h2> Gender : "+ gender +"</h2>");
                out.println("<h2> Course : "+ course +"</h2>");

                //
                //JDBC
                // let us assume that data is saved in data base 
                
                RequestDispatcher rd=request.getRequestDispatcher("success");
                rd.forward(request,response);//it basically forward the request to success url servlet
                
                
            }
            else{
                out.println("<h2>you have not accepted terms and conditions<h2>");
            }
      }
      else{
            out.println("<h2>you have not accepted terms and conditions<h2>");
            //I wnat to include output of index.html
            // get the object of RequestDisptacher
            RequestDispatcher rd=request.getRequestDispatcher("index.html");
            rd.include(request, response);//it basically include output of index.html page
      }



    
    }  

}

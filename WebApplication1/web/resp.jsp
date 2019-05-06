<%-- 
    Document   : resp
    Created on : 24/01/2019, 12:16:33 PM
    Author     : Hugo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         
 Hola <% 
      String text1 = request.getParameter("text1");
     out.println(text1);  %> tus comentarios han sido recibidos. <% 
     out.println("<br>"+"<br>");  %>
     
     Nos comunicaremos contigo en breve al correo: <% 
      String text2 = request.getParameter("text2");
     out.println(text2); %>
    </body>
</html>

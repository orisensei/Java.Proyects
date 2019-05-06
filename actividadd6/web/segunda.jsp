<%-- 
    Document   : segunda
    Created on : 26/02/2019, 12:14:02 AM
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
        <h1>Segundo JSP</h1>
        <%
            
                long factorial = 0;
              
                factorial = 7*6*5*4*3*2*1;
                
                out.println("factorial de 7 es: "+ factorial);
                
        %>
         <br><br>
        <form name="lux" action="tercera.jsp">
         <input type="submit" name="boton" value="Siguiente"/> 
        </form>
    </body>
</html>

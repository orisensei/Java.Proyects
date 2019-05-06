

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Primer JSP</h1>
        <%= new java.util.Date()%>
        <br><br>
        <%
             String mayus = new String("esto es mayusculas");
             out.println(mayus.toUpperCase() );
        
        %>
        <br><br>
        <%
         int numero1 = 1, numero2 = 2;
         
         int resultado = numero1 + numero2;
         
         out.println(" 1 + 2 = "+ resultado);
        %>
        <br><br>
        <%
         
         int azar = (int)(Math.random()* 10); 
         
         out.println("Numero al azar es: "+azar);
        %>
        <br><br>
        <form name="lux" action="segunda.jsp">
         <input type="submit" name="boton" value="Siguiente"/> 
        </form>
    </body>
</html>

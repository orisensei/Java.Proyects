<%-- 
    Document   : index
    Created on : 26/02/2019, 02:37:42 PM
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
        <h1>Generador de RFC</h1>
          <form name="forma1" method="post" action="index.jsp">
         <div>
         
             <p>Escribe tu nombre:</p>
          
         <b class="df">Nombre:</b><br>
         <input type="text" name="nombre"/><br><br>
         
          <b class="df">Primer apellido:</b><br>
         <input type="text" name="a1"/><br><br>
         
          <b class="df">Segundo apellido:</b><br>
         <input type="text" name="a2"/><br><br>
         
          <p>Escribe tu fecha de nacimiento:</p>
          
             <b class="df">Año:</b><br>
         <input type="text" name="year"/><br><br>
         
          <b class="df">Mes:</b><br>
         <input type="text" name="month"/><br><br>
         
          <b class="df">Dia:</b><br>
         <input type="text" name="day"/><br><br>
       
          <input type="submit" name="boton1" value="Enviar" id="ds" class="xd"/> 
          </div>
         </form>  
        
         <%
            String Texto0 = request.getParameter("nombre");
            String Texto1 = request.getParameter("a1");
            String Texto2 = request.getParameter("a2");
            String Texto3 = request.getParameter("year");
            String Texto4 = request.getParameter("month");
            String Texto5 = request.getParameter("day");
         
            if (Texto0 == null || Texto1 == null || Texto2 == null
                    || Texto3 == null || Texto4 == null || Texto5 == null) {

            } else { 
            if (Texto0.length() == 0 || Texto1.length() == 0|| 
                    Texto2.length() == 0 || Texto3.length() == 0 ||
                    Texto4.length() == 0 || Texto5.length() == 0) {

            %>
            <b>no hay datos completos</b>
            <% } else { 
        
            %>
           
                <%
                    }
                    }
                 %>
        
        
        
    </body>
</html>

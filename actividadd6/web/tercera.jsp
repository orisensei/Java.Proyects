<%-- 
    Document   : tercera
    Created on : 26/02/2019, 12:27:56 AM
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
        <h1>Tercer JSP</h1>
        
          <form name="forma1" method="post" action="tercera.jsp">
         <div>
         
         <b class="df">Numero:</b><br>
         <input type="text" name="usuario" /><br><br>
       
          <input type="submit" name="boton1" value="calcular" id="ds" class="xd"/> 
          </div>
         </form>     
        <br>
        <%
            String Texto = request.getParameter("usuario");
         
            if (Texto == null) {

            } else { 
            if (Texto.length() == 0) {

            %>
            <b>no hay numero</b>
            <% } else { 
                 int num = Integer.parseInt(Texto);
                 long factorial = 1;
                  for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
            %>
            <b>El factorial de <%= num%> es: <%= factorial %></b>
                <%
                    }
                    }
                 %>
                 <br><br>
                   <form name="forma2" method="post" action="cuarta.jsp">                    
         <div>    
          <input type="submit" name="boton2" value="siguiente" class="xd"/> 
          </div>
         </form>
    </body>
</html>

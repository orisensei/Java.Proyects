<%-- 
    Document   : seg
    Created on : 17/02/2019, 12:50:46 AM
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
        <% 
            String dato=request.getParameter("datos");
            
         int datos = Integer.parseInt(dato);
            int azar = (int)(Math.random()*100+0);  
            
             if(azar > datos)
             {                                     
                 out.println("Estas lejos arriba");                     
             }
             else if(azar < datos)
             {                  
                 out.println("Estas lejos abajo");                         
             }      
             else if(azar == datos)
             {                    
                  out.println("adivinaste");                                 
             }
        %> 
         <br><br> 
         <form name="tarea4" action="index.html">
              <input type="submit" name="boton" value="Regresar"/>  
         </form>
            
    </body>
</html>

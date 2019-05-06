<%-- 
    Document   : segunda
    Created on : 15/02/2019, 10:29:21 PM
    Author     : Hugo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>

    </style>
    <body>     
        <%
            String dato=request.getParameter("dato");
            String boton=request.getParameter("boton");
            int contador1 = 0,contador2 = 0,contador3 = 0,contador4 = 0,contador5 = 0,contador6 = 0;   
            int azar = (int)(Math.random()*3+1);   
            
            switch(dato){
                case "Piedra": 
                
                    if(1 < azar && azar == 2)
                    {
                                             
                        contador2 = 1;
                        contador1 = 1;
                        
                    }
                    else if(1 < azar && azar == 3)
                    {
                        
                         contador2 = 2;
                         contador1 = 1;
                         
                    }      
                    else
                    {
                        contador2 = 3;
                        contador1 = 1;
                        
                        
                    }
                    
                    break;
                case "Papel": 
                    
                    if(2 < azar && azar == 3)
                    {
                        
                         contador2 = 1;
                         contador1 = 2;
                         
                    }
                    else if(2 > azar && azar == 1)
                    {
                         
                         contador2 = 2;
                         contador1 = 2;
                         
                    }      
                    else
                    {
                         contador2 = 3;
                         contador1 = 2;
                        
                         
                    }   
                    break;
                case "Tijeras": 
                    if(3 > azar && azar == 1)
                    {
                        
                        contador2 = 1;
                        contador1 = 3;
                        
                       
                    }
                    else if(3 > azar && azar == 2)
                    {
                         
                        contador2 = 2;
                        contador1 = 3;
                        
                    }      
                    else
                    {
                         contador2 = 3; 
                         contador1 = 3;
                         
                       
                    }                   
                    break;
                default: 
                        out.println("Error");
                    break;
            }        
        %>
        <br>
        <table class="egt">

            
            <tr><td></td><td>Jugador</td><td>Maquina</td></tr>
            <tr>     
            <td>Jugadores:</td>
            <td><%if(contador1 == 1){
                out.println("Piedra");               
            }
             else if (contador1 == 2){
                out.println("Papel");
            }
            else if(contador1 == 3){
                out.println("Tijeras");
            }
            %></td>
            <td><%if(azar == 1){
                out.println("Piedra");
            }
             else if (azar == 2){
                out.println("Papel");
            }
            else if(azar == 3){
                out.println("Tijeras");
            }
            %></td>
            </tr>    
            <tr>               
            <td>Ganador de la Jugada:</td>

            <td><%if(contador2 == 2){
                out.println("Jugador");
            }
            else if (contador2 == 1){
                out.println("Maquina");
            }
            else if(contador2 == 3){
                out.println("Empatados");
            }%></td>
            <td></td>
            </tr>
            <tr>
                <td>Jugadas Ganadas</td>
                <td>
             
                </td>
                <td>
                    
                </td>
            </tr>
              <tr>
                <td>Jugadas Empatadas</td>
                <td>
             
                </td>
                <td>
                    
                </td>
            </tr>
              <tr>
                <td>Partidas Ganadas</td>
                <td>
             
                </td>
                <td>
                    
                </td>
            </tr>
              <tr>
                <td>Partidas Empatadas</td>
                <td>
             
                </td>
                <td>
                    
                </td>
            </tr>
            </table>
        <form name="avt4" action="index.html">
            <br><input type="submit" name="boton" value="Volver"/> 
        </form>
    </body>
</html>

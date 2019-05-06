<%-- 
    Document   : carrito
    Created on : 20/02/2019, 10:42:14 PM
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
        <style>

        table {
  border-collapse:collapse;
  border:1px solid #CCC;
}
/* Espacio de relleno en celdas y cabeceras */
td, th {
  padding:10px;
}
/* Modificación de estilos en cabeceras */
th {
  background:#000;
  color:#FFF;
  text-transform:uppercase;
}
/* Modificación de estilos en celdas */
td {
  text-align:center;
  border-bottom:2px solid #111;
  color:#333;
  font-size:18px;
}

 body{
           background-color: graytext;
       }
             div
            {
                margin: 10% 17%;
                height: 390px;
                width: 370px;
                border: 7.2px solid pink;               
                background-color: #33ccff;
                padding: 4%; 
                border: none;
                border-radius: 25px;
                box-shadow: 0 9px #999;
            }
              .xd 
              {
                display: inline-block;
                padding: 15px 75px;
                font-size: 24px;
                cursor: pointer;
                text-align: center;
                text-decoration: none;
                outline: none;
                color: yellow;
                background-color: black;
                border: none;
                border-radius: 15px;
                box-shadow: 0 9px #999;
                font-family: Crewniverse;
               } 
               
                 .xd1 
              {
                display: inline-block;
                padding: 15px 55px;
                font-size: 24px;
                cursor: pointer;
                text-align: center;
                text-decoration: none;
                outline: none;
                color: black;
                background-color: white;
                border: none;
                border-radius: 15px;
                box-shadow: 0 9px #999;
               }
               .df{font-size: 24px;}
               .dft{font-size: 44px;}
        </style>
      
        <form name="formal" action="final.jsp">
         <div>
             <table class="egt">
         <tr>               
            <td class="dft">Compras</td>
           </tr>
           <tr>
            <td>La divina comedia</td>
           </tr>
           <tr>
            <td>El festival de la blasfemia</td>
           </tr>
           <tr>
            <td>Luna de pluton</td>
           </tr>
           <tr>
            <td>La guerra de ysaak</td>
           </tr>
           <tr>
            <td>Colorin dot</td>
            </tr>
            </table>
             
            <br><input type="submit" name="boton" value="Pagar" class="xd"/> 
         </form>
    </body>
</html>

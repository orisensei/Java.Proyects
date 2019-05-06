<%-- 
    Document   : time
    Created on : 24/01/2019, 08:55:12 AM
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
       <h1>Datos de contacto</h1>
   </form><br/>

   <form name="form1" action="resp.jsp" method="POST">
      Nombre:
      <input type="text" name="text1" maxlength="10" size="15" />
      <br/>

      Email:
      <input type="text" name="text2" maxlength="10" size="20"/>
      <br/>
        telefono:
      <input type="text" name="text3" maxlength="10" size="20" />
      <br/>
     comentario:
      <input type="text" name="text4" maxlength="10" size="20" />
      <br/>
      <input value="Enviar" type="submit" />
   </form>
 
    </body>
</html>

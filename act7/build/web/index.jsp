<%-- 
    Document   : index
    Created on : 06-mar-2019, 18:23:50
    Author     : laboratorio1
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Actividad 7!</h1>
        <%
          //  ArrayList<String> nombre = new ArrayList<String>();
            int [] id = new int[10];
            String [] nombre1 = new String [10];
            String [] rol = new String [10];
            
                id[0] = 1;
                id[1] = 2;
                id[2] = 3;
                id[3] = 4;
                
                nombre1[0] = "Luis M";
                nombre1[1] = "Jaime M";
                nombre1[2] = "fer M";
                nombre1[3] = "checo M";
                
                rol[0] = "arquitecto";
                rol[1] = "carpintero";
                rol[2] = "plomero";
                rol[3] = "doctor";
                
                
        %>
        <head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>

<table style="width:100%">
  <tr>
    <th>ID</th>
    <th>Nombre</th> 
    <th>Ocupación</th>
  </tr>
  <tr>
    <td><%out.println(id[0]);%></td>
     <td><%out.println(nombre1[0]);%></td>
    <td><%out.println(rol[0]);%></td>   
  </tr>
  <tr>
   <td><%out.println(id[1]);%></td>
     <td><%out.println(nombre1[1]);%></td>
    <td><%out.println(rol[1]);%></td> 
  </tr>
  <tr>
    <td><%out.println(id[2]);%></td>
     <td><%out.println(nombre1[2]);%></td>
    <td><%out.println(rol[2]);%></td> 
  </tr>
</table>
  
</body>
    </body>
</html>

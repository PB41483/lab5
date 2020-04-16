<%-- 
    Document   : personList
    Created on : 2020-03-31, 14:47:01
    Author     : pb41483
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 5</title>
    </head>
    <body>
        <h1> Tabelka Osob</h1>
       <table border=1>
         <thead>
         <th>Firstname</th><th>Lastname</th> <th>emailAddress</th>
            </thead>
      <c:forEach items="${sessionScope.Studenci}" var="osoba">
    <p>
   
       
        <tr>
            
            <td><c:out value="${osoba.getFirstName()}"/> </td><td><c:out value="${osoba.getLastName()}"/> </td><td><c:out value="${osoba.getemailAddress()}"/> </td>
        </tr>
   
    </p>
</c:forEach>
         
    </table>
     <form action='/lab5v4/list' method='post'>
    Imie:
    <input type='text' name='imie'><br>
    Naziwsko:
    <input type='text' name='nazwisko'><br>
    Email:
    <input type='text' name='email'><br>
    <input type='submit'>
</form>
        
        <br>
        <a href="/lab5v4/index.html"> Powrót </a>
    </body>
</html>

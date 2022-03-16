<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Results</title>
</head>
<body>

<p><a href="leads">Create New Lead</a></p>
   <h2>All Leads</h2>
   <table>
   <tr>
   <th>firstName</th>
   <th>lastName</th>
   <th>company</th>
   <th>email</th>
   <th>mobile</th>
   <th>lead Source</th>
   
   <c:forEach items="${leads}" var="lead">
   <tr>
   <td><a href="getLeadInfo?id=${lead.id}">${lead.firstName}</a></td>
   <td>${lead.lastName}</td>
   <td>${lead.company}</td>
   <td>${lead.email }</td>
   <td>${lead.mobile}</td>
   <td>${lead.leadSource}</td>
   </tr>
   </c:forEach>
   
   </table>
   
</body>
</html>
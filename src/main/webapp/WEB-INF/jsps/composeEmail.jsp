<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file="Menu.jsp" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose....</title>
</head>
<body>
     <form action="send" method="post">
     <pre>
         to<input type="text" name="toEmail" value="${email }"/>
         subject<input type="text" name="subject"/>
         
         <textarea name="emailBody" rows="10" cols="50">
             
         
         </textarea>
        <input type="submit" value="send"/>


</pre>
      </form>
</body>
</html>
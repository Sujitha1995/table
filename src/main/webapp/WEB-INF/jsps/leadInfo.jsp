<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lead infor...</title>
</head>
<body>
<h2> Lead Information....</h2>
 First Name:${lead.firstName }<br/>
 Last Name:${lead.lastName }<br/>
 Company:${lead.company }<br/>
 Email:${lead.email }<br/>
 Mobile:${lead.mobile }<br/>
 LeadSource:${lead.leadSource}<br/>

<form action="sendEmail" method="post">
     <input type="hidden"  name="email" value="${lead.email }"/>
     <input type="submit" value="send email"/>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create</title>
</head>
<body>

<h2>Enter Customer Info....</h2>
<form action="saveLead" method="post">
<pre>
   First Name<input type="text" name="firstName"/>
   Last Name<input type="text"  name="lastName"/>
   Company<input type="text"    name="company"/>
   Email<input type="text"      name="email"/>
   Mobile<input type="text"     name="mobile"/>
       
       <label for="leadsSource">Choose Leads Source:</label>
       
        <select name="LeadSource" id="leads">
           <option value="paper Ads">Paper Ads</option>
            <option value="tv Ads">TV Ads</option>
         <option value="online">Online</option>
         <option value="radio">Radio</option>
         </select>
         <input type="submit" value="save lead"/>
</pre>
</form>
${msg}
</body>
</html>
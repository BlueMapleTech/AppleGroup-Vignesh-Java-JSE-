<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddUserField" method="post">
   USERNAME:<input type="text" name="username"> <br/>
PASSWORD:<input type="password" name="password"><br/>
e-mail:<input type="email" name="email"><br/>
CONTACT NUMBER:<input type="number" name="contactnumber"><br/>
FIRST-NAME:<input type="text" name="firstname"><br/>
LAST-NAME:<input type="text" name="lastname"><br/>
ADDRESS:<input type="text" name="address"><br/>
   Role:<select name=role>
     <option value="admin">admin</option>
     <option value="user">user</option>
     </select>
     <input type="submit" value="create">
</form> 
</body>
</html>
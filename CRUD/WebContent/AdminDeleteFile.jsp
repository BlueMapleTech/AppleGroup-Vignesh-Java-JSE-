<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
function validateForm() {
    var email = document.forms["myForm"]["email"].value;
    if (email == null || email == "") {
        text="email must be filled out";
        document.getElementById("demo").innerHTML = text;
        return false;
    }
}
    </script>
<body>
<form name="myForm" action="AdminDelete" onsubmit="return validateForm()" method="post">
email:<input type="email" name="email">

<input type="submit" value="go">
<p id="demo"></p>
</form>
</body>
</html>
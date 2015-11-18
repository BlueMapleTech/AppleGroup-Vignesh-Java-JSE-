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
    var username = document.forms["myForm"]["username"].value;
    if (username == null || username == "") {
        text="Name must be filled out";
        document.getElementById("demo").innerHTML = text;
        return false;
    }
    var password = document.forms["myForm"]["password"].value;
    if (password == null || password == "") {
        text="password must be filled out";
        document.getElementById("demo").innerHTML = text;
        return false;
    }
    var contactnumber = document.forms["myForm"]["contactnumber"].value;
    if (contactnumber == null || contactnumber == "") {
        text="Name must be filled out";
        document.getElementById("demo").innerHTML = text;
       return false;
    }
    var firstname = document.forms["myForm"]["firstname"].value;
    if (firstname == null || firstname == "") {
        text="Name must be filled out";
        document.getElementById("demo").innerHTML = text;
       return false;
    }
    var lastname = document.forms["myForm"]["lastname"].value;
    if (lastname == null || lastname == "") {
        text="Name must be filled out";
        document.getElementById("demo").innerHTML = text;
        return false;
    }
    var address = document.forms["myForm"]["address"].value;
    if (address == null || address == "") {
        text="Name must be filled out";
        document.getElementById("demo").innerHTML = text;
        return false;
    }
    
}
</script>
<body>
	<form name="myForm"action="UserUpdate"onsubmit="return validateForm()" method="post">
		USERNAME:<input type="username" name="username"><br />
		PASSWORD:<input type="password" name="password"><br /> CONTACT
		NUMBER:<input type="number" name="contactnumber"><br />
		FIRST-NAME:<input type="text" name="firstname"><br />
		LAST-NAME:<input type="text" name="lastname"><br /> 
		ADDRESS:<input type="text" name="address"><br /> 
		<input type="submit"value="update">
		<p id="demo"></p>
	</form>
</body>
</html>
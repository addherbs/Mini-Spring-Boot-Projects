<%@ page contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>

<form action="addPerson">
    <label>
        <input type="text" name="pid">
    </label> <br>
    <label>
        <input type="text" name="pname">
    </label> <br>
    <label>
        <input type="text" name="planguage">
    </label> <br>
    <input type="submit" > <br>
</form>

<br><br><br>

<form action="getPerson">
    <label>
        <input type="text" name="pid">
    </label> <br>
    <input type="submit" > <br>
</form>


</body>
</html>

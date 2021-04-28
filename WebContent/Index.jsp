<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="tag" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <div>
                <form action="LoginServlet" method="post" >
                  <br><br><br>
                  <h1 style="text-align:left;" ><u>Login-</u></h1><br>
                
                <label class="a2">Username*</label>
                <input type="text"  name="email"  class="a2" style="width: 11%" ><br><br><br>
              
                <label class="a3">Password*</label>
                <input type="Password"  name="pass" class="a3" style="width: 11%" ><br><br>
              
            <input type="submit" class="b1" name="loginbtn" value="Login"/>
            <input type="button" class="b2" name="cancelbtn" value="Cancel"/>

                </form>
                </div>


<tag:if test='${error != null}'>
		<h3 style="color:red;">${error}</h3>
		
	</tag:if>


<tag:if test='${user != null}'>
		<h3 style="color:red;">${user}</h3>
		
		
	</tag:if>


</body>
</html>
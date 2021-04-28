<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./css/login.css">
<meta charset="ISO-8859-1">
<title>forgot password</title>
</head>
<body>
   <div class="wrapper">
      <div class="title-text">
        <div class="title login">
Forgot Password</div>

</div>


<div class="form-inner">
          <form action="#" class="login">
            <div class="field">
              <input type="text" placeholder="Email Address" name="forgotemail" required>
            </div>
<div >
<select  class="field" name="secQues"  required>
<option value="0" >Select question</option>
<option value="1" >Your first school's name</option>
<option value="2" >Your pet's name</option>
<option value="3" >Your first car's name</option>
<option value="4" >Your favourite teacher's name</option>
<option value="5" >Your mother's maiden name</option>
<option value="6" >Your best friend's name</option>

</select> 
</div> 
<div class="field">
              <input type="text" placeholder="Security answer" name="secans" required>
            </div>
            

<div class="field btn">
              <div class="btn-layer">
</div>
<input type="submit" value="Forgot Password">
            </div>

</form>


</div>
</div>
</div>

</body>
</html>
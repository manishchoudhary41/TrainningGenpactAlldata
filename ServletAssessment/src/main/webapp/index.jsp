<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="row">
<div class="col-lg-4"></div>
<div class="col-lg-4">
<form action="login" method="get">
	
  <div class="form-group">
    <label for="exampleInputEmail1">Username</label>
    <input type="text" class="form-control" name="username" id="exampleInputEmail1" aria-describedby="emailHelp">

  </div>
  
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" name="password" id="exampleInputPassword1" >
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
  <a href="signup.jsp">Register Here</a>
  
  
</form>
</div>
<div class="col-lg-4">
	<%-- <% HttpSession hs = request.getSession();
    		//hs.invalidate();
	String name = (String) hs.getAttribute("name");
	String email = (String) hs.getAttribute("email");
	if(name!=null){
	%>
		<h3>User Details Are :</h3><br/>
		<h4>Name : <%= name %></h4>
		<h4>Email : <%= email %></h4>
	<% } %> --%>
</div>
</div>


</body>
</html>
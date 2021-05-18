<%@ include file="util/header.jsp"%>
<%
  String ErrorMessage="";
  if(session.getAttribute("ERROR")!=null){
	  ErrorMessage =(String) session.getAttribute("ERROR");
	  session.removeAttribute("ERROR");
  }
%>
<body>
	<div class="container-fluid">
		<div class="row">
			<div
				class="cal-12 bg-dark text-light d-flex justify-content-center align-items-center"
				style="height: 100vh">
				<form action="adminlogin" method="post">
				    <div>
						<h3>Admin Login</h3>
					</div>
					<div class="mb-3">
						<label class="form-label">Name</label> <input type="text"
							name="UserName" class="form-control">
					</div>

					<div class="mb-3">
						<label class="form-label">Password</label> <input type="password"
							name="UserPassword" class="form-control">
					</div>
					<button type="submit" class="btn btn-primary">Login</button>
					<%if(ErrorMessage != ""){%>
					<div class="alert alert-danger mt-1" role="alert"><%= ErrorMessage%></div>
					<% } %>
					
               </form>

			</div>
		</div>
	</div>
</body>
</html>
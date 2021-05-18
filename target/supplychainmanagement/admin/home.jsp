<%@ include file="util/header.jsp"%>

<%
if (session.getAttribute("AUTH") == null) {
	response.sendRedirect("login.jsp");
}
%>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-6 bg-dark text-light d-flex  align-items-center"
				style="height: 60px">Welcome To Supply Chain Management System</div>
			<div
				class="col-6 bg-dark text-light d-flex  align-items-center justify-content-end"
				style="height: 60px">
				<a class="btn btn-secondary" href="logout" role="button">LOG OUT</a>
			</div>
		</div>

		<div class="row">


			<link rel="stylesheet"
				href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
				integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
				crossorigin="anonymous">
				
			<div class="container-fluid">
				<form class="form-inline" action="product">
				   
					<label class="m-2">Name</label> <input
						class="form-control form-control-lg ml-1" type="text" name="ProductName"
						placeholder="Product Name" aria-label=".form-control-lg example">
					
					<label class="m-2">Description</label> <input
						class="form-control form-control-lg ml-1" type="text" name="ProductDiscription"
						placeholder="Product Description" aria-label=".form-control-lg example">
					
					<label class="m-2">Price</label> <input
						class="form-control form-control-lg ml-1" type="text" name="ProductPrice"
						placeholder="Product Price" aria-label=".form-control-lg example">
					<button type="submit" class="btn btn-primary m-2">ADD</button>
					
				</form>
			</div>

		</div>
	</div>
</body>
</html>
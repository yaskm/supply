<%@ include file="util/header.jsp"%>
<body>
	<div class="container-fluid">
		<div class="row">
			<div
				class="cal-12 bg-dark text-light d-flex justify-content-center align-items-center"
				style="height: 100vh">
				
				<form action="addProduct" method="post">
					<div>
						<h3>Add Products</h3><br/>
						<hr>
					
					<div class="mb-3">
						<label class="form-label">Product Name</label> <input type="text"
							name="ProductName" class="form-control">
					</div>
					<div class="mb-3">
						<label class="form-label">Description</label> <input type="text"
							name="Description" class="form-control">
					</div>
										<div class="mb-3">
						<label class="form-label">Price</label> <input type="text"
							name="Price" class="form-control">
					</div>

					
					<button type="submit" class="btn btn-primary">Submit</button>
					

				</form>

			</div>
		</div>
	</div>
</body>
</html>
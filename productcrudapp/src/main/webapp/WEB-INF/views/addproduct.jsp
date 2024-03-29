<!doctype html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Bootstrap demo</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
		integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>

<body>
	<div class="container">
		<h1 class="d-flex justify-content-center">Products</h1>
		<form action="handle-product" method="post">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Name</label> <input type="text" class="form-control"
					name="name">
			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Description</label>
				<input type="text" class="form-control" name="description">
			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Price</label> <input type="text" class="form-control"
					name="price">
			</div>
			<div class="d-flex justify-content-center">
				<button type="submit" class="btn btn-primary">Add Product</button>
			</div>
		</form>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
</body>

</html>
<?php
session_start();
if(!isset($_SESSION['user'])){
	header ("location: LOGIN.php");
}
?>

<?php include_once "include/header.php"?>
<?php include_once "db/dbconn.php"?>

<?php
$flag = 0;

if($_POST){
	$mp_ID = $_POST['Product_ID'];
	$mp_Name = $_POST['Product_Name'];
	$mp_Stock = $_POST['Product_Stock'];
	$mp_Updated = $_POST['Product_Updated'];
	$mp_Price = $_POST['Product_Price'];


	$sql = "INSERT INTO `monitor` (`id`, `Product_ID`, `Product_Name`, `Stock`, `Product_Updated`, `Product_Price`) VALUES (NULL, '$mp_ID','$mp_Name','$mp_Stock','$mp_Updated','$mp_Price')";
	mysqli_query($con, $sql);
	$flag=1;
}
?>

<div class="row">
	<div class="col">
		<h1>ADD MONITOR
		<a href="Monitors.php" type="button" class="btn btn-primary">Go Back</a>
		</h1>
	</div>
</div>

<?php
	if($flag==1){
?>
<div class="row">
	<div class="col">
		<div class="alert alert-primary" role="alert">
		  Product Was Successfully Added! <a href="Monitors.php" class="alert-link">View Products</a>.
		</div>
	</div>
</div>
	<?php }?>

<div class="row">
	<div class="col-md-4">

		<form action="add_monitor.php" method="POST">
			<label>Product_ID:</label>
			<input class="form-control" type="text" name="Product_ID" />
			<label>PRODUCT NAME:</label>
			<input class="form-control" type="text" name="Product_Name" />
			<label>PRODUCT STOCK:</label>
			<input class="form-control" type="text" name="Product_Stock" />
			<label>PRODUCT UPDATED:</label>
			<input class="form-control" type="text" name="Product_Updated" />
			<label>PRODUCT PRICE:</label>
			<input class="form-control" type="text" name="Product_Price" />

				<?php
					$sql = "SELECT * FROM monitor";
					$Monitors = mysqli_query($con, $sql) or die(mysqli_error($con));

					while($row = mysqli_fetch_array($Monitors)){
						$id = $row['id'];
						$mp_ID = $row['Product_ID'];
						$mp_Name = $row['Product_Name'];
						$mp_Stock = $row['Stock'];
						$mp_Updated = $row['Product_Updated'];
						$mp_Price = $row['Product_Price'];
				?>

					<?php } ?>
			</select>
			<br/>
			<div style="text-align:right">
			<button class="btn btn-primary" type="submit" >Save</button>
			<div>
		</form>

	</div>
</div>



<?php include_once "include/footer.php"?>

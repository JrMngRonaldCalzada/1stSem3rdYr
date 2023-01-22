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
	$id = @$_GET['id'];
	if($id != ""){
		$sql = "DELETE FROM computercase WHERE id = $id";
		mysqli_query($con, $sql);
		$flag = 1;
	}
?>

<div class="row">
	<div class="col">
		<h1>COMPUTER CASE
		<a href="add_computercase.php" type="button" class="btn btn-primary">
		<i class="fa-solid fa-folder-plus"></i> ADD PRODUCT</a>
		</h1>
	</div>
</div>

<?php
	if($flag==1){
?>
<div class="row">
	<div class="col">
		<div class="alert alert-warning alert-dismissible fade show" role="alert">
		  Product Was Successfully Removed!
		  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
		</div>
	</div>
</div>
	<?php }?>

<div class="row">
	<div class="col">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID#</th>
					<th>Product_ID</th>
					<th>Product_Name</th>
					<th>Stock</th>
					<th>Product_Updated</th>
					<th>Product_Price</th>
				</tr>
			</thead>
		
			<tbody>
				<?php
					$sql = "SELECT * FROM computercase";
					$viewStudent = mysqli_query($con, $sql) or die(mysqli_error());
					$number = 1;

					while($row = mysqli_fetch_array($viewStudent)){
						$id = $row['id'];
						$ccp_ID = $row['Product_ID'];
						$ccp_Name = $row['Product_Name'];
						$ccp_Stock = $row['Stock'];
						$ccp_Updated = $row['Product_Updated'];
						$ccp_Price = $row['Product_Price'];
						

								
				?>
					<tr>
						<td><?php echo $number?></td>
						<td><?php echo $ccp_ID?></td>
						<td><?php echo $ccp_Name?></td>
						<td><?php echo $ccp_Stock?></td>
						<td><?php echo $ccp_Updated?></td>
						<td><?php echo $ccp_Price?></td>
						
						<td>
							<a href="update_computercase.php?id=<?php echo $id?>" class = "btn btn-info"><i class="fa-solid fa-file-pen"></i> UPDATE</a>
							<a href="ComputerCase.php?id=<?php echo $id?>" onclick="return deleteProduct()" class = "btn btn-danger"><i class="fa-solid fa-trash-can"></i> DELETE</a>
						</td>
					</tr>
				<?php
					$number++; } 
				?>
			</tbody>
		</table>
	</div>
</div>

<script>
	function deleteProduct(){
		text = "Are you sure you want ot delete this student?";
		if(confirm(text) == true){
			return true;
		}
		else{
			return false;
		}
	}
</script>

<?php include_once "include/footer.php"?>

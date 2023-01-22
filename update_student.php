<?php
session_start();
if(!isset($_SESSION['user'])){
	header ("location: index.php");
}
?>

<?php include_once "include/header.php"?>
<?php include_once "db/dbconn.php"?>

<?php
$id = @$_GET['id'];
if ($id==""){
	$id = $_POST['id'];
}
$sql = "SELECT * FROM student_info WHERE id=$id";
$viewStudent = mysqli_query($con, $sql) or die(mysqli_error());

	while($row = mysqli_fetch_array($viewStudent)){
		$id = $row['id'];
		$studno = $row['stud_no'];
		$ln = $row['last_name'];
		$fn = $row['first_name'];
		$mn = $row['middle_name'];
		$suffix = $row['suffix'];
		$crs_id = $row['course_id'];

		$sqlcrs="SELECT * FROM course_info WHERE id=$crs_id";
		$viewCrs = mysqli_query($con, $sqlcrs) or die(mysqli_error($con));
		while($rows = mysqli_fetch_array($viewCrs)){
			$crs_name = $rows['crs_name'];

		}
	}

$flag = 0;

if($_POST){
	$studno = $_POST['studno'];
	$last_name = $_POST['last_name'];
	$first_name = $_POST['first_name'];
	$middle_name = $_POST['middle_name'];
	$suffix = $_POST['suffix'];
	$course = $_POST['course'];
	$update_id = $_POST['id'];

	$sql = "UPDATE `student_info` SET `stud_no`='$studno',`last_name`='$last_name',`first_name`='$first_name',`middle_name`='$middle_name',`suffix`='$suffix',`course_id`='$course' WHERE id='$update_id'";
	mysqli_query($con, $sql);
	$flag=1;
}
?>

<div class="row">
	<div class="col">
		<h1>UPDATE STUDENT
		<a href="view_student.php" type="button" class="btn btn-primary">Go Back</a>
		</h1> 
	</div>
</div>

<?php
	if($flag==1){
?>
<div class="row">
	<div class="col">
		<div class="alert alert-primary" role="alert">
		  Student Was Successfully Updated! <a href="view_student.php" class="alert-link">View Students</a>.
		</div>
	</div>
</div>
	<?php }?>

<div class="row">
	<div class="col-md-4">

		<form action="update_student.php" method="POST">
		<input type="hidden" name="id" value="<?php echo $id?>"/>
			<label>Student No.:</label>
			<input class="form-control" type="text" name="studno" value="<?php echo $studno?>"/>
			<label>Last Name:</label>
			<input class="form-control" type="text" name="last_name" value="<?php echo $ln?>"/>
			<label>First Name:</label>
			<input class="form-control" type="text" name="first_name" value="<?php echo $fn?>"/>
			<label>Middle Name:</label>
			<input class="form-control" type="text" name="middle_name" value="<?php echo $mn?>"/>
			<label>Suffix:</label>
			<input class="form-control" type="text" name="suffix" value="<?php echo $suffix?>"/>
			<label>Select Course:</label>
			<select class="form-select" name="course">
				<option value="<?php echo $crs_id?>"><?php echo $crs_name?></option>
				<?php
					$sql = "SELECT * FROM course_info";
					$viewCrs = mysqli_query($con, $sql) or die(mysqli_error($con));

					while($row = mysqli_fetch_array($viewCrs)){
						$id = $row['id'];
						$crs_name = $row['crs_name'];
						$crs_acro = $row['crs_acronym'];
				?>
				<option value="<?php echo $id?>"><?php echo $crs_name?></option>
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

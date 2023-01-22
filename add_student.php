<?php
session_start();
if(!isset($_SESSION['user'])){
	header ("location: index.php");
}
?>

<?php include_once "include/header.php"?>
<?php include_once "db/dbconn.php"?>

<?php
$flag = 0;

if($_POST){
	$studno = $_POST['studno'];
	$last_name = $_POST['last_name'];
	$first_name = $_POST['first_name'];
	$middle_name = $_POST['middle_name'];
	$suffix = $_POST['suffix'];
	$course = $_POST['course'];

	$sql = "INSERT INTO `student_info`(`stud_no`, `last_name`, `first_name`, `middle_name`, `suffix`, `course_id`) VALUES ('$studno', '$last_name', '$first_name', '$middle_name', '$suffix', '$course')";
	mysqli_query($con, $sql);
	$flag=1;
}
?>

<div class="row">
	<div class="col">
		<h1>ADD STUDENT
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
		  Student Was Successfully Added! <a href="view_student.php" class="alert-link">View Students</a>.
		</div>
	</div>
</div>
	<?php }?>

<div class="row">
	<div class="col-md-4">

		<form action="add_student.php" method="POST">
			<label>Student No.:</label>
			<input class="form-control" type="text" name="studno" />
			<label>Last Name:</label>
			<input class="form-control" type="text" name="last_name" />
			<label>First Name:</label>
			<input class="form-control" type="text" name="first_name" />
			<label>Middle Name:</label>
			<input class="form-control" type="text" name="middle_name" />
			<label>Suffix:</label>
			<input class="form-control" type="text" name="suffix" />
			<label>Select Course:</label>
			<select class="form-select" name="course">
				<option selected disabled>--SELECT COURSE--</option>
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

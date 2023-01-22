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
	$crs_name = $_POST['crs_name'];
	$crs_acro = $_POST['crs_acronym'];


	$sql = "INSERT INTO `course_info`(`crs_name`, `crs_acronym`) VALUES ('$crs_name', '$crs_acro')";
	mysqli_query($con, $sql);
	$flag=1;
}
?>

<div class="row">
	<div class="col">
		<h1>ADD COURSE
		<a href="view_courses.php" type="button" class="btn btn-primary">Go Back</a>
		</h1>
	</div>
</div>

<?php
	if($flag==1){
?>
<div class="row">
	<div class="col">
		<div class="alert alert-primary" role="alert">
		  Course Was Successfully Added! <a href="view_courses.php" class="alert-link">View Courses</a>.
		</div>
	</div>
</div>
	<?php }?>

<div class="row">
	<div class="col-md-4">

		<form action="add_course.php" method="POST">
			<label>Course Name:</label>
			<input class="form-control" type="text" name="crs_name" />
			<label>Course Acronym:</label>
			<input class="form-control" type="text" name="crs_acronym" />

				<?php
					$sql = "SELECT * FROM course_info";
					$viewCourse = mysqli_query($con, $sql) or die(mysqli_error($con));

					while($row = mysqli_fetch_array($viewCourse)){
						$id = $row['id'];
						$crs_name = $row['crs_name'];
						$crs_acro = $row['crs_acronym'];
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

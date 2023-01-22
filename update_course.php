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
$sql = "SELECT * FROM course_info WHERE id=$id";
$viewCourse = mysqli_query($con, $sql) or die(mysqli_error());

	while($row = mysqli_fetch_array($viewCourse)){
		$id = $row['id'];
		$crs_name = $row['crs_name'];
		$crs_acro = $row['crs_acronym'];


		$sqlcrs="SELECT * FROM course_info WHERE id=$id";
		$viewCrs = mysqli_query($con, $sqlcrs) or die(mysqli_error($con));
		while($rows = mysqli_fetch_array($viewCrs)){
			$crs_name = $rows['crs_name'];

		}
	}

$flag = 0;

if($_POST){
	$crs_name = $_POST['crs_name'];
	$crs_acro = $_POST['crs_acronym'];

	$update_id = $_POST['id'];

	$sql = "UPDATE `course_info` SET `crs_name`='$crs_name',`crs_acronym`='$crs_acro' WHERE id='$update_id'";
	mysqli_query($con, $sql);
	$flag=1;
}
?>

<div class="row">
	<div class="col">
		<h1>UPDATE COURSE
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
		  Course Was Successfully Updated! <a href="view_courses.php" class="alert-link">View Course</a>.
		</div>
	</div>
</div>
	<?php }?>

<div class="row">
	<div class="col-md-4">

		<form action="update_course.php" method="POST">
		<input type="hidden" name="id" value="<?php echo $id?>"/>
			<label>Course Name:</label>
			<input class="form-control" type="text" name="crs_name" value="<?php echo $crs_name?>"/>
			<label>Course Acronym:</label>
			<input class="form-control" type="text" name="crs_acronym" value="<?php echo $crs_acro?>"/>



				<?php
					$sql = "SELECT * FROM course_info";
					$viewCrs = mysqli_query($con, $sql) or die(mysqli_error($con));

					while($row = mysqli_fetch_array($viewCrs)){
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

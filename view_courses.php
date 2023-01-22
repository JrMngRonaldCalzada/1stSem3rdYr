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
	$id = @$_GET['id'];
	if($id != ""){
		$sql = "DELETE FROM course_info WHERE id = $id";
		mysqli_query($con, $sql);
		$flag = 1;
	}
?>

<div class="row">
	<div class="col">
		<h1>VIEW COURSE
		<a href="add_course.php" type="button" class="btn btn-primary"><i class="fa-solid fa-folder-plus"></i> Add Course</a>
		</h1>
	</div>
</div>

<div class="row">
	<div class="col">
		<table class="table table-striped">
			<thead>
				<tr style="text-align: center;">
					<th>#</th>
					<th>Course Name</th>
					<th>Course Acronym</th>

				</tr>
			</thead>
			<tfoot>
				<tr style="text-align: center;">
					<th>#</th>
					<th>Course Name</th>
					<th>Course Acronym</th>

				</tr>
			</tfoot>
			<tbody>
				<?php
					$sql = "SELECT * FROM course_info";
					$viewCrs = mysqli_query($con, $sql) or die(mysqli_error($con));
					$number = 1;
					while($row = mysqli_fetch_array($viewCrs)){
						$id = $row['id'];
						$crs_name = $row['crs_name'];
						$crs_acro = $row['crs_acronym'];



				?>
					<tr style="text-align: center;">
						<td><?php echo $number?></td>
						<td><?php echo $crs_name?></td>
						<td><?php echo $crs_acro?></td>
						<td>
							<a href="update_course.php?id=<?php echo $id?>" class = "btn btn-info"><i class="fa-solid fa-file-pen"></i> UPDATE</a>
							<a href="view_courses.php?id=<?php echo $id?>" onclick="return deleteCourse()" class = "btn btn-danger"><i class="fa-solid fa-trash-can"></i> DELETE</a>
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
	function deleteCourse(){
		text = "Are you sure you want ot delete this course?";
		if(confirm(text) == true){
			return true;
		}
		else{
			return false;
		}
	}
</script>

<?php include_once "include/footer.php"?>

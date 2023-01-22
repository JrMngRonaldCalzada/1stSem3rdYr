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
		$sql = "DELETE FROM student_info WHERE id = $id";
		mysqli_query($con, $sql);
		$flag = 1;
	}
?>

<div class="row">
	<div class="col">
		<h1>VIEW STUDENT
		<a href="add_student.php" type="button" class="btn btn-primary">
			<i class="fa-solid fa-user-plus"></i> Add Student</a>
		</h1>
	</div>
</div>

<?php
	if($flag==1){
?>
<div class="row">
	<div class="col">
		<div class="alert alert-warning alert-dismissible fade show" role="alert">
		  Student Was Successfully Removed!
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
					<th>#</th>
					<th>Student #</th>
					<th>Last Name</th>
					<th>First Name</th>
					<th>Middle Name</th>
					<th>Suffix</th>
					<th>Course</th>
					<th>Option</th>
				</tr>
			</thead>
			<tfoot>
				<tr>
					<th>#</th>
					<th>Student #</th>
					<th>Last Name</th>
					<th>First Name</th>
					<th>Middle Name</th>
					<th>Suffix</th>
					<th>Course</th>
					<th>Option</th>
				</tr>
			</tfoot>
			<tbody>
				<?php
					$sql = "SELECT * FROM student_info";
					$viewStudent = mysqli_query($con, $sql) or die(mysqli_error());
					$a = 1;

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
								$crs_acro = $rows['crs_acronym'];
				?>
					<tr>
						<td><?php echo $a?></td>
						<td><?php echo $studno?></td>
						<td><?php echo $ln?></td>
						<td><?php echo $fn?></td>
						<td><?php echo $mn?></td>
						<td><?php echo $suffix?></td>
						<td><?php echo $crs_acro?></td>
						<td>
							<a href="update_student.php?id=<?php echo $id?>" class = "btn btn-info"><i class="fa-solid fa-user-edit"></i> UPDATE</a>
							<a href="view_student.php?id=<?php echo $id?>" onclick="return deleteStudent()" class = "btn btn-danger"><i class="fa-solid fa-user-xmark"></i> DELETE</a>
						</td>
					</tr>
				<?php
					$a++; } }
				?>
			</tbody>
		</table>
	</div>
</div>

<script>
	function deleteStudent(){
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

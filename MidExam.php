<!-- file name: "MidtermExam.php" -->
<!-- save: xampp/htdocs/ws101/ -->

<?php
		/*
			Create the script the will get the values of the two numbers then display
			all the prime numbers between it afterwards display your full name.
			The start number must be greater than the end number.

			Sample outputs:

				Scenario 1:
				Enter start number: 13
				Enter end number: 2

				Start number must be greater than the end number!
				Charles Q. Andres Jr.

				Scenario 2:
				Enter start number: 2
				Enter end number: 10

				Prime numbers:
				2
				3
				5
				7
				Charles Q. Andres Jr.
		*/
?>
<html>
<head>
</head>
<body>
	<form method="post" action="MidtermExam.php">
		<label>Enter start number: </label>
		<input type="text" name="txtNum1" /><br/>
		<label>Enter end number: </label>
		<input type="text" name="txtNum2" /><br/>
		<input type="submit" name="btnProcess" value="Process"/>
	</form>
</body>

</html>

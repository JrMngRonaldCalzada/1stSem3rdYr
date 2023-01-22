//make a code for online shop in crud php

<?php

// Connect to the database
$host = "localhost";
$user = "user";
$password = "password";
$dbname = "shop_db";

$conn = mysqli_connect($host, $user, $password, $dbname);

if (!$conn) {
  die("Connection failed: " . mysqli_connect_error());
}

// Create a new product
function createProduct($name, $description, $price) {
  global $conn;
  $sql = "INSERT INTO products (name, description, price) VALUES ('$name', '$description', '$price')";
  if (mysqli_query($conn, $sql)) {
    return true;
  } else {
    return false;
  }
}

// Read all products
function readAllProducts() {
  global $conn;
  $sql = "SELECT * FROM products";
  $result = mysqli_query($conn, $sql);
  $products = mysqli_fetch_all($result, MYSQLI_ASSOC);
  return $products;
}

// Read a single product
function readProduct($id) {
  global $conn;
  $sql = "SELECT * FROM products WHERE id='$id'";
  $result = mysqli_query($conn, $sql);
  $product = mysqli_fetch_assoc($result);
  return $product;
}

// Update a product
function updateProduct($id, $name, $description, $price) {
  global $conn;
  $sql = "UPDATE products SET name='$name', description='$description', price='$price' WHERE id='$id'";
  if (mysqli_query($conn, $sql)) {
    return true;
  } else {
    return false;
  }
}

// Delete a product
function deleteProduct($id) {
  global $conn;
  $sql = "DELETE FROM products WHERE id='$id'";
  if (mysqli_query($conn, $sql)) {
    return true;
  } else {
    return false;
  }
}

// Close the database connection
mysqli_close($conn);

?>

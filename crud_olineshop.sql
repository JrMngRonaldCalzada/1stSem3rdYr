-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 03, 2023 at 05:51 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `crud_olineshop`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
(1, 'unads', '06142002');

-- --------------------------------------------------------

--
-- Table structure for table `computercase`
--

CREATE TABLE `computercase` (
  `id` int(11) NOT NULL,
  `Product_ID` int(100) NOT NULL,
  `Product_Name` varchar(20) NOT NULL,
  `Stock` int(11) NOT NULL,
  `Product_Updated` date NOT NULL,
  `Product_Price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `computercase`
--

INSERT INTO `computercase` (`id`, `Product_ID`, `Product_Name`, `Stock`, `Product_Updated`, `Product_Price`) VALUES
(1, 10001, 'CoolMan Robin 2', 28, '2023-01-03', 2900);

-- --------------------------------------------------------

--
-- Table structure for table `hardware`
--

CREATE TABLE `hardware` (
  `id` int(11) NOT NULL,
  `Product_ID` int(50) NOT NULL,
  `Product_Name` varchar(100) NOT NULL,
  `Stock` int(11) NOT NULL,
  `Product_Updated` date NOT NULL,
  `Product_Price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hardware`
--

INSERT INTO `hardware` (`id`, `Product_ID`, `Product_Name`, `Stock`, `Product_Updated`, `Product_Price`) VALUES
(1, 10001, 'Hardware1', 3, '0000-00-00', 15000),
(2, 10002, 'try', 21, '2023-01-03', 15000);

-- --------------------------------------------------------

--
-- Table structure for table `keyboard`
--

CREATE TABLE `keyboard` (
  `id` int(11) NOT NULL,
  `Product_ID` int(50) NOT NULL,
  `Product_Name` varchar(100) NOT NULL,
  `Stock` int(11) NOT NULL,
  `Product_Updated` date NOT NULL,
  `Product_Price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `keyboard`
--

INSERT INTO `keyboard` (`id`, `Product_ID`, `Product_Name`, `Stock`, `Product_Updated`, `Product_Price`) VALUES
(1, 10001, 'PsycheEagle', 41, '2023-01-03', 1500);

-- --------------------------------------------------------

--
-- Table structure for table `monitor`
--

CREATE TABLE `monitor` (
  `id` int(11) NOT NULL,
  `Product_ID` int(15) NOT NULL,
  `Product_Name` varchar(100) NOT NULL,
  `Stock` int(100) NOT NULL,
  `Product_Updated` date NOT NULL,
  `Product_Price` int(20) NOT NULL,
  `course_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `monitor`
--

INSERT INTO `monitor` (`id`, `Product_ID`, `Product_Name`, `Stock`, `Product_Updated`, `Product_Price`, `course_id`) VALUES
(1, 10001, 'Samsung', 21, '2023-01-03', 20000, 1);

-- --------------------------------------------------------

--
-- Table structure for table `mouse`
--

CREATE TABLE `mouse` (
  `id` int(11) NOT NULL,
  `Product_ID` int(50) NOT NULL,
  `Product_Name` varchar(100) NOT NULL,
  `Stock` int(11) NOT NULL,
  `Product_Updated` date NOT NULL,
  `Product_Price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mouse`
--

INSERT INTO `mouse` (`id`, `Product_ID`, `Product_Name`, `Stock`, `Product_Updated`, `Product_Price`) VALUES
(1, 10001, 'Imperio', 10, '2023-01-03', 500);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `computercase`
--
ALTER TABLE `computercase`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `hardware`
--
ALTER TABLE `hardware`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `keyboard`
--
ALTER TABLE `keyboard`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `monitor`
--
ALTER TABLE `monitor`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `stud_no` (`Product_ID`),
  ADD KEY `course_id` (`course_id`);

--
-- Indexes for table `mouse`
--
ALTER TABLE `mouse`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `computercase`
--
ALTER TABLE `computercase`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `hardware`
--
ALTER TABLE `hardware`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `keyboard`
--
ALTER TABLE `keyboard`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `monitor`
--
ALTER TABLE `monitor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `mouse`
--
ALTER TABLE `mouse`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `monitor`
--
ALTER TABLE `monitor`
  ADD CONSTRAINT `monitor_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `computercase` (`id`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

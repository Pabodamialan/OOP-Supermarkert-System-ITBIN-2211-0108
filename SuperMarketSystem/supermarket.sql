-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 03, 2023 at 09:33 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `supermarket`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminl`
--

CREATE TABLE `adminl` (
  `Name` varchar(20) NOT NULL,
  `NIC` varchar(15) NOT NULL,
  `ContactNo` int(10) NOT NULL,
  `AworkID` varchar(20) NOT NULL,
  `Apassword` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `adminl`
--

INSERT INTO `adminl` (`Name`, `NIC`, `ContactNo`, `AworkID`, `Apassword`) VALUES
('Roshana', '199975102383', 769341210, 'R001', '123456'),
('Upeka', '990840164V', 774917405, 'U001', 'Upeka123');

-- --------------------------------------------------------

--
-- Table structure for table `cashier`
--

CREATE TABLE `cashier` (
  `Name` varchar(20) NOT NULL,
  `NIC` varchar(15) NOT NULL,
  `ContactNo` int(10) NOT NULL,
  `CworkID` varchar(15) NOT NULL,
  `Cpassword` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `cashier`
--

INSERT INTO `cashier` (`Name`, `NIC`, `ContactNo`, `CworkID`, `Cpassword`) VALUES
('Upeka', '990840164V', 774917405, 'U001', 'Upeka123');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `CustomerName` varchar(15) NOT NULL,
  `NIC` varchar(15) NOT NULL,
  `Contact` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`CustomerName`, `NIC`, `Contact`) VALUES
('Roshika', '200016548521', 77895421),
('Yasitha', '200025003463', 712365498),
('Dhanushka', '990164524V', 774940215);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `ProductName` varchar(15) NOT NULL,
  `Category` varchar(15) NOT NULL,
  `WholesalePrice` double NOT NULL,
  `RetailPrice` double NOT NULL,
  `ProductCode` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`ProductName`, `Category`, `WholesalePrice`, `RetailPrice`, `ProductCode`) VALUES
('Atlas CR-80pgs', 'Stationaries', 88, 98, 'ACR001'),
('Atlas CR-120pgs', 'Stationaries', 150, 170, 'ACR002'),
('Atlas CR-200pgs', 'Stationaries', 220, 240, 'ACR003'),
('Bacadi', 'Liquer', 35000, 75000, 'B001'),
('Baby Cream', 'Baby Products', 100, 150, 'BC001'),
('Carrot', 'Vegetables', 950, 1000, 'C001'),
('Chicken', 'Meat', 900, 1200, 'CH001'),
('Chandanalepa', 'Cosmetics', 350, 400, 'CHA001'),
('Jack Danial', 'Liquer', 9000, 11000, 'JD001'),
('Panadol', 'Pharmaceuticals', 200, 250, 'P001'),
('Redbull', 'Beverages', 700, 850, 'R001'),
('Suger', 'Groceries', 80, 100, 'S001'),
('Sun Light', 'Detergents', 50, 55, 'SL001'),
('Vodka', 'Liquer', 12000, 18000, 'V001'),
('Yougurt', 'Dairy Products', 45, 50, 'Y001');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `SupplierName` varchar(20) NOT NULL,
  `SupplierID` varchar(10) NOT NULL,
  `ProductCategory` varchar(25) NOT NULL,
  `SupplierContact` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`SupplierName`, `SupplierID`, `ProductCategory`, `SupplierContact`) VALUES
('Chukki Products', 'CH001', 'Meat', 715435468),
('Mexo Design', 'MD001', 'Liquer', 757114498),
('SENA Products', 'SE001', 'Pharmaceuticals', 719552870);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adminl`
--
ALTER TABLE `adminl`
  ADD PRIMARY KEY (`AworkID`);

--
-- Indexes for table `cashier`
--
ALTER TABLE `cashier`
  ADD PRIMARY KEY (`CworkID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`NIC`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`ProductCode`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`SupplierID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

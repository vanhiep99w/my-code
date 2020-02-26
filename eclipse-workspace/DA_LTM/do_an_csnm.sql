-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 31, 2018 at 07:18 AM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `do_an_csnm`
--

-- --------------------------------------------------------

--
-- Table structure for table `diem_thi`
--

CREATE TABLE `diem_thi` (
  `id` int(11) NOT NULL,
  `mon_1` float NOT NULL,
  `mon_2` float NOT NULL,
  `mon_3` float NOT NULL,
  `hoc_sinh_id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `diem_thi`
--

INSERT INTO `diem_thi` (`id`, `mon_1`, `mon_2`, `mon_3`, `hoc_sinh_id`) VALUES
(1, 8.5, 6.8, 7.2, 1),
(2, 6, 7, 7, 2),
(3, 9, 8.5, 8.5, 3),
(4, 5, 4.2, 3.6, 4),
(5, 5.5, 6.5, 7.5, 5),
(6, 7, 7.5, 5.8, 6),
(7, 7.5, 7, 8, 7),
(8, 9, 5, 6.5, 8),
(9, 9, 9, 9.5, 9),
(10, 6, 6.5, 6, 10),
(11, 7.5, 7, 5.5, 11),
(12, 9, 8, 7, 12);

-- --------------------------------------------------------

--
-- Table structure for table `hoc_sinh`
--

CREATE TABLE `hoc_sinh` (
  `sbd` int(5) NOT NULL,
  `ho_ten` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `ngay_sinh` date NOT NULL,
  `dia_chi` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `khoi_thi_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `hoc_sinh`
--

INSERT INTO `hoc_sinh` (`sbd`, `ho_ten`, `ngay_sinh`, `dia_chi`, `khoi_thi_id`) VALUES
(1, 'Trần Văn Lộc', '1996-06-06', 'Kon Tum', 1),
(2, 'Trần Đình Phú', '1996-10-24', 'Quảng Ngãi', 3),
(3, 'Lê Thảo Sương', '1997-05-02', 'Đà Nẵng', 4),
(4, 'Nguyễn Tùng Đức', '1996-07-02', 'Thanh Hóa', 2),
(5, 'Đặng Thị Giàu', '1997-10-10', 'Quảng Trị', 3),
(6, 'Trần Công Phúc', '1996-06-12', 'Quảng Nam', 1),
(7, 'Mai Thị Hoa', '1996-05-04', 'Nam Đinh', 1),
(8, 'Hồ Minh', '1996-12-12', 'Thừa Thiên Huế', 2),
(9, 'Nguyễn Lộc', '1996-02-02', 'Quảng Nam', 1),
(10, 'Lê Na', '1996-03-03', 'Quảng Bình', 4),
(11, 'Gia Cát Lượng', '1996-09-06', 'Đà Nẵng', 3),
(12, 'Trương Vô Kỵ', '1996-05-01', 'Nghệ An', 1);

-- --------------------------------------------------------

--
-- Table structure for table `khoi_thi`
--

CREATE TABLE `khoi_thi` (
  `id` int(11) NOT NULL,
  `ten` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `mon_1` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `mon_2` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `mon_3` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `khoi_thi`
--

INSERT INTO `khoi_thi` (`id`, `ten`, `mon_1`, `mon_2`, `mon_3`) VALUES
(1, 'A', 'Toán', 'Lý', 'Hóa'),
(2, 'B', 'Toán', 'Hóa', 'Sinh'),
(3, 'C', 'Văn', 'Sử', 'Địa'),
(4, 'D', 'Toán', 'Văn', 'Anh');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `diem_thi`
--
ALTER TABLE `diem_thi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `hoc_sinh_id` (`hoc_sinh_id`);

--
-- Indexes for table `hoc_sinh`
--
ALTER TABLE `hoc_sinh`
  ADD PRIMARY KEY (`sbd`),
  ADD KEY `khoi_thi_id` (`khoi_thi_id`);

--
-- Indexes for table `khoi_thi`
--
ALTER TABLE `khoi_thi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `diem_thi`
--
ALTER TABLE `diem_thi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `hoc_sinh`
--
ALTER TABLE `hoc_sinh`
  MODIFY `sbd` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `khoi_thi`
--
ALTER TABLE `khoi_thi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `diem_thi`
--
ALTER TABLE `diem_thi`
  ADD CONSTRAINT `diem_thi_ibfk_1` FOREIGN KEY (`hoc_sinh_id`) REFERENCES `hoc_sinh` (`sbd`);

--
-- Constraints for table `hoc_sinh`
--
ALTER TABLE `hoc_sinh`
  ADD CONSTRAINT `hoc_sinh_ibfk_1` FOREIGN KEY (`khoi_thi_id`) REFERENCES `khoi_thi` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

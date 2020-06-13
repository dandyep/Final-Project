-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2020 at 11:34 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan2`
--

CREATE TABLE `pelanggan2` (
  `No_Pelanggan` varchar(10) NOT NULL,
  `Nama_Pelanggan` varchar(20) NOT NULL,
  `Nama_Toko` varchar(20) NOT NULL,
  `Alamat` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pelanggan2`
--

INSERT INTO `pelanggan2` (`No_Pelanggan`, `Nama_Pelanggan`, `Nama_Toko`, `Alamat`) VALUES
('001', 'Haryono', 'Toko Mawar', 'Jalan Mawar 1'),
('002', 'Tono', 'Toko Melati', 'Jalan Melati 2'),
('003', 'Dinda', 'Toko Delima', 'Jalan Delima 3'),
('004', 'Rizal', 'Toko Anggrek', 'Jalan Anggrek 4'),
('005', 'Rendi', 'Toko Dahlia', 'Jalan Dahlia 5'),
('006', 'Rinda', 'Toko Lavender', 'Jalan Lavender 6'),
('007', 'Galih', 'Toko Seruni', 'Jalan Seruni 7'),
('008', 'Arik', 'Toko Widuri', 'Jalan Widuri 8');

-- --------------------------------------------------------

--
-- Table structure for table `pemasok2`
--

CREATE TABLE `pemasok2` (
  `Id_Pem` varchar(10) NOT NULL,
  `Nama` varchar(10) NOT NULL,
  `Alamat` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pemasok2`
--

INSERT INTO `pemasok2` (`Id_Pem`, `Nama`, `Alamat`) VALUES
('010', 'Rini', 'Jalan Malioboro 1'),
('011', 'Rafi', 'Jalan Legian 2'),
('012', 'Afif', 'Jalan Dago 3'),
('013', 'Bayu', 'Jalan Tunjungan 4'),
('014', 'Cherly', 'Jalan Sudirman 5'),
('015', 'Erlang', 'Jalan Kesawan 6'),
('016', 'Hadi', 'Jalan Braga 7'),
('017', 'Jihan', 'Jalan Cihampelas 8');

-- --------------------------------------------------------

--
-- Table structure for table `pembelian2`
--

CREATE TABLE `pembelian2` (
  `No_Transaksi` varchar(20) NOT NULL,
  `No_Pelanggan` varchar(20) NOT NULL,
  `Nama_Toko` varchar(20) NOT NULL,
  `Nama_Pelanggan` varchar(20) NOT NULL,
  `Tgl_Transaksi` date NOT NULL,
  `Jenis_Barang` varchar(20) NOT NULL,
  `Harga` varchar(10) NOT NULL,
  `Jumlah` varchar(10) NOT NULL,
  `Total_Harga` varchar(10) NOT NULL,
  `Bayar` varchar(10) NOT NULL,
  `Kembali` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pembelian2`
--

INSERT INTO `pembelian2` (`No_Transaksi`, `No_Pelanggan`, `Nama_Toko`, `Nama_Pelanggan`, `Tgl_Transaksi`, `Jenis_Barang`, `Harga`, `Jumlah`, `Total_Harga`, `Bayar`, `Kembali`) VALUES
('110', '010', 'Rini', 'Jalan Malioboro 1', '2020-06-12', 'Pandan Wangi', '225000', '3', '675000', '700000', '25000'),
('111', '011', 'Rafi', 'Jalan Legian 2', '2020-06-11', 'Pandan Wangi', '225000', '4', '900000', '950000', '50000'),
('112', '012', 'Afif', 'Jalan Dago 3', '2020-06-10', 'Rojolele', '212500', '5', '1062500', '1100000', '37500'),
('113', '013', 'Bayu', 'Jalan Tunjungan 4', '2020-06-09', 'Rojolele', '212500', '3', '637500', '800000', '162500'),
('114', '014', 'Cherly', 'Jalan Sudirman 5', '2020-06-08', 'Sentra Ramos', '195000', '4', '780000', '800000', '20000'),
('115', '015', 'Erlang', 'Jalan Kesawan 6', '2020-06-07', 'Sentra Ramos', '195000', '6', '1170000', '1200000', '30000'),
('116', '016', 'Hadi', 'Jalan Braga 7', '2020-06-06', 'C4', '175000', '7', '1225000', '1300000', '75000'),
('117', '017', 'Jihan', 'Jalan Cihampelas 8', '2020-06-05', 'C4', '175000', '5', '875000', '900000', '25000');

-- --------------------------------------------------------

--
-- Table structure for table `penjualan2`
--

CREATE TABLE `penjualan2` (
  `No_Transaksi` varchar(20) NOT NULL,
  `No_Pelanggan` varchar(20) NOT NULL,
  `Nama_Toko` varchar(20) NOT NULL,
  `Nama_Pelanggan` varchar(20) NOT NULL,
  `Tgl_Transaksi` date NOT NULL,
  `Jenis_Barang` varchar(20) NOT NULL,
  `Harga` varchar(10) NOT NULL,
  `Jumlah` varchar(10) NOT NULL,
  `Total_Harga` varchar(10) NOT NULL,
  `Bayar` varchar(10) NOT NULL,
  `Kembali` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penjualan2`
--

INSERT INTO `penjualan2` (`No_Transaksi`, `No_Pelanggan`, `Nama_Toko`, `Nama_Pelanggan`, `Tgl_Transaksi`, `Jenis_Barang`, `Harga`, `Jumlah`, `Total_Harga`, `Bayar`, `Kembali`) VALUES
('101', '001', 'Toko Mawar', 'Haryono', '2020-06-13', 'Pandan Wangi', '250000', '2', '500000', '1000000', '500000'),
('102', '002', 'Toko Melati', 'Tono', '2020-06-14', 'Pandan Wangi', '250000', '3', '750000', '1500000', '750000'),
('103', '003', 'Toko Delima', 'Dinda', '2020-06-15', 'Rojolele', '225500', '4', '902000', '1000000', '98000'),
('104', '004', 'Toko Anggrek', 'Rizal', '2020-06-16', 'Rojolele', '225500', '2', '451000', '600000', '149000'),
('105', '005', 'Toko Dahlia', 'Rendi', '2020-06-17', 'Sentra Ramos', '212000', '3', '636000', '650000', '14000'),
('106', '006', 'Toko Lavender', 'Rinda', '2020-06-18', 'Sentra Ramos', '212000', '5', '1060000', '1500000', '440000'),
('107', '007', 'Toko Seruni', 'Galih', '2020-06-19', 'C4', '200000', '6', '1200000', '1400000', '200000'),
('108', '008', 'Toko Widuri', 'Arik', '2020-06-20', 'C4', '200000', '4', '800000', '900000', '100000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pelanggan2`
--
ALTER TABLE `pelanggan2`
  ADD PRIMARY KEY (`No_Pelanggan`);

--
-- Indexes for table `pemasok2`
--
ALTER TABLE `pemasok2`
  ADD PRIMARY KEY (`Id_Pem`);

--
-- Indexes for table `pembelian2`
--
ALTER TABLE `pembelian2`
  ADD PRIMARY KEY (`No_Transaksi`);

--
-- Indexes for table `penjualan2`
--
ALTER TABLE `penjualan2`
  ADD PRIMARY KEY (`No_Transaksi`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 13, 2020 at 05:40 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dsa_assignment`
--

-- --------------------------------------------------------

--
-- Table structure for table `loginadmin`
--

CREATE TABLE `loginadmin` (
  `id` int(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `loginadmin`
--

INSERT INTO `loginadmin` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `question`
--

CREATE TABLE `question` (
  `id` int(100) NOT NULL,
  `subjectcode` int(100) NOT NULL,
  `subject` varchar(100) NOT NULL,
  `question` varchar(250) NOT NULL,
  `answer1` varchar(250) NOT NULL,
  `answer2` varchar(250) NOT NULL,
  `answer3` varchar(250) NOT NULL,
  `answer4` varchar(250) NOT NULL,
  `correct` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `question`
--

INSERT INTO `question` (`id`, `subjectcode`, `subject`, `question`, `answer1`, `answer2`, `answer3`, `answer4`, `correct`) VALUES
(19, 1, 'Java', 'Which method returns the interrupted flag after that it sets the flag to false if it is true?', 'isInterrupted()', 'static interrupted()', 'non static interrupted()', 'Both A & C', 'static interrupted()'),
(20, 1, 'Java', 'Which constructor creates an empty string buffer with the specified capacity as length.', 'StringBuffer()', 'StringBuffer(String str)', 'StringBuffer(int capacity)', 'None of the above', 'StringBuffer(int capacity)'),
(21, 1, 'Java', 'How many reserved keywords are currently defined in the Java language?', '48', '49', '50', '47', '49'),
(22, 1, 'Java', 'Which method is used to change the name of a thread?', 'public String getName()', 'public void setName(String name)', 'public void getName()', 'public String setName(String name)', 'public void setName(String name)'),
(23, 1, 'Java', 'Which of these operators is used to allocate memory to array variable in Java?', 'malloc', 'alloc', 'new', 'new malloc', 'new'),
(24, 1, 'Java', 'Which of these is an incorrect array declaration?', 'int arr[] = new int[5]', 'int [] arr = new int[5]', 'int arr[] = new int[5]', 'int arr[] = int [5] new', 'int arr[] = int [5] new'),
(25, 1, 'Java', 'Which of these is necessary to specify at time of array initialization?', 'Row', 'Column', 'Both', 'None', 'Row'),
(26, 1, 'Java', 'Which of these is long data type literal?', '0x99fffL', 'ABCDEFG', '0x99fffa', '99671246', '0x99fffL'),
(28, 1, 'Java', 'Which of these can be returned by the operator &?', 'Integer', 'Boolean', 'Character', 'Integer or Boolean', 'Integer or Boolean'),
(29, 1, 'Java', 'Literals in java must be appended by which of these?', 'L', 'I', 'D', 'L and I', 'L and I'),
(31, 4, 'Python', 'Is Python case sensitive when dealing with identifiers?', 'yes', 'no', 'machine dependent', 'none', 'yes'),
(32, 4, 'Python', 'What is the maximum possible length of an identifier?', '31 characters', '63 characters', '79 characters', 'None', 'None'),
(33, 4, 'Python', 'Which of the following is invalid?', '_a = 1', '__a = 1', '__str__ = 1', 'none', 'none'),
(34, 4, 'Python', 'Which of the following is an invalid variable?', 'my_string_1', '1st_string', ' foo', '_', '1st_string'),
(35, 4, 'Python', 'Which of the following is not a keyword?', 'eval', 'assert', 'nonlocal', 'pass', 'eval'),
(36, 4, 'Python', 'All keywords in Python are in _________', 'lower case', 'UPPER CASE', 'Capitalized', 'None', 'None'),
(37, 4, 'Python', 'Which of the following is an invalid statement?', 'abc = 1,000,000', 'a b c = 1000 2000 3000', 'a,b,c = 1000, 2000, 3000', 'a_b_c = 1,000,000', 'a b c = 1000 2000 3000'),
(38, 4, 'Python', 'Which of the following cannot be a variable?', '__init_', 'in', 'it', 'on', 'in'),
(39, 4, 'Python', 'Which of the following statements create a dictionary?', 'd = {}', 'd = {“john”:40, “peter”:45}', 'd = {40:”john”, 45:”peter”}', 'all', 'all'),
(40, 4, 'Python', 'Which module in Python supports regular expressions?', 're', 'regex', 'pyregex', 'none', 're'),
(41, 3, 'CS', 'I/O function allows to exchange data directly between an', 'Process States', 'Registers', 'I/O module and the processor', 'I/O devices', 'I/O module and the processor'),
(42, 3, 'CS', 'Cache memory is intended to provide memory access', 'Fastest', 'Slow', 'Very Slow', 'Comparatively Fast', 'Fastest'),
(43, 3, 'CS', 'Primary element used for data storage is said to be', 'Monitor', 'Main Storage', 'secondary storage', 'keyboard', 'secondary storage'),
(44, 3, 'CS', 'Interrupts are provided primarily as a way to', 'Improve processor utilization', 'Improve processor execution', 'Improve processor control', 'Improve processor speed', 'Improve processor utilization'),
(45, 3, 'CS', 'Index register involves adding an', 'Index', 'Instruction', 'Information', 'I/O device', 'Index'),
(46, 3, 'CS', 'Program counter contains address of the', 'Next programs to be fetched', 'Previous programs to be fetched', 'Previous information to be fetched', 'Next information to be fetched', 'Next information to be fetched'),
(47, 3, 'CS', 'Memory modules consist of', 'Set of Instructions', 'Set of Registers', 'Set of Locations', 'Set of Programs', 'Set of Locations'),
(48, 3, 'CS', 'Processor is often referred to', 'Central Processing Unit', 'Hardware', 'System Bus', 'I/O Modules', 'Central Processing Unit'),
(49, 3, 'CS', 'I/O interrupt-driven is more efficient than', 'I/O Modules', 'I/O Devices', 'Programmed I/O', 'CPU', 'Programmed I/O'),
(50, 3, 'CS', 'Segment pointers divided memory into', 'Register', 'Segment', 'Process', 'Scaling', 'Segment'),
(51, 2, 'CN', 'Which transmission media provides the highest transmission speed in a network?', 'coaxial cable', 'twisted pair cable', 'optical fiber', 'electrical cable', 'optical fiber'),
(52, 2, 'CN', 'The portion of physical layer that interfaces with the media access control sublayer is ', 'physical signalling sublayer', 'physical data sublayer', 'physical address sublayer', 'physical transport sublayer', 'physical signalling sublayer'),
(53, 2, 'CN', 'The physical layer is responsible for __________', 'line coding', 'channel coding', 'modulation', 'all', 'all'),
(54, 2, 'CN', 'Physical or logical arrangement of network is __________', 'Topology', 'Routing', 'Networking', 'Control', 'Topology'),
(55, 2, 'CN', 'Which network topology requires a central controller or hub?', 'Star', 'Bus', 'Mesh', 'Ring', 'Star'),
(56, 2, 'CN', 'Which of the following are transport layer protocols used in networking?', 'TCP and FTP', 'UDP and HTTP', 'TCP and UDP', 'HTTP and FTP', 'TCP and UDP'),
(57, 2, 'CN', 'An endpoint of an inter-process communication flow across a computer network is called', 'socket', 'pipe', 'port', 'machine', 'socket'),
(58, 2, 'CN', 'Socket-style API for windows is called', 'wsock', 'winsock', 'wins', 'sockwi', 'winsock'),
(59, 2, 'CN', 'DHCP is used for', 'IPv6', 'IPv4', 'Both', 'None', 'Both'),
(60, 2, 'CN', 'DHCP client and servers on the same subnet communicate via', 'UDP broadcast', 'UDP unicast', 'TCP broadcast', 'TCP unicast', 'UDP broadcast'),
(61, 0, '', '', '', '', '', '', ''),
(62, 0, '', '', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `id` int(100) NOT NULL,
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `token` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`id`, `name`, `email`, `password`, `token`) VALUES
(5, 'a', 'aaksh@gmail.com', 'a', 'eiepE'),
(13, '', '', '', 'LYFl9'),
(14, '', '', '', 'HNJUj');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `loginadmin`
--
ALTER TABLE `loginadmin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `signup`
--
ALTER TABLE `signup`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `loginadmin`
--
ALTER TABLE `loginadmin`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `question`
--
ALTER TABLE `question`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=63;

--
-- AUTO_INCREMENT for table `signup`
--
ALTER TABLE `signup`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

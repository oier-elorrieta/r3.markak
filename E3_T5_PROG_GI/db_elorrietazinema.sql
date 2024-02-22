-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-02-2024 a las 09:55:59
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_elorrietazinema`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aretoa`
--

CREATE TABLE `aretoa` (
  `aretoa_id` smallint(5) UNSIGNED NOT NULL,
  `zinema_id` smallint(5) UNSIGNED NOT NULL,
  `izena` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `aretoa`
--

INSERT INTO `aretoa` (`aretoa_id`, `zinema_id`, `izena`) VALUES
(1, 1, 'Areto1'),
(2, 1, 'Areto2'),
(3, 1, 'Areto3'),
(4, 1, 'Areto4'),
(5, 1, 'Areto5'),
(6, 2, 'Areto1'),
(7, 2, 'Areto2'),
(8, 2, 'Areto3'),
(9, 2, 'Areto4'),
(10, 2, 'Areto5'),
(11, 3, 'Areto1'),
(12, 3, 'Areto2'),
(13, 3, 'Areto3'),
(14, 3, 'Areto4'),
(15, 3, 'Areto5'),
(16, 4, 'Areto1'),
(17, 4, 'Areto2'),
(18, 4, 'Areto3'),
(19, 4, 'Areto4'),
(20, 4, 'Areto5'),
(21, 5, 'Areto1'),
(22, 5, 'Areto2'),
(23, 5, 'Areto3'),
(24, 5, 'Areto4'),
(25, 5, 'Areto5');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bezeroa`
--

CREATE TABLE `bezeroa` (
  `Bezero_id` smallint(5) UNSIGNED NOT NULL,
  `NAN` varchar(9) NOT NULL,
  `izena` varchar(30) NOT NULL,
  `abizena` varchar(30) NOT NULL,
  `Generoa` varchar(10) DEFAULT NULL,
  `Email` varchar(30) NOT NULL,
  `telefonoa` varchar(11) DEFAULT NULL,
  `pasahitza` varchar(12) NOT NULL,
  `jaio_data` date DEFAULT NULL CHECK (`jaio_data` < '2010-01-01')
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `bezeroa`
--

INSERT INTO `bezeroa` (`Bezero_id`, `NAN`, `izena`, `abizena`, `Generoa`, `Email`, `telefonoa`, `pasahitza`, `jaio_data`) VALUES
(1, '12345678A', 'Juan', 'Pérez', 'Gizona', 'juan@gmail.com', '123456789', 'pasahitza1', '1990-05-15'),
(2, '87654321B', 'Ana', 'López', 'Emakumea', 'ana@gmail.com', '987654321', 'pasahitza2', '1988-08-25'),
(3, '23456789C', 'Pedro', 'García', 'Gizona', 'pedro@gmail.com', '654321987', 'pasahitza3', '1995-03-10'),
(4, '98765432D', 'María', 'Martínez', 'Emakumea', 'maria@gmail.com', '321987654', 'pasahitza4', '1992-12-20'),
(5, '34567890E', 'Javier', 'Fernández', 'Gizona', 'javier@gmail.com', '987123456', 'pasahitza5', '1987-06-30'),
(6, '09876543F', 'Laura', 'Gómez', 'Emakumea', 'laura@gmail.com', '456789012', 'pasahitza6', '1993-09-05'),
(7, '45678901G', 'Carlos', 'Rodríguez', 'Gizona', 'carlos@gmail.com', '654987321', 'pasahitza7', '1991-02-17'),
(8, '76543210H', 'Sara', 'López', 'Emakumea', 'sara@gmail.com', '789456123', 'pasahitza8', '1994-11-12'),
(9, '56789012I', 'Miguel', 'Hernández', 'Gizona', 'miguel@gmail.com', '234567890', 'pasahitza9', '1989-07-22'),
(10, '67890123J', 'Elena', 'Díaz', 'Emakumea', 'elena@gmail.com', '890123456', 'pasahitza10', '1996-04-03');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `erosketak`
--

CREATE TABLE `erosketak` (
  `erosketak_id` smallint(5) UNSIGNED NOT NULL,
  `dirutotala` decimal(10,2) DEFAULT NULL,
  `jatorria` enum('online','fisikoa') DEFAULT NULL,
  `Bezero_id` smallint(5) UNSIGNED NOT NULL,
  `Deskontua` decimal(4,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `erosketak`
--

INSERT INTO `erosketak` (`erosketak_id`, `dirutotala`, `jatorria`, `Bezero_id`, `Deskontua`) VALUES
(1, 38.00, 'online', 1, 30.00),
(4, 28.50, 'online', 4, 30.00),
(5, 9.50, 'online', 5, NULL),
(6, 19.00, 'online', 6, 20.00),
(7, 47.60, 'online', 7, 30.00),
(8, 19.00, 'online', 8, 20.00),
(9, 9.50, 'online', 9, NULL),
(11, 66.50, 'fisikoa', 6, 30.00),
(12, 57.00, 'fisikoa', 2, 30.00),
(13, 76.00, 'fisikoa', 3, 30.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `filma`
--

CREATE TABLE `filma` (
  `filma_id` smallint(5) UNSIGNED NOT NULL,
  `generoa` varchar(30) DEFAULT NULL,
  `prezioa` decimal(10,2) DEFAULT NULL,
  `izena` varchar(25) DEFAULT NULL,
  `Iraupena` int(11) DEFAULT NULL,
  `Egilea` varchar(20) DEFAULT NULL,
  `Estrenaldi_urtea` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `filma`
--

INSERT INTO `filma` (`filma_id`, `generoa`, `prezioa`, `izena`, `Iraupena`, `Egilea`, `Estrenaldi_urtea`) VALUES
(1, 'Drama', 9.50, 'Handia', 116, 'Jon Garaño', 2017),
(2, 'Drama', 9.50, 'La Lista de Schidler', 195, 'Steven Spielberg', 1994),
(3, 'Drama', 9.50, 'Cadena Perpetua', 142, 'Frank Darabont', 1995),
(4, 'Drama', 9.50, 'Million Dollar Baby', 132, 'Clint Eastwood', 2005),
(5, 'Beldurra', 9.50, 'Psicosis', 109, 'Alfred hitchcock', 1961),
(6, 'Beldurra', 9.50, 'El Resplandor', 116, 'Stanley Kubrick', 1980),
(7, 'Beldurra', 9.50, 'Dracula', 155, 'Francis Ford Coppola', 1993),
(8, 'Beldurra', 9.50, 'Cisne Negro', 110, 'Darren Aronofsky', 2011),
(9, 'Sci-Fi', 9.50, 'Odisea 2001', 142, 'Arthur C. Clarke', 1968),
(10, 'Sci-Fi', 9.50, 'Alien', 117, 'Dan o´bannon', 1979),
(11, 'Sci-Fi', 9.50, 'El Planeta de los Simios', 115, 'Pierre Boulle', 1968),
(12, 'Sci-Fi', 9.50, 'Novia de Frankie', 75, 'Mary Shelley', 1935),
(13, 'Komedia', 9.50, 'Scary Movie', 88, 'keenen Ivory Wayans', 2000),
(14, 'Komedia', 9.50, 'El Gran Lebowsky', 117, 'Ethan Jesse', 1998),
(15, 'Komedia', 9.50, 'La vida de Brian', 94, 'Terry Jones', 1980),
(16, 'komedia', 9.50, 'Aterriza como puedas', 88, 'Jim Abrahams', 1980);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `saioa`
--

CREATE TABLE `saioa` (
  `saioa_id` smallint(5) UNSIGNED NOT NULL,
  `eguna` date DEFAULT NULL,
  `ordutegia` time DEFAULT NULL,
  `filma_id` smallint(5) UNSIGNED DEFAULT NULL,
  `aretoa_id` smallint(5) UNSIGNED DEFAULT NULL,
  `zinema_id` smallint(5) UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `saioa`
--

INSERT INTO `saioa` (`saioa_id`, `eguna`, `ordutegia`, `filma_id`, `aretoa_id`, `zinema_id`) VALUES
(1, '2024-02-06', '13:00:00', 1, 1, 1),
(2, '2024-02-06', '15:30:00', 2, 2, 1),
(3, '2024-02-06', '18:00:00', 3, 3, 1),
(4, '2024-02-07', '13:30:00', 4, 4, 1),
(5, '2024-02-07', '16:00:00', 5, 5, 1),
(6, '2024-02-07', '19:00:00', 6, 6, 2),
(7, '2024-02-08', '14:00:00', 7, 7, 2),
(8, '2024-02-08', '17:30:00', 8, 8, 2),
(9, '2024-02-08', '20:00:00', 9, 9, 2),
(10, '2024-02-09', '12:45:00', 10, 10, 2),
(11, '2024-02-09', '15:15:00', 11, 11, 3),
(12, '2024-02-09', '17:45:00', 12, 12, 3),
(13, '2024-02-10', '11:30:00', 13, 13, 3),
(14, '2024-02-10', '14:00:00', 14, 14, 3),
(15, '2024-02-10', '16:30:00', 15, 15, 3),
(16, '2024-02-11', '10:00:00', 16, 16, 4),
(17, '2024-02-11', '12:15:00', 1, 17, 4),
(18, '2024-02-11', '15:00:00', 2, 18, 4),
(19, '2024-02-12', '13:45:00', 3, 19, 4),
(20, '2024-02-12', '16:00:00', 4, 20, 4),
(21, '2024-02-12', '18:45:00', 5, 21, 5),
(22, '2024-02-13', '12:30:00', 6, 22, 5),
(23, '2024-02-13', '15:00:00', 7, 23, 5),
(24, '2024-02-13', '17:30:00', 8, 24, 5),
(25, '2024-02-14', '14:15:00', 9, 25, 5),
(26, '2024-02-14', '16:45:00', 10, 1, 1),
(27, '2024-02-14', '19:00:00', 11, 2, 1),
(28, '2024-02-15', '11:00:00', 12, 3, 1),
(29, '2024-02-15', '13:30:00', 13, 4, 1),
(30, '2024-02-15', '16:15:00', 14, 5, 1),
(31, '2024-02-16', '12:00:00', 15, 6, 2),
(32, '2024-02-16', '14:30:00', 16, 7, 2),
(33, '2024-02-16', '17:00:00', 1, 8, 2),
(34, '2024-02-17', '13:15:00', 2, 9, 2),
(35, '2024-02-17', '15:45:00', 3, 10, 2),
(36, '2024-02-17', '18:30:00', 4, 11, 3),
(37, '2024-02-18', '10:30:00', 5, 12, 3),
(38, '2024-02-18', '13:00:00', 6, 13, 3),
(39, '2024-02-18', '15:45:00', 7, 14, 3),
(40, '2024-02-19', '11:00:00', 8, 15, 3),
(41, '2024-02-19', '14:00:00', 9, 16, 4),
(42, '2024-02-19', '16:30:00', 10, 17, 4),
(43, '2024-02-20', '12:15:00', 11, 18, 4),
(44, '2024-02-20', '14:45:00', 12, 19, 4),
(45, '2024-02-20', '17:00:00', 13, 20, 4),
(46, '2024-02-21', '10:45:00', 14, 21, 5),
(47, '2024-02-21', '13:30:00', 15, 22, 5),
(48, '2024-02-21', '16:15:00', 16, 23, 5),
(49, '2024-02-22', '12:00:00', 1, 24, 5),
(50, '2024-02-22', '14:30:00', 2, 25, 5),
(51, '2024-02-22', '17:00:00', 3, 1, 1),
(52, '2024-02-23', '13:15:00', 4, 2, 1),
(53, '2024-02-23', '15:45:00', 5, 3, 1),
(54, '2024-02-23', '18:30:00', 6, 4, 1),
(55, '2024-02-24', '10:30:00', 7, 5, 1),
(56, '2024-02-24', '13:00:00', 8, 6, 2),
(57, '2024-02-24', '15:45:00', 9, 7, 2),
(58, '2024-02-25', '11:00:00', 10, 8, 2),
(59, '2024-02-25', '14:00:00', 11, 9, 2),
(60, '2024-02-25', '16:30:00', 12, 10, 2),
(61, '2024-02-26', '12:15:00', 13, 11, 3),
(62, '2024-02-26', '14:45:00', 14, 12, 3),
(63, '2024-02-26', '17:00:00', 15, 13, 3),
(64, '2024-02-27', '10:45:00', 16, 14, 3),
(65, '2024-02-27', '13:30:00', 1, 15, 3),
(66, '2024-02-27', '16:15:00', 2, 16, 4),
(67, '2024-02-28', '12:00:00', 3, 17, 4),
(68, '2024-02-28', '14:30:00', 4, 18, 4),
(69, '2024-02-28', '17:00:00', 5, 19, 4),
(70, '2024-02-29', '11:15:00', 6, 20, 4),
(71, '2024-02-29', '13:45:00', 7, 21, 5),
(72, '2024-02-29', '16:30:00', 8, 22, 5),
(73, '2024-03-01', '12:15:00', 9, 23, 5),
(74, '2024-03-01', '14:45:00', 10, 24, 5),
(75, '2024-03-01', '17:00:00', 11, 25, 5),
(76, '2024-03-02', '11:00:00', 12, 1, 1),
(77, '2024-03-02', '13:30:00', 13, 2, 1),
(78, '2024-03-02', '16:15:00', 14, 3, 1),
(79, '2024-03-03', '12:00:00', 15, 4, 1),
(80, '2024-03-03', '14:30:00', 16, 5, 1),
(81, '2024-03-03', '17:00:00', 1, 6, 2),
(82, '2024-03-04', '11:15:00', 2, 7, 2),
(83, '2024-03-04', '13:45:00', 3, 8, 2),
(84, '2024-03-04', '16:30:00', 4, 9, 2),
(85, '2024-03-05', '12:15:00', 5, 10, 2),
(86, '2024-03-05', '14:45:00', 6, 11, 3),
(87, '2024-03-05', '17:00:00', 7, 12, 3),
(88, '2024-03-06', '11:00:00', 8, 13, 3),
(89, '2024-03-06', '13:30:00', 9, 14, 3),
(90, '2024-03-06', '16:15:00', 10, 15, 3),
(91, '2024-03-07', '12:00:00', 11, 16, 4),
(92, '2024-03-07', '14:30:00', 12, 17, 4),
(93, '2024-03-07', '17:00:00', 13, 18, 4),
(94, '2024-03-08', '10:45:00', 14, 19, 4),
(95, '2024-03-08', '13:30:00', 15, 20, 4),
(96, '2024-03-08', '16:15:00', 16, 21, 5),
(97, '2024-03-09', '12:00:00', 1, 22, 5),
(98, '2024-03-09', '14:30:00', 2, 23, 5),
(99, '2024-03-09', '17:00:00', 3, 24, 5),
(100, '2024-03-10', '11:15:00', 4, 25, 5),
(101, '2024-03-10', '13:45:00', 5, 1, 1),
(102, '2024-03-10', '16:30:00', 6, 2, 1),
(103, '2024-03-11', '12:15:00', 7, 3, 1),
(104, '2024-03-11', '14:45:00', 8, 4, 1),
(105, '2024-03-11', '17:00:00', 9, 5, 1),
(106, '2024-03-12', '11:00:00', 10, 6, 2),
(107, '2024-03-12', '13:30:00', 11, 7, 2),
(108, '2024-03-12', '16:15:00', 12, 8, 2),
(109, '2024-03-13', '12:00:00', 13, 9, 2),
(110, '2024-03-13', '14:30:00', 14, 10, 2),
(111, '2024-03-13', '17:00:00', 15, 11, 3),
(112, '2024-03-14', '11:15:00', 16, 12, 3),
(113, '2024-03-14', '13:45:00', 1, 13, 3),
(114, '2024-03-14', '16:30:00', 2, 14, 3),
(115, '2024-03-15', '12:15:00', 3, 15, 3),
(116, '2024-03-15', '14:45:00', 4, 16, 4),
(117, '2024-03-15', '17:00:00', 5, 17, 4),
(118, '2024-03-16', '11:00:00', 6, 18, 4),
(119, '2024-03-16', '13:30:00', 7, 19, 4),
(120, '2024-03-16', '16:15:00', 8, 20, 4),
(121, '2024-03-17', '12:00:00', 9, 21, 5),
(122, '2024-03-17', '14:30:00', 10, 22, 5),
(123, '2024-03-17', '17:00:00', 11, 23, 5),
(124, '2024-03-18', '10:45:00', 12, 24, 5),
(125, '2024-03-18', '13:30:00', 13, 25, 5),
(126, '2024-03-18', '16:15:00', 14, 1, 1),
(127, '2024-03-19', '12:00:00', 15, 2, 1),
(128, '2024-03-19', '14:30:00', 16, 3, 1),
(129, '2024-03-19', '17:00:00', 1, 4, 1),
(130, '2024-03-20', '11:15:00', 2, 5, 1),
(131, '2024-03-20', '13:45:00', 3, 6, 2),
(132, '2024-03-20', '16:30:00', 4, 7, 2),
(133, '2024-03-21', '12:15:00', 5, 8, 2),
(134, '2024-03-21', '14:45:00', 6, 9, 2),
(135, '2024-03-21', '17:00:00', 7, 10, 2),
(136, '2024-03-22', '11:00:00', 8, 11, 3),
(137, '2024-03-22', '13:30:00', 9, 12, 3),
(138, '2024-03-22', '16:15:00', 10, 13, 3),
(139, '2024-03-23', '12:00:00', 11, 14, 3),
(140, '2024-03-23', '14:30:00', 12, 15, 3),
(141, '2024-03-23', '17:00:00', 13, 16, 4),
(142, '2024-03-24', '11:15:00', 14, 17, 4),
(143, '2024-03-24', '13:45:00', 15, 18, 4),
(144, '2024-03-24', '16:30:00', 16, 19, 4),
(145, '2024-03-25', '12:15:00', 1, 20, 4),
(146, '2024-03-25', '14:45:00', 2, 21, 5),
(147, '2024-03-25', '17:00:00', 3, 22, 5),
(148, '2024-03-26', '11:00:00', 4, 23, 5),
(149, '2024-03-26', '13:30:00', 5, 24, 5),
(150, '2024-03-26', '16:15:00', 6, 25, 5),
(151, '2024-03-27', '12:00:00', 7, 1, 1),
(152, '2024-03-27', '14:30:00', 8, 2, 1),
(153, '2024-03-27', '17:00:00', 9, 3, 1),
(154, '2024-03-28', '10:45:00', 10, 4, 1),
(155, '2024-03-28', '13:30:00', 11, 5, 1),
(156, '2024-03-28', '16:15:00', 12, 6, 2),
(157, '2024-03-29', '12:00:00', 13, 7, 2),
(158, '2024-03-29', '14:30:00', 14, 8, 2),
(159, '2024-03-29', '17:00:00', 15, 9, 2),
(160, '2024-03-30', '11:15:00', 16, 10, 2),
(161, '2024-03-30', '13:45:00', 1, 11, 3),
(162, '2024-03-30', '16:30:00', 2, 12, 3),
(163, '2024-03-31', '12:15:00', 3, 13, 3),
(164, '2024-03-31', '14:45:00', 4, 14, 3),
(165, '2024-03-31', '17:00:00', 5, 15, 3),
(166, '2024-04-01', '11:00:00', 6, 16, 4),
(167, '2024-04-01', '13:30:00', 7, 17, 4),
(168, '2024-04-02', '12:00:00', 8, 18, 4),
(169, '2024-04-02', '14:30:00', 9, 19, 4),
(170, '2024-04-02', '17:00:00', 10, 20, 4),
(171, '2024-04-03', '11:15:00', 11, 21, 5),
(172, '2024-04-03', '13:45:00', 12, 22, 5),
(173, '2024-04-03', '16:30:00', 13, 23, 5),
(174, '2024-04-04', '12:15:00', 14, 24, 5),
(175, '2024-04-04', '14:45:00', 15, 25, 5),
(176, '2024-04-04', '17:00:00', 16, 1, 1),
(177, '2024-04-05', '11:00:00', 1, 2, 1),
(178, '2024-04-05', '13:30:00', 2, 3, 1),
(179, '2024-04-05', '16:15:00', 3, 4, 1),
(180, '2024-04-05', '13:30:00', 4, 5, 1),
(181, '2024-04-05', '16:15:00', 5, 6, 2),
(182, '2024-04-06', '12:00:00', 6, 7, 2),
(183, '2024-04-06', '14:30:00', 7, 8, 2),
(184, '2024-04-06', '16:45:00', 8, 9, 2),
(185, '2024-04-07', '10:00:00', 9, 10, 2),
(186, '2024-04-07', '11:45:00', 10, 11, 3),
(187, '2024-04-07', '16:15:00', 11, 12, 3),
(188, '2024-04-08', '12:00:00', 12, 13, 3),
(189, '2024-04-08', '14:30:00', 13, 14, 3),
(190, '2024-04-08', '17:00:00', 14, 15, 3),
(191, '2024-04-09', '11:15:00', 15, 16, 4),
(192, '2024-04-09', '13:45:00', 16, 17, 4),
(193, '2024-04-09', '16:30:00', 1, 18, 4),
(194, '2024-04-10', '12:15:00', 2, 19, 4),
(195, '2024-04-10', '14:45:00', 3, 20, 4),
(196, '2024-04-10', '17:00:00', 4, 21, 5),
(197, '2024-04-11', '11:00:00', 5, 22, 5),
(198, '2024-04-11', '13:30:00', 6, 23, 5),
(199, '2024-04-11', '16:15:00', 7, 24, 5),
(200, '2024-04-12', '12:00:00', 8, 25, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sarrera`
--

CREATE TABLE `sarrera` (
  `sarrera_id` int(10) UNSIGNED NOT NULL,
  `erosketak_id` smallint(5) UNSIGNED NOT NULL,
  `saioa_id` smallint(5) UNSIGNED DEFAULT NULL,
  `kant_sr` smallint(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `sarrera`
--

INSERT INTO `sarrera` (`sarrera_id`, `erosketak_id`, `saioa_id`, `kant_sr`) VALUES
(1, 1, 1, 3),
(2, 12, 7, 8),
(3, 13, 13, 9),
(4, 4, 19, 1),
(5, 5, 25, 4),
(6, 6, 26, 2),
(7, 7, 32, 3),
(8, 8, 50, 4),
(9, 9, 63, 5),
(10, 11, 100, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `zinema`
--

CREATE TABLE `zinema` (
  `zinema_id` smallint(5) UNSIGNED NOT NULL,
  `izena` varchar(30) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telefonoa` varchar(9) DEFAULT NULL,
  `herria` varchar(20) DEFAULT NULL,
  `Kalea` varchar(20) DEFAULT NULL,
  `zenbakia` smallint(6) DEFAULT NULL,
  `youtube` varchar(30) DEFAULT NULL,
  `twitter` varchar(30) DEFAULT NULL,
  `instagram` varchar(30) DEFAULT NULL,
  `facebook` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `zinema`
--

INSERT INTO `zinema` (`zinema_id`, `izena`, `email`, `telefonoa`, `herria`, `Kalea`, `zenbakia`, `youtube`, `twitter`, `instagram`, `facebook`) VALUES
(1, 'Elorrieta-errekamari zinema', 'zinema@gmail.com', '123456789', 'Bilbao', 'Lehendakari Agirre', 4, 'ElorrietaYt', 'ElorrietaTw', 'ElorrietaInsta', 'ElorrietaFace'),
(2, 'Basauri zinema', 'zinema@gmail.com', '123456789', 'Basauri', 'Pozokoetxe', 6, 'BasaurizinemaYt', 'BasaurizinemaTw', 'BasaurizinemaInsta', 'BasaurizinemaFace'),
(3, 'Ideal zinema', 'zinema@gmail.com', '123456789', 'Bilbao', 'Juan Ajuriaguerra', 7, 'IdealYt', 'IdealTw', 'IdealInsta', 'IdealFace'),
(4, 'Portugalete zinema', 'zinema@gmail.com', '123456789', 'Portugalete', 'Buenavista', 2, 'PortuzinemaYt', 'PortuzinemaTw', 'PortuzinemaInsta', 'PortuzinemaFace'),
(5, 'Gazteiz zinema', 'zinema@gmail.com', '123456789', 'Gazteiz', 'La Musica Ibilbidea', 10, 'GazteizZinemaYt', 'GazteizZinemaTw', 'GazteizZinemaInsta', 'GazteizZinemaFace');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `aretoa`
--
ALTER TABLE `aretoa`
  ADD PRIMARY KEY (`zinema_id`,`aretoa_id`);

--
-- Indices de la tabla `bezeroa`
--
ALTER TABLE `bezeroa`
  ADD PRIMARY KEY (`Bezero_id`),
  ADD UNIQUE KEY `NAN` (`NAN`);

--
-- Indices de la tabla `erosketak`
--
ALTER TABLE `erosketak`
  ADD PRIMARY KEY (`erosketak_id`),
  ADD KEY `Bezero_id` (`Bezero_id`);

--
-- Indices de la tabla `filma`
--
ALTER TABLE `filma`
  ADD PRIMARY KEY (`filma_id`);

--
-- Indices de la tabla `saioa`
--
ALTER TABLE `saioa`
  ADD PRIMARY KEY (`saioa_id`),
  ADD KEY `filma_id` (`filma_id`),
  ADD KEY `zinema_id` (`zinema_id`,`aretoa_id`);

--
-- Indices de la tabla `sarrera`
--
ALTER TABLE `sarrera`
  ADD PRIMARY KEY (`sarrera_id`,`erosketak_id`),
  ADD KEY `erosketak_id` (`erosketak_id`),
  ADD KEY `saioa_id` (`saioa_id`);

--
-- Indices de la tabla `zinema`
--
ALTER TABLE `zinema`
  ADD PRIMARY KEY (`zinema_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `zinema`
--
ALTER TABLE `zinema`
  MODIFY `zinema_id` smallint(5) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `aretoa`
--
ALTER TABLE `aretoa`
  ADD CONSTRAINT `aretoa_ibfk_1` FOREIGN KEY (`zinema_id`) REFERENCES `zinema` (`zinema_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `erosketak`
--
ALTER TABLE `erosketak`
  ADD CONSTRAINT `erosketak_ibfk_1` FOREIGN KEY (`Bezero_id`) REFERENCES `bezeroa` (`Bezero_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `saioa`
--
ALTER TABLE `saioa`
  ADD CONSTRAINT `saioa_ibfk_1` FOREIGN KEY (`filma_id`) REFERENCES `filma` (`filma_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `saioa_ibfk_2` FOREIGN KEY (`zinema_id`,`aretoa_id`) REFERENCES `aretoa` (`zinema_id`, `aretoa_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `sarrera`
--
ALTER TABLE `sarrera`
  ADD CONSTRAINT `sarrera_ibfk_1` FOREIGN KEY (`erosketak_id`) REFERENCES `erosketak` (`erosketak_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `sarrera_ibfk_2` FOREIGN KEY (`saioa_id`) REFERENCES `saioa` (`saioa_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

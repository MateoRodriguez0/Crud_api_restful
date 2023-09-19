-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 19-09-2023 a las 16:26:24
-- Versión del servidor: 8.0.31
-- Versión de PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `music_api`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `albums`
--

DROP TABLE IF EXISTS `albums`;
CREATE TABLE IF NOT EXISTS `albums` (
  `id` int NOT NULL AUTO_INCREMENT,
  `titulo` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `lanzado` date DEFAULT NULL,
  `genero` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `albums`
--

INSERT INTO `albums` (`id`, `titulo`, `lanzado`, `genero`, `precio`) VALUES
(1, 'Harry\'s House', '2022-05-20', 'Pop', 18.99),
(2, '30', '2021-11-19', 'Pop', 21.99),
(3, 'Renaissance', '2022-08-29', 'R&B', 24.99),
(4, 'Donda', '2021-08-31', 'Hip-hop', 24.99),
(5, 'Certified Lover Boy', '2021-09-30', 'Hip-hop', 24.99),
(6, '3.15.20', '2020-03-15', 'Jazz', 24.99),
(7, 'Circles', '2020-01-17', 'Pop', 18.99),
(8, 'After Hours', '2020-03-20', 'Pop', 18.99),
(9, 'Future Nostalgia', '2020-03-27', 'Pop', 18.99),
(10, 'Folklore', '2020-07-24', 'Folk', 18.99),
(11, 'un verano sin ti', '2022-05-17', 'reggaeton-pop', 30.8),
(12, NULL, '2021-11-28', NULL, NULL);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

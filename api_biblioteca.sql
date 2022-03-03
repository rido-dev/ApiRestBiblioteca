-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-03-2022 a las 15:55:02
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `api_biblioteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE `libros` (
  `id` int(11) NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `autor` varchar(50) NOT NULL,
  `categoria` varchar(50) NOT NULL,
  `isbn` varchar(50) NOT NULL,
  `edicion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`id`, `titulo`, `autor`, `categoria`, `isbn`, `edicion`) VALUES
(1, 'Agricultura para principiantes', 'Joel Salatin', 'Ciencias', '1234567890123', 'Primera'),
(2, 'Agricultura para expertos', 'Joel Salatin', 'Ciencias', '1234567890124', 'Primera'),
(3, 'Electricidad para principiantes', 'Nikola Tesla', 'Ciencias', '7894561230123', 'Cuarta'),
(4, 'Electricidad para expertos', 'Nikola Tesla', 'Ciencias', '7894561230124', 'Segunda'),
(5, 'Como hacerse rico', 'Lie Man', 'Finanzas', '4561237890123', 'Primera'),
(6, 'Como triunfar en los negocios', 'Lie Man', 'Finanzas', '4561237890124', 'Primera'),
(7, 'Primera guerra mundial', 'Barbara Tuchman', 'Historia', '1245789630147', 'Segunda'),
(8, 'Segunda guerra mundial', 'Winston Churchill', 'Historia', '2356897410456', 'Tercera'),
(9, 'Animales de la sabana', 'Jack London', 'Naturaleza', '7856129430456', 'Primera'),
(10, 'Animales de la montaña', 'Evelyn Segura', 'Naturaleza', '4679132580456', 'Segunda'),
(11, 'Rebelion en la granaja', 'George Orwell', 'Novela', '1230456789125', 'Cuarta'),
(12, 'Homenaje a Cataluña', 'George Orwell', 'Novela', '1234561230789', 'Segunda'),
(13, 'El origen de las especies', 'Charles Darwin', 'Ciencias', '1025478963014', 'Quinta'),
(14, 'La seleccion natural', 'Charles Darwin', 'Ciencias', '4567891040126', 'Sexta'),
(15, 'Al faro', 'Virginia Woolf', 'Novela', '4561230127852', 'Segunda'),
(16, 'Orlando', 'Virginia Woolf', 'Novela', '1324567897897', 'Tercera');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `libros`
--
ALTER TABLE `libros`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `libros`
--
ALTER TABLE `libros`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

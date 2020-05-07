-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 07 Maj 2020, 13:25
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `biblioteka_n`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `klienci`
--

CREATE TABLE IF NOT EXISTS `klienci` (
  `id_klienta` int(11) NOT NULL AUTO_INCREMENT,
  `imie` varchar(32) COLLATE utf8mb4_polish_ci NOT NULL,
  `nazwisko` varchar(32) COLLATE utf8mb4_polish_ci NOT NULL,
  `login` varchar(32) COLLATE utf8mb4_polish_ci NOT NULL,
  `haslo` varchar(32) COLLATE utf8mb4_polish_ci NOT NULL,
  `numer_tel` int(9) NOT NULL,
  PRIMARY KEY (`id_klienta`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_polish_ci AUTO_INCREMENT=63 ;

--
-- Zrzut danych tabeli `klienci`
--

INSERT INTO `klienci` (`id_klienta`, `imie`, `nazwisko`, `login`, `haslo`, `numer_tel`) VALUES
(1, 'Rafa?', 'Kamilski', 'rafaka', 'kamil', 843850),
(2, 'Kinga', 'Farna', 'kifa', 'garna', 4389499),
(3, 'Leon', 'Wirki', 'leo', 'wir', 34422424),
(4, 'Dawid', 'Wafil', 'dejwid', 'dafa', 44412323),
(5, 'Iwona', 'Walec', 'ivo', 'val', 435923932),
(6, 'Klara', 'Fakt', 'cler', 'news', 434354123),
(7, 'Maciej', 'Wair', 'macius', 'raiw', 34354521),
(8, 'Kamil', 'Je?', 'kamilze', 'lej', 4343553),
(9, 'Eryk', 'Kroso', 'eros', 'kros', 673465464),
(26, 's', 'd', '3', 'd', 33),
(27, 'Rafa?', 'Kamilski', 'rafaka', 'kamil', 843850),
(28, 'Kinga', 'Farna', 'kifa', 'garna', 4389499),
(29, 'Leon', 'Wirki', 'leo', 'wir', 34422424),
(30, 'Dawid', 'Wafil', 'dejwid', 'dafa', 44412323),
(31, 'Iwona', 'Walec', 'ivo', 'val', 435923932),
(32, 'Klara', 'Fakt', 'cler', 'news', 434354123),
(33, 'Maciej', 'Wair', 'macius', 'raiw', 34354521),
(34, 'Kamil', 'Je?', 'kamilze', 'lej', 4343553),
(35, 'Eryk', 'Kroso', 'eros', 'kros', 673465464),
(36, 'Rafa?', 'Kamilski', 'rafaka', 'kamil', 843850),
(37, 'Kinga', 'Farna', 'kifa', 'garna', 4389499),
(38, 'Leon', 'Wirki', 'leo', 'wir', 34422424),
(39, 'Dawid', 'Wafil', 'dejwid', 'dafa', 44412323),
(40, 'Iwona', 'Walec', 'ivo', 'val', 435923932),
(41, 'Klara', 'Fakt', 'cler', 'news', 434354123),
(42, 'Maciej', 'Wair', 'macius', 'raiw', 34354521),
(43, 'Kamil', 'Je?', 'kamilze', 'lej', 4343553),
(44, 'Eryk', 'Kroso', 'eros', 'kros', 673465464),
(45, 'Rafa?', 'Kamilski', 'rafaka', 'kamil', 843850),
(46, 'Kinga', 'Farna', 'kifa', 'garna', 4389499),
(47, 'Leon', 'Wirki', 'leo', 'wir', 34422424),
(48, 'Dawid', 'Wafil', 'dejwid', 'dafa', 44412323),
(49, 'Iwona', 'Walec', 'ivo', 'val', 435923932),
(50, 'Klara', 'Fakt', 'cler', 'news', 434354123),
(51, 'Maciej', 'Wair', 'macius', 'raiw', 34354521),
(52, 'Kamil', 'Je?', 'kamilze', 'lej', 4343553),
(53, 'Eryk', 'Kroso', 'eros', 'kros', 673465464),
(54, 'Rafa?', 'Kamilski', 'rafaka', 'kamil', 843850),
(55, 'Kinga', 'Farna', 'kifa', 'garna', 4389499),
(56, 'Leon', 'Wirki', 'leo', 'wir', 34422424),
(57, 'Dawid', 'Wafil', 'dejwid', 'dafa', 44412323),
(58, 'Iwona', 'Walec', 'ivo', 'val', 435923932),
(59, 'Klara', 'Fakt', 'cler', 'news', 434354123),
(60, 'Maciej', 'Wair', 'macius', 'raiw', 34354521),
(61, 'Kamil', 'Je?', 'kamilze', 'lej', 4343553),
(62, 'Eryk', 'Kroso', 'eros', 'kros', 673465464);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `ksiazki`
--

CREATE TABLE IF NOT EXISTS `ksiazki` (
  `id_ksiazki` int(11) NOT NULL AUTO_INCREMENT,
  `tytul` varchar(100) COLLATE utf8_polish_ci NOT NULL,
  `autor` varchar(32) COLLATE utf8_polish_ci NOT NULL,
  `rok_wydania` int(11) NOT NULL,
  `gatunek` varchar(32) COLLATE utf8_polish_ci NOT NULL,
  PRIMARY KEY (`id_ksiazki`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci AUTO_INCREMENT=12 ;

--
-- Zrzut danych tabeli `ksiazki`
--

INSERT INTO `ksiazki` (`id_ksiazki`, `tytul`, `autor`, `rok_wydania`, `gatunek`) VALUES
(1, 'Wybierz ksi??k?', 's', 0, 's'),
(2, 'Pan Tadeusz', 'Adam Mickiewicz', 1834, 'Poezja epicka'),
(3, 'Krzy?acy', 'Henryk Sienkiewicz', 1900, 'Fikcja historyczna'),
(4, 'Rok 1984', 'George Orwell', 1949, 'Powie?? dystopijna'),
(5, 'Folwark zwierz?cy', 'George Orwell', 1947, 'Powie?? satyryczna'),
(6, 'Lalka', 'Boles?aw Prus', 1890, 'Powie?? spo?eczna'),
(7, 'Ferdydurke', 'Witold Gombrowicz', 1937, 'Literatura pi?kna'),
(8, 'Wesele', 'Stanis?aw Wyspie?ski', 1901, 'Dramat'),
(9, 'Balladyna', 'Juliusz S?owacki', 1839, 'Tragedia'),
(10, 'Outsider', 'Adam Mickiewicz', 1993, 'Poezja epicka'),
(11, 'Potop', 'Henryk Sienkiewicz', 1886, 'Powie?? historyczna');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `wypozyczenia`
--

CREATE TABLE IF NOT EXISTS `wypozyczenia` (
  `id_wyp` int(11) NOT NULL AUTO_INCREMENT,
  `id_klienta` int(11) NOT NULL,
  `id_ksiazki` int(11) NOT NULL,
  `data_wyp` date NOT NULL,
  `data_zwr` date NOT NULL,
  PRIMARY KEY (`id_wyp`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_polish_ci AUTO_INCREMENT=133 ;

--
-- Zrzut danych tabeli `wypozyczenia`
--

INSERT INTO `wypozyczenia` (`id_wyp`, `id_klienta`, `id_ksiazki`, `data_wyp`, `data_zwr`) VALUES
(1, 2, 3, '2020-04-16', '2020-05-23'),
(2, 2, 6, '2020-02-22', '2020-04-12'),
(3, 4, 3, '2020-01-12', '2020-05-11'),
(4, 3, 10, '2020-04-12', '2020-04-26'),
(5, 6, 7, '2020-04-18', '2020-06-12'),
(6, 1, 2, '2020-04-05', '2020-07-30'),
(7, 8, 1, '2020-04-03', '2020-04-23'),
(8, 6, 8, '2020-03-18', '2020-04-01'),
(9, 7, 4, '2020-03-29', '2020-04-30'),
(10, 9, 5, '2020-02-14', '2020-05-21'),
(11, 2, 3, '2020-04-16', '2020-05-23'),
(12, 2, 6, '2020-02-22', '2020-04-12'),
(13, 4, 3, '2020-01-12', '2020-05-11'),
(14, 3, 10, '2020-04-12', '2020-04-26'),
(15, 6, 7, '2020-04-18', '2020-06-12'),
(16, 1, 2, '2020-04-05', '2020-07-30'),
(17, 8, 1, '2020-04-03', '2020-04-23'),
(18, 6, 8, '2020-03-18', '2020-04-01'),
(19, 7, 4, '2020-03-29', '2020-04-30'),
(20, 9, 5, '2020-02-14', '2020-05-21'),
(21, 11, 5, '2020-01-18', '2020-01-18'),
(22, 11, 5, '2020-01-18', '2020-01-18'),
(23, 2, 7, '2020-04-21', '2020-01-18'),
(24, 2, 7, '2020-04-21', '2020-01-18'),
(25, 2, 5, '2020-04-21', '2020-01-18'),
(26, 2, 7, '2020-04-21', '2020-01-18'),
(27, 2, 7, '2020-04-21', '2020-01-18'),
(28, 2, 1, '2020-04-21', '2020-01-18'),
(29, 2, 1, '2020-04-21', '2020-01-18'),
(30, 2, 7, '2020-04-21', '2020-01-18'),
(31, 2, 5, '2020-04-21', '2020-01-18'),
(32, 2, 5, '2020-04-21', '2020-01-18'),
(33, 2, 5, '2020-04-21', '2020-01-18'),
(34, 2, 5, '2020-04-21', '2020-01-18'),
(35, 2, 7, '2020-04-21', '2020-01-18'),
(36, 2, 7, '2020-04-21', '2020-01-18'),
(37, 2, 7, '2020-04-21', '2020-01-18'),
(38, 2, 7, '2020-04-21', '2020-01-18'),
(39, 2, 5, '2020-04-21', '2020-01-18'),
(40, 2, 5, '2020-04-21', '2020-01-18'),
(41, 2, 5, '2020-04-21', '2020-01-18'),
(42, 2, 5, '2020-04-21', '2020-01-18'),
(43, 2, 5, '2020-04-21', '2020-01-18'),
(44, 2, 7, '2020-04-21', '2020-01-18'),
(45, 2, 7, '2020-04-21', '2020-01-18'),
(46, 2, 7, '2020-04-21', '2020-01-18'),
(47, 2, 7, '2020-04-21', '2020-01-18'),
(48, 2, 5, '2020-04-21', '2020-01-18'),
(49, 2, 5, '2020-04-21', '2020-01-18'),
(50, 2, 7, '2020-04-21', '2020-01-18'),
(51, 2, 7, '2020-04-21', '2020-01-18'),
(52, 2, 1, '2020-04-21', '2020-01-18'),
(53, 2, 10, '2020-04-23', '2020-01-18'),
(54, 2, 7, '2020-04-23', '2020-01-18'),
(55, 2, 7, '2020-04-23', '2020-01-18'),
(56, 2, 7, '2020-04-23', '2020-01-18'),
(57, 2, 2, '2020-04-27', '2020-01-18'),
(58, 2, 3, '2020-04-27', '2020-01-18'),
(59, 2, 3, '2020-04-16', '2020-05-23'),
(60, 2, 6, '2020-02-22', '2020-04-12'),
(61, 4, 3, '2020-01-12', '2020-05-11'),
(62, 3, 10, '2020-04-12', '2020-04-26'),
(63, 6, 7, '2020-04-18', '2020-06-12'),
(64, 1, 2, '2020-04-05', '2020-07-30'),
(65, 8, 1, '2020-04-03', '2020-04-23'),
(66, 6, 8, '2020-03-18', '2020-04-01'),
(67, 7, 4, '2020-03-29', '2020-04-30'),
(68, 9, 5, '2020-02-14', '2020-05-21'),
(69, 28, 2, '2020-04-27', '2020-01-18'),
(70, 28, 3, '2020-04-27', '2020-01-18'),
(71, 28, 3, '2020-04-27', '2020-01-18'),
(72, 28, 3, '2020-04-27', '2020-01-18'),
(73, 28, 1, '2020-04-27', '2020-01-18'),
(74, 28, 1, '2020-04-27', '2020-01-18'),
(75, 28, 3, '2020-04-27', '2020-01-18'),
(76, 28, 3, '2020-04-27', '2020-01-18'),
(77, 28, 3, '2020-04-27', '2020-01-18'),
(78, 28, 3, '2020-04-27', '2020-01-18'),
(79, 28, 2, '2020-04-27', '2020-01-18'),
(80, 28, 2, '2020-04-27', '2020-01-18'),
(81, 28, 2, '2020-04-27', '2020-01-18'),
(82, 28, 6, '2020-04-27', '2020-01-18'),
(83, 28, 6, '2020-04-27', '2020-01-18'),
(84, 28, 6, '2020-04-27', '2020-01-18'),
(85, 28, 2, '2020-04-27', '2020-01-18'),
(86, 28, 2, '2020-04-27', '2020-01-18'),
(87, 28, 5, '2020-04-27', '2020-01-18'),
(88, 28, 5, '2020-04-27', '2020-01-18'),
(89, 28, 5, '2020-04-27', '2020-01-18'),
(90, 28, 4, '2020-04-27', '2020-01-18'),
(91, 28, 4, '2020-04-27', '2020-01-18'),
(92, 28, 4, '2020-04-27', '2020-01-18'),
(93, 28, 5, '2020-04-27', '2020-01-18'),
(94, 28, 4, '2020-04-27', '2020-01-18'),
(95, 28, 5, '2020-04-27', '2020-01-18'),
(96, 28, 4, '2020-04-27', '2020-01-18'),
(97, 28, 4, '2020-04-27', '2020-01-18'),
(98, 28, 1, '2020-04-27', '2020-01-18'),
(99, 28, 8, '2020-04-27', '2020-01-18'),
(100, 28, 2, '2020-04-27', '2020-01-18'),
(101, 28, 2, '2020-04-27', '2020-01-18'),
(102, 28, 1, '2020-04-27', '2020-01-18'),
(103, 28, 1, '2020-04-27', '2020-01-18'),
(104, 28, 1, '2020-04-27', '2020-01-18'),
(105, 28, 1, '2020-04-27', '2020-01-18'),
(106, 28, 1, '2020-04-27', '2020-01-18'),
(107, 2, 3, '2020-04-16', '2020-05-23'),
(108, 2, 6, '2020-02-22', '2020-04-12'),
(109, 4, 3, '2020-01-12', '2020-05-11'),
(110, 3, 10, '2020-04-12', '2020-04-26'),
(111, 6, 7, '2020-04-18', '2020-06-12'),
(112, 1, 2, '2020-04-05', '2020-07-30'),
(113, 8, 1, '2020-04-03', '2020-04-23'),
(114, 6, 8, '2020-03-18', '2020-04-01'),
(115, 7, 4, '2020-03-29', '2020-04-30'),
(116, 9, 5, '2020-02-14', '2020-05-21'),
(117, 55, 1, '2020-04-27', '2020-01-18'),
(118, 55, 6, '2020-04-27', '2020-01-18'),
(119, 55, 1, '2020-04-27', '2020-01-18'),
(120, 55, 1, '2020-04-27', '2020-01-18'),
(121, 55, 3, '2020-04-27', '2020-01-18'),
(122, 55, 2, '2020-04-27', '2020-01-18'),
(123, 55, 3, '2020-04-27', '2020-01-18'),
(124, 55, 4, '2020-04-27', '2020-01-18'),
(125, 55, 5, '2020-04-27', '2020-01-18'),
(126, 55, 6, '2020-04-27', '2020-01-18'),
(127, 55, 6, '2020-04-27', '2020-01-18'),
(128, 55, 5, '2020-04-27', '2020-01-18'),
(129, 55, 4, '2020-04-27', '2020-01-18'),
(130, 55, 1, '2020-04-28', '2020-01-18'),
(131, 55, 4, '2020-04-28', '2020-01-18'),
(132, 55, 4, '2020-04-28', '2020-01-18');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 30, 2021 at 10:42 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_kanban`
--

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(11),
(11),
(11),
(11);

-- --------------------------------------------------------

--
-- Table structure for table `T_Fiche`
--

CREATE TABLE `T_Fiche` (
  `idFiche` bigint(20) NOT NULL,
  `dateButoire` date DEFAULT NULL,
  `delai` int(11) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  `lieu` varchar(255) DEFAULT NULL,
  `noteExplicative` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `idTableau` bigint(20) DEFAULT NULL,
  `codeUser` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `T_Fiche`
--

INSERT INTO `T_Fiche` (`idFiche`, `dateButoire`, `delai`, `libelle`, `lieu`, `noteExplicative`, `url`, `idTableau`, `codeUser`) VALUES
(1, '2021-05-29', 45, 'Fiche 1', 'Ville jean', 'Backup cfg file-Cisco', 'http:/www.toto.com', 1, 'u1'),
(2, '2021-02-07', 45, 'Fiche 2', 'Rennes beaulieu', 'Configuration de l\'ip du client xx.', 'http:/www.toto.com', 1, 'u1'),
(3, '2021-02-11', 35, 'Fiche 3', 'Clémenceau', 'Configuration d\'un router', 'http:/www.toto.com', 2, 'u2'),
(4, '2021-02-11', 60, 'Fiche 4', 'Clémenceau', 'PC 19- virus check', 'http:/www.toto.com', 2, 'u2'),
(5, '2021-02-08', 45, 'Fiche 5', 'Rennes Charles de gaule', 'Developpement d\'un nouveau module', 'http:/www.toto.com', 1, 'u3'),
(6, '2021-05-08', 30, 'Fiche 6', 'Beaulieu', 'Configuration serveur pour un employé', 'http:/www.toto.com', 1, 'u3');

-- --------------------------------------------------------

--
-- Table structure for table `T_Fiche_Tag`
--

CREATE TABLE `T_Fiche_Tag` (
  `idFiche` bigint(20) NOT NULL,
  `idTag` bigint(20) NOT NULL,
  `id_Tag` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `T_PositionnementFiche`
--

CREATE TABLE `T_PositionnementFiche` (
  `idPositionnementFiche` bigint(20) NOT NULL,
  `dateDebut` date DEFAULT NULL,
  `idFiche` bigint(20) DEFAULT NULL,
  `idSection` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `T_Section`
--

CREATE TABLE `T_Section` (
  `idSection` bigint(20) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `T_Section`
--

INSERT INTO `T_Section` (`idSection`, `libelle`) VALUES
(6, 'en cours'),
(7, 'realisé');

-- --------------------------------------------------------

--
-- Table structure for table `T_Tableau`
--

CREATE TABLE `T_Tableau` (
  `idTableau` bigint(20) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `T_Tableau`
--

INSERT INTO `T_Tableau` (`idTableau`, `libelle`) VALUES
(1, 'Tableau 1'),
(2, 'Tableau 2');

-- --------------------------------------------------------

--
-- Table structure for table `T_Tableau_Section`
--

CREATE TABLE `T_Tableau_Section` (
  `idSection` bigint(20) NOT NULL,
  `idTableau` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `T_Tag`
--

CREATE TABLE `T_Tag` (
  `idTag` bigint(20) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `T_Tag`
--

INSERT INTO `T_Tag` (`idTag`, `libelle`) VALUES
(8, 'tag1'),
(9, 'tag2'),
(10, 'tag3');

-- --------------------------------------------------------

--
-- Table structure for table `T_Utilisateur`
--

CREATE TABLE `T_Utilisateur` (
  `codeUser` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `T_Utilisateur`
--

INSERT INTO `T_Utilisateur` (`codeUser`, `email`, `nom`, `prenom`) VALUES
('u1', 'boton@gmail.com', 'BOTON', 'Olive'),
('u2', 'machadi@gmail.com', 'MACHADI', 'Anwar'),
('u3', 'august@gmail.com', 'Dupont', 'Auguste '),
('u4', 'assogba@gmail.com', 'ASSOGBA', 'Thibault'),
('u5', 'botonoliv@gmail.com', 'ASSOGBA', 'Thibault'),
('u6', 'jacques@gmail.com', 'SETONDJI', 'Jacques');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `T_Fiche`
--
ALTER TABLE `T_Fiche`
  ADD PRIMARY KEY (`idFiche`),
  ADD KEY `FK9tqe4k7cy0uqre32kgvapxc3g` (`idTableau`),
  ADD KEY `FK6ndkftygk76yrwqh33c00xwde` (`codeUser`);

--
-- Indexes for table `T_Fiche_Tag`
--
ALTER TABLE `T_Fiche_Tag`
  ADD KEY `FKdh8egx20x9jn5fm67bay179ub` (`idTag`),
  ADD KEY `FKhh3bpeehiwwqmf4dbyalpp48o` (`idFiche`),
  ADD KEY `FKqdm5nt37dp5u4bf6hogm295gr` (`id_Tag`);

--
-- Indexes for table `T_PositionnementFiche`
--
ALTER TABLE `T_PositionnementFiche`
  ADD PRIMARY KEY (`idPositionnementFiche`),
  ADD KEY `FK1nb2vgaw6ss9y7byuv3a2ingc` (`idFiche`),
  ADD KEY `FKrnvcu0uex33iml5994cr4kw85` (`idSection`);

--
-- Indexes for table `T_Section`
--
ALTER TABLE `T_Section`
  ADD PRIMARY KEY (`idSection`);

--
-- Indexes for table `T_Tableau`
--
ALTER TABLE `T_Tableau`
  ADD PRIMARY KEY (`idTableau`);

--
-- Indexes for table `T_Tableau_Section`
--
ALTER TABLE `T_Tableau_Section`
  ADD KEY `FKfrl08dm4y2fbtddl13503nc9i` (`idTableau`),
  ADD KEY `FKlwfqotmhe3j8g2313dw94cdfb` (`idSection`);

--
-- Indexes for table `T_Tag`
--
ALTER TABLE `T_Tag`
  ADD PRIMARY KEY (`idTag`);

--
-- Indexes for table `T_Utilisateur`
--
ALTER TABLE `T_Utilisateur`
  ADD PRIMARY KEY (`codeUser`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `T_Fiche`
--
ALTER TABLE `T_Fiche`
  MODIFY `idFiche` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `T_Fiche`
--
ALTER TABLE `T_Fiche`
  ADD CONSTRAINT `FK6ndkftygk76yrwqh33c00xwde` FOREIGN KEY (`codeUser`) REFERENCES `T_Utilisateur` (`codeUser`),
  ADD CONSTRAINT `FK9tqe4k7cy0uqre32kgvapxc3g` FOREIGN KEY (`idTableau`) REFERENCES `T_Tableau` (`idTableau`);

--
-- Constraints for table `T_Fiche_Tag`
--
ALTER TABLE `T_Fiche_Tag`
  ADD CONSTRAINT `FKdh8egx20x9jn5fm67bay179ub` FOREIGN KEY (`idTag`) REFERENCES `T_Tag` (`idTag`),
  ADD CONSTRAINT `FKhh3bpeehiwwqmf4dbyalpp48o` FOREIGN KEY (`idFiche`) REFERENCES `T_Fiche` (`idFiche`),
  ADD CONSTRAINT `FKqdm5nt37dp5u4bf6hogm295gr` FOREIGN KEY (`id_Tag`) REFERENCES `T_Tag` (`idTag`);

--
-- Constraints for table `T_PositionnementFiche`
--
ALTER TABLE `T_PositionnementFiche`
  ADD CONSTRAINT `FK1nb2vgaw6ss9y7byuv3a2ingc` FOREIGN KEY (`idFiche`) REFERENCES `T_Fiche` (`idFiche`),
  ADD CONSTRAINT `FKrnvcu0uex33iml5994cr4kw85` FOREIGN KEY (`idSection`) REFERENCES `T_Section` (`idSection`);

--
-- Constraints for table `T_Tableau_Section`
--
ALTER TABLE `T_Tableau_Section`
  ADD CONSTRAINT `FKfrl08dm4y2fbtddl13503nc9i` FOREIGN KEY (`idTableau`) REFERENCES `T_Tableau` (`idTableau`),
  ADD CONSTRAINT `FKlwfqotmhe3j8g2313dw94cdfb` FOREIGN KEY (`idSection`) REFERENCES `T_Section` (`idSection`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

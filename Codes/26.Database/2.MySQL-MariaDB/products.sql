-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : ven. 27 juin 2025 à 18:29
-- Version du serveur : 11.7.2-MariaDB
-- Version de PHP : 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `productsjava`
--

-- --------------------------------------------------------

--
-- Structure de la table `products`
--

CREATE TABLE `products` (
  `product_id` int(11) NOT NULL,
  `product_name` varchar(255) NOT NULL,
  `product_price` double NOT NULL,
  `product_quantity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `products`
--

INSERT INTO `products` (`product_id`, `product_name`, `product_price`, `product_quantity`) VALUES
(1, 'Zotac Gaming NVIDIA GeForce RTX 3080', 985.99, 15),
(2, 'Logitech G502 LIGHTSPEED', 159, 3),
(3, 'FITFIU Fitness MC-200', 389.99, 11),
(4, 'Peluche Dora l\'exploratrice', 39.99, 20),
(5, 'Nikon D5600', 1049.99, 2),
(6, 'SanDisk 32 Go Extreme PRO SDXC', 26.88, 48),
(7, 'Pattex Bois Classic 250g', 7.2, 13),
(8, 'Lot de 4 bocaux en verre avec couvercle en bambou', 34.99, 7),
(9, 'Yaourts au lait entier vanille La laitière', 4.49, 0),
(10, 'SONGMICS fauteuil de bureau en toile', 74.99, 3);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`product_id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `products`
--
ALTER TABLE `products`
  MODIFY `product_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

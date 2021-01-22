-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 16 Ara 2020, 16:45:10
-- Sunucu sürümü: 10.4.14-MariaDB
-- PHP Sürümü: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `stoktakipotomasyonu`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanici_giris`
--

CREATE TABLE `kullanici_giris` (
  `id` int(11) NOT NULL,
  `kullanici_yetki` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `kullanici_adi` varchar(15) COLLATE utf8mb4_turkish_ci NOT NULL,
  `kullanici_email` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `kullanici_sifre` varchar(15) COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `kullanici_giris`
--

INSERT INTO `kullanici_giris` (`id`, `kullanici_yetki`, `kullanici_adi`, `kullanici_email`, `kullanici_sifre`) VALUES
(10, '', 'admin', '', '1234'),
(12, 'Müdür', 'abc', 'abc@gmail.com', '1234');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `main`
--

CREATE TABLE `main` (
  `id` int(11) NOT NULL,
  `kullanici_bilgileri` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `ürün_bilgileri` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `satis_bilgileri` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `satislar`
--

CREATE TABLE `satislar` (
  `id` int(11) NOT NULL,
  `satilan_ürün` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `satis_miktari` int(11) NOT NULL,
  `satis_tarihi` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `satis_fiyati` int(11) NOT NULL,
  `ürün_kari` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `satislar`
--

INSERT INTO `satislar` (`id`, `satilan_ürün`, `satis_miktari`, `satis_tarihi`, `satis_fiyati`, `ürün_kari`) VALUES
(16, 'havlu', 2, '10/12/2020', 1000, 1000),
(17, 'samsung', 1, '11/12/2020', 1000, 0),
(18, 'havlu', 2, '10/12/2020', 1000, 1000),
(19, 'havlu', 10, '10/12/2020', 1000, 5000),
(20, 'samsung', 10, '11/12/2020', 1000, 0),
(21, 'samsung', 9, '11/12/2020', 1000, 0),
(22, 'aa', 3, '11/12/2020', 33, 33),
(23, 'kola', 10, '11/12/2020', 10, 50),
(24, 'kola', 1, '11/12/2020', 10, 5),
(25, 'dell', 1, '04/12/2020', 56, 12),
(26, 'samsung', 1, '11/12/2020', 1500, 500);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `ürünler`
--

CREATE TABLE `ürünler` (
  `id` int(11) NOT NULL,
  `ürün_adi` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `ürün_kategorisi` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `ürün_stok` int(11) NOT NULL,
  `ürün_af` int(11) NOT NULL,
  `ürün_sf` int(11) NOT NULL,
  `tarih` varchar(15) COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `ürünler`
--

INSERT INTO `ürünler` (`id`, `ürün_adi`, `ürün_kategorisi`, `ürün_stok`, `ürün_af`, `ürün_sf`, `tarih`) VALUES
(24, 'samsung', 'elektronik', 29, 1000, 1500, '11/12/2020'),
(30, 'dell', 'pc', 0, 44, 56, '04/12/2020');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `kullanici_giris`
--
ALTER TABLE `kullanici_giris`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `main`
--
ALTER TABLE `main`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `satislar`
--
ALTER TABLE `satislar`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `ürünler`
--
ALTER TABLE `ürünler`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `kullanici_giris`
--
ALTER TABLE `kullanici_giris`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Tablo için AUTO_INCREMENT değeri `main`
--
ALTER TABLE `main`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Tablo için AUTO_INCREMENT değeri `satislar`
--
ALTER TABLE `satislar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- Tablo için AUTO_INCREMENT değeri `ürünler`
--
ALTER TABLE `ürünler`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

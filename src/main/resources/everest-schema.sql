drop schema `everest`;
CREATE SCHEMA IF NOT EXISTS `everest`;
USE `everest`;
CREATE TABLE IF NOT EXISTS `everest`.`item` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) NOT NULL,
    `price` DOUBLE NOT NULL,_______
    `quantity` INT(11) NOT NULL,
    `description` VARCHAR(255),
    PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `everest`.`customer` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `fk_item_id` INT(11) NOT NULL,
    PRIMARY KEY (`id`),
    CONSTRAINT `fk_item_id` FOREIGN KEY (`fk_item_id`) REFERENCES item(`id`),
    `address` VARCHAR(255) NOT NULL,
    `email` VARCHAR(255) NOT NULL,
    `name` VARCHAR(255) NOT NULL,
    `password` VARCHAR(255) NOT NULL,
    `phone` VARCHAR(255) NOT NULL,
    `username` VARCHAR(255) NOT NULL
);
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `bolao` ;
USE `bolao` ;

-- -----------------------------------------------------
-- Table `bolao`.`Usuario`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `bolao`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT ,
  `nome` VARCHAR(45) NULL ,
  `email` VARCHAR(45) NULL ,
  `telefone` VARCHAR(45) NULL ,
  `dataNascimento` DATE NULL ,
  PRIMARY KEY (`idUsuario`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bolao`.`Palpite`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `bolao`.`Palpite` (
  `idPalpite` INT NOT NULL AUTO_INCREMENT ,
  `campeao` VARCHAR(45) NULL ,
  `vice` VARCHAR(45) NULL ,
  `palpiteiro` INT NOT NULL ,
  PRIMARY KEY (`idPalpite`, `palpiteiro`) ,
  INDEX `teste_idx` (`palpiteiro` ASC) ,
  CONSTRAINT `constraintUsuario`
    FOREIGN KEY (`palpiteiro` )
    REFERENCES `bolao`.`Usuario` (`idUsuario` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `bolao` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

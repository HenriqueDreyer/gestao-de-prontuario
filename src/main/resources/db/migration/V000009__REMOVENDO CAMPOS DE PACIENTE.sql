ALTER TABLE `PACIENTE` 
DROP COLUMN `CPF`,
DROP COLUMN `NOME_COMP_MAE`,
DROP COLUMN `NOME_COMP_PAI`,
DROP COLUMN `SEXO`,
DROP COLUMN `SOBRENOME`,
DROP COLUMN `NOME`,
CHANGE COLUMN `RG` `ID_PESSOA` BIGINT(20) NOT NULL ,
DROP INDEX `CPF_UNIQUE` ;
ALTER TABLE `PACIENTE` 
ADD COLUMN `CPF` VARCHAR(11) NULL AFTER `NOME_COMP_MAE`,
ADD UNIQUE INDEX `CPF_UNIQUE` (`CPF` ASC);

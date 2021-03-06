ALTER TABLE `PESSOA_FISICA` 
ADD UNIQUE INDEX `CPF_UNIQUE` (`CPF` ASC);
  
ALTER TABLE `PACIENTE` 
ADD INDEX `FK_PACIENTE_PESSOA_F_idx` (`ID_PESSOA` ASC);
ALTER TABLE `PACIENTE` 
ADD CONSTRAINT `FK_PACIENTE_PESSOA_F`
  FOREIGN KEY (`ID_PESSOA`)
  REFERENCES `PESSOA_FISICA` (`ID`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
  
INSERT INTO `whisky`.`brewery` (`id`, `adresid`, `brewery`) VALUES ('1', '1', 'Beerkeg');
INSERT INTO `whisky`.`brewery` (`id`, `adresid`, `brewery`) VALUES ('2', '2', 'Hammered');
INSERT INTO `whisky`.`brewery` (`id`, `adresid`, `brewery`) VALUES ('3', '3', 'Smashed');
INSERT INTO `whisky`.`brewery` (`id`, `adresid`, `brewery`) VALUES ('4', '4', 'DrunkenMaster');
INSERT INTO `whisky`.`brewery` (`id`, `adresid`, `brewery`) VALUES ('5', '5', 'Shotglass');
INSERT INTO `whisky`.`brewery` (`id`, `adresid`, `brewery`) VALUES ('6', '6', 'LordWhisky');
INSERT INTO `whisky`.`brewery` (`id`, `adresid`, `brewery`) VALUES ('7', '7', 'Sandblasted');
INSERT INTO `whisky`.`whisky` (`id`, `age`, `breweryid`, `content`, `prize`, `rating`, `type`, `whiskyname`) VALUES ('1', '18', '1', '70cl', '37', '8.5', 'blend', 'Whisky1');
INSERT INTO `whisky`.`whisky` (`id`, `age`, `breweryid`, `content`, `prize`, `rating`, `type`, `whiskyname`) VALUES ('2', '18', '1', '70cl', '37', '8.5', 'blend', 'Whisky2');
INSERT INTO `whisky`.`whisky` (`id`, `age`, `breweryid`, `content`, `prize`, `rating`, `type`, `whiskyname`) VALUES ('3', '18', '2', '70cl', '37', '8.5', 'blend', 'Whisky3');
INSERT INTO `whisky`.`whisky` (`id`, `age`, `breweryid`, `content`, `prize`, `rating`, `type`, `whiskyname`) VALUES ('4', '18', '2', '70cl', '37', '8.5', 'blend', 'Whisky4');
INSERT INTO `whisky`.`whisky` (`id`, `age`, `breweryid`, `content`, `prize`, `rating`, `type`, `whiskyname`) VALUES ('5', '18', '3', '70cl', '37', '8.5', 'blend', 'Whisky5');
INSERT INTO `whisky`.`whisky` (`id`, `age`, `breweryid`, `content`, `prize`, `rating`, `type`, `whiskyname`) VALUES ('6', '18', '4', '70cl', '37', '8.5', 'blend', 'Whisky6');
INSERT INTO `whisky`.`whisky` (`id`, `age`, `breweryid`, `content`, `prize`, `rating`, `type`, `whiskyname`) VALUES ('7', '18', '5', '70cl', '37', '8.5', 'blend', 'Whisky7');
INSERT INTO `whisky`.`whisky` (`id`, `age`, `breweryid`, `content`, `prize`, `rating`, `type`, `whiskyname`) VALUES ('8', '18', '6', '70cl', '37', '8.5', 'blend', 'Whisky8');
INSERT INTO `whisky`.`whisky` (`id`, `age`, `breweryid`, `content`, `prize`, `rating`, `type`, `whiskyname`) VALUES ('9', '18', '7', '70cl', '37', '8.5', 'blend', 'Whisky9');
INSERT INTO `whisky`.`adres` (`id`, `street`, `number`, `postalcode`, `country`, `breweryid`) VALUES ('1', 'Ahabstreet', '23', '7777ER', 'NL', '1');
INSERT INTO `whisky`.`adres` (`id`, `street`, `number`, `postalcode`, `country`, `breweryid`) VALUES ('2', 'Brutusstraat', '89', '111TY', 'BE', '1');
INSERT INTO `whisky`.`adres` (`id`, `street`, `number`, `postalcode`, `country`, `breweryid`) VALUES ('3', 'Rampagestreet', '45', '97654', 'US', '1');
INSERT INTO `whisky`.`adres` (`id`, `street`, `number`, `postalcode`, `country`, `breweryid`) VALUES ('4', 'Papastreet', '29', 'nnj', 'UK', '1');
INSERT INTO `whisky`.`adres` (`id`, `street`, `number`, `postalcode`, `country`, `breweryid`) VALUES ('5', 'HAHAHAHA', '000', 'trtrt', 'L', '1');
INSERT INTO `whisky`.`adres` (`id`, `street`, `number`, `postalcode`, `country`, `breweryid`) VALUES ('6', 'What?', '78', '22ju83', 'MOON', '1');
UPDATE `whisky`.`adres` SET `startdate` = '1944-10-15' WHERE (`id` = '1');
UPDATE `whisky`.`adres` SET `startdate` = '1865-06-12' WHERE (`id` = '2');
UPDATE `whisky`.`adres` SET `startdate` = '1995-01-10' WHERE (`id` = '3');
UPDATE `whisky`.`adres` SET `startdate` = '1995-01-10' WHERE (`id` = '4');
UPDATE `whisky`.`adres` SET `startdate` = '1995-01-10' WHERE (`id` = '5');
UPDATE `whisky`.`adres` SET `startdate` = '1995-01-10' WHERE (`id` = '6');




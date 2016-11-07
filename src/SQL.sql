CREATE TABLE `solrTest` (
  `solrID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `context` varchar(255) DEFAULT NULL COMMENT 'context',
  `updateTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT 'updateTime',
  PRIMARY KEY (`ID`)
) DEFAULT CHARSET=utf8;
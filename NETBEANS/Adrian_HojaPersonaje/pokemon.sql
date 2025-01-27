CREATE DATABASE IF NOT EXISTS Pokemon 
DEFAULT CHARACTER SET utf8 
DEFAULT COLLATE utf8_general_ci;

USE Pokemon;

DROP TABLE IF EXISTS datos;

CREATE TABLE datos(
	numpokedex INT NOT NULL,
    nombre VARCHAR(20) NOT NULL,
    nivel INT NOT NULL,
    tipo1 VARCHAR(10) NOT NULL,
    tipo2 VARCHAR(10),
    ps INT NOT NULL,
    ataque INT NOT NULL,
    defensa INT NOT NULL,
    ataqueesp INT NOT NULL,
    defensaesp INT NOT NULL,
    velocidad INT NOT NULL,
    objeto VARCHAR(2),
    PRIMARY KEY (numpokedex)
);

/*
SELECT * FROM datos;
DELETE FROM datos WHERE numpokedex="002";
*/
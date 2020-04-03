CREATE DATABASE dataBaseMotocicletas ;
USE dataBaseMotocicletas ;

CREATE TABLE IF NOT EXISTS tableMotocicleta(
        idMotocicleta INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
        modeloMotocicleta VARCHAR(30) NOT NULL,
        renavamMotocicleta VARCHAR(20) NOT NULL,
        chassiMotocicleta VARCHAR(30) NOT NULL,
        placaMotocicleta VARCHAR(12) NOT NULL,
        corMotocicleta VARCHAR(30) NOT NULL,
        anoMotocicleta INTEGER NOT NULL,
        valorCompra FLOAT NOT NULL,
        descricao VARCHAR(255))

CREATE TABLE IF NOT EXISTS tableMotocicletaVenda(
    idVendaMotocicleta INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nomeVendedor VARCHAR(20) NOT NULL,
    valorGasto FLOAT NOT NULL,
    valorVenda FLOAT NOT NULL)



INSERT INTO tableMotocicleta (idMotocicleta,modeloMotocicleta,renavamMotocicleta,chassiMotocicleta,placaMotocicleta,
corMotocicleta,anoMotocicleta,valorCompra,descricao) VALUES (?) ;

INSERT INTO tableMotocicletaVenda(idVendaMotocicleta,nomeVendedor,valorGasto,valorVenda) VALUES(?) ;

--                                  SELECT
-- FIND ALL QUERY
SELECT * FROM tableMotocicleta ;

-- FIND BY idMotocicleta WHERE idMotocicleta
SELECT * FROM tableMotocicleta WHERE idMotocicleta = ? ;

-- FIND BY idMotocicleta && modeloMotocicleta && chassiMotocicleta && anoMotocicleta && corMotocicleta && placaMotocicleta
SELECT idMotocicleta,modeloMotocicleta,chassiMotocicleta,anoMotocicleta,corMotocicleta,placaMotocicleta FROM tableMotocicleta ;

-- FIND BY idMotocicleta && modeloMotocicleta && anoMotocicleta && corMotocicleta && placaMotocicleta
SELECT idMotocicleta,modeloMotocicleta,anoMotocicleta,corMotocicleta,placaMotocicleta FROM tableMotocicleta ;

-- FIND BY modeloMotocicleta && anoMotocicleta && corMotocicleta && placaMotocicleta
SELECT modeloMotocicleta,anoMotocicleta,corMotocicleta,placaMotocicleta FROM tableMotocicleta ;

-- FIND SUM valorCompra
SELECT SUM(valorCompra) FROM tableMotocicleta ; 

-- DELETE QUERY ID
DELETE FROM tableMotocicleta WHERE idMotocicleta ;

-- DELETE QUERY ID
DELETE FROM tableMotocicletaVenda WHERE idVendaMotocicleta ;
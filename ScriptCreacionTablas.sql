CREATE DATABASE aero_solve;

CREATE TABLE ciudades
(
idCiudad INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
nomCiudad VARCHAR(25) NOT NULL
);

CREATE TABLE vuelos
(
idVuelo INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
idCiudadOrg INT UNSIGNED NOT NULL,
idCiudadDest INT UNSIGNED NOT NULL,
vlrIda INT UNSIGNED NOT NULL,
VlrIdaVuelta INT UNSIGNED NOT NULL,
porcMañana DEC(3,1) NOT NULL,
porcTarde DEC(3,1) NOT NULL,
porcFSemana DEC(3,1) NOT NULL,
FOREIGN KEY (idCiudadOrg) REFERENCES ciudades(idCiudad),
FOREIGN KEY (idCiudadDest) REFERENCES ciudades(idCiudad)
);

INSERT INTO ciudades ( nomCiudad) VALUES ('Cartagena');
INSERT INTO ciudades ( nomCiudad) VALUES ('Medellin');
INSERT INTO ciudades ( nomCiudad) VALUES ('Monteria');
INSERT INTO ciudades ( nomCiudad) VALUES ('Bogota');
INSERT INTO ciudades ( nomCiudad) VALUES ('Santa Marta');

INSERT INTO vuelos (
idCiudadOrg,
idCiudadDest,
vlrIda,
VlrIdaVuelta,
porcMañana,
porcTarde,
porcFSemana)
 VALUES (2,1,120000,200000,15.5,10.6,25.9);
 
INSERT INTO vuelos (
idCiudadOrg,
idCiudadDest,
vlrIda,
VlrIdaVuelta,
porcMañana,
porcTarde,
porcFSemana)
 VALUES (2,3,260000,400000,17.5,12.6,25.9);
 
 INSERT INTO vuelos (
idCiudadOrg,
idCiudadDest,
vlrIda,
VlrIdaVuelta,
porcMañana,
porcTarde,
porcFSemana)
 VALUES (2,5,90000,150000,25.5,15.6,25.9);
 

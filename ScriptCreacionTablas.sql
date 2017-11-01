CREATE DATABASE aero_solve;

CREATE TABLE ciudades
(
id_ciudad INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
nom_ciudad VARCHAR(25) NOT NULL
);

CREATE TABLE vuelos
(
id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
id_origen INT UNSIGNED NOT NULL,
nom_origen  VARCHAR(25) NOT NULL,
id_dest INT UNSIGNED NOT NULL,
nom_dest  VARCHAR(25) NOT NULL,
hora_inic  VARCHAR(25) NOT NULL,
hora_fin VARCHAR(25) NOT NULL,
vlr_ida INT UNSIGNED NOT NULL,
Vlr_idavuelta INT UNSIGNED NOT NULL,
porc_finsemana DOUBLE(3,1) NOT NULL,
FOREIGN KEY (id_origen) REFERENCES ciudades(id_ciudad)
);

CREATE TABLE reservas
(
id_reserva INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
id_vuelo INT UNSIGNED NOT NULL,
id_cedula INT UNSIGNED NOT NULL,
nom_cliente  VARCHAR(50) NOT NULL,
vlr_tiquete DOUBLE(7,1) NOT NULL,
fec_venta  VARCHAR(25) NOT NULL,
solo_ida VARCHAR(1) NOT NULL,
fec_ida VARCHAR(25) NOT NULL,
fec_regreso VARCHAR(25) NULL,
FOREIGN KEY (id_vuelo) REFERENCES vuelos(id)
);

INSERT INTO ciudades ( nom_ciudad) VALUES ('Cartagena');
INSERT INTO ciudades ( nom_ciudad) VALUES ('Medellin');
INSERT INTO ciudades ( nom_ciudad) VALUES ('Monteria');
INSERT INTO ciudades ( nom_ciudad) VALUES ('Bogota');
INSERT INTO ciudades ( nom_ciudad) VALUES ('Santa Marta');

INSERT INTO vuelos (
id_origen,
nom_origen,
id_dest ,
nom_dest,
hora_inic  ,
hora_fin ,
vlr_ida ,
Vlr_idavuelta ,
porc_finsemana)
 VALUES (2,'Medellin',1,'Cartagena','08:19:03', '10:19:03',120000,200000,25.9);
 
 
 INSERT INTO vuelos (
id_origen,
nom_origen,
id_dest ,
nom_dest,
hora_inic  ,
hora_fin ,
vlr_ida ,
Vlr_idavuelta ,
porc_finsemana)
 VALUES (2,'Medellin',5,'Santa Marta','10:19:03', '12:19:03',120000,200000,25.9);
 
  INSERT INTO vuelos (
id_origen,
nom_origen,
id_dest ,
nom_dest,
hora_inic  ,
hora_fin ,
vlr_ida ,
Vlr_idavuelta ,
porc_finsemana)
 VALUES (2,'Medellin',3,'Monteria','20:19:03', '22:19:03',120000,200000,25.9);
 
 INSERT INTO reservas (
id_vuelo ,
id_cedula ,
nom_cliente,
vlr_tiquete,
fec_venta,
solo_ida ,
fec_ida ,
fec_regreso)
 VALUES (1, 1067859785,'Pedro Hincapie',150000, NOW(),'S','29-10-2017','01-12-2017');
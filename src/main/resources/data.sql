DROP TABLE IF EXISTS CLIENTES;

CREATE TABLE CLIENTES(
   NMIDENTIFICACION BIGINT(10) PRIMARY KEY,
   DSNOMBRE CHAR(50),
   DSDIRECCION VARCHAR(100),
   DSCIUDAD VARCHAR(30),
   NMTELEFONO BIGINT(20)
);

ALTER TABLE CLIENTES MODIFY(NMTELEFONO BIGINT(20));

DROP TABLE IF EXISTS ASESORES;

CREATE TABLE ASESORES(
   NMIDENTIFICACION BIGINT(10) PRIMARY KEY,
   DSNOMBRE CHAR(50),
   DSESPECIALIDAD CHAR(50)
);

DROP TABLE IF EXISTS TARJETAS;

CREATE TABLE TARJETAS(
   NMTARJETA BIGINT(16) PRIMARY KEY,
   NMCCV INT(4),
   DSTIPOTARJETA CHAR(50),
   NMIDENTIFICACIONCLIENTE BIGINT(10),
	NMIDENTIFICACIONASESOR BIGINT(10),
	FOREIGN KEY (NMIDENTIFICACIONCLIENTE) REFERENCES CLIENTES(NMIDENTIFICACION),
	FOREIGN KEY (NMIDENTIFICACIONASESOR) REFERENCES ASESORES(NMIDENTIFICACION)
);

INSERT INTO CLIENTES(NMIDENTIFICACION, DSNOMBRE, DSDIRECCION, DSCIUDAD, NMTELEFONO)VALUES('92548165', 'JUAN PABLO BELTRAN VEGA', 'CL 53 A N 80A 9', 'MEDELLIN', 3013807123);
   
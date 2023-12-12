# AgendaAcceso
Proyecto de agenda de trabajadores realizado en Acceso a Datos.

//Agrego la base de datos bdTrabajadores; Luego agregare mas tranajadores
DROP DATABASE IF EXISTS bdTrabajadores;
create DATABASE bdTrabajadores;
use bdTrabajadores;

create table Trabajadores(
	dni varchar(9) PRIMARY KEY not null,
    nombre varchar(25) not null,
    apellidos varchar(50) not null,
    sueldo double(6,2) not null,
    fecha date not null,
    matricula varchar(9) not null
);

INSERT INTO Trabajadores VALUES ('12345678A','Andres','Gutierrez','1500,00','1989-01-13','12312312P');
INSERT INTO Trabajadores VALUES ('23456789B','Antonio','Fernandez','1400,00','1999-03-21','12312312Q');
INSERT INTO Trabajadores VALUES ('34567890C','Julio','Zamora','1800,00','2000-10-01','12312312R');
INSERT INTO Trabajadores VALUES ('45678901D','Carmen','Escribano','1600,00','1968-11-30','12312312S');
INSERT INTO Trabajadores VALUES ('56789012E','Marcos','Perez','2100,00','1995-07-08','12312312T');

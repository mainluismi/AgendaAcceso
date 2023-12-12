# AgendaAcceso
Proyecto de agenda de trabajadores realizado en Acceso a Datos.

//Agrego la base de datos bdTrabajadores;
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


INSERT INTO Trabajadores VALUES ('12345678A','Andres','Gutierrez','1500.00','1989-01-13','12312312P');
INSERT INTO Trabajadores VALUES ('23456789B','Antonio','Fernandez','1400.00','1999-03-21','12312312Q');
INSERT INTO Trabajadores VALUES ('34567890C','Julio','Zamora','1800.00','2000-10-01','12312312R');
INSERT INTO Trabajadores VALUES ('45678901D','Carmen','Escribano','1600.00','1968-11-30','12312312S');
INSERT INTO Trabajadores VALUES ('56789012E','Marcos','Perez','2100.00','1995-07-08','12312312T');
INSERT INTO Trabajadores VALUES ('67890123F','Francisco','Lopez','1504.00','1989-01-13','12312312U');
INSERT INTO Trabajadores VALUES ('78901234G','Miguel','Rodriguez','1105.00','1999-03-21','12312312V');
INSERT INTO Trabajadores VALUES ('89012345H','Angel','Martinez','2800.00','2001-10-01','12312312W');
INSERT INTO Trabajadores VALUES ('90123456I','Leonardo','Sanchez','5600.00','1948-11-30','12312312X');
INSERT INTO Trabajadores VALUES ('01234567J','Marcos','Gomez','1100,70','1985-07-08','12312312Y');
INSERT INTO Trabajadores VALUES ('12345678K','Pedro','Martin','3500.02','1979-01-13','12312312Z');
INSERT INTO Trabajadores VALUES ('23456789L','Antonio','Garcia','3200.00','1989-03-21','12312312A');
INSERT INTO Trabajadores VALUES ('34567890M','Julio','Gomez','800.00','2001-10-01','12312312B');
INSERT INTO Trabajadores VALUES ('45678901N','Carmen','Fernandez','1000.00','1968-11-30','12312312C');
INSERT INTO Trabajadores VALUES ('56789012O','Marcos','Rodriguez','4000.00','1995-07-08','12312312D');

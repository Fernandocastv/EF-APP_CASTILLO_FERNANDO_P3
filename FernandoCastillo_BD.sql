create Database FernandoCastillo_EF;
use FernandoCastillo_EF;
 
create table usuario (

	id Int Primary Key Auto_Increment,
    codigo varchar(30) not null,
    password varchar(100) not null,
    email varchar(60) not null,
    rol varchar(30) not null,
	activo boolean not null
);

Insert Into Usuario Values
(Null, 'FernandoCastillo',
'$2a$12$I/HOZHFCCyX9Sp.BDmsumeP7yeldj5Mjw1qihRFzG/F//N.Pn7en6', -- FerCV
'fernando@gmail.com', 'USER', True);


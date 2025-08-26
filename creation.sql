drop database sea;
create database sea;
use sea;

create table tb_user (
 id int primary key auto_increment not null,
 nome varchar(100) not null,
 permissao varchar(100) not null,
 data_cadastro Date not null,
 hora_cadastro Time not null,
 login varchar(100) not null,
 senha varchar(100) not null,
 log LONGTEXT not null
);
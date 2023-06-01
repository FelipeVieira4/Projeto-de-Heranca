create database crimes;
use crimes;

# Criação da tablea "localização"
create table localizacao(
	id int primary key auto_increment,
    local varchar(255),
    rua varchar(255) not null,
    bairro varchar(255) not null
);

# Criação da tablea "crimes"
create table crime(
	id int primary key auto_increment,
    data date not null,
    tipoCrime enum('Assalto','Roubo','Jogar LOL','Matar Aula') not null,
    id_local int not null,foreign key(id_local) references localizacao(id)
);

#Criação da tebela "vitima"
create table vitima(
	id int primary key auto_increment,
    nome varchar(255) not null,
    cpf varchar(255) not null,
    id_crime int,foreign key(id_crime) references crime(id) 
);

#Criação da tebela "suspeito"
create table suspeito(
	id int primary key auto_increment,
    nome varchar(255) not null,
    CPF varchar(11) not null,
    telefone varchar(11),
    idade int not  null
);

#Criação da relação crime e suspeito
create table crime_suspeito(
	id int primary key auto_increment,
    id_crime int not null,foreign key(id_crime) references crime(id),
    id_suspeito int not null,foreign key(id_suspeito) references suspeito(id)
);

#Criação da tabela "evidencia"
create table evidencia(
	id int primary key auto_increment,
    iten varchar(255) not null,
    id_crime int not null,foreign key(id_crime) references crime(id)
);


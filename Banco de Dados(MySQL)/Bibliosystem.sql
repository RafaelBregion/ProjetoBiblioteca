create database BiblioSystem;
use BiblioSystem;

    
create table leitor(
	id_leitor int auto_increment,
    nome_leitor varchar(40) not null,
    cpf_leitor varchar(20) not null unique,
    dataNascimento_leitor varchar(15) not null,
    sexo_leitor varchar(20) not null,
	formacao_leitor varchar(40) not null,
    email_leitor varchar(40) not null,
    telefone_leitor varchar(20) not null,
    celular_leitor varchar(20) not null,
    logradouro_leitor varchar(25) not null,
    numero_leitor varchar(7) not null,
    bairro_leitor varchar(30) not null,
    cidade_leitor varchar(30) not null,
    estado_leitor varchar(30) not null,
    cep_leitor varchar(30) not null,
    primary key(id_leitor));

create table livro(
	id_livro int auto_increment,
    titulo_livro varchar(60),
    autor_livro varchar(30),
    genero_livro varchar(30),
    anoPubli_livro varchar(15),
    editora_livro varchar(30),
    numeroPag_livro varchar(15),
    isbn_livro varchar(25),
    codBarras_livro varchar(25),
    primary key(id_livro));
    
create table funcionario(
	id_funcionario int auto_increment,
    nome_funcionario varchar(80) not null,
    cpf_funcionario varchar(20) not null unique,
    dataNascimento_funcionario varchar(15) not null,
    sexo_funcionario varchar(20) not null,
	formacao_funcionario varchar(40) not null,
    email_funcionario varchar(40) not null,
    telefone_funcionario varchar(20) not null,
    celular_funcionario varchar(20) not null,
    logradouro_funcionario varchar(25) not null,
    numero_funcionario varchar(7) not null,
    bairro_funcionario varchar(30) not null,
    cidade_funcionario varchar(30) not null,
    estado_funcionario varchar(30) not null,
    cep_funcionario varchar(30) not null,
    salario_funcionario decimal(10,2) not null,
    dataAdmissao_funcionario varchar(30) not null,
    usuario_funcionario varchar(15) not null,
    senha_funcionario varchar(15) not null,
    primary key(id_funcionario));
    
create table Reserva(
    id_reserva int auto_increment,
    nome_usuario varchar(40) not null,
    cpf_usuario varchar(20) not null unique,
    título_livro varchar(40) not null,
    data_emprestimo varchar(20) not null,
    primary key (id_reserva));
    
create table Devolucao(
	id_devolucao int auto_increment,
	titulo_livro varchar(40) not null,
    nome_usuario varchar(40) not null,
    cpf_usuario varchar(40) not null,
    data_emprestimo varchar(40) not null,
	data_devolucao varchar(20) not null unique,
	data_entregue varchar(40) not null,
	multa_usuario decimal(10,2) not null,
	primary key(id_devolucao));
    
insert into funcionario values ('1','ADM','','','','','','','','','','','','','','00','','admin','admin');



select*from Devolucao;
SET SQL_SAFE_UPDATES = 0;
drop database bibliosystem;
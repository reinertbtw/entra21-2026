create database atividade_pratica;

use atividade_pratica;

/* Parte 1 - Criação das Tabelas */
create table Produto (
	id_produto int primary key auto_increment,
    nome varchar(100),
    preco decimal(10,2),
    estoque int
);

create table Pedido (
	id_pedido int primary key auto_increment,
	data_pedido date,
    nome_cliente varchar(100)
);

create table Item_Pedido (
	id_item int primary key auto_increment,
    id_pedido int,
    id_produto int,
    quantidade int,
    valor_unitario decimal(10,2),
    
    foreign key (id_pedido) references Pedido(id_pedido),
    foreign key (id_produto) references Produto(id_produto)
);

show tables;

/* Parte 2 - Inserção dos Dados */
insert into Produto (nome, preco, estoque)
values
('Arroz', 25.00, 30),
('Feijao', 8.50, 25),
('Macarrao', 6.00, 15),
('Refrigerante', 9.90, 20),
('Chocolate', 4.50, 40);

insert into Pedido (data_pedido, nome_cliente)
values ('2026-06-15', 'Joao Silva');

insert into Item_Pedido
(id_pedido, id_produto, quantidade, valor_unitario)
values
(1, 1, 2, 25.00),
(1, 4, 1, 9.90),
(1, 5, 3, 4.50);

/* Parte 3 - Consultas */
select * from Produto;

select * from Produto
where estoque > 10;

select * from Produto
order by preco;

select * from Pedido
where id_pedido = 1;

select * from Item_Pedido
where id_pedido = 1;

/* Parte 4 - Alteração de Dados */
update Produto
set preco = 27.00
where id_produto = 1;

update Produto
set estoque = 50
where id_produto = 1;

update Produto
set nome = 'Macarrao'
where id_produto = 3;

update Pedido
set nome_cliente = 'Maria Souza'
where id_pedido = 1;

/* Parte 5 - Cupom Fiscal */
select
	p.nome as Produto,
    i.quantidade as Qtd,
    i.valor_unitario as 'Valor Unit.',
    (i.quantidade * i.valor_unitario) as Subtotal
from Item_Pedido i
join Produto p
on i.id_produto = p.id_produto
where i.id_pedido = 1;

select
	sum(i.quantidade * i.valor_unitario) as 'Total da Compra'
from Item_Pedido i
where i.id_pedido = 1;

/* Relatório Completo */
select
	pe.id_pedido,
    pe.nome_cliente,
    pe.data_pedido,
    p.nome as Produto,
    i.quantidade,
    i.valor_unitario,
    (i.quantidade * i.valor_unitario) as Subtotal
from Pedido pe
join Item_Pedido i
on pe.id_pedido = i.id_pedido
join Produto p
on p.id_produto = i.id_produto
where pe.id_pedido = 1;

/* Storages Procedures */
delimiter $$

create procedure MostrarPedido(IN p_id_pedido INT)
begin
    select
        pr.nome AS produto,
        ip.quantidade,
        ip.valor_unitario,
        (ip.quantidade * ip.valor_unitario) AS subtotal
    from item_pedido ip
    join produto pr
        on ip.id_produto = pr.id_produto
    where ip.id_pedido = p_id_pedido;
end$$

delimiter ;

delimiter $$

create procedure AtualizarEstoque(
    in p_id_produto INT,
    in p_quantidade INT
)

begin
    update produto
    set estoque = estoque - p_quantidade
    where id_produto = p_id_produto;
end$$

delimiter ;

call MostrarPedido(1);
select * from produto;

call AtualizarEstoque(1, 2);
select * from produto;

drop procedure if exists CadastrarProduto;

delimiter $$

create procedure CadastrarProduto (
    in p_nome varchar(100),
    in p_preco decimal(10,2),
    in p_estoque int
)

begin
    insert into produto (nome, preco, estoque)
    values (p_nome, p_preco, p_estoque);
end$$

delimiter ;

call CadastrarProduto('abacaxi', 29.00, 9);
select * from produto;

/* Triggers */
--------------
/* Exemplo 1 - Trigger de Auditoria */
create table clientes(
	id int auto_increment primary key,
    nome varchar(100),
    email varchar(100)
);

create table log_clientes(
	id int auto_increment primary key,
	mensagem varchar(255),
    data_evento datetime
);

delimiter $$

create trigger trg_cliente_insert
after insert on clientes
for each row
begin

	insert into log_clientes(
		mensagem,
        data_evento
	)
    values(
		concat('Cliente cadastrado: ', new.nome),
        now()
	);
end $$

delimiter ;

insert into clientes(nome,email)
values('João','joao@email.com');

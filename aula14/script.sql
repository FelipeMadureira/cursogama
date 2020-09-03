use aula10;

alter table usuario add column linkFoto varchar(200);

update usuario set linkFoto = 'https://hennesseyonline.com/wp-content/uploads/2015/05/staff-placeholder-male.jpg' where id > 0;

insert into pedido values(null, '2020-08-20', 'P', 1);
insert into pedido values(null, '2020-08-20', 'C', 1);
insert into pedido values(null, '2020-08-23', 'P', 1);
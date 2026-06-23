create database atividade_pratica2;

use atividade_pratica2;

/* Considere o banco loja. 
1. Crie um usuário chamado vendedor. 
2. Permita apenas: 
o SELECT 
o INSERT 
o UPDATE 
3. Verifique as permissões. 
4. Revogue o UPDATE. 
5. Verifique novamente as permissões. */

-- 1 
create user 'vendedor'@'localhost'
identified by '123';

-- 2
grant select, insert, update
on loja.*
to 'vendedor'@'localhost';

-- 3
show grants for 'vendedor'@'localhost';

-- 4
revoke update
on loja.*
from 'vendedor'@'localhost';

-- 5
show grants for 'vendedor'@'localhost';

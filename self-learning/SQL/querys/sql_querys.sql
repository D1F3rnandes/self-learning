  /*Listando os to 10 clientes que tem mais pedidos ordenados pela 
  quantidade de pedidos.*/
SELECT
  CONCAT (first_name,' ',last_name) AS Clientes,
  order_id AS Pedidos_Quantidades
FROM
  pdopocs.training_dataset_dsilv244.customers
    INNER JOIN pdopocs.training_dataset_dsilv244.orders
    ON orders.customer_id = customers.customer_id
ORDER BY Pedidos_Quantidades DESC
LIMI 10;

  /*Criando uma view com os TopClientes do resultado Query Anterior*/
CREATE VIEW
  pdopocs.training_dataset_dsilv244.TopClientes AS
SELECT
  CONCAT (first_name,' ',last_name) AS Clientes,
  order_id AS Pedidos_Quantidades
FROM
  pdopocs.training_dataset_dsilv244.customers
    INNER JOIN pdopocs.training_dataset_dsilv244.orders
    ON orders.customer_id = customers.customer_id
ORDER BY Pedidos_Quantidades DESC
LIMI 10; 
  
  /*Listando as lojas que mais vendem, ou seja, que mais tem quantitdade 
  de pedidos.*/
SELECT
  store_name AS lojas,
  count (order_id) AS qtdPedidos,
FROM 
  pdopocs.training_dataset_dsilv244.stores
    INNER JOIN pdopocs.training_dataset_dsilv244.orders
    ON orders.store_id = stores.store_id
GROUP BY lojas
ORDER BY qtdPedidos DESC
LIMIT 10;

  /*Criando uma view com as TopLojas do rsultado da Query Anterior*/

CREATE VIEW
  pdopocs.training_dataset_dsilv244.TopLojas AS
SELECT
  store_name AS lojas,
  count (order_id) AS qtdPedidos,
FROM 
  pdopocs.training_dataset_dsilv244.stores
    INNER JOIN pdopocs.training_dataset_dsilv244.orders
    ON orders.store_id = stores.store_id
GROUP BY lojas
ORDER BY qtdPedidos DESC
LIMIT 10;

/*Listando a m[edia de faturamento das lojas*/
SELECT
  store_name AS Lojas,
  CAST (AVG(list_price) AS int64) AS media_faturamento
FROM 
  pdopocs.training_dataset_dsilv244.orders
    INNER JOIN pdopocs.training_dataset_dsilv244.stores 
    ON stores.store_id = orders.store_id
      INNER JOIN pdopocs.training_dataset_dsilv244.orders_items 
      ON orders.order_id = orders_items.order_id
GROUP BY Lojas
ORDER BY media_faturamento DESC
LIMIT 10;

/*Listando a soma de todos os descontos dos clientes na companhia*/
SELECT
  CONCAT(first_name,' ',last_name) AS cliente,
  SUM(discount) AS Desconto
FROM 
  pdopocs.training_dataset_dsilv244.orders
    INNER JOIN pdopocs.training_dataset_dsilv244.customers 
    ON customers.customer_id = orders.customer_id
      INNER JOIN pdopocs.training_dataset_dsilv244.orders_items 
      ON orders.order_id = orders_items.order_id
GROUP BY cliente
ORDER BY Desconto DESC
LIMIT 10;

/*Liste a soma de todos os descontos dos clientes na companhia*/
SELECT
  store_name AS Lojas,
  MAX(discount) AS Desconto
FROM 
  pdopocs.training_dataset_dsilv244.orders
    INNER JOIN pdopocs.training_dataset_dsilv244.stores 
    ON stores.store_id = orders.store_id
      INNER JOIN pdopocs.training_dataset_dsilv244.orders_items 
      ON orders.order_id = orders_items.order_id
GROUP BY Lojas
ORDER BY Desconto DESC
LIMIT 10;

/*Queremos descobrir clientes que estão na mesma localidade para 
administrar melhor nossas entregas. Hoje temos uma entrega pra cliente 
de Customer_id = 5. Quais são os possíveis outros clientes no mesmo 
zip_code que o dela? Selecionar com uma única query utilizando subquerys 
clientes que tem o mesmo zip_code que o dela*/

SELECT
  CONCAT (c.first_name,' ',c.last_name) AS customer_full_name,
  c.zip_code
FROM
  pdopocs.training_dataset_dsilv244.customers AS c
WHERE
  c.zip_code IN
    (SELECT
      c.zip_code
    FROM
      pdopocs.training_dataset_dsilv244.customers AS c
    WHERE
      c.customer_id = 5);

/*Queremos descobrir staffs que são gerenciados pelo mesmo gerente. 
Não sabemos qual o gerente da staff_id = 5 e precisamos entender quem 
mais faz parte do time dela. Quais são os possíveis outros staffs no 
mesmo time que ela, gerenciados pelo mesmo manager_id que o dela? 
Selecionar com uma única query utilizando subquerys staffs que possuem 
o mesmo gerente que a staff de código 5.*/

SELECT
  CONCAT(s.frist_name,' ',s.last_name) AS staffs_full_name,
  s.manager_id AS manager
FROM
  pdopocs.training_dataset_dsilv244.staffs AS s
WHERE
  s.manager_id IN
    (SELECT
      s.manager_id
    FROM
      pdopocs.training_dataset_dsilv244.staffs AS s
    WHERE
      s.staff_id = 5
    );

/*Queremos descobrir os produtos mais caros que temos. Para analisar isso 
vamos definir como métrica os produtos que estão acima da média dos valores 
de todos os produtos. Selecionar com uma única query utilizando subquerys, 
os produtos que estão acima da média de todos os produtos.*/

SELECT
  DISTINCT oi.product_id,
  oi.list_price,
FROM
  pdopocs.training_dataset_dsilv244.orders_items AS oi
WHERE
  oi.list_price > (SELECT
    AVG(oi.list_price)
  FROM
    pdopocs.training_dataset_dsilv244.orders_items AS oi)
ORDER BY
  oi.product_id
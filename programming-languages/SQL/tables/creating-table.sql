CREATE TABLE
  'customers' ( costumer_id INT64,
    frist_name STRING NOT NULL,
    last_name STRING NOT NULL,
    phone STRING,
    email STRING NOT NULL,
    street STRING,
    city STRING,
    state STRING,
    zip_code INT64 );
CREATE TABLE
  'orders_items' ( order_id INT64,
    item_id INT64,
    product_id INT64 NOT NULL,
    quantity INT64 NOT NULL,
    list_price DECIMAL (10, 2) NOT NULL,
    discount DECIMAL (4, 2) NOT NULL );
CREATE TABLE
  'orders' ( order_id INT64,
    customer_id INT64,
    order_status INT64 NOT NULL,
    order_date STRING NOT NULL,
    required_date STRING NOT NULL,
    shipped_date STRING,
    store_id INT64 NOT NULL,
    staff_id INT64 NOT NULL );
CREATE TABLE
  'staffs' ( staff_id INT64,
    frist_name STRING NOT NULL,
    last_name STRING NOT NULL,
    email STRING NOT NULL,
    phone STRING,
    active INT64 NOT NULL,
    store_id INT64 NOT NULL,
    manager_id INT64 );
CREATE TABLE
  'stores' ( store_id INT64,
    store_name STRING NOT NULL,
    email STRING,
    phone STRING,
    street STRING,
    city STRING,
    state STRING,
    zip_code STRING );
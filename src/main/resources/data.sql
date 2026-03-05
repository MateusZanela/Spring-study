CREATE TABLE item (
    item_id VARCHAR(255) NOT NULL PRIMARY KEY,
    item_name VARCHAR(50) NOT NULL,
    item_description VARCHAR(300),
    price NUMERIC(18,2)
);
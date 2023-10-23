CREATE DATABASE demo_db;


CREATE TABLE IF NOT EXISTS fruits
( id INTEGER NOT NULL AUTO_INCREMENT,
  img VARCHAR(255) NOT NULL,
  name VARCHAR(255) NOT NULL,
  article VARCHAR(255) NOT NULL,
  description VARCHAR(255) NOT NULL,
  price DECIMAL(6,2) NOT NULL,
  PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS vegetables
( id INTEGER NOT NULL AUTO_INCREMENT,
  img VARCHAR(255) NOT NULL,
  name VARCHAR(255) NOT NULL,
  article VARCHAR(255) NOT NULL,
  description VARCHAR(255) NOT NULL,
  price DECIMAL(6,2) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS orders
( id INTEGER NOT NULL AUTO_INCREMENT,
  order_code VARCHAR(255) NOT NULL,
  buyer_name VARCHAR(255) NOT NULL,
  buyer_phone VARCHAR(255) NOT NULL,
  buyer_email VARCHAR(255) NOT NULL,
  content VARCHAR(255) NOT NULL,
  status VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO
 fruits (img, name, article, description, price)
VALUES
 ('orange.jpg', 'Orange', 'T022', 'Sweet and juicy orange', 7.95),
   ('blueberry.jpg', 'Blueberry', 'T033', 'Delicious and nutritious blueberry', 5.95),
   ('banana.jpg', 'Banana', 'T044', 'Creamy and flavorful banana', 4.99),
   ('melon.jpg', 'Melon', 'T055', 'Refreshing and succulent melon', 9.99),
   ('apple.jpg', 'Apple', 'T066', 'Crisp and sweet apple', 2.95),
   ('strawberry.jpg', 'Strawberry', 'T077', 'Sweet and succulent strawberries', 6.49),
   ('pineapple.jpg', 'Pineapple', 'T088', 'Tropical and tangy pineapple', 8.99),
   ('grapes.jpg', 'Grapes', 'T099', 'Juicy and flavorful grapes', 4.79),
   ('kiwi.jpg', 'Kiwi', 'T101', 'Tropical and tangy kiwi', 3.49),
   ('watermelon.jpg', 'Watermelon', 'T112', 'Refreshing and hydrating watermelon', 7.29);

INSERT INTO
 vegetables (img, name, article, description, price)
VALUES
 ('onion.jpg', 'Onion', 'C111', 'Crisp and flavorful onion', 1.95),
   ('potato.jpg', 'Potato', 'C112', 'Fresh and hearty potato', 2.99),
   ('tomato.jpg', 'Tomato', 'C113', 'Juicy and ripe tomato', 6.99),
   ('cucumber.jpg', 'Cucumber', 'C114', 'Crunchy and refreshing cucumber', 4.99),
   ('mushrooms.jpg', 'Mushrooms', 'C133', 'Savory and earthy mushrooms', 9.99),
   ('carrot.jpg', 'Carrot', 'C115', 'Crispy orange carrot', 2.49),
   ('broccoli.jpg', 'Broccoli', 'C116', 'Nutrient-rich broccoli', 3.99),
   ('cabbage.jpg', 'Cabbage', 'C117', 'Fresh green cabbage', 2.79),
   ('pepper.jpg', 'Pepper', 'C118', 'Colorful bell pepper', 1.99),
   ('zucchini.jpg', 'Zucchini', 'C119', 'Tasty green zucchini', 3.29);

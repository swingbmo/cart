-- account
CREATE TABLE cart_user (
	account VARCHAR(25) primary key,
	password VARCHAR(25) not null,
	name VARCHAR(25) not null,
	phone VARCHAR(25),
	address VARCHAR(50),
	email VARCHAR(50) not null
);
CREATE TABLE cart_admin (
	account VARCHAR(25) primary key,
	password VARCHAR(25) not null,
	name VARCHAR(25) not null,
	email VARCHAR(50) not null
);
-- homepage
CREATE TABLE cart_info (
	id INTEGER auto_increment primary key,
	title VARCHAR(25) not null,
	desc VARCHAR(100),
	footer_desc VARCHAR(100),
	is_active VARCHAR(1)
);
-- product
CREATE TABLE IMAGE (
	id INTEGER auto_increment primary key,
	main VARCHAR(255),
);
CREATE TABLE product (
	id INTEGER auto_increment primary key,
	title VARCHAR(25) not null,
	desc VARCHAR(100),
	price INTEGER null,
	is_active VARCHAR(1),
	fk_image_id VARCHAR(255) REFERENCES image(id)
);
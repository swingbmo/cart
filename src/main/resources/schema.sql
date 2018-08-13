CREATE TABLE cart_user (
	account VARCHAR(25) primary key,
	password VARCHAR(25) not null,
	name VARCHAR(25) not null,
	phone VARCHAR(25),
	address VARCHAR(50),
	email VARCHAR(50)
);
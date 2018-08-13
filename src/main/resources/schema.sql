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
	footerdesc VARCHAR(100)
);
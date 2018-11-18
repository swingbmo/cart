INSERT INTO cart_user(account, password, name, phone, address, email)
VALUES('user123', 'pwd123', 'jack', '00-00-0000', 'address..', 'email@email.com');

INSERT INTO cart_admin(account, password, name, email)
VALUES('admin', 'admin', 'admin', 'email@email.com');
INSERT INTO cart_admin(account, password, name, email)
VALUES('admin2', 'admin2', 'admin2', 'email@email.com');


INSERT INTO cart_info (title, desc, footer_desc, is_active)
VALUES('HOME TITLE', 'SITE DESCRIPTION', 'FOOTER DESCRIPTION', 'Y');

INSERT INTO image (main)
VALUES ('https://s4.lativ.com.tw/i/Waterfall//38194_560_181116_TW.jpg');
INSERT INTO image (main)
VALUES ('https://s4.lativ.com.tw/i/Waterfall//37812_560_181115_4_TW.jpg');

INSERT INTO product (title, desc, price, is_active, fk_image_id)
VALUES('ATLAS 蓬鬆造型噴霧','this is a...', 100, 'Y', 1);
INSERT INTO product (title, desc, price, is_active, fk_image_id)
VALUES('product2','this is a...', 100, 'Y', 1);
INSERT INTO product (title, desc, price, is_active, fk_image_id)
VALUES('product3','this is a...', 100, 'Y', 1);
INSERT INTO product (title, desc, price, is_active, fk_image_id)
VALUES('product4','this is a...', 100, 'Y', 2);
INSERT INTO product (title, desc, price, is_active, fk_image_id)
VALUES('product5','this is a...', 100, 'Y', 2);


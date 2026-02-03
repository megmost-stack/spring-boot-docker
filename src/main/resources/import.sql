-- NUR INSERTS - Keine CREATE TABLE Befehle!
INSERT INTO authors (id, firstname, lastname, image_url) VALUES (1, 'John', 'Thompson', 'instructor_jt.jpg');

INSERT INTO categories (category_id, name) VALUES (1, 'Spring Introduction'), (2, 'Spring Core'), (3, 'Spring Boot'), (4, 'Thymeleaf'), (5, 'G.E.A.P');

-- WICHTIG: author_id statt product_author nutzen!
INSERT INTO products (product_id, name, subtitle, description, price, author_id, image_url) VALUES (1, 'Introduction to Spring', 'Start Learning Spring!', 'Lerne Spring von Profis', 49.99, 1, 'SpringIntroThumb.png');
INSERT INTO products (product_id, name, subtitle, description, price, author_id, image_url) VALUES (2, 'Spring Core Ultimate', 'Ultimate Bundle of Spring Core!', 'Lerne Spring Core von Profis', 199.99, 1, 'SpringCoreUltimateThumb.png');
INSERT INTO products (product_id, name, subtitle, description, price, author_id, image_url) VALUES (3, 'Thymeleaf', 'Thymeleaf and Spring!', 'Lerne Thymeleaf von Profis', 149.99, 1, 'ThymeleafThumb.png');
INSERT INTO products (product_id, name, subtitle, description, price, author_id, image_url) VALUES (4, 'Spring Core', 'Spring Core - mastering Spring!', 'Mastering Spring Core with Profis', 109.99, 1, 'SpringCoreThumb.png');
INSERT INTO products (product_id, name, subtitle, description, price, author_id, image_url) VALUES (5, 'Spring Core Advanced', 'Advanced Spring Core!', 'Lerne Advanced Spring Core von Profis', 259.99, 1, 'SpringCoreAdvancedThumb.png');
INSERT INTO products (product_id, name, subtitle, description, price, author_id, image_url) VALUES (6, 'Spring Core Dev-Ops', 'Deploying Spring in the Enterprise and the cloud!', 'Deploying Spring in the Enterprise like Profis', 579.99, 1, 'SpringCoreDevOpsThumb.png');

INSERT INTO product_category (product_id, category_id) VALUES (1, 1);
INSERT INTO product_category (product_id, category_id) VALUES (1, 3);
INSERT INTO product_category (product_id, category_id) VALUES (2, 2);
INSERT INTO product_category (product_id, category_id) VALUES (2, 3);
INSERT INTO product_category (product_id, category_id) VALUES (3, 4);
INSERT INTO product_category (product_id, category_id) VALUES (4, 2);
INSERT INTO product_category (product_id, category_id) VALUES (4, 3);
INSERT INTO product_category (product_id, category_id) VALUES (5, 2);
INSERT INTO product_category (product_id, category_id) VALUES (5, 3);
INSERT INTO product_category (product_id, category_id) VALUES (6, 3);
INSERT INTO product_category (product_id, category_id) VALUES (6, 5);
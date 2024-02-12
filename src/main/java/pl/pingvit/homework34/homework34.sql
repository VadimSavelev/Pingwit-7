---1. Отсортируйте таблицу users по полю email по убыванию и выведите 5 записей, начиная с 10
SELECT *FROM users ORDER BY email DESC
    LIMIT 5 OFFSET 9;
---2. Выведите все столбцы из таблицы products, у которых цена ниже, чем цена продукта с id = 41
SELECT *FROM products
WHERE price <(SELECT price FROM products WHERE id =41) ;

---3. Из таблицы users выведите все уникальные имена пользователей
SELECT DISTINCT name FROM users ;
---4. Выведите имя, фамилию и имэйл пользователей, у которых имэйл находится в домене gmail.com
SELECT name,surname,email FROM users WHERE email LIKE '%gmail.com';
---5. Выведите orders.id, users.email, orders.created_at, product.name и order_items.quantity для заказов, сделанных 2023-02-19 и позже
SELECT o.id,u.email,o.created_at,p.name,oi.quantity FROM orders o
                                                             JOIN users u ON o.user_id =u.id
                                                             JOIN order_items oi ON o.id = oi.order_id
                                                             JOIN products p ON oi.product_id = p.id
WHERE o.created_at >= '2023-02-19';
---6. Выведите все колонки таблицы users + заказы пользователя, если они у него есть
SELECT users.*,orders.*
From users
         JOIN orders ON users.id =orders.user_id;
---7. Выведите дату и количество заказов, сделанных в эту дату
SELECT DATE(o.created_at) AS order_date, COUNT(*) AS order_count
FROM orders o
    JOIN order_items oi ON o.id = oi.order_id
GROUP BY DATE(o.created_at);
---8. Выведите products.name, и sum(quantity) проданных товаров для всех товаров, которых продали меньше 15 штук sum(quantity) < 15
SELECT p.name AS product_name, SUM(oi.quantity) AS total_quantity
FROM products p
         JOIN order_items oi ON p.id = oi.product_id
GROUP BY p.name
HAVING SUM(oi.quantity) < 15;
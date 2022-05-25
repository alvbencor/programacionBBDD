use classicmodels;

select * from customers;
INSERT INTO customers (customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, addressLine2, city, state, postalCode, country, salesRepEmployeeNumber, creditLimit) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);
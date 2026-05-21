CREATE DATABASE hotel;
USE hotel;
CREATE TABLE reservas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    sexo VARCHAR(20),
    email VARCHAR(100),
    data_chegada DATE,
    numero_noites INT,
    numero_hospedes INT,
    mensagem TEXT
);

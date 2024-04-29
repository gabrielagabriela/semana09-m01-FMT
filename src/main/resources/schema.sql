CREATE
DATABASE IF NOT EXISTS biblioteca;


USE
biblioteca;


CREATE TABLE IF NOT EXISTS Livro
(
    id
    INT
    AUTO_INCREMENT
    PRIMARY
    KEY,
    titulo
    VARCHAR
(
    255
) NOT NULL,
    autor VARCHAR
(
    255
) NOT NULL,
    anoPublicacao INT
    );


CREATE TABLE IF NOT EXISTS Membros
(
    id
    INT
    AUTO_INCREMENT
    PRIMARY
    KEY,
    nome
    VARCHAR
(
    255
) NOT NULL,
    endereco VARCHAR
(
    255
),
    telefone VARCHAR
(
    20
)
    );


CREATE TABLE IF NOT EXISTS Emprestimos
(
    id
    INT
    AUTO_INCREMENT
    PRIMARY
    KEY,
    livro_id
    INT,
    membro_id
    INT,
    dataEmprestimo
    DATE,
    dataDevolucao
    DATE,
    FOREIGN
    KEY
(
    livro_id
) REFERENCES Livro
(
    id
),
    FOREIGN KEY
(
    membro_id
) REFERENCES Membros
(
    id
)
    );


CREATE TABLE IF NOT EXISTS Bibliotecario
(
    id
    INT
    AUTO_INCREMENT
    PRIMARY
    KEY,
    nome
    VARCHAR
(
    255
) NOT NULL,
    email VARCHAR
(
    255
) UNIQUE,
    senha VARCHAR
(
    255
) NOT NULL
    );


CREATE TABLE IF NOT EXISTS Visitante
(
    id
    INT
    AUTO_INCREMENT
    PRIMARY
    KEY,
    nome
    VARCHAR
(
    255
) NOT NULL,
    telefone VARCHAR
(
    20
)
    );

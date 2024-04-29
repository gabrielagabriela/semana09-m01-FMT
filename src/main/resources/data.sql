INSERT INTO Livro (titulo, autor, anoPublicacao) VALUES ('Dom Quixote', 'Miguel de Cervantes', 1605);
INSERT INTO Livro (titulo, autor, anoPublicacao) VALUES ('Romeu e Julieta', 'William Shakespeare', 1597);

INSERT INTO Membros (nome, endereco, telefone) VALUES ('João Silva', 'Rua A, 123', '(11) 1234-5678');
INSERT INTO Membros (nome, endereco, telefone) VALUES ('Maria Santos', 'Av. B, 456', '(22) 9876-5432');

INSERT INTO Emprestimos (livro_id, membro_id, dataEmprestimo, dataDevolucao) VALUES (1, 1, '2024-04-29', '2024-05-29');
INSERT INTO Emprestimos (livro_id, membro_id, dataEmprestimo, dataDevolucao) VALUES (2, 2, '2024-04-30', '2024-05-30');

INSERT INTO Bibliotecario (nome, email, senha) VALUES ('Admin', 'admin@example.com', 'senha123');

INSERT INTO Visitante (nome, telefone) VALUES ('Pedro', '(33) 1234-5678');

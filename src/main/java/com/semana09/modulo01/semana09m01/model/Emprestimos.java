package com.semana09.modulo01.semana09m01.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.time.LocalDate;

@Data
public class Emprestimos {

    public static Integer proximoId = 1;
    @Setter(AccessLevel.NONE)private Integer id;
    private Livro id_livro;
    private Membros id_membros;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

}

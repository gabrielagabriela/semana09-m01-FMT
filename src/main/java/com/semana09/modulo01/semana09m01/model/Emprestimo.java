package com.semana09.modulo01.semana09m01.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class Emprestimo {

    public static Integer proximoId = 1;
    @Setter(AccessLevel.NONE)private Integer id;
    private Emprestimo id_emprestimo;
    private Membros id_membros;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    @Getter
    private static List<Emprestimo> listaDeEmprestimo = new ArrayList<>();

    public static Emprestimo inserir(Emprestimo emprestimo){
        emprestimo.id = proximoId++;
        listaDeEmprestimo.add(emprestimo);
        return emprestimo;
    }

    public static Emprestimo buscarPorId(Integer id) throws Exception {
        for(Emprestimo emprestimo: listaDeEmprestimo){
            if(emprestimo.getId().equals(id)){
                return emprestimo;
            }
        }
        throw new Exception("Emprestimo não encontrado");
    }
}

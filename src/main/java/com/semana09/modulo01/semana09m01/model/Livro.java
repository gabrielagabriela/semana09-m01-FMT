package com.semana09.modulo01.semana09m01.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class Livro {

    public static Integer proximoId = 1;
    @Setter(AccessLevel.NONE)private Integer id;
    private String titulo;
    private String autor;
    @Getter
    private static List<Livro> listaDeLivros = new ArrayList<>();

    public static Livro inserir(Livro livro){
        livro.id = proximoId++;
        listaDeLivros.add(livro);
        return livro;
    }

    public static Livro buscarPorId(Integer id) throws Exception {
        for(Livro livro: listaDeLivros){
            if(livro.getId().equals(id)){
                return livro;
            }
        }
        throw new Exception("Livro não encontrado");
    }

}

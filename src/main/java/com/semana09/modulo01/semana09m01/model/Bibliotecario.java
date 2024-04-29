package com.semana09.modulo01.semana09m01.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class Bibliotecario {

    public static Integer proximoId = 1;
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    @Getter
    private static List<Bibliotecario> listaDeBibliotecario = new ArrayList<>();

    public static Bibliotecario inserir(Bibliotecario bibliotecario){
        bibliotecario.id = proximoId++;
        listaDeBibliotecario.add(bibliotecario);
        return bibliotecario;
    }

    public static Bibliotecario buscarPorId(Integer id) throws Exception {
        for(Bibliotecario bibliotecario: listaDeBibliotecario){
            if(bibliotecario.getId().equals(id)){
                return bibliotecario;
            }
        }
        throw new Exception("Bibliotecario não encontrado");
    }

}

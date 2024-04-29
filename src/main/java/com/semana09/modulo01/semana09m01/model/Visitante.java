package com.semana09.modulo01.semana09m01.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class Visitante {

    public static Integer proximoId = 1;
    @Setter(AccessLevel.NONE)private Integer id;
    private String nome;
    private String telefone;
    @Getter
    private static List<Visitante> listaDeVisitantes = new ArrayList<>();

    public static Visitante inserir(Visitante visitante){
        visitante.id = proximoId++;
        listaDeVisitantes.add(visitante);
        return visitante;
    }

    public static Visitante buscarPorId(Integer id) throws Exception {
        for(Visitante visitante: listaDeVisitantes){
            if(visitante.getId().equals(id)){
                return visitante;
            }
        }
        throw new Exception("Visitante não encontrado");
    }


}

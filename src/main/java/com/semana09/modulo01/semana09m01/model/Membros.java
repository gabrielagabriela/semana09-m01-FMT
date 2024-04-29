package com.semana09.modulo01.semana09m01.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class Membros {

    public static Integer proximoId = 1;
    @Setter(AccessLevel.NONE)private Integer id;
    private String nome;
    private String endereco;
    private String telefone;
    @Getter
    private static List<Membros> listaDeMembross = new ArrayList<>();

    public static Membros inserir(Membros membros){
        membros.id = proximoId++;
        listaDeMembross.add(membros);
        return membros;
    }

    public static Membros buscarPorId(Integer id) throws Exception {
        for(Membros membros: listaDeMembross){
            if(membros.getId().equals(id)){
                return membros;
            }
        }
        throw new Exception("Membros não encontrado");
    }


}

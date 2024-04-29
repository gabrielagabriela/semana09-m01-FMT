package com.semana09.modulo01.semana09m01.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class Visitante {

    public static Integer proximoId = 1;
    @Setter(AccessLevel.NONE)private Integer id;
    private String nome;
    private String telefone;


}

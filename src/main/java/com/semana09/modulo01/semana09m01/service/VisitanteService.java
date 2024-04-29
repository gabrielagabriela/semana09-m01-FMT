package com.semana09.modulo01.semana09m01.service;

import com.semana09.modulo01.semana09m01.model.Visitante;
import org.springframework.stereotype.Service;

@Service
public class VisitanteService {

    public Visitante salvar(Visitante visitante) throws Exception{
        return Visitante.inserir(visitante);
    }
}

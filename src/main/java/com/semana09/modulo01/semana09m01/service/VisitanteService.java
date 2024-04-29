package com.semana09.modulo01.semana09m01.service;

import com.semana09.modulo01.semana09m01.model.Livro;
import com.semana09.modulo01.semana09m01.model.Visitante;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitanteService {

    public Visitante salvar(Visitante visitante) throws Exception{
        return Visitante.inserir(visitante);
    }

    public List<Visitante> buscarTodos(){return Visitante.getListaDeVisitantes();}
}

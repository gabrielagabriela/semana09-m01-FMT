package com.semana09.modulo01.semana09m01.service;

import com.semana09.modulo01.semana09m01.model.Livro;
import com.semana09.modulo01.semana09m01.model.Membros;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembrosService {

    public Membros salvar(Membros membros) throws Exception{
        return Membros.inserir(membros);
    }

    public List<Membros> buscarTodos(){return Membros.getListaDeMembross();}
}

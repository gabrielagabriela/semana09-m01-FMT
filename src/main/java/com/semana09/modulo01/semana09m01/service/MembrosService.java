package com.semana09.modulo01.semana09m01.service;

import com.semana09.modulo01.semana09m01.model.Membros;
import com.semana09.modulo01.semana09m01.model.Membros;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembrosService {

    public Membros salvar(Membros membros) throws Exception{
        return Membros.inserir(membros);
    }

    public List<Membros> buscarTodos(){return Membros.getListaDeMembross();}

    public Membros buscarPorId(Integer id) throws Exception {
        return Membros.buscarPorId(id);
    }

    public void delete(Integer id) throws Exception{
        Membros membros = buscarPorId(id);
        Membros.getListaDeMembross().remove(membros);
    }
}

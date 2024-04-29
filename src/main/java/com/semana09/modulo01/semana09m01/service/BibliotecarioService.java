package com.semana09.modulo01.semana09m01.service;

import com.semana09.modulo01.semana09m01.model.Bibliotecario;
import com.semana09.modulo01.semana09m01.model.Livro;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecarioService {

    public Bibliotecario salvar(Bibliotecario bibliotecario) throws Exception{
        return Bibliotecario.inserir(bibliotecario);
    }

    public List<Bibliotecario> buscarTodos(){return Bibliotecario.getListaDeBibliotecario();}
}

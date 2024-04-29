package com.semana09.modulo01.semana09m01.service;

import com.semana09.modulo01.semana09m01.model.Bibliotecario;
import org.springframework.stereotype.Service;

@Service
public class BibliotecarioService {

    public Bibliotecario salvar(Bibliotecario bibliotecario) throws Exception{
        return Bibliotecario.inserir(bibliotecario);
    }
}

package com.semana09.modulo01.semana09m01.service;

import com.semana09.modulo01.semana09m01.model.Bibliotecario;
import com.semana09.modulo01.semana09m01.model.Bibliotecario;
import com.semana09.modulo01.semana09m01.model.Bibliotecario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecarioService {

    public Bibliotecario salvar(Bibliotecario bibliotecario) throws Exception{
        return Bibliotecario.inserir(bibliotecario);
    }

    public List<Bibliotecario> buscarTodos(){return Bibliotecario.getListaDeBibliotecario();}

    public Bibliotecario buscarPorId(Integer id) throws Exception {
        return Bibliotecario.buscarPorId(id);
    }

    public void delete(Integer id) throws Exception{
        Bibliotecario bibliotecario = buscarPorId(id);
        Bibliotecario.getListaDeBibliotecario().remove(bibliotecario);
    }

    public Bibliotecario update(Integer id, Bibliotecario bibliotecario)  throws Exception{
        Bibliotecario bibliotecarioPesquisado = buscarPorId(id);
        bibliotecarioPesquisado.setId(id);
        bibliotecarioPesquisado.setNome(bibliotecario.getNome());
        bibliotecarioPesquisado.setEmail(bibliotecario.getEmail());
        bibliotecarioPesquisado.setSenha(bibliotecario.getSenha());
        return bibliotecarioPesquisado;
    }
}

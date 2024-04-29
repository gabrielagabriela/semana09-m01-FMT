package com.semana09.modulo01.semana09m01.service;

import com.semana09.modulo01.semana09m01.model.Livro;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    public Livro salvar(Livro livro) throws Exception{
        return Livro.inserir(livro);
    }

    public List<Livro> buscarTodos(){return Livro.getListaDeLivros();}

    public Livro buscarPorId(Integer id) throws Exception {
        return Livro.buscarPorId(id);
    }

    public void delete(Integer id) throws Exception{
        Livro livro = buscarPorId(id);
        Livro.getListaDeLivros().remove(livro);
    }

}

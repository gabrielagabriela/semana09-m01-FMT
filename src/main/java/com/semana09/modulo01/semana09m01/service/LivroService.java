package com.semana09.modulo01.semana09m01.service;

import com.semana09.modulo01.semana09m01.model.Livro;
import com.semana09.modulo01.semana09m01.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private LivroRepository livroRepository;
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

    public Livro update(Integer id, Livro livro)  throws Exception{
        Livro livroPesquisado = buscarPorId(id);
        livroPesquisado.setId(id);
        livroPesquisado.setTitulo(livro.getTitulo());
        livroPesquisado.setAutor(livro.getAutor());
        return livroPesquisado;
    }

    public Livro updateWithQuery(Integer id, Livro livro) {
        int updatedRows = livroRepository.updateLivroById(id, livro.getTitulo(), livro.getAutor());
        if (updatedRows == 0) {
            throw new RuntimeException("Livro não encontrado");
        }
        return livroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado após atualização"));
    }

}

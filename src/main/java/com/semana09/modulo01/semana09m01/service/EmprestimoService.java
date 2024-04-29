package com.semana09.modulo01.semana09m01.service;

import com.semana09.modulo01.semana09m01.model.Emprestimo;
import com.semana09.modulo01.semana09m01.model.Livro;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprestimoService {

    public Emprestimo salvar(Emprestimo emprestimo) throws Exception{
        return Emprestimo.inserir(emprestimo);
    }

    public List<Emprestimo> buscarTodos(){return Emprestimo.getListaDeEmprestimo();}
}

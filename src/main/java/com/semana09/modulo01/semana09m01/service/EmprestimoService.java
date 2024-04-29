package com.semana09.modulo01.semana09m01.service;

import com.semana09.modulo01.semana09m01.model.Emprestimo;
import com.semana09.modulo01.semana09m01.model.Emprestimo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprestimoService {

    public Emprestimo salvar(Emprestimo emprestimo) throws Exception{
        return Emprestimo.inserir(emprestimo);
    }

    public List<Emprestimo> buscarTodos(){return Emprestimo.getListaDeEmprestimo();}

    public Emprestimo buscarPorId(Integer id) throws Exception {
        return Emprestimo.buscarPorId(id);
    }

    public void delete(Integer id) throws Exception{
        Emprestimo emprestimo = buscarPorId(id);
        Emprestimo.getListaDeEmprestimo().remove(emprestimo);
    }
}

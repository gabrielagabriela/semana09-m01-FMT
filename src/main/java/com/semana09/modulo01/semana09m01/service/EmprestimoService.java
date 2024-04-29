package com.semana09.modulo01.semana09m01.service;

import com.semana09.modulo01.semana09m01.model.Emprestimo;
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

    public Emprestimo update(Integer id, Emprestimo emprestimo)  throws Exception{
        Emprestimo emprestimoPesquisado = buscarPorId(id);
        emprestimoPesquisado.setId(id);
        emprestimoPesquisado.setId_emprestimo(emprestimo.getId_emprestimo());
        emprestimoPesquisado.setId_membros(emprestimo.getId_membros());
        emprestimoPesquisado.setDataEmprestimo(emprestimo.getDataEmprestimo());
        emprestimoPesquisado.setDataDevolucao(emprestimo.getDataDevolucao());
        return emprestimoPesquisado;
    }

}

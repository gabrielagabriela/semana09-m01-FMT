package com.semana09.modulo01.semana09m01.service;

import com.semana09.modulo01.semana09m01.model.Emprestimo;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoService {

    public Emprestimo salvar(Emprestimo emprestimo) throws Exception{
        return Emprestimo.inserir(emprestimo);
    }
}

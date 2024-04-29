package com.semana09.modulo01.semana09m01.controller;

import com.semana09.modulo01.semana09m01.model.Emprestimo;
import com.semana09.modulo01.semana09m01.service.EmprestimoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emprestimos")
public class EmprestimoController {

    private final EmprestimoService emprestimoService;

    public EmprestimoController(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }

    @PostMapping
    public Emprestimo post(@RequestBody Emprestimo emprestimo) throws Exception{
        return emprestimoService.salvar(emprestimo);
    }
}

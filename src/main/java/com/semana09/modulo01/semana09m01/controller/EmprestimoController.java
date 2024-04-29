package com.semana09.modulo01.semana09m01.controller;

import com.semana09.modulo01.semana09m01.model.Bibliotecario;
import com.semana09.modulo01.semana09m01.model.Emprestimo;
import com.semana09.modulo01.semana09m01.service.EmprestimoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public List<Emprestimo> get(){
        return emprestimoService.buscarTodos();
    }

}

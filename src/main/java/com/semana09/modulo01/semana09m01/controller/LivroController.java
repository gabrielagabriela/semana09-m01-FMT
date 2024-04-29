package com.semana09.modulo01.semana09m01.controller;

import com.semana09.modulo01.semana09m01.model.Livro;
import com.semana09.modulo01.semana09m01.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("livros")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping
    public Livro post(@RequestBody Livro livro) throws Exception{
        return livroService.salvar(livro);
    }

    @GetMapping
    public List<Livro> get(){
        return livroService.buscarTodos();
    }

}

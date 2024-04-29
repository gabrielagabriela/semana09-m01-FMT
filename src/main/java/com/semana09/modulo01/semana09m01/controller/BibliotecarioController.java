package com.semana09.modulo01.semana09m01.controller;

import com.semana09.modulo01.semana09m01.model.Bibliotecario;
import com.semana09.modulo01.semana09m01.model.Livro;
import com.semana09.modulo01.semana09m01.service.BibliotecarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bibliotecarios")
public class BibliotecarioController {

    private final BibliotecarioService bibliotecarioService;

    public BibliotecarioController(BibliotecarioService bibliotecarioService) {
        this.bibliotecarioService = bibliotecarioService;
    }

    @PostMapping
    public Bibliotecario post(@RequestBody Bibliotecario bibliotecario) throws Exception{
        return bibliotecarioService.salvar(bibliotecario);
    }

    @GetMapping
    public List<Bibliotecario> get(){
        return bibliotecarioService.buscarTodos();
    }

}

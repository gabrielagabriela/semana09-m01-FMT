package com.semana09.modulo01.semana09m01.controller;

import com.semana09.modulo01.semana09m01.model.Bibliotecario;
import com.semana09.modulo01.semana09m01.model.Bibliotecario;
import com.semana09.modulo01.semana09m01.model.Bibliotecario;
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

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) throws Exception{
        bibliotecarioService.delete(id);
    }

    @PutMapping("{id}")
    public Bibliotecario update(@PathVariable Integer id, @RequestBody Bibliotecario bibliotecario) throws Exception{
        return bibliotecarioService.update(id, bibliotecario);
    }


    @PutMapping("update-query/{id}")
    public Bibliotecario updateWithQuery(@PathVariable Integer id, @RequestBody Bibliotecario bibliotecario) {
        return bibliotecarioService.updateWithQuery(id, bibliotecario);
    }


}

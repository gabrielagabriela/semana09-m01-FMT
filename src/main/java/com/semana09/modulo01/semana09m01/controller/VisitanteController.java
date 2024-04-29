package com.semana09.modulo01.semana09m01.controller;

import com.semana09.modulo01.semana09m01.model.Visitante;
import com.semana09.modulo01.semana09m01.model.Visitante;
import com.semana09.modulo01.semana09m01.service.VisitanteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("visitantes")
public class VisitanteController {

    private final VisitanteService visitanteService;

    public VisitanteController(VisitanteService visitanteService) {
        this.visitanteService = visitanteService;
    }

    @PostMapping
    public Visitante post(@RequestBody Visitante visitante) throws Exception{
        return visitanteService.salvar(visitante);
    }

    @GetMapping
    public List<Visitante> get(){
        return visitanteService.buscarTodos();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) throws Exception{
        visitanteService.delete(id);
    }

    @PutMapping("{id}")
    public Visitante update(@PathVariable Integer id, @RequestBody Visitante visitante) throws Exception{
        return visitanteService.update(id, visitante);
    }

}

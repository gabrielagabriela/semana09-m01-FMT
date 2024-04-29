package com.semana09.modulo01.semana09m01.controller;

import com.semana09.modulo01.semana09m01.model.Visitante;
import com.semana09.modulo01.semana09m01.service.VisitanteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

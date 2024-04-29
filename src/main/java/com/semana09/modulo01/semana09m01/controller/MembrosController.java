package com.semana09.modulo01.semana09m01.controller;

import com.semana09.modulo01.semana09m01.model.Membros;
import com.semana09.modulo01.semana09m01.service.MembrosService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("membros")
public class MembrosController {

    private final MembrosService membrosService;

    public MembrosController(MembrosService membrosService) {
        this.membrosService = membrosService;
    }

    @PostMapping
    public Membros post(@RequestBody Membros membros) throws Exception{
        return membrosService.salvar(membros);
    }
}

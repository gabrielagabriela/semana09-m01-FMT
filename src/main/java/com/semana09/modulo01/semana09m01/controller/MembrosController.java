package com.semana09.modulo01.semana09m01.controller;

import com.semana09.modulo01.semana09m01.model.Membros;
import com.semana09.modulo01.semana09m01.model.Membros;
import com.semana09.modulo01.semana09m01.service.MembrosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public List<Membros> get(){
        return membrosService.buscarTodos();
    }


    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) throws Exception{
        membrosService.delete(id);
    }

    @PutMapping("{id}")
    public Membros update(@PathVariable Integer id, @RequestBody Membros membros) throws Exception{
        return membrosService.update(id, membros);
    }
}

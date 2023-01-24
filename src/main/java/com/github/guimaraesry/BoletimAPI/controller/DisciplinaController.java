package com.github.guimaraesry.BoletimAPI.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.guimaraesry.BoletimAPI.model.Disciplina;
import com.github.guimaraesry.BoletimAPI.dto.DisciplinaDTO;
import com.github.guimaraesry.BoletimAPI.service.DiscplinaService;
import com.github.guimaraesry.BoletimAPI.repository.DisciplinaRepository;

/**
 *
 * @author Ryan
 */

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {
    
    @Autowired
    private DiscplinaService disciplinaService;
    
    @GetMapping
    public List<DisciplinaDTO> listar() {
        return disciplinaService.findAll();
    }
    
    @GetMapping("{id}")
    public DisciplinaDTO listarPorId(@PathVariable int id) {
        return disciplinaService.findById(id);
    }
    
    @PostMapping
    public DisciplinaDTO adicionar(@RequestBody Disciplina disciplina) {
        return disciplinaService.save(disciplina);
    }
    
    @PutMapping("{id}")
    public DisciplinaDTO alterar(@PathVariable int id, @RequestBody Disciplina disciplina) {
        return disciplinaService.atualizar(id, disciplina);
    }
    
    @DeleteMapping("{id}")
    public DisciplinaDTO deletar(@PathVariable int id) {
        return disciplinaService.deletar(id);
    }
}

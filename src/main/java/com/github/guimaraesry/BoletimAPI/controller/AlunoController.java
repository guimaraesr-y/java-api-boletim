package com.github.guimaraesry.BoletimAPI.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.github.guimaraesry.BoletimAPI.model.Aluno;
import com.github.guimaraesry.BoletimAPI.dto.AlunoDTO;
import com.github.guimaraesry.BoletimAPI.service.AlunoService;

/**
 *
 * @author Ryan
 */

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    
    @Autowired
    private AlunoService alunoService;
    
    @GetMapping
    public List<AlunoDTO> listar() {
        return alunoService.findAll();
    }
    
    @GetMapping("{id}")
    public AlunoDTO listarPorId(@PathVariable int id) {
        return alunoService.listarPorId(id);
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AlunoDTO adicionar(@RequestBody Aluno aluno) {
        return alunoService.save(aluno);
    }
    
    @PutMapping("{id}")
    public AlunoDTO alterar(@PathVariable int id, @RequestBody Aluno aluno) {
        return alunoService.alterar(id, aluno);
    }
    
    @DeleteMapping("{id}")
    public AlunoDTO deletar(@PathVariable int id) {
        return alunoService.deletar(id);
    }
    
}

package com.github.guimaraesry.BoletimAPI.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.guimaraesry.BoletimAPI.model.Nota;
import com.github.guimaraesry.BoletimAPI.dto.NotaDTO;
import com.github.guimaraesry.BoletimAPI.service.NotaService;

/**
 *
 * @author Ryan
 */

@RestController
@RequestMapping("/notas")
public class NotaController {
    
    @Autowired
    private NotaService notaService;
    
    @GetMapping
    public List<NotaDTO> listar() {
        return notaService.fetchNotas();
    }
    
    @GetMapping("{alunoId}")
    public List<NotaDTO> listarPorAlunoId(@PathVariable int alunoId) {
        return notaService.listarPorAlunoId(alunoId);
    }
    
    @PostMapping
    public NotaDTO adicionar(@RequestBody Nota nota) {
        return notaService.save(nota);
    }
    
    @PutMapping("{id}")
    public NotaDTO atualizar(@PathVariable int id, @RequestBody Nota nota) {
        return notaService.atualizar(id, nota);
    }
    
    @DeleteMapping("{id}")
    public NotaDTO deletar(@PathVariable int id) {
        return notaService.deletar(id);
    }
    
}

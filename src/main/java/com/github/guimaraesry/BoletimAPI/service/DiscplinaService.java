package com.github.guimaraesry.BoletimAPI.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.guimaraesry.BoletimAPI.dto.DisciplinaDTO;
import com.github.guimaraesry.BoletimAPI.model.Disciplina;
import com.github.guimaraesry.BoletimAPI.repository.DisciplinaRepository;
import com.github.guimaraesry.BoletimAPI.repository.NotaRepository;

/**
 *
 * @author Ryan
 */

@Service
public class DiscplinaService { // falta programar tudo aqui
    
    @Autowired
    private DisciplinaRepository disciplinaRepository;
    
    @Autowired
    private NotaRepository notaRepository;

    public List<DisciplinaDTO> findAll() {
        return DisciplinaDTO.convertListEntityToDTO(disciplinaRepository.findAll());
    }
    
    public DisciplinaDTO findById(int id) {
        return DisciplinaDTO.convertEntityToDTO(
                disciplinaRepository.findById(id)
                .orElseThrow(
                                () -> new Error("Disciplina não encontrada com o id fornecido")
                        )
        );
    }

    public DisciplinaDTO save(Disciplina disciplina) {
        return DisciplinaDTO.convertEntityToDTO(disciplinaRepository.save(disciplina));
    }
    
    public DisciplinaDTO atualizar(int id, Disciplina disciplina) {
        Disciplina update = disciplinaRepository.findById(id)
                .orElseThrow(() -> new Error("Disciplina não encontrada com o id fornecido"));
        System.out.println(disciplina.getNome());
        update.setNome(disciplina.getNome());
        System.out.println(update.getNome());
        
        return DisciplinaDTO.convertEntityToDTO(disciplinaRepository.save(update));
    }
    
    public DisciplinaDTO deletar(int id) {
        notaRepository.findByDisciplinaId(id).forEach(nota -> {
            notaRepository.delete(nota);
        });
        
        disciplinaRepository.deleteById(id);
        return new DisciplinaDTO(0, "");
    }
    
}

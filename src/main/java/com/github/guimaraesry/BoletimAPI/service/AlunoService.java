package com.github.guimaraesry.BoletimAPI.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.guimaraesry.BoletimAPI.dto.AlunoDTO;
import com.github.guimaraesry.BoletimAPI.model.Aluno;
import com.github.guimaraesry.BoletimAPI.repository.AlunoRepository;

/**
 *
 * @author Ryan
 */

@Service
public class AlunoService {
    
    @Autowired
    private AlunoRepository alunoRepository;
    
    @Autowired NotaService notaService;

    public List<AlunoDTO> findAll() {
        return AlunoDTO.convertListEntityToDTO(alunoRepository.findAll());
    }
    
    public AlunoDTO listarPorId(int id) {
        return AlunoDTO.convertEntityToDTO(
                alunoRepository.findById(id)
                        .orElseThrow(
                                () -> new Error("Aluno não encontrada com o id fornecido")
                        )
        );
    }

    public AlunoDTO save(Aluno aluno) {
        return AlunoDTO.convertEntityToDTO(alunoRepository.save(aluno));
    }
    
    public AlunoDTO alterar(int id, Aluno aluno) {
        Aluno updated = alunoRepository.findById(id)
                .orElseThrow(() -> new Error("Aluno não encontrado com o id fornecido"));
        updated.setNome(aluno.getNome());
        alunoRepository.save(updated);
        
        return AlunoDTO.convertEntityToDTO(updated);
    }

    public AlunoDTO deletar(int id) {
        notaService.listarPorAlunoId(id).forEach(nota -> {
            notaService.deletar(nota.getId());
        });
        
        alunoRepository.deleteById(id);
        return new AlunoDTO(0, "");
    }
    
}

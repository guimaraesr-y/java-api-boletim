package com.github.guimaraesry.BoletimAPI.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.guimaraesry.BoletimAPI.model.Nota;
import com.github.guimaraesry.BoletimAPI.dto.NotaDTO;
import com.github.guimaraesry.BoletimAPI.model.Aluno;
import com.github.guimaraesry.BoletimAPI.dto.AlunoDTO;
import com.github.guimaraesry.BoletimAPI.model.Disciplina;
import com.github.guimaraesry.BoletimAPI.dto.DisciplinaDTO;
import com.github.guimaraesry.BoletimAPI.repository.NotaRepository;
import com.github.guimaraesry.BoletimAPI.repository.AlunoRepository;
import com.github.guimaraesry.BoletimAPI.repository.DisciplinaRepository;

/**
 *
 * @author Ryan
 */

@Service
public class NotaService {

    @Autowired
    private NotaRepository notaRepository;
    
    @Autowired
    private AlunoRepository alunoRepository;
    
    @Autowired
    private DisciplinaRepository disciplinaRepository;
    
    public List<NotaDTO> fetchNotas() {
        return NotaDTO.convertListEntityToDTO(notaRepository.findAll());
    }
    
    public List<NotaDTO> listarPorAlunoId(int alunoId) { // PRECISO ARRUMAR ESSA LISTAGEM AQUIIIII
        return NotaDTO.convertListEntityToDTO(notaRepository.findByAlunoId(alunoId));
    }
    
    public NotaDTO save(Nota nota) {
        int id = nota.getAluno().getId();
        Aluno aluno = alunoRepository.findById(id)
                .orElseThrow(() -> new Error("Aluno não encontrado com o id fornecido"));
        Disciplina disciplina = disciplinaRepository.findById(nota.getDisciplina().getId())
                .orElseThrow(() -> new Error("Disciplina não encontrada com o id fornecido"));
        
        nota.setAluno(aluno);
        nota.setDisciplina(disciplina);
        
        return NotaDTO.convertEntityToDTO(notaRepository.save(nota));
    }

    public NotaDTO atualizar(int id, Nota nota) { // FALTA PROGRAMAR ISSO
        System.out.println(nota.getAluno());
        System.out.println(nota.getNota());
        Nota update = notaRepository.findById(id).orElseThrow(
                () -> new Error("Nota não encontrada com o id fornecido")
        );
        update.setAluno(alunoRepository.findById(
                nota.getAluno().getId())
                    .orElseThrow(
                            () -> new Error("Aluno não encontrado com o id fornecido")
                    )
        );
        update.setDisciplina(disciplinaRepository.findById(
                nota.getDisciplina().getId())
                    .orElseThrow(
                            () -> new Error("Disciplina não encontrads com o id fornecido")
                    )
        
        );
        
        update.setBimestre(nota.getBimestre());
        update.setNota(nota.getNota());
        
        return NotaDTO.convertEntityToDTO(notaRepository.save(update));
    }

    public NotaDTO deletar(int id) {
        notaRepository.deleteById(id);
        return new NotaDTO(
                0, new AlunoDTO(0, ""), 
                new DisciplinaDTO(0, ""), 0.0, 0
        );
    }
    
}

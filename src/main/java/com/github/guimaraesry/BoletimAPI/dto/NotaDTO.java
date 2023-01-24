package com.github.guimaraesry.BoletimAPI.dto;

import lombok.Getter;
import java.util.List;
import java.util.ArrayList;
import lombok.AllArgsConstructor;

import com.github.guimaraesry.BoletimAPI.model.Nota;

/**
 *
 * @author Ryan
 */

@AllArgsConstructor
@Getter
public class NotaDTO {
    
    private int id;
    private AlunoDTO aluno;
    private DisciplinaDTO disciplina;
    private double nota;
    private int bimestre;
    
    public static NotaDTO convertEntityToDTO(Nota nota) {
        return new NotaDTO(nota.getId(), AlunoDTO.convertEntityToDTO(nota.getAluno()), 
                DisciplinaDTO.convertEntityToDTO(nota.getDisciplina()), nota.getNota(), 
                nota.getBimestre());
    }
    
    public static List<NotaDTO> convertListEntityToDTO(List<Nota> notas) {
        List<NotaDTO> notasDTO = new ArrayList<>();
        notas.forEach(
                nota -> notasDTO.add(
                        convertEntityToDTO(nota)
                )
        );
        return notasDTO;
    }
    
}

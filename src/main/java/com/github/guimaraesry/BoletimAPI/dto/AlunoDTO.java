package com.github.guimaraesry.BoletimAPI.dto;

import com.github.guimaraesry.BoletimAPI.model.Aluno;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author Ryan
 */

@AllArgsConstructor
@Getter
public class AlunoDTO {
    
    int id;
    String nome;
    
    public static AlunoDTO convertEntityToDTO(Aluno aluno) {
        return new AlunoDTO(aluno.getId(), aluno.getNome());
    }
    
    public static List<AlunoDTO> convertListEntityToDTO(List<Aluno> alunos) {
        List<AlunoDTO> alunosDTO = new ArrayList<>();
        alunos.forEach(aluno -> alunosDTO.add(new AlunoDTO(aluno.getId(), aluno.getNome())));
        return alunosDTO;
    }
    
}

package com.github.guimaraesry.BoletimAPI.dto;

import com.github.guimaraesry.BoletimAPI.model.Disciplina;
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
public class DisciplinaDTO {
    
    int id;
    String nome;
    
    public static DisciplinaDTO convertEntityToDTO(Disciplina disciplina) {
        return new DisciplinaDTO(disciplina.getId(), disciplina.getNome());
    }
    
    public static List<DisciplinaDTO> convertListEntityToDTO(List<Disciplina> disciplinas) {
        List<DisciplinaDTO> disciplinasDTO = new ArrayList<>();
        disciplinas.forEach(
                disciplina -> disciplinasDTO.add(
                        new DisciplinaDTO(disciplina.getId(), disciplina.getNome())
                )
        );
        return disciplinasDTO;
    }
    
}

package com.github.guimaraesry.BoletimAPI.repository;

import com.github.guimaraesry.BoletimAPI.model.Disciplina;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import com.github.guimaraesry.BoletimAPI.model.Nota;

/**
 *
 * @author Ryan
 */
public interface NotaRepository extends JpaRepository<Nota, Integer> {
    
    @Query("SELECT n FROM Nota n WHERE n.aluno.id = :alunoId")
    List<Nota> findByAlunoId(@Param("alunoId") int alunoId);
    
    @Query("SELECT n FROM Nota n WHERE n.disciplina.id = :disciplinaId")
    List<Nota> findByDisciplinaId(@Param("disciplinaId") int disciplinaId);
    
}

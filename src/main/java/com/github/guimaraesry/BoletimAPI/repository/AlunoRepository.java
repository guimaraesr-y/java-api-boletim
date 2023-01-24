package com.github.guimaraesry.BoletimAPI.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.github.guimaraesry.BoletimAPI.model.Aluno;

/**
 *
 * @author Ryan
 */

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    
}

package com.github.guimaraesry.BoletimAPI.model;

import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

/**
 *
 * @author Ryan
 */

@Data
@Entity
@Table(name = "notas")
public class Nota {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "alunoId", referencedColumnName = "id", nullable = false)
    private Aluno aluno;
    
    @ManyToOne
    @JoinColumn(name = "disciplinaId", referencedColumnName = "id", nullable = false)
    private Disciplina disciplina;
    
    @Column(nullable = false)
    private double nota;
    
    @Column(nullable = false)
    private int bimestre;
    
}

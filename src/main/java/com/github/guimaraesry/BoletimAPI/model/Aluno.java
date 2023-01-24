package com.github.guimaraesry.BoletimAPI.model;

import lombok.Data;
import java.util.List;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Data
@Entity
@Table(name = "alunos")
public class Aluno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
    @Column(nullable = false, unique = true)
    private String nome;

    @OneToMany(mappedBy = "aluno")
    private List<Nota> notas;
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.github.guimaraesry.BoletimAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.guimaraesry.BoletimAPI.model.Disciplina;

/**
 *
 * @author Ryan
 */
public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.curso.service;

import br.com.ifba.curso.entity.Curso;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Glauber
 */

public interface CursoIService {
    //Interface do Service
    public abstract Curso save(Curso curso);
    public abstract void delete(Curso curso);
    public abstract Curso update(Curso curso);
    public abstract Curso findById(Long curso);
    public abstract List <Curso> findAll();
    public abstract Curso findBycodigoCurso(String codCurso);

}

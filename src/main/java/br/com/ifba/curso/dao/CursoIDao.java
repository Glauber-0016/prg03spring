/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.curso.dao;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.dao.GenericIDao;
import jakarta.persistence.Entity;
import org.springframework.stereotype.Service;

/**
 *
 * @author Glauber
 */

public interface CursoIDao extends GenericIDao <Curso> {
    public abstract Curso findByCodCurso (String codigoCurso);
        
}

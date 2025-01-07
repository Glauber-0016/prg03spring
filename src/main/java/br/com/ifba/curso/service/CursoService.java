/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.service;

import br.com.ifba.curso.dao.CursoDao;
import br.com.ifba.curso.dao.CursoIDao;
import br.com.ifba.curso.entity.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Glauber
 */
@Service
public class CursoService implements CursoIService {
    //Curso service com os atributos
    @Autowired
    private CursoIDao cursoIDao;

    @Override
    public Curso save(Curso curso) throws RuntimeException {
        if(curso == null){
            throw new RuntimeException ("Dados do" + " Curso nao preenchidos");
        } else {
            return cursoIDao.save(curso);
        }
    }
    
    @Override
    public void delete(Curso curso) throws RuntimeException {
        if (curso == null){
            throw new RuntimeException ("Dados do" + " Curso nao preenchidos");
        } else {
             cursoIDao.delete(curso);
        }
    }
    
    @Override
    public Curso update(Curso curso) throws RuntimeException {
        if(curso == null){
            throw new RuntimeException ("Dados do" + " Curso nao preenchidos");
        } else {
            return cursoIDao.update(curso);
        }
    }
    
    @Override
    public Curso findById(Long curso) throws RuntimeException {
        if(curso == null){
            throw new RuntimeException ("Dados do" + " Curso nao preenchidos");
        } else {
            return cursoIDao.findById(curso);
        }
        
    }
    
     @Override
     public List <Curso> findAll() throws RuntimeException {
         return cursoIDao.findAll();
     } 
     
    @Override
    public Curso findByCodCurso(String codcurso) {
        if(codcurso == null){
            throw new RuntimeException ("Primeiramente preencha o Codigo do curso");
        } else {
             return cursoIDao.findByCodCurso(codcurso);
        }
    } 
    
}
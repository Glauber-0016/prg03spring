/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.service;
import br.com.ifba.curso.entity.Curso;
import br.com.ifba.curso.repository.CursoRepository;
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
    private CursoRepository cursoIDao;

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
            return cursoIDao.save(curso);
        }
    }
    
    @Override
    public Curso findById(Long id) {
        if (id == null) {
            throw new RuntimeException("O ID do curso é obrigatório.");
        }

        return cursoIDao.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso não encontrado para o ID: " + id));
    }
    
     @Override
     public List <Curso> findAll() throws RuntimeException {
         return cursoIDao.findAll();
     } 
     
//    @Override
//    public Curso findByCodCurso(String codCurso) {
//        if (codCurso == null || codCurso.isBlank()) {
//            throw new RuntimeException("O código do curso é obrigatório.");
//        }
//
//        return cursoIDao.findByCodCurso(codCurso)
//                .orElseThrow(() -> new RuntimeException("Curso não encontrado para o código: " + codCurso));
//            
//    }
//    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.service;
import br.com.ifba.curso.entity.Curso;
import br.com.ifba.curso.repository.CursoRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    
    
    private static final Logger log = (Logger) LoggerFactory.getLogger(CursoService.class);

    @Override
    public Curso save(Curso curso) throws RuntimeException {
        if(curso == null){
            throw new RuntimeException ("Dados do" + " Curso nao preenchidos");
        } else {
            log.info("Salvando o Objeto Curso!");
            return cursoIDao.save(curso);
            
        }
    }
    
    @Override
    public void delete(Curso curso) throws RuntimeException {
        if (curso == null){
            throw new RuntimeException ("Dados do" + " Curso nao preenchidos");
        } else {
            log.info("Deletando o Objeto Curso!");
             cursoIDao.delete(curso);
        }
    }
    
    @Override
    public Curso update(Curso curso) throws RuntimeException {
        if(curso == null){
            throw new RuntimeException ("Dados do" + " Curso nao preenchidos");
        } else {
            log.info("Atualizando o Objeto Curso!");
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
     
    @Override
    public Curso findBycodigoCurso(String codCurso) {
        if (codCurso == null || codCurso.isBlank()) {
            throw new RuntimeException("O código do curso é obrigatório.");
        }
        
        return cursoIDao.findBycodigoCurso(codCurso)
                .orElseThrow(() -> new RuntimeException("Curso não encontrado para o código: " + codCurso));
            
    }
    
}
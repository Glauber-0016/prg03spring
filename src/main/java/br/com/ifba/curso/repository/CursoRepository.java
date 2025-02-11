/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.curso.repository;

import br.com.ifba.curso.entity.Curso;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Glauber
 */

@Repository
public interface CursoRepository extends JpaRepository<Curso,Long>{
    
    public Optional <Curso> findBycodigoCurso(String CodCurso);
    
    public List<Curso> findById(long id);
}

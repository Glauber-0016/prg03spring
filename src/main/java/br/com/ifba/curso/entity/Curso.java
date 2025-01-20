/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Glauber
 */

@Entity
@Table(name = "curso")
@Getter
@Setter
@NoArgsConstructor
public class Curso extends PersistenceEntity implements Serializable {
    
    @Column(name  = "nome", nullable = false)
    private String nome;
    
    @Column(name  = "codigo_curso", nullable = false, unique = true)
    private String codigoCurso;
    
    @Column(name  = "Ativo")
    private Boolean ativo;

   
}

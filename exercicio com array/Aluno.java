package com.mycompany.mavenproject1;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private Professor professor;
    private List<Curso> cursos = new  ArrayList<>();
    
    
    public Aluno(String nome) {
        this.nome = nome;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
public void adicionarCurso(Curso curso){
 
    if (cursos.contains(curso) == true){
        cursos.add(curso);
        curso.adicionarAluno(this);
    }
    else {
        
        System.out.println("curso ja adicionado");
    }
    

}
    
    
}

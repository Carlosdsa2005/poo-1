package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Aluno> alunos = new  ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

public void adicionarAluno(Aluno aluno){
 
      if (alunos.contains(aluno) == false){
            
        alunos.add(aluno);
        aluno.adicionarCurso(this);
    }
    else {
        System.out.println("aluno ja adicionado");
    }
}
}

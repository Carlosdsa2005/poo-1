package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;


public class Professor {
    private String nome;
    private List<Aluno> Alunos = new ArrayList<>();

    public Professor(String nome) {
        this.nome = nome;

    }

public void adicionarAluno(Aluno aluno) 
    {
        Alunos.add(aluno);
        aluno.setProfessor(this);
    
    }
}



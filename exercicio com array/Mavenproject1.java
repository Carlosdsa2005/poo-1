package com.mycompany.mavenproject1;


public class Mavenproject1 {

    public static void main(String[] args) {
    
    System.out.println("adicionando os participantes");
    Aluno a1 = new Aluno("queres leite");
    Aluno a2 = new Aluno("tomili rola");
    Aluno a3 = new Aluno("felipin jack");
    Aluno a4 = new Aluno("gordin jack");
    Aluno a5 = new Aluno("brunin jack");

    
    Professor p1 = new Professor("mbappe");
    Professor p2 = new Professor("ferro nela");

    Curso c1 = new Curso("curso de ser jack");
    Curso c2 = new Curso("curso com o papa capim");
    
    
    p1.adicionarAluno(a2);
    p1.adicionarAluno(a1);
    
    p2.adicionarAluno(a5);
    p2.adicionarAluno(a3);
    p2.adicionarAluno(a4);
    
    c1.adicionarAluno(a5);
    c1.adicionarAluno(a4);
    c1.adicionarAluno(a3);
    
    c2.adicionarAluno(a1);
    c2.adicionarAluno(a2);
                              
    }
}

package com.mycompany.uvv;

import java.util.Random;
import java.time.Year; 


public class aluno {
    private static int qtdalunos = 0 ;
    
    private String matricula;
    private String nome;
    private String curso;
    private String turma;
    private int periodo;
    private double prime_bimes;
    private double segun_bimeste;
    private double nota_final;

   
    public aluno() {
        this.matricula = gerarMatricula();
    }
    

    
    public aluno(String n,String c,double pb,double sb){
        this.matricula = gerarMatricula();
        this.nome =  n;
        this.curso = c;
        this.prime_bimes = pb;
        this.segun_bimeste = sb;
        this.turma = "A";
        this.periodo = 1;
        this.nota_final = setNota_final();
        qtdalunos++;

}
    private static String gerarMatricula(){
        int ano = Year.now().getValue();
        Random rand = new Random();
        int alea = rand.nextInt(10000);    
        return ano+String.format("%04d",alea);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void imprimir(){
         System.out.println("Matricula: " + this.matricula);
         System.out.println("nome: " + this.nome);
         System.out.println("curso: " + this.curso);
         System.out.println("nota 1bi: " + this.prime_bimes);
         System.out.println("nota 2bi: " + this.segun_bimeste);
         System.out.println("nota final: " + this.nota_final);
         System.out.println("resultado final: " + this.passar());
    }


    
    
    public double setNota_final() {
         return (this.prime_bimes + this.segun_bimeste)/2;
    }

    public String passar(){
        if(this.setNota_final()>=7){
            periodo++;
            return "passou";
        }
        return "reprovou";
    }

     
}

package com.mycompany.uvv;

import java.util.Scanner;

public class Uvv {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            
        System.out.print("digite seu nome: ");
        String nome = scanner.nextLine();   
        nome = nome.toUpperCase();
        System.out.print("Digite seu curso: ");
        String curso = scanner.nextLine();    
        System.out.print("Digite a nota do primeiro bimestre: ");
        double nota1 = scanner.nextDouble();  
        System.out.print("Digite a nota do segundo bimestre: ");
        double nota2 = scanner.nextDouble();  
           
        aluno aluno = new aluno(nome,curso,nota1,nota2);    
        
        aluno.imprimir();
    }
        
        

}

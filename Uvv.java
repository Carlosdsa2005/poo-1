package com.mycompany.uvv;

import java.util.Scanner;


public class Uvv {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

            
        System.out.print("digite seu nome: ");
        String nome = scanner.nextLine();     
        System.out.print("Digite seu curso: ");
        String curso = scanner.nextLine();     
           
        aluno aluno = new aluno(nome,curso);

        


    }
}

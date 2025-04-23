package com.mycompany.mavenproject1;

import java.util.Scanner;


public class Conta {
    int numero = 1;
    double saldo;
    double limite = 1000.00;
    
    Scanner scanner = new Scanner(System.in);

    public Conta( ) {
        System.out.print("faca o deposito inicial: ");
        saldo = scanner.nextInt();

        
    }

     void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

     void sacar(double valor) {
        if (valor > 0 && valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

     void dados(double num_conta){
         if (num_conta == numero)
         {
             System.out.println(numero);
             System.out.println(saldo);
             System.out.println(limite);
             System.out.println(Conta);


         }
             
     }

}

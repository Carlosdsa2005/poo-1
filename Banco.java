package com.mycompany.banco;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Conta conta = new Conta(1000.00, 500.00);

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Sistema Bancário ---");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Consultar Limite");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: R$ ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: R$ ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    System.out.println("Saldo atual: R$ " + conta.getSaldo());
                    break;
                case 4:
                    System.out.println("Limite disponível: R$ " + conta.getLimite());
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar o sistema bancário!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}

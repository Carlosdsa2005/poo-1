package com.mycompany.mavenproject1;


public class Mavenproject1 {

    public static void main(String[] args) {
 Cliente c1 = new Cliente("carlos","111.111.111.11");
       Cliente c2 = new Cliente("queres leite","222.222.222.22");
       Cliente c3 = new Cliente("tomili rola","333.333.333.33");
       
       c1.criarcontacorrente(1000);
       c1.criarcontapoupanca(1000);
       c1.criarcontacorrente(100);
       
       
       c2.criarcontacorrente(200);
       c2.criarcontapoupanca(200);
       
       c3.criarcontacorrente(5000);
       c3.criarcontapoupanca(5000);
       
 
       c1.contas.get(0).sacar(200);
       c1.contas.get(1).sacar(985);

       
       c2.contas.get(0).depositar(400);
       
       
       
       c3.contas.get(0).rendimento();
       
       
       c1.mostrarsaldo();
    }
}

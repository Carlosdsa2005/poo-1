package com.mycompany.mavenproject1;


public class Produto {
    String nome;
    double preco;

    public Produto() {
    }
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
   
    public void ehcaro(){
        if (preco >100)
        {
           System.out.println("o produto " + nome + " e caro");
        }
    }
    
}

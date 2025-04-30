package com.mycompany.mavenproject1;


class Carro extends Produto{
    private String fabricante;
    private String ano;

    public Carro() {
    }

    public Carro(String n, double p,String f, String a) {
        nome = n;
        preco = p;
        fabricante = f;
        ano = a;
    }
        

    
    @Override
    public void ehcaro(){
        if (preco >200000)
        {
           System.out.println("o carro "+ nome + " e caro");
        }
    }  
    
    
}

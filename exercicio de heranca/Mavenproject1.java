/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author alunolab08
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
    Livro l1 = new Livro("queres",150.50,"leite",250);
    Carro c1 = new Carro("corola",3000000,"toyota","2024");
    
    l1.ehgrande();
    l1.ehcaro();
    
    c1.ehcaro();
    }
}

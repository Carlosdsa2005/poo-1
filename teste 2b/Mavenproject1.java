package com.mycompany.mavenproject1;


public class Mavenproject1 {

    public static void main(String[] args) {
        Editora e1 = new Editora("lixex","gadomaster@gmail");
        Editora e2 = new Editora("larissa","rainha dos bois");
        
        Autor a1 = new Autor("carlos","cs");
        Autor a2 = new Autor("rafael","rf");
        
        a1.addContato("email", "lllll@", a1);
        a2.addContato("telefone", "999999", a2);
        
        Livro l1 = new Livro("letras",2013,a1,e1);
        Livro l2 = new Livro("frases",2003,a2,e2);
        
        l2.adicionarAutor(a1);
    }
}


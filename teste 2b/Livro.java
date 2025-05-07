package com.mycompany.mavenproject1;

import java.util.HashSet;
import java.util.Set;

public class Livro {
    private String titulo;
    private int ano;
    private Set<Autor> autores = new HashSet<>();
    private Editora editora;

    public Livro(String titulo, int ano,Autor autor, Editora editora) {
        this.titulo = titulo;
        this.ano = ano;
        autores.add(autor);
        this.editora = editora;
    }
   
    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}

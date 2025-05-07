package com.mycompany.mavenproject1;

import java.util.HashSet;
import java.util.Set;

public class Autor {
    private String nome;
    private String abreviatura;
    
    public Autor(String nome, String abreviatura) {
        this.nome = nome;
        this.abreviatura = abreviatura;       
    }

    public void addContato(String t,String c,Autor autor){
    Contato contato = new Contato(t,c,autor);
        }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
    
    
}

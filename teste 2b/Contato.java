package com.mycompany.mavenproject1;

import java.util.HashSet;
import java.util.Set;

public class Contato {
    private String tipo;
    private String contato;
    private Autor autor;


    public Contato(String tipo, String contato,Autor autor) {
        this.tipo = tipo;
        this.contato = contato;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    
    

    
}

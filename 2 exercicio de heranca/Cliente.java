package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
                String nome;
        String cpf;
        public List<Conta> contas = new ArrayList<>();
        
                
    public Cliente(String n,String c){
            this.nome = n;
            cpf = c;

    }
    
    public void criarcontacorrente(double s){
        Contac contac = new Contac(s);
        contas.add(contac);
    }
    
    public void criarcontapoupanca(double s){
        Contap contap = new Contap(s);
        contas.add(contap);
    }
    
    public void mostrarsaldo(){
        for(Conta conta : contas){
        System.out.println( "Saldo da conta: " + conta.getSaldo());
        }
    }    
    
    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
    
    
    

}

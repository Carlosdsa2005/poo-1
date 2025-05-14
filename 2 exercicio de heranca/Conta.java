
package com.mycompany.mavenproject1;


public class Conta {
    private double saldo;



         
    public Conta(double saldo) {
        this.saldo = saldo;

        
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

  
     public void sacar(double v){
        if ((v + 15)< getSaldo()){
            setSaldo(getSaldo() - (v + 15));
            System.err.println("novo saldo : " + getSaldo());
        }
        else{
            System.err.println("saldo insuficente");
        }
    }
     
     
 
    public void depositar(double v){
        if( v > 0){
             setSaldo(getSaldo() - v);
             System.err.println("saldo insuficente");
        }
        else {
            System.err.println("novo saldo : " + getSaldo());

        }
    }
    
    

    public void rendimento(){
        setSaldo(getSaldo() + (getSaldo() * 0.5));
        System.err.println("novo saldo : " + getSaldo());
    }
}

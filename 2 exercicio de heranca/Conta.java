
package com.mycompany.mavenproject1;


public abstract class Conta {
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

  
     public abstract void sacar(double v);
     
     
 
    public abstract void depositar(double v);


    public abstract void rendimento();
    
}

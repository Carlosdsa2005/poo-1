
package com.mycompany.mavenproject1;


class Contac extends Conta{
 

    public Contac(double saldo) {
        super(saldo);
    }


    @Override
     public void sacar(double v){
        if ((v + 5)< getSaldo()){
            setSaldo(getSaldo() - (v + 5));
            System.err.println("novo saldo : " + getSaldo());
        }
        else{
            System.err.println("saldo insuficente");
        }
    }
     
     
    @Override
    public void depositar(double v){
        if( v > 0){
             setSaldo(getSaldo() - v);
             System.err.println("novo saldo da conta corrente : " + getSaldo());
        }
        else {
            System.err.println("saldo insuficente");

        }
    }
    
    
    @Override
    public void rendimento(){
        setSaldo(getSaldo() +(getSaldo() * 0.02));
        System.err.println("novo saldo da conta poupança: " + getSaldo());
    }
    
    
   
    
}

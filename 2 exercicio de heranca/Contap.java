package com.mycompany.mavenproject1;


class Contap extends Conta {

    public Contap(double saldo) {
        super(saldo);
    }

    @Override
     public void sacar(double v){
        if ((v + 15)< getSaldo()){
            setSaldo(getSaldo() - (v + 15));
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
             System.err.println("saldo insuficente");
        }
        else {
            System.err.println("novo saldo : " + getSaldo());

        }
    }
    
    
    @Override
    public void rendimento(){
        setSaldo(getSaldo() + (getSaldo() * 0.5));
        System.err.println("novo saldo : " + getSaldo());
    }
    
}

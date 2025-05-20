
package com.mycompany.mavenproject1;


class Contac extends Conta{
 

    public Contac(double saldo) {
         super(saldo);
    }

    @Override
     public void sacar(double v){
        if ((v + 15) <= getSaldo()){
            setSaldo(getSaldo() - (v + 15));
            System.err.println("SAQUE FEITO ; novo saldo da conta poupanca: " + getSaldo());
        }
        else{
            System.err.println("saldo insuficente");
        }
    }
     
     
    @Override
    public void depositar(double v){
        if( v > 0){
             setSaldo(getSaldo() + v); 
             System.err.println("DEPOSITO REALIZADO ; novo saldo da conta poupanca : " + getSaldo());         
        }
        else {
           System.err.println("valor nao aceito");

        }
    }
    
    
    @Override
    public void rendimento(){
        setSaldo(getSaldo() + (getSaldo() * 0.05));
        System.err.println("RENDIMENTO APLICADO; novo saldo da conta poupanca: " + getSaldo());
    }
    }
    
    
   
    
}

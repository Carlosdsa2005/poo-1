package banco;


public class Conta {
    int numero;
    String nome;
    double saldo;

    public Conta(int num, String nom, double saldoInicial) {
        saldo = saldoInicial;
    }

     void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

     void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

     double dados() {
        return numero + nome+ saldo;
    }


}


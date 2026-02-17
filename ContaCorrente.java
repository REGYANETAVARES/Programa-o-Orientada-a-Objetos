public class ContaCorrente {
    int numeroConta;
    String titular;
    double saldo; 
    int agencia; 
    double limite; 

    void sacar (double valor){
        if (saldo >= valor) {
        saldo = saldo - valor;
        System.out.println("Saque realizado! Saldo: " + saldo);
    } else {
        System.out.println("Saldo insuficiente!");
    }
       

    }
    void depositar (double valor){
        saldo = saldo + valor;
        System.out.println("Deposito realizado! Saldo : "+ saldo); 



    }
    void transferir (double valor){
        if (saldo >= valor) {
        saldo -= valor;
        System.out.println("Transferencia realizada! Saldo: " + saldo);
    } else {
        System.out.println("Saldo insuficiente!");
    }

    }
}
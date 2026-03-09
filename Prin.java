public class Prin {
    public static void main(String[] args) {
        // Cria 2 contas
        ContaCorrente cC = new ContaCorrente(); 
        cC.titular = "Ricardo";
        cC.saldo = 3000.00;
        cC.numeroConta = 123345578;
        cC.agencia = 1234;
        cC.limite = 500.00;
        
        ContaCorrente cC2 = new ContaCorrente();
        cC2.titular = "Maria";
        cC2.saldo = 500.00;
        
        // DEPOSITANDO
        System.out.println("=== DEPOSITANDO R$ 500 ===");
        if (cC.depositar(500)) {
            System.out.println("Deposito realizado! Saldo: " + cC.saldo);
        } else {
            System.out.println("Erro no deposito!");
        }
        
        // SACANDO
        System.out.println("\n=== SACANDO R$ 200 ===");
        if (cC.sacar(200)) {
            System.out.println("Saque realizado! Saldo: " + cC.saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
        
        // TRANSFERINDO
        System.out.println("\n=== TRANSFERINDO R$ 100 PRA MARIA ===");
        if (cC.transferir(100, cC2)) {
            System.out.println("Transferencia OK!");
            System.out.println("Saldo Ricardo: " + cC.saldo);
            System.out.println("Saldo Maria: " + cC2.saldo);
        } else {
            System.out.println("Transferencia falhou!");
        }
        
        // TENTANDO SACAR MUITO
        System.out.println("\n=== TENTANDO SACAR R$ 99999 ===");
        if (cC.sacar(99999)) {
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente! Saldo atual: " + cC.saldo);
        }
    }
}
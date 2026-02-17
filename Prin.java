public class Prin {
    public static void main(String[] args) {
        ContaCorrente cC = new ContaCorrente(); 

        cC.titular = "Ricardo";
        cC.saldo = 3000.00;
        cC.numeroConta = 123345578;
        cC.agencia = 1234;
        cC.limite = 500.00;

        System.out.println("=======SALDO INICIAL =========");
        System.out.println("Saldo : R$ "+ cC.saldo);

           System.out.println("\n=======Depositando R$ 500.00=====");
           cC.depositar(500);

            System.out.println("\n=======Sacando R$ 200 =========");
            cC.sacar(200);

               System.out.println("\n=======Transferindo R$ 100=========");
               cC.transferir(100);

                  System.out.println("\n=======Tentando sacar R$ 99999 =========");
                  cC.sacar(99999);
    }

    }


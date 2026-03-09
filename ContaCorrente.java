public class ContaCorrente {
    int numeroConta;
    String titular;
    double saldo; 
    int agencia; 
    double limite; 

    public boolean sacar (double valor){
        if (valor > 0 && saldo >= valor) {
        saldo = saldo - valor;
        return true; 
    } 
         return false; 
        
    }
       

    
    public boolean depositar(double valor){
        if(valor > 0){
            saldo = saldo + valor ; 
            return true; 

        }
        return false; 
      


    }

    public boolean depositar (double valor){
        if (valor > 0) {
        saldo = saldo + valor; 
        return true; 
       
    } 
    return false; 
  
    }

    public boolean transferir (double valor, ContaCorrente destino) {
        if (sacar(valor)) {
            destino.depositar(valor); 
            return true; 
        }
        return false; 
    }
}

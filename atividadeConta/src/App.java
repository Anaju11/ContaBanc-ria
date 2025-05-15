public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Conta Bancaria 01");
         conta c1 = new conta(1001, "Ana Silva", 500.0); 
        System.out.println("Saldo inicial (c1): " + c1.getSaldo()); 
        c1.depositar(150.0); 
        System.out.println("Após depósito de R$150: " + c1.getSaldo()); 
boolean ok = c1.sacar(700.0); 
        System.out.println("Tentativa de saque de R$700: " + (ok ? "sucesso" : 
"falha")); 
        System.out.println("Saldo final (c1): " + c1.getSaldo()); 
         System.out.println("Conta Bancaria 02");
         //cria nova conta e define atributos.
         conta c2= new conta(1002, "Leo", 1000.0);
         //exibe saldo inicial.
         System.err.println("Saldo inicial c2: "+ c2.getSaldo());
         //deposita um valor.
        c2.depositar(100000.0);
        //mostra valor após depósito.
        System.err.println("Após depósito de R$100000.0: "+c2.getSaldo());
        //caso haja saldo suficiente saca o valor.
         ok = c2.sacar(190.0);
  System.out.println("Tentativa de saque de R$190.0: " + (ok ? "sucesso" : 
"falha")); 
//exibe saldo final.
        System.out.println("Saldo final (c2): " + c2.getSaldo()); 

    }
}

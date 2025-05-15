public class conta {
 private int numeroConta = 0;
  private String titular;
 private double saldo = 0.0;

 public conta(int numeroConta, String titular, double saldo){
    this.numeroConta = numeroConta;
    this.titular = titular;
    this.saldo = saldo;
 }
 
    public int getNumeroConta() {
        return numeroConta;
    }

    
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String titular(){
    return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
    return saldo;
    }

    public void depositar(double valor){
        saldo+=valor;
    }

     
       public boolean sacar(double valor) {
       
        if (valor <= saldo) {
            saldo -= valor;
            return true; 
        } else {
            return false; 
        }
    }
}

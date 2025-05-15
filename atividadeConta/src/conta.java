//criação de uma classe e seus atributos inicializados.
public class conta {
 private int numeroConta = 0;
  private String titular;
 private double saldo = 0.0;
//construtor público.
 public conta(int numeroConta, String titular, double saldo){
    this.numeroConta = numeroConta;
    this.titular = titular;
    this.saldo = saldo;
 }
 //método para acessar número da conta.
    public int getNumeroConta() {
        return numeroConta;
    }

    //método para atualizar número da conta.
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
  //método para depositar valor onde saldo é igual a saldo + valor.
    public void depositar(double valor){
        saldo+=valor;
    }
//método para sacar, onde primeiro é verificado se o saldo é suficiente.
     
       public boolean sacar(double valor) {
       
        if (valor <= saldo) {
            saldo -= valor;
            return true; 
        } else {
            return false; 
        }
    }
}

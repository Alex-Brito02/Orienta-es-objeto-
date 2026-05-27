public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String nomeTitular) { 
        this.titular = nomeTitular;
        this.saldo =  0.0;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositadar(double valorDepositado) {
     this.saldo = this.saldo + valorDepositado;
    }

    public void sacar(double valorSacado) {
        if (this.saldo >= valorSacado) {
            this.saldo = this.saldo - valorSacado;
            System.out.println("Saldo realizado");
        } else {
            System.out.println("Saldo insuficiente");
            
        }

    }
    
}
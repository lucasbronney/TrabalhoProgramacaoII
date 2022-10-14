package trabalho01;

public class ContaCorrente implements Conta {

    // Atributos //
    private String titular;
    private double saldo = 0;
    private boolean status;

    // Construtor //
    public ContaCorrente(){

    }
    public ContaCorrente(String titular) {
        this.titular = titular;

    }

    // Getters and Setters //
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Métodos //
    public void depositar(double v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado");
        } else {
            System.out.println("Não foi possível realizar o deposito");
        }

    }

    public void sacar(double v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado");
            } else {
                System.out.println("Saldo Insuficiente");
            }

        }
    }

    public void mostrarInfo() {
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Status: " + this.getStatus());
        System.out.println("Saldo: " + this.getSaldo());
    }

    @Override
    public String getTitular() {
        return titular;
    }

    @Override
    public void setTitular(String titular) {
        this.titular = titular;
    }

}
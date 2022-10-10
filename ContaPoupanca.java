package trabalho01;

public class ContaPoupanca implements Conta {

    // Atributos //
    private String titular;
    private float saldo;
    private boolean status;

    // Construtor //
    public ContaPoupanca(String titular) {
        this.titular = titular;

    }

    // Getters and Setters //
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Métodos //
    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado");
        } else {
            System.out.println("Não foi possível realizar o deposito");
        }

    }

    public void sacar(float v) {
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

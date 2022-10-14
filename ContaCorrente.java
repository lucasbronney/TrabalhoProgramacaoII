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
    public void depositar(float v) {
        if (this.getStatus() == false) {
            try {
                throw new ExceptConta();
            } catch (ExceptConta e) {
                System.out.println("Um erro foi encontrado");
                e.printStackTrace();
            }
        } else {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado");
        }
    }

    public void sacar(float v) {
        if (this.getStatus() == false) {
            try {
                throw new ExceptConta();
            } catch (ExceptConta e) {
                System.out.println("Um erro foi encontrado");
                e.printStackTrace();
                System.exit(0);
            }
        }
        if (this.getSaldo() < v) {
            System.out.println("Saldo insuficiente");
        } else {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado");
        }
    }

    public void mostrarInfo() {
        System.out.println("Titular: " + this.getTitular());
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

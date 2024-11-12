package br.com.controle;

//@author emanuelly
public abstract class Conta extends Cliente{
    private int numero_conta;
    private String agencia_conta;
    private String tipo_conta;
    private double saldo_conta;
    private Cliente cliente;

    public int getNumero_conta() {
        return numero_conta;
    }
    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }
    public String getAgencia_conta() {
        return agencia_conta;
    }
    public void setAgencia_conta(String agencia_conta) {
        this.agencia_conta = agencia_conta;
    }

    public String getTipo_conta() {
        return tipo_conta;
    }

    public void setTipo_conta(String tipo_conta) {
        this.tipo_conta = tipo_conta;
    }
       
    public double getSaldo_conta() {
        return saldo_conta;
    }
    public void setSaldo_conta(double saldo_conta) {
        this.saldo_conta = saldo_conta;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        //implemtar
    }

    public boolean sacar(double valor) {
        return false;
        //implemtar
    }

    public double consultarSaldo() {
        return 0;
        //implemtar
    }
}

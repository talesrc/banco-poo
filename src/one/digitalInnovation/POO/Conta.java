package one.digitalInnovation.POO;

public abstract class Conta implements IConta {

    private static int SEQUENTIAL = 1;

    protected Banco banco;
    protected Agencia agencia;
    protected int numConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Banco banco, Agencia agencia, Cliente cliente) {
        this.agencia = agencia;
        this.banco = banco;
        this.numConta = SEQUENTIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Agencia agencia, Conta contaDestino, double valor) {
        if (agencia.getBanco() != this.banco) {
            this.sacar(valor + 5.50);
            contaDestino.depositar(valor);
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    protected void imprimirInfos() {
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Banco getBanco() { return this.banco; }

    public Cliente getCliente() { return cliente; }

}

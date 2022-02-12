package one.digitalInnovation.POO;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Banco banco, Agencia agencia, Cliente cliente) {
        super(banco, agencia, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfos();
    }

    public void render() {
        this.saldo *= 1.005;
    }

}

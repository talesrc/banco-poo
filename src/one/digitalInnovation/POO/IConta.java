package one.digitalInnovation.POO;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(Agencia agencia, Conta contaDestino, double valor);

    void imprimirExtrato();

}

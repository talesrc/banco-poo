package one.digitalInnovation.POO;

public class Agencia {

    private static int SEQUENCIAL = 1;

    private Banco banco;
    private int numAgencia;

    public Agencia(Banco banco) {
        this.banco = banco;
        this.numAgencia = SEQUENCIAL++;
    }

    public Banco getBanco() {
        return banco;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

}

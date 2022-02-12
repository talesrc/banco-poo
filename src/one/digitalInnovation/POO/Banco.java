package one.digitalInnovation.POO;

public class Banco {

    private static int SEQUENCIAL = 1;

    private int idBanco;
    private String nome;

    public Banco(String nome) {
        this.idBanco = SEQUENCIAL++;
        this.nome = nome;
    }

    public int getIdBanco() { return idBanco; }

    public String getNome() { return nome; }

    @Override
    public String toString() {
        return "Banco{" +
                "idBanco=" + idBanco +
                ", nome='" + nome + '\'' +
                '}';
    }
}

package one.digitalInnovation.POO;

public class Main {

    public static void main(String[] args) {
        Banco bb = new Banco("Banco do Brasil");
        Banco nubank = new Banco("Nubank");

        Agencia agenciabb1 = new Agencia(bb);
        Agencia agenciaNu1 = new Agencia(nubank);

        Cliente tales = new Cliente("15555567890", "Tales");

        ContaPoupanca bbTales = new ContaPoupanca(bb, agenciabb1, tales);
        Conta nubankTales = new ContaCorrente(nubank, agenciaNu1, tales);

        bbTales.depositar(1560);

        // Após 1 mês rendendo...
        bbTales.render();

        bbTales.transferir(agenciaNu1, nubankTales, 1360);

        System.out.println("=== Informações de Tales - BB ===");
        System.out.println(String.format("Banco: %s", bbTales.getBanco().getNome()));
        System.out.println(String.format("Agencia: %x", bbTales.getAgencia().getNumAgencia()));
        System.out.println(String.format("Saldo: %.2f\n", bbTales.getSaldo()));

        System.out.println("=== Informações de Tales - Nubank ===");
        System.out.println(String.format("Banco: %s", nubankTales.getBanco().getNome()));
        System.out.println(String.format("Agencia: %x", nubankTales.getAgencia().getNumAgencia()));
        System.out.println(String.format("Saldo: %.2f", nubankTales.getSaldo()));

    }
}

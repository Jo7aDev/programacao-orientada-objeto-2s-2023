public class Main {
    public static void main(String[] args) {
        Banco meuBanco = new Banco("Meu Banco");

        Cliente cliente1 = new Cliente("Alice", "123 Main St", "12345");
        Cliente cliente2 = new Cliente("Bob", "456 Elm St", "67890");

        ContaCorrente conta1 = new ContaCorrente("001", 1000.0, 500.0);
        ContaPoupanca conta2 = new ContaPoupanca("002", 2000.0, 0.03);

        conta1.setCliente(cliente1);
        conta2.setCliente(cliente2);

        meuBanco.adicionarConta(conta1);
        meuBanco.adicionarConta(conta2);

        meuBanco.listarContas();

        System.out.println("\nInformações dos Clientes e Contas:");
        exibirInformacoesConta(conta1);
        exibirInformacoesConta(conta2);
    }

    public static void exibirInformacoesConta(ContaBancaria conta) {
        Cliente cliente = conta.getCliente();
        String tipoConta = (conta instanceof ContaCorrente) ? "Conta Corrente" : "Conta Poupança";
        
        System.out.println("\nCliente: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo da Conta: " + conta.getSaldo());
    }
}

import java.util.Scanner;

public class SistemaGerenciamentoEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Remover item");
            System.out.println("3 - Listar itens");
            System.out.println("4 - Atualizar quantidade");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do item: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    estoque.adicionarItem(nome, quantidade);
                    break;

                case 2:
                    System.out.print("Nome do item a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    estoque.removerItem(nomeRemover);
                    break;

                case 3:
                    estoque.listarItens();
                    break;

                case 4:
                    System.out.print("Nome do item a ser atualizado: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    estoque.atualizarQuantidade(nomeAtualizar, novaQuantidade);
                    break;

                case 5:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }
    }
}

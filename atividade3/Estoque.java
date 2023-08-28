import java.util.ArrayList;

public class Estoque {
    private ArrayList<ItemEstoque> itens;

    public Estoque() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade) {
        ItemEstoque newItem = new ItemEstoque(nome, quantidade);
        itens.add(newItem);
    }

    public void removerItem(String nome) {
        for (ItemEstoque item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itens.remove(item);
                break;
            }
        }
    }

    public void listarItens() {
        System.out.println("Itens no estoque:");
        for (ItemEstoque item : itens) {
            System.out.println("Nome: " + item.getNome() + " | Quantidade: " + item.getQuantidade());
        }
    }

    public void atualizarQuantidade(String nome, int novaQuantidade) {
        for (ItemEstoque item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                item.setQuantidade(novaQuantidade);
                break;
            }
        }
    }
}

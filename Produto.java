public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço não pode ser negativo.");
        }
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEmEstoque += quantidade;
            System.out.println("Adicionado " + quantidade + " unidade(s) ao estoque.");
        } else {
            System.out.println("Erro: A quantidade para adicionar deve ser maior que zero.");
        }
    }


    public void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade para venda deve ser maior que zero.");
        } else if (quantidade <= this.quantidadeEmEstoque) {
            this.quantidadeEmEstoque -= quantidade;
            System.out.println("Venda realizada: " + quantidade + " unidade(s).");
        } else {
            System.out.println("Estoque insuficiente para a venda.");
        }
    }

    public void exibirResumo() {
        System.out.println("\n--- Resumo do Produto ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$ " + String.format("%.2f", this.preco));
        System.out.println("Quantidade em Estoque: " + this.quantidadeEmEstoque);
        System.out.println("-------------------------\n");
    }
}
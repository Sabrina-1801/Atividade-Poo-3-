public class Main {
    public static void main(String[] args) {
        System.out.println("=== INICIANDO TESTES DE PRODUTO ===\n");

        Produto produto1 = new Produto("Notebook", 3500.00);
        produto1.exibirResumo();

        System.out.println("--- Teste de Adição de Estoque ---");
        produto1.adicionarEstoque(10); 
        produto1.adicionarEstoque(-5); 
        produto1.adicionarEstoque(0); 

        System.out.println("\n--- Teste de Vendas ---");
        produto1.vender(3); 
        produto1.vender(15);
        produto1.vender(0); 
        produto1.vender(-2); 

    
        produto1.vender(7); 

        produto1.vender(1);  

        produto1.exibirResumo();
    }
}
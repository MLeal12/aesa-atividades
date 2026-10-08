public class Main {
public static void main(String[] args) {

    EstoqueService estoque = new EstoqueService();

    Produto produto1 = new Produto(1, "Arroz", "Alimentos", 25.90, 10);
    Produto produto2 = new Produto(2, "Feijão", "Alimentos", 8.50, 20);

    // CREATE
    estoque.adicionarProduto(produto1);
    estoque.adicionarProduto(produto2);

    // READ
    System.out.println("Produto encontrado:");
    System.out.println(estoque.buscarProduto(1));

    // UPDATE
    Produto produtoAtualizado = new Produto(1, "Arroz Integral", "Alimentos", 29.90, 15);
    estoque.atualizarProduto(produtoAtualizado);

    System.out.println("\nProduto após atualização:");
    System.out.println(estoque.buscarProduto(1));

    // DELETE
    estoque.removerProduto(2);

    System.out.println("\nProduto 2 após remoção:");
    System.out.println(estoque.buscarProduto(2));
}    
}

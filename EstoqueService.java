import java.util.HashMap;
import java.util.Map;

public class EstoqueService {

    private Map<Integer, Produto> produtos = new HashMap<>();


public void adicionarProduto(Produto produto) {
    produtos.put(produto.getId(), produto);
}

public Produto buscarProduto(int id) {
    return produtos.get(id);
}
public void atualizarProduto(Produto produto) {
    produtos.put(produto.getId(), produto);
}

public void removerProduto(int id) {
    produtos.remove(id);
}
}
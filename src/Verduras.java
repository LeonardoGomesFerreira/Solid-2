public class Verduras implements Desconto {
    @Override
    public double aplicar(Produto produto) {
        double pesoTotal = produto.getPeso() * produto.getQuantidade();

        // só recebe desconto se atingir 5kg
        if (pesoTotal >= 5) {
            return produto.getPreco() * produto.getQuantidade() * 0.90; // 10% de desconto
        }

        return produto.getPreco() * produto.getQuantidade();
    }
}
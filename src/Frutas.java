public class Frutas implements Desconto {
    @Override
    public double aplicar(Produto produto) {
        double pesoTotal = produto.getPeso() * produto.getQuantidade();

        // só recebe desconto se atingir 3kg
        if (pesoTotal >= 3) {
            return produto.getPreco() * produto.getQuantidade() * 0.85; // 15% de desconto
        }

        return produto.getPreco() * produto.getQuantidade();
    }
}

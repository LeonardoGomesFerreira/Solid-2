public class Legumes implements Desconto {
    @Override
    public double aplicar(Produto produto) {
        // Desconto de 12% se o peso for maior ou igual a 4
        if (produto.getPeso() >= 4) {
            return produto.getPreco() * 0.88;
        }
        return produto.getPreco();
    }
}

public class CalculadoraDesconto {
    /// public static double aplicarDesconto(Desconto desconto, Produto produto) {
    ///      return desconto.aplicar(produto);
    ///  }

    /// Metodo extra se quiser calcular vários produtos
    public double aplicarDesconto(Desconto desconto, Produto... produtos) {
        double total = 0;
        for (Produto p : produtos) {
            total += desconto.aplicar(p);
        }
        return total;
    }
}
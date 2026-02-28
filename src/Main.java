public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Banana", 4.50, 0.25, 12);   // 12 bananas, 0.25kg cada
        Produto p2 = new Produto(2, "Alface", 3.00, 0.30, 2);    // 2 alfaces
        Produto p3 = new Produto(3, "Laranja", 5.00, 0.20, 10);  // 10 laranjas
        Produto p4 = new Produto(4, "Cenoura", 2.50, 0.20, 8);   // 8 cenouras

        // Criando os descontos
        Desconto descontoFrutas = new Frutas();
        Desconto descontoVerduras = new Verduras();
        Desconto descontoLegumes = new Legumes();

        // Calculadora de descontos
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        // Mostrar produtos individualmente
        mostrarPrecoProduto(calculadora, descontoFrutas, p1);
        mostrarPrecoProduto(calculadora, descontoFrutas, p3);
        mostrarPrecoProduto(calculadora, descontoVerduras, p2);
        mostrarPrecoProduto(calculadora, descontoLegumes, p4);

        // Total geral da compra
        double totalGeralSemDesconto = p1.getPreco() * p1.getQuantidade() + p2.getPreco() * p2.getQuantidade() + p3.getPreco() * p3.getQuantidade() + p4.getPreco() * p4.getQuantidade();
        double totalGeralComDesconto = calculadora.aplicarDesconto(descontoFrutas, p1, p3) + calculadora.aplicarDesconto(descontoVerduras, p2) + calculadora.aplicarDesconto(descontoLegumes, p4);

        System.out.println("\nTotal geral sem desconto: R$ " + String.format("%.2f", totalGeralSemDesconto));
        System.out.println("Total geral com desconto: R$ " + String.format("%.2f", totalGeralComDesconto));
    }

    /// Metodo auxiliar para mostrar preço com e sem desconto
    private static void mostrarPrecoProduto(CalculadoraDesconto calculadora, Desconto desconto, Produto produto) {
        double precoSemDesconto = produto.getPreco() * produto.getQuantidade();
        double precoComDesconto = calculadora.aplicarDesconto(desconto, produto);

        System.out.println("Produto: " + produto.getNome());
        System.out.println(" - Quantidade: " + produto.getQuantidade());
        System.out.println(" - Preço sem desconto: R$ " + String.format("%.2f", precoSemDesconto));
        System.out.println(" - Preço com desconto: R$ " + String.format("%.2f", precoComDesconto) + "\n");
    }
}
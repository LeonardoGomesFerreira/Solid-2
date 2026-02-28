public class Produto {
    private int Id;
    private String Nome;
    private double Preco;
    private double Peso;
    private int Quantidade;

    public Produto(int id, String nome, double preco, double peso, int quantidade) {
        Id = id;
        Nome = nome;
        Preco = preco;
        Peso = peso;
        Quantidade = quantidade;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }
}
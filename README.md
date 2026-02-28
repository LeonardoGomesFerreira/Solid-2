# 🛒 Sistema de Descontos para Produtos (Strategy Pattern em Java)

Este projeto é uma aplicação simples em **Java** que simula um sistema de cálculo de descontos para produtos de um mercado (Frutas, Verduras e Legumes).

O principal objetivo é demonstrar a aplicação do **Design Pattern Strategy**, permitindo que diferentes regras de desconto sejam aplicadas dinamicamente.

---

## 📌 Conceitos Aplicados

- ✅ Programação Orientada a Objetos (POO)
- ✅ Encapsulamento
- ✅ Interface
- ✅ Strategy Pattern
- ✅ Varargs
- ✅ Organização de responsabilidades

---

## 🧠 Strategy Pattern

O padrão **Strategy** permite definir uma família de algoritmos (regras de desconto), encapsulá-los e torná-los intercambiáveis em tempo de execução.

### Estrutura do Projeto

- **Strategy (Interface)** → `Desconto`
- **Concrete Strategies** → `Frutas`, `Verduras`, `Legumes`
- **Context** → `CalculadoraDesconto`
- **Client** → `Main`

---

## 📦 Estrutura das Classes

### 🔹 Produto

Representa um produto do mercado.

Atributos:

- id
- nome
- preco
- peso
- quantidade

Métodos importantes:

```java
public double getValorTotal() {
    return preco * quantidade;
}

public double getPesoTotal() {
    return peso * quantidade;
}
🔹 Interface Desconto

Define o comportamento comum das estratégias:

public interface Desconto {
    double aplicar(Produto produto);
}
🔹 Regras de Desconto
🍎 Frutas

15% de desconto se o peso total for ≥ 3kg

🥬 Verduras

10% de desconto se o peso total for ≥ 5kg

🥕 Legumes

12% de desconto se o peso total for ≥ 4kg

🧮 Fórmulas Utilizadas

Valor total do produto:

valorTotal = preco * quantidade

Peso total do produto:

pesoTotal = peso * quantidade

Cálculo genérico do desconto:

valorFinal = valorTotal * (1 - percentual)
🧾 Calculadora de Desconto

Permite aplicar desconto em um ou vários produtos:

public double aplicarDesconto(Desconto desconto, Produto... produtos) {
    double total = 0;
    for (Produto p : produtos) {
        total += desconto.aplicar(p);
    }
    return total;
}
▶️ Classe Main (Execução)

A classe Main cria produtos, aplica diferentes estratégias de desconto e calcula:

Valor individual com e sem desconto

Total geral da compra

Total geral com desconto aplicado

🚀 Como Executar

Clone o repositório:

git clone https://github.com/seu-usuario/seu-repositorio.git

Abra o projeto em uma IDE (IntelliJ, Eclipse ou VSCode).

Execute a classe Main.

📈 Possíveis Melhorias Futuras

🔄 Substituir double por BigDecimal (cálculo monetário mais preciso)

📊 Criar enum TipoProduto

🏗 Refatorar para remover repetição nas classes de desconto

🧪 Adicionar testes unitários com JUnit

💾 Persistência em banco de dados

🎯 Objetivo Educacional

Este projeto foi desenvolvido com fins de aprendizado para:

Compreender o funcionamento do Strategy Pattern

Melhorar organização de código

Aplicar boas práticas de orientação a objetos

👨‍💻 Autor

Projeto desenvolvido para fins acadêmicos e prática de arquitetura de software em Java.

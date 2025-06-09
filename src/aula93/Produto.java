package aula93;

public class Produto {
    static final double PRECO = 1.00;
    static double custoEmbalagem;
    private double precoVenda;
    private double valor = 1.00;
    public Produto(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Produto() {
    }

    @Override
    public String toString() {
        return "Produto{" +
                "precoVenda=" + precoVenda +
                ", custoEmbalagem=" + custoEmbalagem +
                ", preco=" + Produto.PRECO +
                '}';
    }

    //    para um metodo static usar uma variavel de instancia deve receber a instancia do objeto

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    static double calcularCustosTotais(Produto p) {
        return Produto.custoEmbalagem + p.precoVenda + PRECO;
    }

    public static double getCustoEmbalagem() {
        return custoEmbalagem;
    }

    public static void setCustoEmbalagem(double custoEmbalagem) {
        Produto.custoEmbalagem = custoEmbalagem;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
}

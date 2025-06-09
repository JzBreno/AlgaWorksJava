package aula93;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Produto.custoEmbalagem = 20.00;
        produto.setPrecoVenda(23.00);
        Produto.calcularCustosTotais(produto);
        System.out.println(produto);
    }
}

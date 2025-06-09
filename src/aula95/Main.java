package aula95;

//#096
public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Produto.custoEmbalagem = 20.00;
        produto.setPrecoVenda(23.00);
        var numero = Produto.calcularCustosTotais(produto);
        System.out.println(produto + ": " + numero);
    }
}

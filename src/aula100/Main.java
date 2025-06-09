package aula100;

import POO.Carro;
import aula93.Produto;

public class Main {
    public static void main(String[] args) {
//        Cliente primeiro = new Cliente("jose", 2.000);
//        System.out.println(primeiro);
//        primeiro.consultalimiteCredito();
//        System.out.println(primeiro);

        CarrinhoDeCompra c = new CarrinhoDeCompra();
        c.setQuantidadeItens(1);
        c.realizarCompra("00001");

        Produto produto = new Produto();
        produto.setPrecoVenda(100);
        produto.setValor(20);
        c.adicionarItem(produto);
    }
}

package aula100;

import aula100.Pagamento.GatewayPagamento;
import aula93.Produto;

public class CarrinhoDeCompra {

    static final double TAXA_DE_SERVICO = 0.10;

    private int quantidadeItens;
    Produto produto = new Produto();

    void adicionarItem(Produto produto) {
        System.out.println("Adicionado Produto" + produto);
    }
    void adicionarItem(GatewayPagamento gatewayPagamento, Produto produto) {
        System.out.println("Adicionado Produto" + produto + "Pagamento" + gatewayPagamento);
    }

    void realizarCompra(String numeroCartao) {
        double subvalor = calcularSubvalor();
        double taxaServico = calcularTaxaServico(subvalor);
        double valorTotal = subvalor + taxaServico;
        boolean pagamentoAutorizado = GatewayPagamento.autorizarPagamento(numeroCartao, valorTotal);

        checarAutorizacaoPagamento(pagamentoAutorizado, valorTotal);

    }

    private static void checarAutorizacaoPagamento(boolean pagamentoAutorizado, double valorTotal) {
        if (pagamentoAutorizado) {
            System.out.println("Pagamento Autorizado");
            System.out.println("valorTotal: " + valorTotal);
        }
    }

    private static double calcularTaxaServico(double subvalor) {
        return subvalor * TAXA_DE_SERVICO;
    }

    private double calcularSubvalor() {
        return produto.getValor() * quantidadeItens;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }
}

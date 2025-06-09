package aula100.Pagamento;

public class GatewayPagamento {

    public static boolean autorizarPagamento(String numeroCartao, double valorTotal){
        if(numeroCartao.equals("0000") && valorTotal > 0){
            System.out.println("Pagamento efetuado com sucesso!");
            return true;
        }else{}
            System.out.println("Pagamento Não Autorizado!");
            return false;
    }
}

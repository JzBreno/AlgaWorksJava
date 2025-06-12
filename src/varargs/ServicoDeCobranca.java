package varargs;

import java.util.ArrayList;

public class ServicoDeCobranca {

    //com varargs posso usar melhor esses valores aos metodos
    //bom quando quiser usar valores que podem ser ou nao utilizados
    static void pagar(double valor,String emailObrigatorio, String... emailsCobranca){
        ArrayList<String> emails = new ArrayList<>();
        emails.add(emailObrigatorio);
        for(String email : emailsCobranca){
            emails.add(email);
        }
        emails.forEach(email -> notificacaoCobranca(valor, email));
    }

    static void pagarMinimo1Email(double valor,String emailobrigatorio, String... emailCobranca){
        if(emailCobranca.length == 0){
            throw new IllegalArgumentException("informe no minimo um email de cobranca");
        }else{
            pagar(valor, emailobrigatorio, emailCobranca);
        }
    }

    private static void notificacaoCobranca(double valor, String email){
        System.out.println("valor: "+valor+" email: "+email);
    }
}

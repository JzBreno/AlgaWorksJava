package varargs;

import java.util.ArrayList;

public class Main {

    ArrayList<String> validaLista(ArrayList<String> lista){
        lista.forEach(aluno -> System.out.println(aluno));
        lista.add("aba");
        return lista.isEmpty() ? null : lista;
    }



    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
       alunos.add("Jose");
       alunos.add("breno");
       alunos.add("maria");
       alunos.add("joao");
       alunos.add("pedro");
        ArrayList<String> listaVazia = new ArrayList<>();
        ArrayList<String> novaLista = new Main().validaLista(alunos);
        System.out.println("pulando pra segunda list");
        novaLista.forEach(aluno -> System.out.println(listaVazia));


        //utilizando varargs para inserir multiplas quantidades de argumentos ao metodo
        ServicoDeCobranca.pagar(100,"teste@gmail", new String[]{"josebrenosousa@gmail.com"});
        ServicoDeCobranca.pagar(230, "brenosousa@gmail.com", "cladiaAquira");
        ServicoDeCobranca.pagar(100, "teste@htmail.com");
        ServicoDeCobranca.pagarMinimo1Email(120, "josebrenosousa@gmail.com", "testes2334@gmail.com");
    }


}

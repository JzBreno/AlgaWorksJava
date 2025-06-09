package POO;
//#F093
public class CadCarros {
    public static void main(String[] args) {
//        Pessoa proprietario = new Pessoa();
//        Carro carro = new Carro();
//        proprietario.setNome("Joao");
//        proprietario.setCpf("123456789");
//        proprietario.setIdade(25);
//        carro.setProprietario(proprietario);
//        carro.setFIPE(200.00f);
//        System.out.println(carro);
        Carro carro = new Carro();
        carro.SetPais("Brasil");
        Carro carro2 = new Carro();
        System.out.println(carro.chamaPais());
        System.out.println(carro2.chamaPais());
        //metodos static nao precisam ser instanciados para ser chamados
        System.out.println(Carro.chamaPais());
        try{
            ValidarCarros.valdiacarros(carro);
            System.out.println("retornando um objeto: "+ValidarCarros.retornaCArro("chorea"));
            System.out.println(carro.getProprietario(new Pessoa()).getNome());
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

}

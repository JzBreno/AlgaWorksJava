package POO;

import POO.Carro;

import java.util.logging.Logger;

public class ValidarCarros {

        static Logger log = Logger.getLogger("ValidarCarros");
        //metodos staticos nao precisam que um objeto seja instanciado para ser chamado
       public static boolean valdiacarros(Carro car) {
           if (car.getMarca() != null && !car.getMarca().isEmpty()) {
               log.info("Carro Marca: " + car.getMarca());
           } else {
               log.info("Erro ao Validar Carro Marca: " + car.getMarca());
               return false;
           }

           if (car.getModelo() != null && !car.getModelo().isEmpty()) {
               log.info("Carro Modelo: " + car.getModelo());
           } else {
               log.info("Erro ao Validar Modelo: " + car.getModelo());
               return false;
           }

           if (car.getAltura() != 0.0) {
               log.info("Carro Altura: " + car.getAltura());
           } else {
               log.info("Erro ao Validar Altura: " + car.getAltura());
               return false;
           }

           if (car.getComprimento() != 0.0) {
               log.info("Carro Comprimento: " + car.getComprimento());
           } else {
               log.info("Erro ao Validar Comprimento: " + car.getComprimento());
               return false;
           }

           if (car.getCor() != null && !car.getCor().isEmpty()) {
               log.info("Carro Cor: " + car.getCor());
           } else {
               log.info("Erro ao Validar Cor: " + car.getCor());
               return false;
           }

           return true;
       }
       public static Carro retornaCArro(String modelo){
           Carro carro = new Carro();
           carro.setModelo(modelo);
           carro.setFIPE(2000000);
           carro.getProprietario(new Pessoa());
           return carro;
       }

}

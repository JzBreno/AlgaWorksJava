package aula100;

public class Cliente {
    //variaveis de classe
    static final double TAXA_LIMITE_CREDITO = 0.10;
    static final double LIMITE_CREDITO_MINIMO = 10_00;
    //variaveis de instancia
    double faturamentoAnual;
    double limiteCredito;
    String razaoSocial;

    public Cliente(String razaoSocial, Double faturamentoAnual) {
        this.razaoSocial = razaoSocial;
        this.faturamentoAnual = faturamentoAnual;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", limiteCredito=" + limiteCredito +
                '}';
    }

    public Double consultalimiteCredito() {
        this.limiteCredito = faturamentoAnual * LIMITE_CREDITO_MINIMO;
        return this.limiteCredito;
    }

}

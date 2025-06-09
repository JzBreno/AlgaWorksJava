package Arrays.miniprojetoarrays.model;

public class Coordenacao extends Pessoa {

    private String Cargo;
    private Double Salario;

    public Coordenacao(String nome, int anoNascimento, String sexo, String cpf, String Cargo, Double Salario) {
        super(nome, anoNascimento, sexo, cpf);
        this.Cargo = Cargo;
        this.Salario = Salario;
    }

    @Override
    public String toString() {
        return "Coordenacao{" +
                "Cargo='" + Cargo + '\'' +
                ", Salario=" + Salario +
                '}';
    }

    public Coordenacao(){
        super();
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }
}

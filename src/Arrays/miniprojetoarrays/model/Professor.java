package Arrays.miniprojetoarrays.model;

import java.util.ArrayList;

public class Professor extends Pessoa {

    private Double salario;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Professor(String nome, int anoNascimento, String sexo, String cpf) {
        super(nome, anoNascimento, sexo, cpf);
    }



    @Override
    public String toString() {
        return "Professor{" +
                "salario=" + salario +
                ", disciplinas=" + disciplinas +
                '}';
    }

    public Professor(){
        super();
    }


    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}

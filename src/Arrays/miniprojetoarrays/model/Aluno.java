package Arrays.miniprojetoarrays.model;

import java.util.ArrayList;

public class Aluno extends Pessoa {

    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Aluno(String nome, int anoNascimento, String sexo, String cpf) {
        super(nome, anoNascimento, sexo, cpf);
    }

    public Aluno(){
        super();
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "disciplinas=" + disciplinas +
                '}';
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}

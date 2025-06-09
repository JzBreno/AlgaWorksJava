package Arrays.miniprojetoarrays.model;

import Arrays.miniprojetoarrays.controller.TurmaService;

import java.util.ArrayList;

public class Turma {

    private static final int MAX_ALUNOS = 30;
    public static final int MAX_PROFESSORES = 4;
    private String nomeDaTurma;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Professor> professores = new ArrayList<>();

    public Turma(String nomeDaTurma) {
        this.nomeDaTurma = nomeDaTurma;
    }

    public String getNomeDaTurma() {
        return nomeDaTurma;
    }

    public void setNomeDaTurma(String nomeDaTurma) {
        this.nomeDaTurma = nomeDaTurma;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores, Professor novoProfessor) {
        this.professores = TurmaService.validaQuantidadeProfessores(professores, novoProfessor);
    }
}

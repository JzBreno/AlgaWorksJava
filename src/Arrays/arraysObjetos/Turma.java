package Arrays.arraysObjetos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Turma {

    private String[] Professor = new String[1];
    private String[] Alunos;
    private ArrayList<Double> notas = new ArrayList<>();
    private String ano;

    Turma(String[] professor, String[] alunos, String ano){
        this.Professor = professor;
        this.Alunos = alunos;
        this.ano = ano;
    }

    Turma(String professor, String[] alunos, String ano){
        this.Professor[0] = professor;
        this.Alunos = alunos;
        this.ano = ano;
    }
    @Override
    public String toString() {
        return "Turma{" +
                "Professor='" + Arrays.toString(Professor) + '\'' +
                ", Alunos=" + Arrays.toString(Alunos) +
                ", notas=" + notas +
                ", ano='" + ano + '\'' +
                '}';
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(double nota) {
        this.notas.add(nota);
    }

    public String[] getProfessor() {
        return Professor;
    }

    public void setProfessor(String[] professor) {
        Professor = professor;
    }

    public String[] getAlunos() {
        return Alunos;
    }

    public void setAlunos(String[] alunos) {
        Alunos = alunos;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    void mediaTurma(){
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        System.out.println("A media da Turma é: "+soma/this.notas.size());
    }
}

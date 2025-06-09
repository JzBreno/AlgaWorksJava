package Arrays.miniprojetoarrays.model;

import java.util.ArrayList;

public class Disciplina {

    private String nomeDaDisciplina;
    private int cargaHoraria;
    private ArrayList<ArrayList<Double>> notas = new ArrayList<ArrayList<Double>>();

    public Disciplina(String nome, int cargaHoraria) {
        this.nomeDaDisciplina = nome;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nomeDaDisciplina + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", notas=" + notas +
                '}';
    }

    public String getNome() {
        return nomeDaDisciplina;
    }

    public void setNome(String nome) {
        this.nomeDaDisciplina = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<ArrayList<Double>> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas.add(notas);
    }
}

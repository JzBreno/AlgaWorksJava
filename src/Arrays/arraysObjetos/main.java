package Arrays.arraysObjetos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        String[] alunos = {"brenno", "ze", "calidao"};
        Random random = new Random();
        Turma turma = new Turma("breno", alunos, "setimo");
        String[] profTurma2 = new String[]{"breninho", "zeinho", "calidaoinho"};
        Turma turma2 = new Turma(profTurma2, alunos, "setimo");
        ArrayList<Turma> listaTurmas = new ArrayList<>();

        for(int i=0; i<turma.getAlunos().length; i++){
            turma.setNotas(random.nextDouble(10));
            System.out.println(turma.getAlunos()[i]+" "+turma.getNotas());
        }

        turma.mediaTurma();
        listaTurmas.add(turma);
        listaTurmas.add(turma2);

        System.out.println(listaTurmas);
    }
}

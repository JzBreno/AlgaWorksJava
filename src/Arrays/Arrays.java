package Arrays;

import java.util.ArrayList;
import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> notasList = new ArrayList<>();
        int[] notas = new int[3];

        for(int i=0; i<notas.length; i++){
            notas[i] = random.nextInt(10);
        }

        for(int i=0;i<notas.length; i++){
            notasList.add(notas[i]);
        }
        System.out.println("notas antes de sort"+notasList);
        notasList.sort((o1, o2) -> o2-o1);
        System.out.println("notas dps de sort"+notasList);
        String notasString = java.util.Arrays.toString(notas);
        System.out.println(notasString);

        for(int nota: notas){
            System.out.println(nota);
        }

        for(int nota: notas){
            validaNotasBussiness.checaNota(nota);
        }
    }



}

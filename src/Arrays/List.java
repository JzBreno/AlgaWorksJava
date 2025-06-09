package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Ana", "Beto", "Carlos"));
        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()){
            String nome = iterator.next();
            if(nome.equals("Carlos")){
                iterator.remove();
            }
        }
    }
}

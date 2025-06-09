package datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Date date = new Date();
        LocalDate date1 = new Date().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        String entrada = date1.toString();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date2 = LocalDate.parse(entrada,formato);
        System.out.println("esta funcionando: "+date2);

        LocalDate date3 = LocalDate.now();
        LocalDate date4 = LocalDate.of(2021, 12, 12);
        long diffDias = ChronoUnit.DAYS.between(date3, date4);
        System.out.println((diffDias/12)*-1);
   }
}

package datas;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Formatter;

public class ClasseDatas {
    public static void main(String[] args) {

        LocalDate date;
        String entrada = "10-02-2025";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        date = LocalDate.parse(entrada, formatter);
        System.out.println(date);


    }
}

package desafio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Desafio2 {

    public static void main(String[] args) {

        String ano = "2022";
        String anoIntermediario = ano.concat("-01-01");
        LocalDate anoDate = LocalDate.parse(anoIntermediario, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(anoDate.getDayOfWeek());

    }
}

package desafio2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Desafio2 {

    public enum mes {
        JAN, FEV, MAR, ABR, MAI, JUN, JUL, AGO, SET, OUT, NOV, DEZ
    }

    public static void getComissaoMensal(Double salario, String ano) {

        String anoIntermediario = ano.concat("-01-01");
        LocalDate anoDate = LocalDate.parse(anoIntermediario, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        DayOfWeek diaDaSemana = anoDate.getDayOfWeek();

        Double gratificacaoSalario = (salario / 30.0);

        switch (diaDaSemana) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
                System.out.println(mes.JAN + "  " + (23.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.FEV + "  " + (20.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.MAR + "  " + (23.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.ABR + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.MAI + "  " + (23.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.JUN + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.JUL + "  " + (23.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.AGO + "  " + (23.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.SET + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.OUT + "  " + (23.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.NOV + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.DEZ + "  " + (23.0 * gratificacaoSalario * 0.005));
                break;

            case THURSDAY:
                System.out.println(mes.JAN + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.FEV + "  " + (20.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.MAR + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.ABR + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.MAI + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.JUN + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.JUL + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.AGO + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.SET + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.OUT + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.NOV + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.DEZ + "  " + (22.0 * gratificacaoSalario * 0.005));
                break;

            case FRIDAY:
                System.out.println(mes.JAN + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.FEV + "  " + (20.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.MAR + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.ABR + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.MAI + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.JUN + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.JUL + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.AGO + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.SET + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.OUT + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.NOV + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.DEZ + "  " + (21.0 * gratificacaoSalario * 0.005));
                break;
            case SATURDAY:
                System.out.println(mes.JAN + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.FEV + "  " + (20.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.MAR + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.ABR + "  " + (20.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.MAI + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.JUN + "  " + (20.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.JUL + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.AGO + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.SET + "  " + (20.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.OUT + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.NOV + "  " + (20.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.DEZ + "  " + (21.0 * gratificacaoSalario * 0.005));
                break;
            case SUNDAY:
                System.out.println(mes.JAN + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.FEV + "  " + (20.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.MAR + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.ABR + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.MAI + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.JUN + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.JUL + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.AGO + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.SET + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.OUT + "  " + (22.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.NOV + "  " + (21.0 * gratificacaoSalario * 0.005));
                System.out.println(mes.DEZ + "  " + (22.0 * gratificacaoSalario * 0.005));
                break;
        }

    }

    public static void main(String[] args) {

        getComissaoMensal(1200.0, "2022");

    }
}

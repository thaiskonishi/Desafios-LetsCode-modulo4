package desafio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class Funcionario {
    private String nome;
    private Double salario;
    private Map<Enum, Double> comissaoMensal;

    public enum mes {
        JAN, FEV, MAR, ABR, MAI, JUN, JUL, AGO, SET, OUT, NOV, DEZ
    }

    public Map<Enum, Double> getComissaoMensal(Double salario, String ano) {
        comissaoMensal = Map.of(mes.JAN, 134.02);

        String anoIntermediario = ano.concat("-01-01");
        LocalDate anoDate = LocalDate.parse(anoIntermediario, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Double diasUteis = 0.0d;
        Enum diaDaSemana = anoDate.getDayOfWeek();

        switch (anoDate.getDayOfWeek()) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
                comissaoMensal = Map.of(mes.JAN, (23.0 * salario));
                comissaoMensal = Map.of(mes.FEV, (20.0 * salario));
                comissaoMensal = Map.of(mes.MAR, (23.0 * salario));
                comissaoMensal = Map.of(mes.ABR, (22.0 * salario));
                comissaoMensal = Map.of(mes.MAI, (23.0 * salario));
                comissaoMensal = Map.of(mes.JUN, (22.0 * salario));
                comissaoMensal = Map.of(mes.JUL, (23.0 * salario));
                comissaoMensal = Map.of(mes.AGO, (23.0 * salario));
                comissaoMensal = Map.of(mes.SET, (22.0 * salario));
                comissaoMensal = Map.of(mes.OUT, (23.0 * salario));
                comissaoMensal = Map.of(mes.NOV, (22.0 * salario));
                comissaoMensal = Map.of(mes.DEZ, (23.0 * salario));
                break;

            case THURSDAY:

                break;
            case FRIDAY:

                break;
            case SATURDAY:

                break;
            case SUNDAY:

                break;
        }

        return comissaoMensal;
    }
}

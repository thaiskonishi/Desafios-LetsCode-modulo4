package desafio2;

import java.time.LocalDate;
import java.util.Map;

public class Funcionario {
    private String nome;
    private Double salario;
    private Map<Enum, Double> comissaoMensal;

    public enum mes {
        JAN, FEV, MAR, ABR, MAI, JUN, JUL, AGO, SET, OUT, NOV, DEZ
    }

    public Map<Enum, Double> getComissaoMensal(Double salario, LocalDate ano) {
        comissaoMensal = Map.of(mes.JAN, 134.02);
        return comissaoMensal;
    }
}

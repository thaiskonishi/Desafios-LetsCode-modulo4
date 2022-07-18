package desafio2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.EnumMap;
import java.util.Map;

public class Desafio2completo {
    private String nome;
    private Double salario;
    public EnumMap<mes, Double> comissaoMensal;

    public Desafio2completo(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
        this.comissaoMensal = new EnumMap<>(mes.class);

    }

    public enum mes {
        JAN, FEV, MAR, ABR, MAI, JUN, JUL, AGO, SET, OUT, NOV, DEZ
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Map<mes, Double> getComissaoMensal() {
        return comissaoMensal;
    }

    public Map<mes, Double> getComissao(Double salario, String ano) {

        String anoIntermediario = ano.concat("-01-01");
        LocalDate anoDate = LocalDate.parse(anoIntermediario, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        DayOfWeek diaDaSemana = anoDate.getDayOfWeek();
        Double taxaGratificacao = 0.05;
        Double gratificacaoSalario = (salario / 30.0);

        switch (diaDaSemana) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
                comissaoMensal.put(mes.JAN, (23.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.FEV, (20.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.MAR, (23.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.ABR, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.MAI, (23.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.JUN, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.JUL, (23.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.AGO, (23.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.SET, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.OUT, (23.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.NOV, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.DEZ, (23.0 * gratificacaoSalario * taxaGratificacao));
                break;

            case THURSDAY:
                comissaoMensal.put(mes.JAN, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.FEV, (20.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.MAR, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.ABR, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.MAI, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.JUN, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.JUL, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.AGO, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.SET, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.OUT, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.NOV, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.DEZ, (22.0 * gratificacaoSalario * taxaGratificacao));
                break;

            case FRIDAY:
                comissaoMensal.put(mes.JAN, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.FEV, (20.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.MAR, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.ABR, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.MAI, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.JUN, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.JUL, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.AGO, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.SET, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.OUT, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.NOV, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.DEZ, (21.0 * gratificacaoSalario * taxaGratificacao));
                break;
            case SATURDAY:
                comissaoMensal.put(mes.JAN, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.FEV, (20.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.MAR, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.ABR, (20.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.MAI, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.JUN, (20.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.JUL, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.AGO, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.SET, (20.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.OUT, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.NOV, (20.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.DEZ, (21.0 * gratificacaoSalario * taxaGratificacao));
                break;
            case SUNDAY:
                comissaoMensal.put(mes.JAN, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.FEV, (20.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.MAR, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.ABR, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.MAI, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.JUN, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.JUL, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.AGO, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.SET, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.OUT, (22.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.NOV, (21.0 * gratificacaoSalario * taxaGratificacao));
                comissaoMensal.put(mes.DEZ, (22.0 * gratificacaoSalario * taxaGratificacao));
                break;
        }

        return comissaoMensal;
    }

    public static void main(String[] args) {
        Desafio2completo pablo = new Desafio2completo("Pablo", 1000.0);
        pablo.getComissao(12000.0, "2022");
        System.out.println("Gratificacao mes a mes " + pablo.getComissaoMensal());

    }
}

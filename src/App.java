import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        List<Map<String, String>> listaPessoas = new ArrayList<>();
        listaPessoas.add(Map.of("nome", "Joaquim", "nascimento", "11-12-65"));
        listaPessoas.add(Map.of("nome", "Maria", "nascimento", "24-07-88"));
        listaPessoas.add(Map.of("nome", "Caroline", "nascimento", "14-02-93"));
        listaPessoas.add(Map.of("nome", "Pedro Henrique", "nascimento", "02-11-88"));
        listaPessoas.add(Map.of("nome", "Maria Antonieta", "nascimento", "02-11-15"));

        DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd-MM-yy");

        List<Map<String, String>> listaPessoaIdade = new ArrayList<>();
        listaPessoaIdade = calculaIdade(listaPessoas, padrao);

        System.out.println("Lista de idades");
        for (Map<String, String> dado : listaPessoaIdade) {
            System.out.println(dado);
        }

    }

    public static List<Map<String, String>> calculaIdade(List<Map<String, String>> listaPessoas,
            DateTimeFormatter padrao) {

        LocalDate dataAComparar;
        Integer anoAComparar, dataAtual;

        List<Map<String, String>> listaPessoaIdade = new ArrayList<>();
        for (Map<String, String> dado : listaPessoas) {

            dataAComparar = LocalDate.parse(dado.get("nascimento"), padrao);
            anoAComparar = converteAno(dataAComparar.getYear());
            dataAtual = LocalDate.now().getYear();

            Integer idade = dataAtual - anoAComparar;
            String pessoa = dado.get("nome");

            listaPessoaIdade.add(Map.of("nome", pessoa, "idade", String.format("%d", idade)));
        }

        return listaPessoaIdade;
    }

    // converte ano de dois digitos para quatro digitos, pois java usa como default
    // 2000 e não 1900 no getYear()
    public static Integer converteAno(int ano) {
        if (ano > 2023) {
            return ano - 100;
        } else {
            return ano;
        }

    }
}

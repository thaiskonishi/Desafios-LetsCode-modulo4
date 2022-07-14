import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// A partir de uma lista de pessoas (nome e data nascimento no formato dd-MM-yy), calcular a idade de cada pessoa em referência a data de hoje.
public class App {
    public static void main(String[] args) throws Exception {
        List<Map<String, String>> listaPessoas = new ArrayList<>();
        listaPessoas.add(Map.of("nome", "Joaquim", "nascimento", "11-12-1965"));
        listaPessoas.add(Map.of("nome", "Maria", "nascimento", "24-07-1988"));
        listaPessoas.add(Map.of("nome", "Caroline", "nascimento", "14-02-1993"));
        listaPessoas.add(Map.of("nome", "Pedro Henrique", "nascimento", "02-11-1988"));

        DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    }

    public static Map<String, String> calculaIdade(List<Map<String, String>> listaPessoas, DateTimeFormatter padrao) {

        LocalDate dataAtual, dataAComparar, idade;
        dataAtual = LocalDate.now();
        Map<String, String> listaPessoaIdade;
        for (Map<String, String> dado : listaPessoas) {

            dataAComparar = LocalDate.parse(dado.get("nascimento"), padrao);
            Period period = Period.between(dataAComparar, dataAtual);

        }
        return null;
    }
}

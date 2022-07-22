package desafio3;

import java.time.LocalDateTime;
import java.util.List;

public class ImprimeAgenda {

    private List<LocalDateTime> agenda;

    public ImprimeAgenda(List<LocalDateTime> agenda) {
        for (LocalDateTime localDateTime : agenda) {
            System.out.println(agenda.toString());
        }
    }

    public List<LocalDateTime> getAgenda() {
        return agenda;
    }

}

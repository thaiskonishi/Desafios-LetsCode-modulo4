package desafio3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        ZoneId fusoHorarioSaoPaulo = ZoneId.of("America/Sao_Paulo");
        ZoneId fusoHorarioParis = ZoneId.of("Europe/Paris");
        System.out.println("fuso horario " + fusoHorarioParis);
        // ZoneId fusoHorarioParis = ZoneId.of(ZoneId.SHORT_IDS.get("ECT"));

        LocalDateTime horaParis = LocalDateTime.now(fusoHorarioParis);
        LocalDateTime horaSP = LocalDateTime.now(fusoHorarioSaoPaulo);

        Duration duration = Duration.between(horaSP, horaParis);
        long horasDiferenca = duration.getSeconds() / 60 / 60;
        System.out.println(horasDiferenca);

        LocalDateTime agora = LocalDateTime.now();
        ZonedDateTime horarioComFuso = ZonedDateTime.of(agora, fusoHorarioParis);
        System.out.println(agora.getDayOfWeek());
        System.out.println(horarioComFuso.getDayOfWeek());

        System.out.println("horario com fuso " + horarioComFuso);

        LocalDateTime horaAqui = horarioComFuso.toLocalDateTime();
        System.out.println("horaAqui " + horaAqui);

        LocalDateTime inicioSessao1 = LocalDateTime.of(2022, 07, 20, 10, 00);
        LocalDateTime fimSessaoInaugural = inicioSessao1.plusHours(6);

        int eventos = 0;
        LocalDateTime dataFimEvento = LocalDateTime.of(2022, 10, 31, 23, 59);

        List<LocalDateTime> sessoesSP = new ArrayList<>();

        LocalDateTime sessaoSP = inicioSessao1.plusDays(10).plusHours(2);

        while (sessaoSP.isBefore(dataFimEvento)) {

            sessoesSP.add(eventos, sessaoSP);
            sessaoSP = sessaoSP.plusDays(10).plusHours(2);
            eventos++;
        }
        System.out.println("numero de sessoes: " + eventos);

    }
}

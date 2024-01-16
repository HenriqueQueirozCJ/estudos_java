import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.LocalDateTime;
import java.util.Locale;

public class Mensagem_de_saudacao {
    public static void main(String[] args) {
      LocalDate hoje = LocalDate.now();
      Locale Brasil = Locale.of("pt");
      LocalDateTime agora = LocalDateTime.now();

      String nome = "Pedro";
      String DiadaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Brasil);
      String objetivo;

      if (agora.getHour() >= 00 && agora.getHour() < 12){
        objetivo = "Bom dia !";
      } else if (agora.getHour() >= 12 && agora.getHour() < 18 ){
        objetivo = "Boa Tarde !";
      } else {
        objetivo = "Boa Noite !"; 
      }
    
      System.out.printf("Olá, %s. Hoje é %s. %s %n ",nome,DiadaSemana,objetivo.toUpperCase());

    }
}

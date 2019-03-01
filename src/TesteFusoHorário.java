import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TesteFusoHorário {

	public static void main(String[] args) {

		/*Para representarmos uma data e hora em um fuso horário específico,
		 *  devemos utilizar a classe ZonedDateTime.*/
		
		
//		ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
//		ZonedDateTime agoraEmSaoPaulo = ZonedDateTime.now(fusoHorarioDeSaoPaulo);
//		System.out.println(agoraEmSaoPaulo); //2014-04-08T10:02:57.838-03:00[America/Sao_Paulo]
//		
		//Com um ZonedDateTime, podemos representar, por exemplo, a data de um voo.
		
		ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
		ZoneId fusoHorarioDeNovaYork = ZoneId.of("America/New_York");
		 
		LocalDateTime saidaDeSaoPauloSemFusoHorario = 
		  LocalDateTime.of(2014, Month.APRIL, 4, 22, 30);
		LocalDateTime chegadaEmNovaYorkSemFusoHorario =
		  LocalDateTime.of(2014, Month.APRIL, 5, 7, 10);
		     
		ZonedDateTime saidaDeSaoPauloComFusoHorario = 
		  ZonedDateTime.of(saidaDeSaoPauloSemFusoHorario, fusoHorarioDeSaoPaulo);
		System.out.println(saidaDeSaoPauloComFusoHorario); //2014-04-04T22:30-03:00[America/Sao_Paulo]
		 
		ZonedDateTime chegadaEmNovaYorkComFusoHorario = 
		  ZonedDateTime.of(chegadaEmNovaYorkSemFusoHorario, fusoHorarioDeNovaYork);
		System.out.println(chegadaEmNovaYorkComFusoHorario); //2014-04-05T07:10-04:00[America/New_York]
		   
		Duration duracaoDoVoo = 
		  Duration.between(saidaDeSaoPauloComFusoHorario, chegadaEmNovaYorkComFusoHorario);
		System.out.println(duracaoDoVoo); //PT9H40M
	}

}

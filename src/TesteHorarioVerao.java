import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TesteHorarioVerao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
		 
		LocalDateTime fimDoHorarioDeVerao2013SemFusoHorario = 
		  LocalDateTime.of(2014, Month.FEBRUARY, 15, 23, 00);
		 
		ZonedDateTime fimDoHorarioVerao2013ComFusoHorario = 
		  fimDoHorarioDeVerao2013SemFusoHorario.atZone(fusoHorarioDeSaoPaulo);
		System.out.println(fimDoHorarioVerao2013ComFusoHorario); //2014-02-15T23:00-02:00[America/Sao_Paulo]
		 
		ZonedDateTime maisUmaHora = 
		  fimDoHorarioVerao2013ComFusoHorario.plusHours(1);
		System.out.println(maisUmaHora); //2014-02-15T23:00-03:00[America/Sao_Paulo]

	}

}

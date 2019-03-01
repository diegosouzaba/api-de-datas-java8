import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TesteTempo {

	public static void main(String[] args) {

		/*J� a classe LocalTime serve para representar apenas um hor�rio,
		 *  sem data espec�fica. Podemos, por exemplo,
		 *  us�-la para representar o hor�rio de entrada no trabalho.*/
		
		
		LocalTime horarioDeEntrada = LocalTime.of(9, 0);
		System.out.println(horarioDeEntrada); //09:00
		
		/*A classe LocalDateTime serve para representar
		 *  uma data e hora espec�ficas*/
		
		LocalDateTime agora = LocalDateTime.now();
		LocalDateTime aberturaDaCopa = LocalDateTime.of(2014, Month.JUNE, 12, 17, 0);
		System.out.println(aberturaDaCopa); //2014-06-12T17:00 (formato ISO-8601)
		
		
		
		
		
	}

}

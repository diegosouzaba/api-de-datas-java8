import java.time.LocalDate;

public class TesteManipulandoDatas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Todas as classes mencionadas possuem diversos m�todos que permitem
		 *  manipular  as medidas de tempo. Por exemplo,
		 *  podemos usar o m�todo plusDays da classe LocalDate para aumentarmos
		 *   um dia:*/
		
		LocalDate hoje = LocalDate.now();
		LocalDate amanha = hoje.plusDays(1);
		
		
		/*Outro c�lculo interessante � o n�mero de medidas de tempo at� uma
		 *  determinada data, que podemos fazer atrav�s do m�todo until.
		 *   Para descobrir o n�mero de dias at� uma data, por exemplo,
		 *    devemos passar ChronoUnit.DAYS como par�metro.*/
		
		
		MonthDay natal = MonthDay.of(Month.DECEMBER, 25);
		LocalDate natalDesseAno = natal.atYear(Year.now().getValue());
		long diasAteONatal = LocalDate.now()
		    .until(natalDesseAno, ChronoUnit.DAYS);
		
		
		

	}

}

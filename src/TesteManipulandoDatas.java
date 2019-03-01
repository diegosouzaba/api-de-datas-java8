import java.time.LocalDate;

public class TesteManipulandoDatas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Todas as classes mencionadas possuem diversos métodos que permitem
		 *  manipular  as medidas de tempo. Por exemplo,
		 *  podemos usar o método plusDays da classe LocalDate para aumentarmos
		 *   um dia:*/
		
		LocalDate hoje = LocalDate.now();
		LocalDate amanha = hoje.plusDays(1);
		
		
		/*Outro cálculo interessante é o número de medidas de tempo até uma
		 *  determinada data, que podemos fazer através do método until.
		 *   Para descobrir o número de dias até uma data, por exemplo,
		 *    devemos passar ChronoUnit.DAYS como parâmetro.*/
		
		
		MonthDay natal = MonthDay.of(Month.DECEMBER, 25);
		LocalDate natalDesseAno = natal.atYear(Year.now().getValue());
		long diasAteONatal = LocalDate.now()
		    .until(natalDesseAno, ChronoUnit.DAYS);
		
		
		

	}

}

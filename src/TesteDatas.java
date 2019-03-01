import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class TesteDatas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		/*Um LocalDate serve para representarmos,
		 *  por exemplo, a data de emiss�o do nosso RG,
		 *   em que n�o nos importa as horas ou minutos,
		 *    mas o dia todo*/
		
		LocalDate emissaoRG = LocalDate.of(2000, Month.APRIL, 15);
		
		
		//dura��o entre dois LocalDate
		
		LocalDate homemNoEspaco = LocalDate.of(1961, Month.APRIL, 12);
		LocalDate homemNaLua = LocalDate.of(1969, Month.MAY, 25);
		
		Period periodo = Period.between(homemNoEspaco, homemNaLua);
		 
		System.out.printf("%s anos, %s m�s e %s dias", 
		  periodo.getYears() , periodo.getMonths(), periodo.getDays());
		  //8 anos, 1 m�s e 13 dias
		
		

	}

}

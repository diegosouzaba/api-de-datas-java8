
public class TesteFormatandoDatas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*O toString padr�o das classes da API utiliza o formato ISO-8601.
		 *  Se quisermos definir o formato de apresenta��o da data,
		 *   devemos utilizar o m�todo format,
		 *  passando um DateTimeFormatter.*/
		
		
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = 
		  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		hoje.format(formatador); //08/04/2014
		
		
		/*O enum FormatStyle possui alguns formatos pr�-definidos,
		 *  que podem ser combinados com um Locale.*/
		
		
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatador = DateTimeFormatter
		  .ofLocalizedDateTime(FormatStyle.SHORT)
		  .withLocale(new Locale("pt", "br"));
		agora.format(formatador); //08/04/14 10:02
		

	}

}

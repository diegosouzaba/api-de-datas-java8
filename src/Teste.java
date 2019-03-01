import java.time.Duration;
import java.time.Instant;

public class Teste {
	
	public static void main(String[] args) {
		
		
//		Instant agora = Instant.now();
//		System.out.println(agora); 
		
		
		Instant inicio = Instant.now();
		rodaAlgoritmo();
		Instant fim = Instant.now();
		 
		Duration duracao = Duration.between(inicio, fim);
		long duracaoEmMilissegundos = duracao.toMillis();
		long duracaoEmSegundos = duracao.getSeconds();
		
		System.out.println(duracaoEmSegundos);
	}

	private static void rodaAlgoritmo() {
		for(long i =0; i> 99999999; i++) {
			long soma = 0;
			soma+=i;
		}
		
	}

}

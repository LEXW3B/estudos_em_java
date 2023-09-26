package exemplos.de.condicionais;
import java.util.Random;


public class EstruturaRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tentativas = 0;
		int atendeu = 0;
		String log;
		
		do {
			log = "Ligando para candidato selecionado ...\n";
			atendeu = new Random().ints(0, 2).findFirst().getAsInt();
			tentativas += 1;
		} while (atendeu == 0 && tentativas < 3);
		
		log = "Candidato atendeu na tentativa: " + tentativas;
		System.out.println(log);
	}
}


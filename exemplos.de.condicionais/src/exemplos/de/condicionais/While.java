package exemplos.de.condicionais;

public class While {

	public static void main(String[] args) {
		//Vamos considerar que uma escola abriu um processo de inscrição
		//para um curso gratuito com o número máximo de 10 vagas. A boa 
		//notícia é que as inscrições no site bombaram! Com base em quem
		//se inscreveu, vamos preencher as vagas até que sejam totalizados 10 cadastros.

		String[] inscritos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA", "JOAO", "FELIPE", "LUCIA", "ANTONIO", "FERNANDA",
				"MARCELA", "VITOR", "BEATRIZ", "JORGE", "JULIA" };
		final int numeroDeVagas = 10;
		String[] vagas = new String[numeroDeVagas];
		int vagaAtual = 0;
		String inscrito = "Indefinido";
		String log;
		
		while (vagaAtual < numeroDeVagas) {
			inscrito = inscritos[vagaAtual];
			log = "Adicinando a inscrição: " + inscrito + " Na vaga: " + (vagaAtual + 1) + "\n";
			vagas[vagaAtual] = inscrito;
			vagaAtual += 1;
			System.out.println(log);
		}
	}
}

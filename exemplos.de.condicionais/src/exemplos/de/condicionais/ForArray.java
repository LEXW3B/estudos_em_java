package exemplos.de.condicionais;

public class ForArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] alunos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA" };
		String log;
		
		int totalAlunos = alunos.length;
		log = "A lista de chamadas possui " + totalAlunos + "alunos \n";
		int matricula;
		
		for (int posicao = 0; posicao < totalAlunos; posicao++) {
			matricula = posicao + 1;
			log = "Matricula: " + matricula + " Aluno: " + alunos[posicao] + "\n";
			System.out.println(log);
		}
	}
}

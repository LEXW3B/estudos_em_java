package exemplos.de.condicionais;

public class IfElse {

	public static void main(String[] args) {
		// nota final escolar
		double mediaFinal = 6.0;
		String resultado = "INDEFINIDO";
		
		if (mediaFinal >= 7) {
			resultado = "APROVADO";
		} else if (mediaFinal == 6.0) {
			resultado = "REALIZAR PROVA BONUS";
		} else {
			resultado = "REPROVADO";
		}
		System.out.println(resultado);
	}
}

package calcular.imc;
import java.util.Scanner;

public class Diagnostico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avaliacao instanciaDeAvaliacao = new Avaliacao();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual o seu peso? ");
		String pesoEntrada = scanner.next();
		
		System.out.println("Qual a sua altura? ");
		String alturaEntrada = scanner.next();
		
		
		double peso = Double.parseDouble(pesoEntrada);
		double altura = Double.parseDouble(alturaEntrada);
		
		instanciaDeAvaliacao.calcularIMC(peso, altura);
		scanner.close();
	}

}

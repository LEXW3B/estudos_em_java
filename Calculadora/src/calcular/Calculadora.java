package calcular;

public class Calculadora {
	
	public void soma(int a, int b) {
		int result = a + b;
		System.out.printf("A soma entre %d e %d é: %d\n\n", a, b, result);
	}
	
	public void sub(int c, int d) {
		int result = c - d;
		System.out.printf("A subtração entre %d e %d é: %d\n\n", c, d, result);
	}
	
	public void mult(int e, int f) {
		int result = e * f;
		System.out.printf("A multiplicação entre %d e %d é: %d\n\n", e, f, result);
	}
	
	public void div(float g, float h) {
		float result = g / h;
		System.out.printf("A divisão entre %.2f e %.2f é: %.2f\n\n", g, h, result);
	}

	public static void main(String args[]) {
		//	crie um programa que execute as tarefas fundamentais de
		//	uma calculadora, ou seja, soma, subtaçãom, multiplicação
		//	e divisão.
		Calculadora calcular = new Calculadora();
		calcular.soma(3, 6);
		calcular.sub(3, 6);
		calcular.mult(3, 6);
		calcular.div(3, 6);
	}

}

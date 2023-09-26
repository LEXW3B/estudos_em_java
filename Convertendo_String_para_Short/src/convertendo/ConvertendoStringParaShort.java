package convertendo;
import java.util.Scanner;

public class ConvertendoStringParaShort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entre com sua idade: ");
		String input1 = scanner.next();
		scanner.close();
		
		short idade = Short.parseShort(input1);
		
		short resultado = idade;
		resultado++;
		
		System.out.println("Daqui a um ano sua idade será: " + resultado);
	}

}

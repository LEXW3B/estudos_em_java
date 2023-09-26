package convertendo;
import java.util.Scanner;

public class ConvertendoStringParaLong {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entre com o tamanho da população chinesa: ");
		String input1 = scanner.next();
		
		long populacaoChinesa = Long.parseLong(input1);
		
		long resultado = 7909863848L + populacaoChinesa;
		System.out.println("Se tivessemos duas chinas no mundo, a população mundial seria: " + resultado);
		
	}

}

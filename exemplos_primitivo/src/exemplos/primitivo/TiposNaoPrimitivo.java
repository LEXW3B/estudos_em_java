package exemplos.primitivo;

public class TiposNaoPrimitivo {

	public static void main0(String[] args) {
		// TODO Auto-generated method stub
		String vamos = "Vamos";
		String aprender = " aprender";
		String java = " Java?";
		
		String frase = vamos + aprender + java;
		System.out.println(frase);
	}
	
	public static void main1(String[] args) {
		//biblioteca StringBuilder
		StringBuilder stringBuilder = new StringBuilder();
		String estou = "Estou";
		String aprendendo = " aprendendo";
		String a = " a";
		String usar = " usar";
		String string = " string";
		String em = " em";
		String java = " Java!";
				
		String frase = stringBuilder.append(estou)
				.append(aprendendo)
				.append(a)
				.append(usar)
				.append(string)
				.append(em)
				.append(java)
				.toString();
		System.out.println(frase);
				
		StringBuilder novaFrase = stringBuilder.replace(23, 37, " Tipos Primitivos e Strings!!!");
		System.out.println(novaFrase);
	}
	
	public static void main(String[] args) {
		String[] arrayDeString = {"na Trybe!", "Partiu ", "Java ", "aprender "};
		int[][] matriz = new int[2][3];
		int[] arrayDeInteiros = {10, 20, 30};
		
		matriz[0][0] = 10;
		matriz[1][0] = 20;
		
		System.out.println(arrayDeString[1] + arrayDeString[3] + arrayDeString[2] + arrayDeString[0]);
		System.out.println(matriz[0][0]);
		System.out.println(matriz[1][1]);
		System.out.println(arrayDeInteiros.length);
	}
}


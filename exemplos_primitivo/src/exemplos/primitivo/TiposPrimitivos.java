package exemplos.primitivo;

public class TiposPrimitivos {
	
	public static void main1(String[] args) {
        byte b = 9;
        System.out.println(b);  
    }
	
	public static void main2(String[] args) {
        short num = 300;
        short formatadaComUnderscore = 20_000; // variável 
        System.out.println(num);
        System.out.println(formatadaComUnderscore); // 20000
    }
	
	 public static void main3(String[] args) {
	        int numeroInteiro = 10;
	        int a = 10, b = 20, soma; // inicialização de variáveis inline
	        soma = a + b; // atribuição da soma da variável a + b para a variável soma
	        System.out.println(numeroInteiro); // 10
	        System.out.println(soma); // 30
	    }
	 
	 public static void main4(String[] args) {
	        long numA = 102040;
	        long numB = 102030405060L; // adicionado L no final para indicar que estamos inserindo um valor do tipo long
	        System.out.println(numA);
	        System.out.println(numB);
	    }
	 
	 public static void main5(String[] args) {
	        float numA = -101.23f;
	        float numB = 2.356f;
	        System.out.println(numA + numB); // -98.874
	    }

    public static void main6(String[] args) {
        double varDouble = 2.356; // double inicializado naturalmente
        double doubleRecebendoFloat = 1.409F; // double aceitando número float
        double doubleRecebendoLong = 12930L; // double aceitando número long
        System.out.println(doubleRecebendoFloat); // 1.409000039100647
        System.out.println(doubleRecebendoLong); // 12930.0
    }    
}


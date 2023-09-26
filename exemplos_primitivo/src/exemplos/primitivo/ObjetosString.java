package exemplos.primitivo;

public class ObjetosString {
	
	public static void main(String[] args) {
        char letraA = 'a';
        char letraAMaiuscula = 'A';
        System.out.println(letraA); // a
        System.out.println(letraAMaiuscula);
    }
	
	public static void main1(String[] args) {
        String frase = "Estou aprendendo Java!";
        String numeros = "09890";
        String caractere = "a";
    }
	
	public static void main2(String[] args) {

        String eu = "Eu";
        String ja = " já";
        String sei = " sei";
        String usar = " usar";
        String strings = " Strings";
        String em = " em";
        String java = " Java";

        String frase = eu + ja + sei + usar + strings + em + java;
        System.out.println(frase); // Eu já sei usar Strings em Java
    }
	
	  public static void main3(String[] args) {
	        StringBuilder stringBuilder = new StringBuilder();
	        String eu = "Eu";
	        String ja = " já";
	        String sei = " sei";
	        String usar = " usar";
	        String strings = " Strings";
	        String em = " em";
	        String java = " Java";

	        String frase = stringBuilder.append(eu)
	                .append(ja)
	                .append(sei)
	                .append(usar)
	                .append(strings)
	                .append(em)
	                .append(java)
	                .toString();
	        System.out.println(frase); // Eu já sei usar Strings em Java
	    }
}

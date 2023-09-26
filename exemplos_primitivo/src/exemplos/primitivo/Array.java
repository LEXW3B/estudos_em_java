package exemplos.primitivo;

public class Array {
	
	public static void main(String[] args) {
        int[] arrayDeInteiros = new int[9];
        arrayDeInteiros[0] = 40;
        arrayDeInteiros[1] = 55;
        arrayDeInteiros[2] = 63;
        arrayDeInteiros[3] = 17;
        arrayDeInteiros[4] = 22;
        arrayDeInteiros[5] = 68;
        arrayDeInteiros[6] = 89;
        arrayDeInteiros[7] = 97;
        arrayDeInteiros[8] = 89;

        System.out.println(arrayDeInteiros[8]); // 89
        System.out.println(arrayDeInteiros[2]); // 63

        arrayDeInteiros[9] = 89; // Estoura a pilha porque tentamos inserir um valor em um espaço inexistente do array
    }
	
	public static void main1(String[] args) {
        int[] arrayDeInteiros = new int[9];
        arrayDeInteiros[0] = 40;
        arrayDeInteiros[1] = 55;
        arrayDeInteiros[2] = 63;
        arrayDeInteiros[3] = 17;
        arrayDeInteiros[4] = 22;
        arrayDeInteiros[5] = 68;
        arrayDeInteiros[6] = 89;
        arrayDeInteiros[7] = 97;
        arrayDeInteiros[8] = 89;

        System.out.println(arrayDeInteiros[8]); // 89
        System.out.println(arrayDeInteiros[2]); // 63

        arrayDeInteiros[9] = 89; // Estoura a pilha porque tentamos inserir um valor em um espaço inexistente do array
    }
}

import java.util.Scanner;

public class Exercicio05 {
    public static String paraBinario(int numero) {
        if (numero == 0) {
            return "0";
        }
        String binario = "";
        while (numero > 0) {
            binario = (numero % 2) + binario;
            numero = numero / 2;
        }
        return binario;
    }
    public static void exibirTabela(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " = " + paraBinario(numeros[i]));
        }
    }
    public static void main(String[] args) {
        System.out.println("decimal para binario");
        System.out.println("digite 5 numeros inteiros nao negativos");
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
            while (numeros[i] < 0) {
                System.out.print("numero negativo. nao use negativos, digite denovo: ");
                numeros[i] = entrada.nextInt();
            }
        }
        System.out.println();
        exibirTabela(numeros);
        entrada.close();
    }
}

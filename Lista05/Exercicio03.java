import java.util.Scanner;

public class Exercicio03 {
    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int contarPrimos(int[] numeros) {
        int quantidade = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (ehPrimo(numeros[i])) {
                quantidade++;
            }
        }
        return quantidade;
    }
    public static void exibirPrimos(int[] numeros) {
        System.out.print("primos: ");
        for (int i = 0; i < numeros.length; i++) {
            if (ehPrimo(numeros[i])) {
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("numeros primos");
        System.out.println("digite 8 numeros inteiros");
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println();
        exibirPrimos(numeros);
        System.out.println("quantidade de primos encontrados: " + contarPrimos(numeros));
        entrada.close();
    }
}

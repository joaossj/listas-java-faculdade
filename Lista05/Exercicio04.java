import java.util.Scanner;

public class Exercicio04 {
    public static void ordenar(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = auxiliar;
                }
            }
        }
    }
    public static boolean estaOrdenado(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void exibir(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("ordenacao pelo metodo da bolha");
        System.out.println("digite 6 numeros inteiros");
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println();
        System.out.print("antes de ordenar: ");
        exibir(numeros);
        System.out.println("nao esta ordenado " + estaOrdenado(numeros));
        ordenar(numeros);
        System.out.print("depois de ordenar: ");
        exibir(numeros);
        System.out.println("esta ordenado " + estaOrdenado(numeros));
        entrada.close();
    }
}

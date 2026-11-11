import java.util.Scanner;

public class Exercicio10 {
    public static int fibonacci(int indice) {
        if (indice == 0) {
            return 0; 
        }
        if (indice == 1) {
            return 1;
        }
        return fibonacci(indice - 1) + fibonacci(indice - 2);
    }

    public static int somar(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma;
    }

    public static void exibir(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("sequencia de fibonacci");
        System.out.println("digite quantos termos quer ver (de 1 a 30)");
        System.out.println();

        Scanner entrada = new Scanner(System.in);
        System.out.print("n: ");
        int quantidadeTermos = entrada.nextInt();

        if (quantidadeTermos < 1 || quantidadeTermos > 30) {
            System.out.println("quantidade invalida, praque tanto");
            entrada.close();
            return;
        }

        int[] sequencia = new int[quantidadeTermos];
        for (int i = 0; i < quantidadeTermos; i++) {
            sequencia[i] = fibonacci(i);
        }

        System.out.println();
        exibir(sequencia);
        System.out.println("soma: " + somar(sequencia));
        entrada.close();
    }
}

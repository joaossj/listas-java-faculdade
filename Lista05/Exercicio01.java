import java.util.Scanner;

public class Exercicio01 {
    public static String montarLinha(char caractere, int quantidade) {
        String linha = "";
        for (int i = 0; i < quantidade; i++) {
            linha += caractere;
        }
        return linha;
    }
    public static void desenharTriangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            System.out.println(montarLinha('*', i));
        }
    }
    public static void main(String[] args) {
        System.out.println("triangulos de asteriscos");
        System.out.println("digite a altura de 3 triangulos");
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        int[] alturas = new int[3];

        for (int i = 0; i < alturas.length; i++) {
            System.out.print("altura do triangulo " + (i + 1) + ": ");
            alturas[i] = entrada.nextInt();
        }
        System.out.println();
        for (int i = 0; i < alturas.length; i++) {
            desenharTriangulo(alturas[i]);
            if (i < alturas.length - 1) {
                System.out.println();
            }
        }
        entrada.close();
    }
}

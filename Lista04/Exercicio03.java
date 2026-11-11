import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("media do aluno");
        System.out.println("digite as 4 notas do aluno");
        System.out.println("use virgula nos decimais (exemplo: 7,5).");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.printf("media: %.2f%n", media);
        if (media >= 6) {
            System.out.println("situacao: aprovado");
        } else {
            System.out.println("situacao: reprovado");
        }
        sc.close();
    }
}

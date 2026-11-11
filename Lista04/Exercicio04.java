import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println("total da compra");
        System.out.println("digite o preco dos 5 produtos, um por um, e aperta enter pra continuar");
        System.out.println("use virgula nos decimais (exemplo: 12,90).");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[5];
        double total = 0;
        for (int i = 0; i < precos.length; i++) {
            System.out.print("preco do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
            total += precos[i];
        }
        System.out.println("precos lidos:");
        for (int i = 0; i < precos.length; i++) {
            System.out.printf("produto %d: R$ %.2f%n", i + 1, precos[i]);
        }
        System.out.printf("total da compra: R$ %.2f%n", total);
        sc.close();
    }
}

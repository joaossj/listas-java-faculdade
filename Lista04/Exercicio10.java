import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println("caixa da loja");
        System.out.println("primeiro digite quantos itens tem a compra");
        System.out.println("digite o preco unitario e a quantidade");
        System.out.println("use virgula nos decimais (exemplo: 12,90)");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("quantidade de itens da compra: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("quantidade invalida");
            sc.close();
            return;
        }
        double[] precoUnitario = new double[n];
        int[] quantidade = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("preço unitario do item " + (i + 1) + ": ");
            precoUnitario[i] = sc.nextDouble();
            System.out.print("quantidade do item " + (i + 1) + ": ");
            quantidade[i] = sc.nextInt();
        }
        double total = 0;
        for (int i = 0; i < n; i++) {
            double subtotal = precoUnitario[i] * quantidade[i];
            total += subtotal;
            System.out.printf("item %d - subtotal: R$ %.2f%n", i + 1, subtotal);
        }
        double desconto = 0;
        if (total > 200.00) {
            desconto = total * 0.05;
        }
        double valorFinal = total - desconto;
        System.out.printf("total da compra: R$ %.2f%n", total);
        System.out.printf("desconto: R$ %.2f%n", desconto);
        System.out.printf("valor final a pagar: R$ %.2f%n", valorFinal);
        sc.close();
    }
}

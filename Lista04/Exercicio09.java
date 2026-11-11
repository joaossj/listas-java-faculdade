import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        System.out.println("busca de produto");
        System.out.println("digite o codigo do produto para ver o preco");
        System.out.println("codigos cadastrados: 101, 205, 310, 420 e 550");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int[] codigos = {101, 205, 310, 420, 550};
        double[] precos = {4.50, 12.00, 7.90, 25.00, 3.20};
        System.out.print("codigo do produto: ");
        int codigo = sc.nextInt();

        int posicao = -1;
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigo) {
                posicao = i;
                break;
            }
        }
        if (posicao != -1) {
            System.out.printf("preco: R$ %.2f%n", precos[posicao]);
        } else {
            System.out.println("produto nao encontrado");
        }
        sc.close();
    }
}

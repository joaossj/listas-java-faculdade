public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println("contar pares");
        System.out.println("digite os 6 numeros inteiros da matriz 2x3 (2 linhas e 3 colunas)");
        System.out.println();

        int[][] matriz = new int[2][3];
        int pares = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Integer.parseInt(IO.readln("posicao [" + i + "][" + j + "]: "));
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }

        System.out.println();
        System.out.println("quantidade de pares: " + pares);
    }
}

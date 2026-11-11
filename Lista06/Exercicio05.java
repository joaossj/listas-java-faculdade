public class Exercicio05 {
    public static void main(String[] args) {
        System.out.println("diagonal principal");
        System.out.println("digite os 9 numeros inteiros da matriz 3x3");
        System.out.println();

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Integer.parseInt(IO.readln("posicao [" + i + "][" + j + "]: "));
            }
        }

        System.out.println();
        System.out.print("diagonal principal: ");

        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();
    }
}

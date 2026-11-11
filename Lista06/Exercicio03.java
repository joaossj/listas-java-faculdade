public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("maior valor da matriz");
        System.out.println("digite os 9 numeros inteiros da matriz 3x3");
        System.out.println();

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Integer.parseInt(IO.readln("posicao [" + i + "][" + j + "]: "));
            }
        }

        int maior = matriz[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        System.out.println();
        System.out.println("maior valor: " + maior);
    }
}

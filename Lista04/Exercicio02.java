public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println("precos dos produtos");
        System.out.println("o bagulho vai mostrar o preco de cada um dos 3 produtos.");
        System.out.println();
        double[] precos = new double[3];
        precos[0] = 12.90;
        precos[1] = 5.50;
        precos[2] = 30.00;

        for (int i = 0; i < precos.length; i++) {
            System.out.printf("produto %d: R$ %.2f%n", i + 1, precos[i]);
        }
    }
}

import java.util.Scanner;

public class Exercicio02 {
    public static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }
    public static String classificarImc(double imc) {
        if (imc < 18.5) {
            return "abaixo do peso";
        } else if (imc < 25) {
            return "peso normal";
        } else if (imc < 30) {
            return "sobrepeso";
        } else {
            return "obesidade";
        }
    }
    public static void exibirRelatorio(double[] pesos, double[] alturas) {
        for (int i = 0; i < pesos.length; i++) {
            double resultado = calcularImc(pesos[i], alturas[i]);
            System.out.printf("pessoa %d: imc %.2f - %s%n", i + 1, resultado, classificarImc(resultado));
        }
    }
    public static void main(String[] args) {
        System.out.println("imc de 4 pessoas");
        System.out.println("digite o peso (kg) e depois a altura (m)");
        System.out.println("use virgula nos decimais (exemplo: peso 70,5 e altura 1,75)");
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        double[] pesos = new double[4];
        double[] alturas = new double[4];
        for (int i = 0; i < pesos.length; i++) {
            System.out.print("peso da pessoa " + (i + 1) + ": ");
            pesos[i] = entrada.nextDouble();
            System.out.print("altura da pessoa " + (i + 1) + ": ");
            alturas[i] = entrada.nextDouble();
        }
        System.out.println();
        exibirRelatorio(pesos, alturas);
        entrada.close();
    }
}

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        System.out.println("salarios dos funcionarios");
        System.out.println("digite o salario de 6 funcionarios");
        System.out.println("use virgula nos decimais");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        double[] salarios = new double[6];
        double soma = 0;
        for (int i = 0; i < salarios.length; i++) {
            System.out.print("salario do funcionario " + (i + 1) + ": ");
            salarios[i] = sc.nextDouble();
            soma += salarios[i];
        }
        double maior = salarios[0];
        double menor = salarios[0];
        for (int i = 1; i < salarios.length; i++) {
            if (salarios[i] > maior) {
                maior = salarios[i];
            }
            if (salarios[i] < menor) {
                menor = salarios[i];
            }
        }
        double media = soma / salarios.length;
        int acimaDaMedia = 0;
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] > media) {
                acimaDaMedia++;
            }
        }
        System.out.printf("maior salario: R$ %.2f%n", maior);
        System.out.printf("menor salario: R$ %.2f%n", menor);
        System.out.printf("media: R$ %.2f%n", media);
        System.out.println("funcionarios acima da media: " + acimaDaMedia);
        sc.close();
    }
}

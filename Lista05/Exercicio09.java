import java.util.Scanner;

public class Exercicio09 {
    public static long potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base * potencia(base, expoente - 1);
    }
    public static void exibirPotencias(int[] bases, int expoente) {
        for (int i = 0; i < bases.length; i++) {
            System.out.println(bases[i] + "^" + expoente + " = " + potencia(bases[i], expoente));
        }
    }
    public static void main(String[] args) {
        System.out.println("potencia recursiva");
        System.out.println("primeiro digite o expoente (0 ou maior)");
        System.out.println("depois digite 5 bases");
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        System.out.print("expoente: ");
        int expoente = entrada.nextInt();
        while (expoente < 0) {
            System.out.print("expoente negativo. digite de novo: ");
            expoente = entrada.nextInt();
        }
        int[] bases = new int[5];
        for (int i = 0; i < bases.length; i++) {
            System.out.print("base " + (i + 1) + ": ");
            bases[i] = entrada.nextInt();
        }
        System.out.println();
        exibirPotencias(bases, expoente);
        entrada.close();
    }
}

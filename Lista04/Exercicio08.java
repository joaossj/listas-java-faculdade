import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        System.out.println("situacao da turma");
        System.out.println("digite a nota de 10 alunos");
        System.out.println("use virgula nos decimais (exemplo: 7,5).");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            if (notas[i] >= 6) {
                aprovados++;
            } else if (notas[i] >= 4) {
                recuperacao++;
            } else {
                reprovados++;
            }
        }

        System.out.println("aprovados: " + aprovados);
        System.out.println("recuperacao: " + recuperacao);
        System.out.println("reprovados: " + reprovados);
        sc.close();
    }
}

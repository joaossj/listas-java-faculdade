package br.com.joao.lista03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual exercicio quer rodar? (1 a 10):");
        int ex = ler.nextInt();
        ler.nextLine();
        
        switch (ex) {
            case 1:
                System.out.print("Digite N: ");
                int n1 = ler.nextInt();
                if (n1 < 1) {
                    System.out.println("não há valores a exibir");
                } else {
                    int i = 1;
                    while (i <= n1) {
                        System.out.println(i);
                        i++;
                    }
                }
                break;

            case 2:
                System.out.print("Digite um numero: ");
                int numTab = ler.nextInt();
                int j = 1;
                while (j <= 10) {
                    System.out.println(numTab + " x " + j + " = " + (numTab * j));
                    j++;
                }
                break;

            case 3:
                double nota;
                do {
                    System.out.print("Digite a nota (0 a 10): ");
                    nota = ler.nextDouble();
                    if (nota < 0 || nota > 10) {
                        System.out.println("valor inválido");
                    }
                } while (nota < 0 || nota > 10);
                System.out.println("Nota aceita: " + nota);
                break;

            case 4:
                int opMenu;
                do {
                    System.out.println("1 - Dobro\n2 - Metade\n3 - Quadrado\n0 - Sair");
                    System.out.print("Opção: ");
                    opMenu = ler.nextInt();
                    
                    if (opMenu >= 1 && opMenu <= 3) {
                        System.out.print("Digite o numero: ");
                        double numOp = ler.nextDouble();
                        switch (opMenu) {
                            case 1 -> System.out.println("Dobro: " + (numOp * 2));
                            case 2 -> System.out.println("Metade: " + (numOp / 2));
                            case 3 -> System.out.println("Quadrado: " + (numOp * numOp));
                        }
                    } else if (opMenu != 0) {
                        System.out.println("Opção inválida");
                    }
                } while (opMenu != 0);
                break;

            case 5:
                System.out.print("Digite A: ");
                int a = ler.nextInt();
                System.out.print("Digite B: ");
                int b = ler.nextInt();
                if (a > b) {
                    System.out.println("intervalo é inválido");
                } else {
                    int somaPares = 0;
                    for (int k = a; k <= b; k++) {
                        if (k % 2 == 0) {
                            somaPares += k;
                        }
                    }
                    System.out.println("Soma dos pares: " + somaPares);
                }
                break;

            case 6:
                System.out.print("Digite um numero: ");
                int numFat = ler.nextInt();
                if (numFat < 0) {
                    System.out.println("entrada inválida");
                } else {
                    long fat = 1;
                    for (int k = 1; k <= numFat; k++) {
                        fat *= k;
                    }
                    System.out.println("Fatorial: " + fat);
                }
                break;

            case 7:
                System.out.print("Quantidade de alunos: ");
                int qtdAlunos = ler.nextInt();
                double somaNotas = 0;
                int maior6 = 0, menor6 = 0;
                for (int k = 1; k <= qtdAlunos; k++) {
                    System.out.print("Nota do aluno " + k + ": ");
                    double nAlu = ler.nextDouble();
                    somaNotas += nAlu;
                    if (nAlu >= 6.0) maior6++;
                    else menor6++;
                }
                double medTurma = (qtdAlunos > 0) ? (somaNotas / qtdAlunos) : 0;
                System.out.printf("Média da turma: %.2f\n", medTurma);
                System.out.println("Alunos maiores ou iguais a 6: " + maior6);
                System.out.println("Alunos abaixo de 6: " + menor6);
                break;

            case 8:
                int qtdValores = 0, somaValores = 0;
                int maiorVal = Integer.MIN_VALUE, menorVal = Integer.MAX_VALUE;
                boolean primeiro = true;
                while (true) {
                    System.out.print("Digite um valor (0 para sair): ");
                    int val = ler.nextInt();
                    if (val == 0) {
                        if (primeiro) System.out.println("nenhum valor foi lido");
                        break;
                    }
                    primeiro = false;
                    qtdValores++;
                    somaValores += val;
                    if (val > maiorVal) maiorVal = val;
                    if (val < menorVal) menorVal = val;
                }
                if (qtdValores > 0) {
                    System.out.println("Quantidade lida: " + qtdValores);
                    System.out.println("Soma: " + somaValores);
                    System.out.println("Maior: " + maiorVal);
                    System.out.println("Menor: " + menorVal);
                }
                break;

            case 9:
                System.out.print("Digite N (1 a 9): ");
                int n9 = ler.nextInt();
                if (n9 < 1 || n9 > 9) {
                    System.out.println("entrada inválida");
                } else {
                    for (int m = 1; m <= n9; m++) {
                        for (int o = 1; o <= 10; o++) {
                            System.out.println(m + " x " + o + " = " + (m * o));
                        }
                        System.out.println();
                    }
                }
                break;

            case 10:
                double totCompra = 0;
                int totItens = 0;
                while (true) {
                    System.out.print("Código do produto (0 para sair): ");
                    int cod = ler.nextInt();
                    if (cod == 0) break;
                    System.out.print("Preço unitário: ");
                    double preco = ler.nextDouble();
                    System.out.print("Quantidade: ");
                    int qItens = ler.nextInt();
                    totCompra += (preco * qItens);
                    totItens += qItens;
                }
                System.out.println("Forma de pagamento (1-Dinheiro, 2-Débito, 3-Crédito): ");
                int fPag = ler.nextInt();
                switch (fPag) {
                    case 1 -> totCompra *= 0.95;
                    case 3 -> totCompra *= 1.03;
                    case 2 -> {}
                    default -> System.out.println("Forma inválida");
                }
                if (totCompra > 300.00) System.out.println("Aviso: compra grande");
                if (totItens > 20) System.out.println("Aviso: muitos itens");
                System.out.printf("Total final: R$ %.2f\n", totCompra);
                break;

            default:
                System.out.println("Opção inválida! Escolha de 1 a 10.");
                break;
        }
        
        ler.close();
    }
}

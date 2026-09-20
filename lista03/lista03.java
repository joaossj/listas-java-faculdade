package br.com.joao.lista03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Escolha o exercicio (1 a 10): ");
        int ex = ler.nextInt();

        switch (ex) {

        case 1:
            System.out.print("Digite N: ");
            int n = ler.nextInt();

            if (n < 1) {
                System.out.println("Nao ha valores");
            } else {
                int i = 1;

                while (i <= n) {
                    System.out.println(i);
                    i++;
                }
            }
            break;

        case 2:
            System.out.print("Digite um numero: ");
            int num = ler.nextInt();

            int i = 1;

            while (i <= 10) {
                System.out.println(num + " x " + i + " = " + (num * i));
                i++;
            }
            break;

        case 3:
            double nota;

            do {
                System.out.print("Digite a nota (0 a 10): ");
                nota = ler.nextDouble();

                if (nota < 0 || nota > 10)
                    System.out.println("Nota invalida");

            } while (nota < 0 || nota > 10);

            System.out.println("Nota aceita: " + nota);
            break;

        case 4:
            int op;

            do {
                System.out.println("1 - Dobro");
                System.out.println("2 - Metade");
                System.out.println("3 - Quadrado");
                System.out.println("0 - Sair");
                System.out.print("Opcao: ");
                op = ler.nextInt();

                if (op >= 1 && op <= 3) {
                    System.out.print("Digite um numero: ");
                    double x = ler.nextDouble();

                    if (op == 1)
                        System.out.println("Dobro: " + (x * 2));
                    else if (op == 2)
                        System.out.println("Metade: " + (x / 2));
                    else
                        System.out.println("Quadrado: " + (x * x));

                } else if (op != 0) {
                    System.out.println("Opcao invalida");
                }

            } while (op != 0);
            break;

        case 5:
            System.out.print("Digite A: ");
            int a = ler.nextInt();

            System.out.print("Digite B: ");
            int b = ler.nextInt();

            if (a > b) {
                System.out.println("Intervalo invalido");
            } else {
                int soma = 0;

                for (int i = a; i <= b; i++) {
                    if (i % 2 == 0)
                        soma = soma + i;
                }

                System.out.println("Soma dos pares: " + soma);
            }
            break;

        case 6:
            System.out.print("Digite um numero: ");
            int fat = ler.nextInt();

            if (fat < 0) {
                System.out.println("Numero invalido");
            } else {
                long resultado = 1;

                for (int i = 1; i <= fat; i++) {
                    resultado = resultado * i;
                }

                System.out.println("Fatorial: " + resultado);
            }
            break;

        case 7:
            System.out.print("Quantidade de alunos: ");
            int qtd = ler.nextInt();

            double soma = 0;
            int maior = 0;
            int menor = 0;

            for (int i = 1; i <= qtd; i++) {
                System.out.print("Nota do aluno " + i + ": ");
                double notaAluno = ler.nextDouble();

                soma = soma + notaAluno;

                if (notaAluno >= 6)
                    maior++;
                else
                    menor++;
            }

            double media = 0;

            if (qtd > 0)
                media = soma / qtd;

            System.out.printf("Media da turma: %.2f\n", media);
            System.out.println("Notas maiores ou iguais a 6: " + maior);
            System.out.println("Notas abaixo de 6: " + menor);
            break;

        case 8:
            int qtdValores = 0;
            int somaValores = 0;
            int maiorValor = 0;
            int menorValor = 0;

            while (true) {
                System.out.print("Digite um valor (0 para sair): ");
                int valor = ler.nextInt();

                if (valor == 0)
                    break;

                if (qtdValores == 0) {
                    maiorValor = valor;
                    menorValor = valor;
                }

                qtdValores++;
                somaValores = somaValores + valor;

                if (valor > maiorValor)
                    maiorValor = valor;

                if (valor < menorValor)
                    menorValor = valor;
            }

            if (qtdValores == 0) {
                System.out.println("Nenhum valor foi lido");
            } else {
                System.out.println("Quantidade: " + qtdValores);
                System.out.println("Soma: " + somaValores);
                System.out.println("Maior: " + maiorValor);
                System.out.println("Menor: " + menorValor);
            }
            break;

        case 9:
            System.out.print("Digite N (1 a 9): ");
            int n9 = ler.nextInt();

            if (n9 < 1 || n9 > 9) {
                System.out.println("Numero invalido");
            } else {

                for (int i = 1; i <= n9; i++) {

                    for (int j = 1; j <= 10; j++) {
                        System.out.println(i + " x " + j + " = " + (i * j));
                    }

                    System.out.println();
                }
            }
            break;

        case 10:
            double total = 0;
            int itens = 0;

            while (true) {
                System.out.print("Codigo do produto (0 para sair): ");
                int codigo = ler.nextInt();

                if (codigo == 0)
                    break;

                System.out.print("Preco: ");
                double preco = ler.nextDouble();

                System.out.print("Quantidade: ");
                int quantidade = ler.nextInt();

                total = total + (preco * quantidade);
                itens = itens + quantidade;
            }

            System.out.println("1 - Dinheiro");
            System.out.println("2 - Debito");
            System.out.println("3 - Credito");
            System.out.print("Forma de pagamento: ");
            int pagamento = ler.nextInt();

            if (pagamento == 1)
                total = total * 0.95;
            else if (pagamento == 3)
                total = total * 1.03;
            else if (pagamento != 2)
                System.out.println("Forma invalida");

            if (total > 300)
                System.out.println("Aviso: compra grande");

            if (itens > 20)
                System.out.println("Aviso: muitos itens");

            System.out.printf("Total final: R$ %.2f\n", total);
            break;

        default:
            System.out.println("Opcao invalida");
        }

        ler.close();
    }
}


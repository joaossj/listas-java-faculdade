package br.com.joao.lista02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Escolha o exercicio (1 a 15): ");
        int ex = ler.nextInt();

        switch (ex) {

        case 1:
            System.out.print("Idade: ");
            int idade = ler.nextInt();

            if (idade >= 16)
                System.out.println("Pode votar");

            if (idade >= 18)
                System.out.println("Pode dirigir");

            if (idade >= 60)
                System.out.println("E idoso");
            break;

        case 2:
            System.out.print("Numero: ");
            int n = ler.nextInt();

            if (n > 0)
                System.out.println("E positivo");

            if (n % 2 == 0)
                System.out.println("E par");

            if (n % 5 == 0)
                System.out.println("E multiplo de 5");

            if (Math.abs(n) >= 10 && Math.abs(n) <= 99)
                System.out.println("Tem dois digitos");
            break;

        case 3:
            System.out.print("Temperatura: ");
            double temp = ler.nextDouble();

            System.out.print("Umidade: ");
            double umid = ler.nextDouble();

            if (temp >= 38)
                System.out.println("Alerta de calor extremo");

            if (umid < 30)
                System.out.println("Alerta de umidade baixa");

            if (temp >= 35 && umid < 20)
                System.out.println("Alerta de risco de queimada");
            break;

        case 4:
            System.out.print("Numero 1: ");
            int n1 = ler.nextInt();

            System.out.print("Numero 2: ");
            int n2 = ler.nextInt();

            if (n2 == 0) {
                System.out.println("Nao pode fazer a verificacao");
            } else {
                if (n1 % n2 == 0)
                    System.out.println("O primeiro e multiplo do segundo");
                else
                    System.out.println("O primeiro nao e multiplo do segundo");
            }
            break;

        case 5:
            System.out.print("Ano: ");
            int ano = ler.nextInt();

            if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0)
                System.out.println("Ano bissexto");
            else
                System.out.println("Nao e bissexto");
            break;

        case 6:
            System.out.print("Valor da compra: ");
            double compra = ler.nextDouble();

            double frete;

            if (compra >= 199)
                frete = 0;
            else
                frete = 24.90;

            System.out.printf("Frete: R$ %.2f\n", frete);
            System.out.printf("Total: R$ %.2f\n", compra + frete);
            break;

        case 7:
            System.out.print("Hora: ");
            int hora = ler.nextInt();

            if (hora < 0 || hora > 23)
                System.out.println("Hora invalida");
            else if (hora <= 11)
                System.out.println("Bom dia");
            else if (hora <= 17)
                System.out.println("Boa tarde");
            else
                System.out.println("Boa noite");
            break;

        case 8:
            System.out.print("Velocidade maxima: ");
            double max = ler.nextDouble();

            System.out.print("Velocidade do carro: ");
            double v = ler.nextDouble();

            if (v <= max)
                System.out.println("Dentro do limite");
            else if (v <= max * 1.20)
                System.out.println("Infracao media");
            else if (v <= max * 1.50)
                System.out.println("Infracao grave");
            else
                System.out.println("Infracao gravissima");
            break;

        case 9:
            System.out.print("Salario: ");
            double sal = ler.nextDouble();

            System.out.print("Anos de casa: ");
            int tempo = ler.nextInt();

            double porcentagem = 0;

            if (tempo >= 1 && tempo <= 3)
                porcentagem = 0.05;
            else if (tempo <= 10)
                porcentagem = 0.10;
            else
                porcentagem = 0.15;

            double bonus = sal * porcentagem;

            System.out.println("Percentual: " + (porcentagem * 100) + "%");
            System.out.printf("Bonus: R$ %.2f\n", bonus);
            break;

        case 10:
            ler.nextLine();

            System.out.print("Usuario: ");
            String usuario = ler.nextLine();

            System.out.print("Senha: ");
            String senha = ler.nextLine();

            if (!usuario.equals("admin"))
                System.out.println("Usuario nao encontrado");
            else if (senha.equals("java123"))
                System.out.println("Acesso liberado");
            else
                System.out.println("Senha incorreta");
            break;

        case 11:
            System.out.print("Frequencia: ");
            double freq = ler.nextDouble();

            System.out.print("Media: ");
            double media = ler.nextDouble();

            if (freq < 75)
                System.out.println("Reprovado por falta");
            else if (media >= 7)
                System.out.println("Aprovado");
            else if (media >= 5)
                System.out.println("Recuperacao");
            else
                System.out.println("Reprovado por nota");
            break;

        case 12:
            System.out.print("Saldo: ");
            double saldo = ler.nextDouble();

            System.out.print("Limite diario: ");
            double limite = ler.nextDouble();

            System.out.print("Valor do saque: ");
            double saque = ler.nextDouble();

            if (saldo < saque)
                System.out.println("Saldo insuficiente");
            else if (saque > limite)
                System.out.println("Passou do limite diario");
            else
                System.out.printf("Saque feito. Saldo: R$ %.2f\n", saldo - saque);
            break;

        case 13:
            System.out.print("Numero 1: ");
            double a = ler.nextDouble();

            System.out.print("Numero 2: ");
            double b = ler.nextDouble();

            System.out.print("Opcao (1 a 4): ");
            int op = ler.nextInt();

            if (op == 1)
                System.out.println("Resultado: " + (a + b));
            else if (op == 2)
                System.out.println("Resultado: " + (a - b));
            else if (op == 3)
                System.out.println("Resultado: " + (a * b));
            else if (op == 4) {
                if (b == 0)
                    System.out.println("Nao pode dividir por zero");
                else
                    System.out.println("Resultado: " + (a / b));
            } else {
                System.out.println("Opcao invalida");
            }
            break;

        case 14:
            System.out.print("Mes: ");
            int mes = ler.nextInt();

            if (mes == 2)
                System.out.println("28 dias");
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
                System.out.println("30 dias");
            else if (mes >= 1 && mes <= 12)
                System.out.println("31 dias");
            else
                System.out.println("Mes invalido");
            break;

        case 15:
            System.out.print("Tipo (1 carro, 2 moto): ");
            int tipo = ler.nextInt();

            double tarifa;

            if (tipo == 1)
                tarifa = 8;
            else if (tipo == 2)
                tarifa = 5;
            else {
                System.out.println("Opcao invalida");
                break;
            }

            System.out.print("Horas: ");
            int horas = ler.nextInt();

            double valor = tarifa * horas;

            ler.nextLine();
            System.out.print("Tem cupom? (sim/nao): ");
            String cupom = ler.nextLine();

            if (cupom.equalsIgnoreCase("sim") && valor >= 50)
                valor = valor * 0.80;

            if (horas > 12)
                System.out.println("Permanencia longa");

            if (horas > 24)
                System.out.println("Cobranca de diaria");

            if (horas <= 2)
                System.out.println("Permanencia curta");
            else if (horas <= 6)
                System.out.println("Permanencia media");
            else
                System.out.println("Permanencia longa");

            System.out.printf("Valor final: R$ %.2f\n", valor);
            break;

        default:
            System.out.println("Opcao invalida");
        }

        ler.close();
    }
}


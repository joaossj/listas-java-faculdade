package br.com.joao.lista02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual exercicio quer rodar? (1 a 15):");
        int ex = ler.nextInt();
        ler.nextLine();
        
        switch (ex) {
            case 1:
                System.out.print("Digite a idade: ");
                int idade = ler.nextInt();
                if (idade >= 16) System.out.println("16 anos ou mais pode votar");
                if (idade >= 18) System.out.println("18 anos ou mais pode dirigir");
                if (idade >= 60) System.out.println("60 anos ou mais é idoso");
                break;

            case 2:
                System.out.print("Digite um numero: ");
                int n = ler.nextInt();
                int absN = Math.abs(n);
                if (n > 0) System.out.println("é positivo");
                if (n % 2 == 0) System.out.println("é par");
                if (n % 5 == 0) System.out.println("é múltiplo de 5");
                if (absN >= 10 && absN <= 99) System.out.println("tem dois dígitos");
                break;

            case 3:
                System.out.print("Temperatura: ");
                double temp = ler.nextDouble();
                System.out.print("Umidade: ");
                double umid = ler.nextDouble();
                if (temp >= 38) System.out.println("alerta de calor extremo");
                if (umid < 30) System.out.println("alerta de umidade baixa");
                if (temp >= 35 && umid < 20) System.out.println("alerta de risco de queimada");
                break;

            case 4:
                System.out.print("Numero 1: ");
                int n1 = ler.nextInt();
                System.out.print("Numero 2: ");
                int n2 = ler.nextInt();
                if (n2 == 0) {
                    System.out.println("a verificação não pode ser feita");
                } else {
                    if (n1 % n2 == 0) System.out.println("o primeiro é múltiplo do segundo");
                    else System.out.println("o primeiro nao é múltiplo do segundo");
                }
                break;

            case 5:
                System.out.print("Ano: ");
                int ano = ler.nextInt();
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    System.out.println("ano bissexto");
                } else {
                    System.out.println("nao é bissexto");
                }
                break;

            case 6:
                System.out.print("Valor da compra: ");
                double compra = ler.nextDouble();
                double frete = (compra >= 199.00) ? 0.0 : 24.90;
                double total = compra + frete;
                System.out.printf("Valor do frete: R$ %.2f\n", frete);
                System.out.printf("Total a pagar: R$ %.2f\n", total);
                break;

            case 7:
                System.out.print("Hora (0 a 23): ");
                int hora = ler.nextInt();
                if (hora < 0 || hora > 23) System.out.println("Horas inválidas");
                else if (hora <= 11) System.out.println("bom dia");
                else if (hora <= 17) System.out.println("boa tarde");
                else System.out.println("boa noite");
                break;

            case 8:
                System.out.print("Velocidade maxima: ");
                double max = ler.nextDouble();
                System.out.print("Velocidade do veiculo: ");
                double v = ler.nextDouble();
                if (v <= max) System.out.println("dentro do limite não há multa");
                else if (v <= max * 1.20) System.out.println("infração média");
                else if (v <= max * 1.50) System.out.println("infração grave");
                else System.out.println("infração gravíssima");
                break;

            case 9:
                System.out.print("Salario: ");
                double sal = ler.nextDouble();
                System.out.print("Tempo de casa (anos): ");
                int tempo = ler.nextInt();
                double pct = 0;
                if (tempo >= 1 && tempo <= 3) pct = 0.05;
                else if (tempo <= 10 && tempo > 3) pct = 0.10;
                else if (tempo > 10) pct = 0.15;
                double bonus = sal * pct;
                System.out.printf("Percentual: %.0f%%\n", pct * 100);
                System.out.printf("Valor do bônus: R$ %.2f\n", bonus);
                break;

            case 10:
                System.out.print("Usuario: ");
                String user = ler.nextLine();
                System.out.print("Senha: ");
                String senha = ler.nextLine();
                if (!user.equals("admin")) {
                    System.out.println("usuário não foi encontrado");
                } else {
                    if (senha.equals("java123")) System.out.println("acesso liberado");
                    else System.out.println("senha incorreta");
                }
                break;

            case 11:
                System.out.print("Frequencia (%): ");
                double freq = ler.nextDouble();
                System.out.print("Media final: ");
                double mf = ler.nextDouble();
                if (freq < 75.0) {
                    System.out.println("reprovado por falta");
                } else {
                    if (mf >= 7.0) System.out.println("aprovado");
                    else if (mf >= 5.0) System.out.println("recuperação");
                    else System.out.println("reprovado por nota");
                }
                break;

            case 12:
                System.out.print("Saldo: ");
                double saldo = ler.nextDouble();
                System.out.print("Limite diario: ");
                double limite = ler.nextDouble();
                System.out.print("Valor do saque: ");
                double valorSaque = ler.nextDouble();
                if (saldo < valorSaque) {
                    System.out.println("saldo insuficiente");
                } else {
                    if (valorSaque > limite) System.out.println("valor ultrapassa o limite diário");
                    else System.out.printf("Saque efetuado. Novo saldo: R$ %.2f\n", (saldo - valorSaque));
                }
                break;

            case 13:
                System.out.print("Numero 1: ");
                double d1 = ler.nextDouble();
                System.out.print("Numero 2: ");
                double d2 = ler.nextDouble();
                System.out.print("Opção (1 a 4): ");
                int op = ler.nextInt();
                if (op == 1) System.out.println("Resultado: " + (d1 + d2));
                else if (op == 2) System.out.println("Resultado: " + (d1 - d2));
                else if (op == 3) System.out.println("Resultado: " + (d1 * d2));
                else if (op == 4) {
                    if (d2 == 0) System.out.println("Erro: Divisor é zero");
                    else System.out.println("Resultado: " + (d1 / d2));
                } else System.out.println("opção inválida");
                break;

            case 14:
                System.out.print("Mes (1 a 12): ");
                int mes = ler.nextInt();
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) System.out.println("31 dias");
                else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) System.out.println("30 dias");
                else if (mes == 2) System.out.println("28 dias");
                else System.out.println("Mês inválido");
                break;

            case 15:
                System.out.print("Tipo (1-carro, 2-moto): ");
                int tipo = ler.nextInt();
                double tarifa = 0;
                if (tipo == 1) tarifa = 8.00;
                else if (tipo == 2) tarifa = 5.00;
                else {
                    System.out.println("opção inválida");
                    break;
                }
                System.out.print("Horas: ");
                int horas = ler.nextInt();
                ler.nextLine();
                double vFinal = tarifa * horas;
                System.out.print("Tem cupom? (sim/nao): ");
                String cupom = ler.nextLine();
                if (cupom.equalsIgnoreCase("sim")) {
                    if (vFinal >= 50.00) vFinal = vFinal * 0.80;
                    else System.out.println("o cupom vale apenas acima de 50,00");
                }
                if (horas > 12) System.out.println("Aviso: permanência longa");
                if (horas > 24) System.out.println("Aviso: cobrança de diária");
                if (horas <= 2) System.out.println("Permanência: curta");
                else if (horas <= 6) System.out.println("Permanência: média");
                else System.out.println("Permanência: longa");
                System.out.printf("Valor final: R$ %.2f\n", vFinal);
                break;

            default:
                System.out.println("Opção inválida! Escolha de 1 a 15.");
                break;
        }
        
        ler.close();
    }
}

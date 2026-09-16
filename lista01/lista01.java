import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Escolha o exercicio: ");
        int ex = ler.nextInt();

        if (ex == 1) {
            System.out.print("Nome: ");
            String nome = ler.next();
            System.out.print("Idade: ");
            int idade = ler.nextInt();
            System.out.print("Altura: ");
            double altura = ler.nextDouble();

            System.out.println("Ola, meu nome e " + nome + ", tenho " + idade + " anos e minha altura e " + altura);
        }

        else if (ex == 2) {
            System.out.print("Numero 1: ");
            int a = ler.nextInt();
            System.out.print("Numero 2: ");
            int b = ler.nextInt();

            System.out.println("Soma: " + (a + b));
            System.out.println("Subtracao: " + (a - b));
            System.out.println("Multiplicacao: " + (a * b));
            System.out.println("Divisao: " + (a / b));
            System.out.println("Resto: " + (a % b));
        }

        else if (ex == 3) {
            System.out.print("Reais: ");
            double reais = ler.nextDouble();
            System.out.print("Cotacao do dolar: ");
            double cot = ler.nextDouble();

            System.out.println("Valor em dolar: " + (reais / cot));
        }

        else if (ex == 4) {
            System.out.print("Nota 1: ");
            double n1 = ler.nextDouble();
            System.out.print("Nota 2: ");
            double n2 = ler.nextDouble();
            System.out.print("Nota 3: ");
            double n3 = ler.nextDouble();
            System.out.print("Nota 4: ");
            double n4 = ler.nextDouble();

            double media = (n1 + n2 + n3 + n4) / 4;
            System.out.println("Media: " + media);
        }

        else if (ex == 5) {
            System.out.print("Valor por hora: ");
            double hora = ler.nextDouble();
            System.out.print("Horas trabalhadas: ");
            double horas = ler.nextDouble();

            double bruto = hora * horas;
            double inss = bruto * 0.08;

            System.out.println("Salario bruto: " + bruto);
            System.out.println("INSS: " + inss);
            System.out.println("Salario liquido: " + (bruto - inss));
        }

        else if (ex == 6) {
            System.out.print("Raio: ");
            double r = ler.nextDouble();

            double area = 3.14159 * r * r;
            double p = 2 * 3.14159 * r;

            System.out.println("Area: " + area);
            System.out.println("Perimetro: " + p);
        }

        else if (ex == 7) {
            System.out.print("Base: ");
            double b = ler.nextDouble();
            System.out.print("Altura: ");
            double h = ler.nextDouble();

            double area = b * h;
            double perimetro = 2 * (b + h);

            System.out.println("Area: " + area);
            System.out.println("Perimetro: " + perimetro);
            System.out.println("Diagonal: " + Math.sqrt(b * b + h * h));
        }

        else if (ex == 8) {
            System.out.print("Celsius: ");
            double c = ler.nextDouble();

            double f = c * 9 / 5 + 32;
            double k = c + 273.15;

            System.out.println("Fahrenheit: " + f);
            System.out.println("Kelvin: " + k);
        }

        else if (ex == 9) {
            System.out.print("Digite um numero: ");
            int n = ler.nextInt();

            if (n % 2 == 0)
                System.out.println("O numero e par");
            else
                System.out.println("O numero e impar");
        }

        else if (ex == 10) {
            System.out.print("Digite a media: ");
            double m = ler.nextDouble();

            if (m >= 7)
                System.out.println("Aprovado");
            else if (m >= 5)
                System.out.println("Recuperacao");
            else
                System.out.println("Reprovado");
        }

        else if (ex == 11) {
            System.out.print("Numero 1: ");
            int a = ler.nextInt();
            System.out.print("Numero 2: ");
            int b = ler.nextInt();
            System.out.print("Numero 3: ");
            int c = ler.nextInt();

            if (a > b && a > c)
                System.out.println("Maior: " + a);
            else if (b > a && b > c)
                System.out.println("Maior: " + b);
            else
                System.out.println("Maior: " + c);
        }

        else if (ex == 12) {
            System.out.print("Consumo em kWh: ");
            double kwh = ler.nextDouble();

            if (kwh <= 100)
                System.out.println("Conta: R$ " + (kwh * 0.50));
            else if (kwh <= 300)
                System.out.println("Conta: R$ " + (kwh * 0.75));
            else
                System.out.println("Conta: R$ " + (kwh * 1.10));
        }

        ler.close();
    }
}


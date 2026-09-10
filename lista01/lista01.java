import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual exercicio quer rodar? (1 a 12):");
        int ex = ler.nextInt();
        ler.nextLine();
        
        if (ex == 1) {
            System.out.print("Nome: ");
            String nome = ler.nextLine();
            System.out.print("Idade: ");
            int idade = ler.nextInt();
            System.out.print("Altura: ");
            double alt = ler.nextDouble();
            
            System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e minha altura é " + alt);
        }
        else if (ex == 2) {
            System.out.print("Numero 1: ");
            int num1 = ler.nextInt();
            System.out.print("Numero 2: ");
            int num2 = ler.nextInt();
            
            System.out.println("Soma: " + (num1 + num2));
            System.out.println("Subtracao: " + (num1 - num2));
            System.out.println("Multiplicacao: " + (num1 * num2));
            System.out.println("Divisao: " + (num1 / num2));
            System.out.println("Resto: " + (num1 % num2));
        }
        else if (ex == 3) {
            System.out.print("Valor em reais: ");
            double r = ler.nextDouble();
            System.out.print("Cotacao do dolar: ");
            double cot = ler.nextDouble();
            
            double totalDolar = r / cot;
            System.out.println("Valor convertido: " + totalDolar);
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
            System.out.println("Media final: " + media);
        }
        else if (ex == 5) {
            System.out.print("Ganho por hora: ");
            double gHora = ler.nextDouble();
            System.out.print("Horas no mes: ");
            double hMes = ler.nextDouble();
            
            double bruto = gHora * hMes;
            double inss = bruto * 0.08;
            double liquido = bruto - inss;
            
            System.out.println("Salario Bruto: " + bruto);
            System.out.println("Desconto INSS: " + inss);
            System.out.println("Salario Liquido: " + liquido);
        }
        else if (ex == 6) {
            System.out.print("Raio do circulo: ");
            double raio = ler.nextDouble();
            
            double area = 3.14159 * raio * raio;
            double perimetro = 2 * 3.14159 * raio;
            
            System.out.println("Area: " + area);
            System.out.println("Perimetro: " + perimetro);
        }
        else if (ex == 7) {
            System.out.print("Base: ");
            double b = ler.nextDouble();
            System.out.print("Altura: ");
            double h = ler.nextDouble();
            
            double areaRet = b * h;
            double perRet = 2 * (b + h);
            double diagRet = Math.sqrt((b * b) + (h * h));
            
            System.out.println("Area: " + areaRet);
            System.out.println("Perimetro: " + perRet);
            System.out.println("Diagonal: " + diagRet);
        }
        else if (ex == 8) {
            System.out.print("Celsius: ");
            double c = ler.nextDouble();
            
            double f = (c * 9/5) + 32;
            double k = c + 273.15;
            
            System.out.println("Fahrenheit: " + f);
            System.out.println("Kelvin: " + k);
        }
        else if (ex == 9) {
            System.out.print("Digite um numero: ");
            int n = ler.nextInt();
            
            if (n % 2 == 0) {
                System.out.println("O numero e par");
            } else {
                System.out.println("O numero e impar");
            }
        }
        else if (ex == 10) {
            System.out.print("Digite a media: ");
            double mf = ler.nextDouble();
            
            if (mf >= 7.0) {
                System.out.println("Aprovado");
            } else if (mf >= 5.0 && mf < 7.0) {
                System.out.println("Recuperacao");
            } else {
                System.out.println("Reprovado");
            }
        }
        else if (ex == 11) {
            System.out.print("Numero 1: ");
            int x = ler.nextInt();
            System.out.print("Numero 2: ");
            int y = ler.nextInt();
            System.out.print("Numero 3: ");
            int z = ler.nextInt();
            
            if (x > y && x > z) {
                System.out.println("Maior: " + x);
            } else if (y > x && y > z) {
                System.out.println("Maior: " + y);
            } else {
                System.out.println("Maior: " + z);
            }
        }
        else if (ex == 12) {
            System.out.print("Consumo em kWh: ");
            double kwh = ler.nextDouble();
            double conta = 0;
            
            if (kwh <= 100) {
                conta = kwh * 0.50;
            } else if (kwh <= 300) {
                conta = kwh * 0.75;
            } else {
                conta = kwh * 1.10;
            }
            
            System.out.println("Conta total: R$ " + conta);
        }
        
        ler.close();
    }
}

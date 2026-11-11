import java.util.Scanner;

public class Exercicio06 {
    public static int contarVogais(String texto) {
        String textoMinusculo = texto.toLowerCase();
        int quantidade = 0;
        for (int i = 0; i < textoMinusculo.length(); i++) {
            char letra = textoMinusculo.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                quantidade++;
            }
        }
        return quantidade;
    }
    public static void exibirContagem(String[] frases) {
        int indiceMaior = 0;
        for (int i = 0; i < frases.length; i++) {
            int totalVogais = contarVogais(frases[i]);
            System.out.println("frase " + (i + 1) + ": \"" + frases[i] + "\" - " + totalVogais + " vogais");
            if (totalVogais > contarVogais(frases[indiceMaior])) {
                indiceMaior = i;
            }
        }
        System.out.println("frase com mais vogais: \"" + frases[indiceMaior] + "\"");
    }
    public static void main(String[] args) {
        System.out.println("contagem de vogais");
        System.out.println("digite 3 frases");
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        String[] frases = new String[3];
        for (int i = 0; i < frases.length; i++) {
            System.out.print("frase " + (i + 1) + ": ");
            frases[i] = entrada.nextLine();
        }
        System.out.println();
        exibirContagem(frases);
        entrada.close();
    }
}

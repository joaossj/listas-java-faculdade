public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("Notas do aluno");
        System.out.println("O trecho vai mostrar a quantidade de notas, a primeira e a ultima nota.");
        System.out.println();
        double[] notas = {7.5, 6.0, 8.0, 5.5};
        System.out.println("Quantidade de notas: " + notas.length);
        System.out.println("Primeira nota: " + notas[0]);
        System.out.println("Ultima nota: " + notas[notas.length - 1]);
    }
}

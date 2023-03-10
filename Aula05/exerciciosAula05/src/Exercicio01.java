import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double notas[] = new double[15];
        double soma = 0;
        double media;

        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite as notas do aluno " + (i + 1) + ": ");
            notas[i] = leia.nextDouble();
            soma += notas[i];
        }

        media = soma / notas.length;
        System.out.println("A média geral dos alunos é: " + String.format("%.2f", media));

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double soma = 0;
        double media;
        double nota;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite a nota " + i + ":");
            nota = leia.nextDouble();
            soma += nota;
        }

        media = soma / 4;

        System.out.println("A média das notas é: " + media);

        if (media >= 6) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 5) {
            System.out.println("Aluno em recuperação!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
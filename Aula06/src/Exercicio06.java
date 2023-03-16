import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = leia.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o valor para o índice " + i + " do vetor: ");
            vetor[i] = leia.nextInt();
        }

        double soma = 0;
        double contador = 0;

        for (int i = 1; i < tamanho; i += 2) {
            soma += vetor[i];
            contador++;
        }
        double media = soma / contador;

        System.out.println("Média dos números em posições ímpares: " + media);
    }
}

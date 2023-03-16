import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = leia.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o valor do elemento " + i + " do vetor: ");
            vetor[i] = leia.nextInt();
        }

        int maior = vetor[0];
        int segundoMaior = vetor[0];

        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > maior) {
                segundoMaior = maior;
                maior = vetor[i];
            } else if (vetor[i] > segundoMaior && vetor[i] != maior) {
                segundoMaior = vetor[i];
            }
        }

        System.out.println("O segundo maior número do vetor é: " + segundoMaior);

    }
}

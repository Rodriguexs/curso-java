import java.util.Arrays;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = leia.nextInt();
        int vetor[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o valor do elemento " + i + " do vetor: ");
            vetor[i] = leia.nextInt();
        }

        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[i] < vetor[j]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }

        }

        System.out.println("Vetor em ordem decrescente: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetor[i] + "");
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = leia.nextInt();
        int vetor[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++){
            System.out.println("Digite o valor do elemento " + i + " do vetor: ");
            vetor[i] = leia.nextInt();
        }

        Arrays.sort(vetor);

        System.out.println("Vetor em ordem crescente: ");
        for (int i = 0; i < tamanho; i++){
            System.out.println(vetor[i] + "");
        }
    }
}

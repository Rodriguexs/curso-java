import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = leia.nextInt();

        int vetor[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor do elemento " + i + " do vetor: ");
            vetor[i] = leia.nextInt();
        }

        boolean ehPar = true;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] % 2 != 0) {
                ehPar = false;
            }
        }

        if (ehPar) {
            System.out.println("O vetor é par. Os números pares do vetor são:");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(vetor[i] + ", ");
            }
        } else {
            System.out.println("O vetor não é par.");
        }
    }
}

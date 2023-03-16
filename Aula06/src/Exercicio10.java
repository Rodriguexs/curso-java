import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        boolean saoIguais = true;

        System.out.print("Digite o tamanho do primeiro vetor: ");
        int tamanho1 = leia.nextInt();
        int primeiroVetor[] = new int[tamanho1];

        for (int i = 0; i < tamanho1; i++) {
            System.out.print("Digite o valor do elemento " + i + " do primeiro vetor: ");
            primeiroVetor[i] = leia.nextInt();
        }

        System.out.print("Digite o tamanho do segundo vetor: ");
        int tamanho2 = leia.nextInt();
        int segundoVetor[] = new int[tamanho2];

        for (int i = 0; i < tamanho2; i++) {
            System.out.print("Digite o valor do elemento " + i + " do segundo vetor: ");
            segundoVetor[i] = leia.nextInt();
        }

        if (tamanho1 != tamanho2) {
            saoIguais = false;
        } else {
            for (int i = 0; i < tamanho1; i++) {
                if (primeiroVetor[i] != segundoVetor[i]) {
                    saoIguais = false;
                }
            }
        }

        if (saoIguais) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores são diferentes.");
        }
    }
}

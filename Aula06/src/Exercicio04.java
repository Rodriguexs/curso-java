import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        //Faça um programa que lê um conjunto de números inteiros
        // do usuário e armazena esses números em um vetor. O programa deve então encontrar
        // e exibir o número de elementos no vetor que são maiores do que a média dos números no vetor.
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = leia.nextInt();
        int vetor[] = new int [tamanho];
        int maioresQueMedia = 0;
        double mediaVetor = 0;
        double soma = 0;

        for (int i = 0; i < tamanho; i++){
            System.out.println("Digite o valor do elemento " + i + " do vetor: ");
            vetor[i] = leia.nextInt();
            soma += vetor[i];
        }

        mediaVetor = soma / tamanho;

        for(int i = 0; i < tamanho; i++){
            if (vetor[i] > mediaVetor){
                maioresQueMedia++;
            }
        }

        System.out.println("Elementos maiores que a média dos números: " + maioresQueMedia);








    }
}

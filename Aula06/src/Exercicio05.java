import java.util.Arrays;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

//        Escreva um programa Java que lê dois vetores de números
//        inteiros e exibe o vetor resultante da interseção entre
//        eles (ou seja, os números que aparecem nos dois vetores).


        System.out.println("Digite o tamanho do primeiro vetor: ");
        int tamanhoUm = leia.nextInt();

        System.out.println("Digite o tamanho do segundo vetor: ");
        int tamanhoDois = leia.nextInt();

        int primeiroVetor[] = new int[tamanhoUm];
        int segundoVetor[] = new int[tamanhoDois];

        for (int i = 0; i < tamanhoUm; i++){
            System.out.println("Digite o valor do elemento " + i + " do primeiro vetor: ");
            primeiroVetor[i] = leia.nextInt();
        }

        for (int i = 0; i < tamanhoUm; i++){
            System.out.println("Digite o valor do elemento " + i + " do segundo vetor: ");
            segundoVetor[i] = leia.nextInt();
        }

        Arrays.sort(primeiroVetor);
        Arrays.sort(segundoVetor);

        int tamanhoIntersecao;
        int intersecao[];

        if(tamanhoUm <= tamanhoDois){
            intersecao = new int[tamanhoUm];
        } else {
            intersecao = new int[tamanhoDois];
        }
        tamanhoIntersecao = 0;

        int i = 0;
        int j = 0;

        while (i < tamanhoUm && j < tamanhoDois){
            if (primeiroVetor[i] == segundoVetor[j]){
                intersecao[tamanhoIntersecao] = primeiroVetor[i];
                tamanhoIntersecao++;
                i++;
                j++;
            } else if (primeiroVetor[i] < segundoVetor[j]){
                i++;
            } else {
                j++;
            }
        }

        System.out.println("Vetor de interseção: ");
        for (int temp = 0; temp < tamanhoIntersecao; temp++){
            System.out.print(intersecao[temp] + ", ");
        }







    }
}

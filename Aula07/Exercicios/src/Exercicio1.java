import java.util.Scanner;

public class Exercicio1 {

//    Faça um programa que leia a dimensão de uma matriz de inteiros M e N, onde M é
//    o número de linhas e N é o número de colunas. A seguir, leia os elementos da matriz,
//    conte e escreva quantos valores maiores que 10 ela possui.

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int qtdLinhas, qtdColunas;
        int maiorQueDez = 0;

        System.out.println("Digite a quantidade de linhas da matriz: ");
        qtdLinhas = leia.nextInt();

        System.out.println("Digite a quantidade de colunas da matriz: ");
        qtdColunas = leia.nextInt();

        int matriz[][] = new int[qtdLinhas][qtdColunas];

        for (int linha = 0; linha < qtdLinhas; linha++){
            for (int coluna = 0; coluna < qtdColunas; coluna++){
                System.out.println("Digite o valor da linha " + linha + " da coluna " + coluna);
                matriz[linha][coluna] = leia.nextInt();
            }
        }

        for (int linha = 0; linha < qtdLinhas; linha++){
            for (int coluna = 0; coluna < qtdColunas; coluna++){
                System.out.print(" " + matriz[linha][coluna] + " ");
                if (matriz[linha][coluna] > 10){
                    maiorQueDez++;
                }
            }
            System.out.println();
        }

        System.out.println("Existem " + maiorQueDez + " elementos maiores que dez!");
    }
}

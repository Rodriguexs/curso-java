import java.util.Scanner;

public class Exercicio3 {

//    Escreva um programa que cria uma matriz 2x3 de inteiro.
//    Em seguida, calcule a média dos elementos de cada linha e exiba os resultados.

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int qtdLinhas = 2, qtdColunas = 3;
        int matriz[][] = new int[qtdLinhas][qtdColunas];
        double soma = 0;
        double media;

        for (int linha = 0; linha < qtdLinhas; linha++){
            for (int coluna = 0; coluna < qtdColunas; coluna++){
                System.out.println("Digite o valor do elemento da linha " + linha + " coluna " + coluna + ": ");
                matriz[linha][coluna] = leia.nextInt();
            }
        }

        for (int linha = 0; linha < qtdLinhas; linha++){
            for (int coluna = 0; coluna < qtdColunas; coluna++){
                System.out.print(" " + matriz[linha][coluna] + " ");
                soma += matriz[linha][coluna];
            }
            System.out.println();
            media = soma / matriz[linha].length;
            System.out.println("A média da linha " + (linha+1) + " é: " + String.format("%.2f", media));
        }
    }
}

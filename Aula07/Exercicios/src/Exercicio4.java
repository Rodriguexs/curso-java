import java.util.Scanner;

public class Exercicio4 {

//    Escreva um programa que cria uma matriz 3x3de inteiros.
//    Em seguida, calcule a soma dos elementos de cada linha e
//    de cada coluna e exiba os resultados.

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int qtdLinhas = 3, qtdColunas = 3;
        int matriz[][] = new int[qtdLinhas][qtdColunas];
        int somaLinhas[] = new int[3];
        int somaColunas[] = new int[3];

        for (int linha = 0; linha < qtdLinhas; linha++){
            for (int coluna = 0; coluna < qtdColunas; coluna++){
                System.out.println("Digite o valor da linha " + linha + " da coluna " + coluna);
                matriz[linha][coluna] = leia.nextInt();
            }
        }

        for (int linha = 0; linha < qtdLinhas; linha++){
            for (int coluna = 0; coluna < qtdColunas; coluna++){
                System.out.print(" " + matriz[linha][coluna] + " ");
                somaLinhas[linha] += matriz[linha][coluna];
                somaColunas[coluna] += matriz[linha][coluna];
            }
            System.out.println();
        }

        for (int linha = 0; linha < somaLinhas.length; linha++){
            System.out.println("A soma da linha " + (linha+1) + " é: " + somaLinhas[linha]);
        }

        for (int coluna = 0; coluna < somaColunas.length; coluna++){
            System.out.println("A soma da coluna " + (coluna+1) + " é: " + somaColunas[coluna]);
        }
    }
}

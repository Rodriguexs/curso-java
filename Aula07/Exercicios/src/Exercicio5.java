import java.util.Scanner;

public class Exercicio5 {

//    Escreva um programa que cria uma matriz 3x3de inteiros.
//    Em seguida, encontre a posição do maior valor na matriz
//    e exiba as coordenadas.

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int qtdLinhas = 3, qtdColunas = 3;
        int matriz[][] = new int[qtdLinhas][qtdColunas];
        int maiorValor = 0;

        for (int linha = 0; linha < qtdLinhas; linha++){
            for (int coluna = 0; coluna < qtdColunas; coluna++){
                System.out.println("Digite o valor da linha " + linha + " da coluna " + coluna);
                matriz[linha][coluna] = leia.nextInt();
            }
        }

        for (int linha = 0; linha < qtdLinhas; linha++){
            for (int coluna = 0; coluna < qtdColunas; coluna++){
                System.out.print(" " + matriz[linha][coluna] + " ");
                if (matriz[linha][coluna] > maiorValor){
                    maiorValor = matriz[linha][coluna];
                }
            }
            System.out.println();
        }
        System.out.println("O elemento de maior valor na matriz é: " + maiorValor);
    }
}

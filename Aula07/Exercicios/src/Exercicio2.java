import java.util.Scanner;

public class Exercicio2 {

//    Faça um programa que leia a dimensão de uma matriz quadrada N. A seguir,
//    leia os elementos da matriz. Faça um programa que verifique se essa matriz é diagonal.
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int qtdLinhas = 0, qtdColunas = 0;

        System.out.println("Digite a quantidade de linhas da matriz: ");
        qtdLinhas = leia.nextInt();

        System.out.println("Digite a quantidade de colunas da matriz: ");
        qtdColunas = leia.nextInt();

        int matriz[][] = new int[qtdLinhas][qtdColunas];
        boolean diagonal = true;

        for (int linha = 0; linha < qtdLinhas; linha++){
            for (int coluna = 0; coluna < qtdColunas; coluna++){
                System.out.println("Digite o valor da linha " + linha + " e da coluna " + coluna + ": ");
                matriz[linha][coluna] = leia.nextInt();
            }
        }


        for (int linha = 0; linha < qtdLinhas; linha++){
            for (int coluna = 0; coluna < qtdColunas; coluna++){
                System.out.print(" " + matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

        for (int linha = 0; linha < qtdLinhas; linha++){
            for (int coluna = 0; coluna < qtdColunas; coluna++){
                if (linha != coluna && matriz[linha][coluna] != 0){
                    diagonal = false;
                }
            }
        }
        if(diagonal == true){
            System.out.println("Essa matriz é diagonal!");
        } else {
            System.out.println("Essa matriz não é diagonal!");
        }
    }
}

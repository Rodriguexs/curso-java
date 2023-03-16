import java.util.Scanner;

public class Exercicio01 {

//    Crie um programa que preencha todos os valores
//    de uma matriz 2x2, e em seguida exiba todos os valores
//    e a soma de todos os valores. EXIBIR EM FORMA DE MATRIZ!
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int qtdColunas = 2, qtdLinhas = 2;
        int matriz[][] = new int[qtdColunas][qtdLinhas];
        int soma = 0;

        for (int linha = 0; linha < qtdLinhas; linha++){
            for(int coluna = 0; coluna < qtdColunas; coluna++){
                System.out.println("Informe o valor da linha " + linha + " da coluna " + coluna);
                matriz[linha][coluna] = leia.nextInt();
                soma += matriz[linha][coluna];
            }
        }
        for (int linha = 0; linha < qtdLinhas; linha++){
            for (int coluna = 0; coluna < qtdColunas; coluna++){
                System.out.print(" " + matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
        System.out.println("Soma dos valores: " + soma);

    }
}
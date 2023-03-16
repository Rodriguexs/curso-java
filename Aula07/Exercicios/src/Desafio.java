import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int qtdLinhas = 3, qtdColunas = 3;
        int matriz[][] = new int[qtdLinhas][qtdColunas];

        for (int linha = 0; linha < qtdLinhas; linha++){
            for (int coluna = 0; coluna < qtdColunas; coluna++){
                System.out.println("Digite o valor da linha " + linha + " da coluna " + coluna);
                matriz[linha][coluna] = leia.nextInt();
            }
        }

        System.out.println("Matriz com os valores informados: ");
        for (int linha = 0; linha < qtdLinhas; linha++){
            for (int coluna = 0; coluna < qtdColunas; coluna++){

                System.out.print(" " + matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < qtdLinhas * qtdColunas - 1; i++) {
            int menorValor = i;
            for (int j = i + 1; j < qtdLinhas * qtdColunas; j++) {
                int linha1 = menorValor / qtdColunas;
                int coluna1 = menorValor % qtdColunas;
                int linha2 = j / qtdColunas;
                int coluna2 = j % qtdColunas;
                if (matriz[linha2][coluna2] < matriz[linha1][coluna1]) {
                    menorValor = j;
                }
            }
            int temp = matriz[menorValor / qtdColunas][menorValor % qtdColunas];
            matriz[menorValor / qtdColunas][menorValor % qtdColunas] = matriz[i / qtdColunas][i % qtdColunas];
            matriz[i / qtdColunas][i % qtdColunas] = temp;
        }

        System.out.println("Matriz ordenada em ordem cresecnte: ");
        for (int linha = 0; linha < qtdLinhas; linha++){
            for (int coluna = 0; coluna < qtdColunas; coluna++){
                System.out.print(" " + matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}

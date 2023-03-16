import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int elementos = 0;

        int qtdPares = 0;
        int somaImpares = 0;

        System.out.println("Digite a quantidade de elementos: ");
        elementos = leia.nextInt();

        int vetor[] = new int[elementos];

        for (int i = 0; i < elementos; i++){
            System.out.println("Digite o valor do elemento " + i);
            vetor[i] = leia.nextInt();
        }

        for (int i = 0; i < elementos; i++){
            if (vetor[i] % 2 == 0){
                qtdPares++;
            } else {
                somaImpares += vetor[i];
            }
        }

        System.out.println("Quantidade dos pares: " + qtdPares);
        System.out.println("Soma dos Impares: " + somaImpares);


    }
}

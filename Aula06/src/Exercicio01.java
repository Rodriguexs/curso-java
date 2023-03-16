import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a quantidade de elementos do vetor: ");
        int elementos = leia.nextInt();
        int valor;
        int vetor[] = new int[elementos];
        int indice;

        System.out.println("Digite o valor do elemento: ");
        for (int i = 0; i < elementos; i++){
            vetor[i] = leia.nextInt();
        }

        System.out.println("Digite o valor do elemento a ser procurado: ");
        valor = leia.nextInt();

        indice = -1;

        for (int i = 0; i < elementos; i++){
            if (vetor[i] == valor){
                indice = i;
            }
        }

        System.out.println("O número da posição do elemento é: " + indice);

    }
}
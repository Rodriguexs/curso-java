import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);


        int elementos;
        System.out.println("Digite a quantidade de elementos: ");
        elementos = leia.nextInt();

        int vetor[] = new int[elementos];
        int indiceMenorElemento = 0;
        int menorElemento = 0;


        for (int i = 0; i < elementos; i++){
            System.out.println("Digite um elemento: ");
            vetor[i] = leia.nextInt();
        }
        for (int i = 0; i < elementos; i++){
            if (vetor[i] < menorElemento){
                indiceMenorElemento = i;
            }
        }

        vetor[0] = vetor[indiceMenorElemento];
        vetor[indiceMenorElemento] = menorElemento;


        System.out.println("Valor resultante: ");
        for (int i = 0; i < elementos; i++){
            System.out.print(vetor[i] + " ");
        }


    }
}

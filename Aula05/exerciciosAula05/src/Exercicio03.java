import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int matrizA[] = new int[8];
        int matrizB[] = new int[8];

        for (int i = 0; i < matrizA.length; i++){
            System.out.println("Digite um número: ");
            matrizA[i] = leia.nextInt();
            matrizB[i] = matrizA[i] * 3;
        }

        System.out.println("Matriz B: ");
        for (int i = 0; i < matrizB.length; i++){
            System.out.print(matrizB[i] + ", ");
        }


    }
}

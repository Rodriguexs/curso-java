import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numeros[] = new int[15];
        int impares[] = new int[15];
        int pares[] = new int[15];

        int qtdPares = 0;
        int qtdImpares = 0;

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite um número: ");
            numeros[i] = leia.nextInt();

            if (numeros[i] % 2 == 0){
                pares[qtdPares] = numeros[i];
                qtdPares++;
            } else {
                impares[qtdImpares] = numeros[i];
                qtdImpares++;
            }
        }

        System.out.println("Números pares: ");
        for (int i = 0; i < qtdPares; i++){
            System.out.print(pares[i] + ", ");
        }
        System.out.println("");

        System.out.println("Números ímpares: ");
        for (int i = 0; i < qtdImpares; i++){
            System.out.print(impares[i] + ", ");
        }
    }
}

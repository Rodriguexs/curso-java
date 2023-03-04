import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = leia.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número " + numero + " é par!");
        } else {
            System.out.println("O número " + numero + " é ímpar!");
        }
    }
}
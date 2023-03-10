import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;
        int i;

        System.out.print("Digite um número para ver sua tabuada de multiplicação: ");
        numero = leia.nextInt();

        for (i = 1; i <= 50; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }
    }
}
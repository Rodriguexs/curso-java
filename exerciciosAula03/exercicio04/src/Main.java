import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int produtoImpar = 1;
        int somaPar = 0;
        int numero;

        System.out.print("Digite um número inteiro e positivo (ou 0 para parar): ");
        numero = leia.nextInt();

        while (numero > 0) {
            if (numero % 2 == 0) {
                somaPar += numero;
            } else {
                produtoImpar *= numero;
            }

            System.out.print("Digite outro número inteiro e positivo (ou 0 para parar): ");
            numero = leia.nextInt();
        }

        System.out.println("O produto dos números ímpares é: " + produtoImpar);
        System.out.println("A soma dos números pares é: " + somaPar);

    }
}
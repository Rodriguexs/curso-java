import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int maior = 0;
        int menor = 0;
        int valor;

        for (int i = 1; i <= 15; i++) {
            System.out.println("Digite o " + i + " valor:");
            valor = leia.nextInt();

            if (i == 1) {
                maior = valor;
                menor = valor;
            } else {
                if (valor > maior) {
                    maior = valor;
                }

                if (valor < menor) {
                    menor = valor;
                }
            }
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
    }
}

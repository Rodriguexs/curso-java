import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int palpites;
        int numero;
        int numerosMaiorQueOito = 0;

        for (palpites = 1; palpites <= 20; palpites++){
            System.out.println("Digite um número: ");
            numero = leia.nextInt();

            if (numero > 8){
                numerosMaiorQueOito++;
            }
        }

        System.out.println("Você digitou " + numerosMaiorQueOito + " números maior que 8.");
    }
}
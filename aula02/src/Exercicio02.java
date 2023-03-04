import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = leia.nextInt();

        System.out.println("Digite o terceiro número: ");
        int terceiroNumero = leia.nextInt();

        if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero){
            System.out.println("O maior número é: " + primeiroNumero);
        } else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero){
            System.out.println("O maior número é: " + segundoNumero);
        } else {
            System.out.println("O maior número é: " + terceiroNumero);
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;
        int terceiroNumero;

        System.out.println("Digite o primeiro número: ");
        primeiroNumero = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        segundoNumero = leia.nextInt();

        System.out.println("Digite o terceiro número: ");
        terceiroNumero = leia.nextInt();

        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero){
            if(segundoNumero > terceiroNumero){
                System.out.println(primeiroNumero + ", " + segundoNumero + ", " + terceiroNumero);
            } else {
                System.out.println(primeiroNumero + ", " + terceiroNumero + ", " + segundoNumero);
            }
        }
        if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero){
            if (primeiroNumero > terceiroNumero){
                System.out.println(segundoNumero + ", " + primeiroNumero + ", " + terceiroNumero);
            } else {
                System.out.println(segundoNumero + ", " + terceiroNumero + ", " + primeiroNumero);
            }
        }
        if (terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero){
            if(primeiroNumero > segundoNumero){
                System.out.println(terceiroNumero + ", " + primeiroNumero + ", " + segundoNumero);
            } else {
                System.out.println(terceiroNumero + ", " + segundoNumero + ", " + primeiroNumero);
            }
        }
    }
}
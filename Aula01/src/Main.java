import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Por favor insira o valor do primeiro número: ");
        numero1 = leia.nextInt();

        System.out.println("Por favor insira o valor do segundo número: ");
        numero2 = leia.nextInt();


        int soma = numero1 + numero2;
        int multi = numero1 * numero2;
        int div = numero1 / numero2;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A multiplicação dos números é: " + multi);
        System.out.println("A divisão dos números é: " + div);




    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double lado1;
        double lado2;
        double lado3;

        System.out.println("Informe o valor do primeiro lado: ");
        lado1 = leia.nextDouble();

        System.out.println("Informe o valor do segundo lado: ");
        lado2 = leia.nextDouble();

        System.out.println("Informe o valor do terceiro lado: ");
        lado3 = leia.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
            if (lado1 == lado2 && lado2 == lado3){
                System.out.println("Triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Triângulo isósceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }
        } else {
            System.out.println("Os lados informados não podem formar um triângulo.");
        }

    }
}
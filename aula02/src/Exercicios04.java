import java.util.Scanner;

public class Exercicios04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 1 para calcular a área do quadrado");
        System.out.println("Digite 2 para calcular a área do retângulo");
        System.out.println("Digite 3 para calcular a área do circulo");
        int formaEscolhida = leia.nextInt();

        switch (formaEscolhida){
            case 1: {
                System.out.println("Digite o tamanho do lado do quadrado");
                 double ladoQuadrado = leia.nextDouble();
                 double areaQuadrado = ladoQuadrado * ladoQuadrado;
                System.out.println("A área do quadrado é: " + areaQuadrado); break;
            }
            case 2: {
                System.out.println("Digite a base do retângulo: ");
                double baseRetangulo = leia.nextDouble();
                System.out.println("Digite a altura do retângulo: ");
                double alturaRetangulo = leia.nextDouble();
                double areaRetangulo = baseRetangulo * alturaRetangulo;
                System.out.println("A área do retângulo é: " + areaRetangulo); break;
            }
            case 3: {
                System.out.println("Digite o raio do circulo: ");
                double raioCirculo = leia.nextDouble();
                double areaCirculo = Math.PI * raioCirculo * raioCirculo;
                System.out.println("A área do ciurculo é: " + areaCirculo); break;
            }
            default:{
                System.out.println("Opção inválida");
            }
        }
    }
}

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a nota da primeira prova: ");
        double primeiraProva = leia.nextDouble();

        System.out.println("Digite a nota da segunda prova: ");
        double segundaProva = leia.nextDouble();

        System.out.println("Digite a nota da terceira prova: ");
        double terceiraProva = leia.nextDouble();

        System.out.println("Digite a nota da quarta prova: ");
        double quartaProva = leia.nextDouble();

        double media = (primeiraProva + segundaProva + terceiraProva + quartaProva) / 4;

        System.out.println("Sua média é: " + media);

        if (media >= 6){
            System.out.println("Parabéns! você foi aprovado :)");
        } else {
            System.out.println("Você foi reprovado! :(");
        }
    }
}

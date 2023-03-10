import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double altura, maiorAltura = 0, menorAltura = 0;
        int sexo, contMulheres = 0;
        double somaAlturaMulheres = 0, somaAlturaTotal = 0;
        double mediaAlturaMulheres;
        double mediaAlturaTotal;


        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite a altura da pessoa " + i + ":");
            altura = leia.nextDouble();

            System.out.println("Digite o sexo da pessoa " + i + " (0 = masculino, 1 = feminino):");
            sexo = leia.nextInt();

            if (altura > maiorAltura || i == 1) {
                maiorAltura = altura;
            }

            if (altura < menorAltura || i == 1) {
                menorAltura = altura;
            }

            somaAlturaTotal += altura;

            if (sexo == 1) {
                somaAlturaMulheres += altura;
                contMulheres++;
            }
        }

        mediaAlturaMulheres = somaAlturaMulheres / contMulheres;
        mediaAlturaTotal = somaAlturaTotal / 5;

        System.out.println("Maior altura encontrada: " + maiorAltura);
        System.out.println("Menor altura encontrada: " + menorAltura);
        System.out.println("Média de altura das mulheres: " + String.format("%.2f", mediaAlturaMulheres));
        System.out.println("Média de altura da população: " + String.format("%.2f", mediaAlturaTotal));
    }
}

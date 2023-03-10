import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            int opcao = -1;
            double numero1;
            double numero2;

            while (opcao != 0) {
                System.out.println("Selecione uma opção:");
                System.out.println("1 Somar");
                System.out.println("2 Subtrair");
                System.out.println("3 Multiplicar");
                System.out.println("4 Dividir");
                System.out.println("0 Encerrar calculadora");

            opcao = leia.nextInt();

                if (opcao == 0) {
                    System.out.println("Encerrando a calculadora...");
                } else if (opcao >= 1 && opcao <= 4) {
                    System.out.println("Digite o primeiro número:");
                    numero1 = leia.nextDouble();
                    System.out.println("Digite o segundo número:");
                    numero2 = leia.nextDouble();

                    while (opcao == 4 && numero2 == 0) {
                        System.out.println("Não é possível dividir por zero. Digite um valor válido para o segundo número:");
                        numero2 = leia.nextDouble();
                    }

                    switch (opcao) {
                            case 1:
                                System.out.println(numero1 + " + " + numero2 + " = " + String.format("%.2f", numero1 + numero2));
                                break;
                            case 2:
                                System.out.println(numero1 + " - " + numero2 + " = " + String.format("%.2f", numero1 - numero2));
                                break;
                            case 3:
                                System.out.println(numero1 + " * " + numero2 + " = " + String.format("%.2f", numero1 * numero2));
                                break;
                            case 4:
                                System.out.println(numero1 + " / " + numero2 + " = " + String.format("%.2f", numero1 / numero2));
                                break;
                        }
                            } else {
                                System.out.println("Opção inválida.");
            }
        }
    }
}

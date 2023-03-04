import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double salarioAtual, percentualAumento, valorAumento, novoSalario;

        System.out.print("Digite o salário atual do colaborador: R$ ");
        salarioAtual = leia.nextDouble();


        if (salarioAtual <= 280) {
            percentualAumento = 20;
        } else if (salarioAtual <= 700) {
            percentualAumento = 15;
        } else if (salarioAtual <= 1500) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }

        valorAumento = salarioAtual * percentualAumento / 100;
        novoSalario = salarioAtual + valorAumento;

        System.out.printf("Salário antes do reajuste: R$ %.2f%n", salarioAtual);
        System.out.printf("Percentual de aumento aplicado: %.0f%%%n", percentualAumento);
        System.out.printf("Valor do aumento: R$ %.2f%n", valorAumento);
        System.out.printf("Novo salário após o aumento: R$ %.2f%n", novoSalario);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

    double valorHora;
    double horasTrabalhadas;
    double salarioBruto;
    double fgts;
    double inss;
    double ir;
    double totalDescontos;
    double salarioLiquido;

        System.out.print("Digite o valor da hora trabalhada: ");
                valorHora = leia.nextDouble();

                System.out.print("Digite a quantidade de horas trabalhadas: ");
                horasTrabalhadas = leia.nextDouble();

                salarioBruto = valorHora * horasTrabalhadas;
                fgts = salarioBruto * 0.11;
                inss = salarioBruto * 0.10;
                ir = 0;

                if (salarioBruto <= 900) {
                ir = 0;
                } else if (salarioBruto <= 1500) {
                ir = salarioBruto * 0.05;
                } else if (salarioBruto <= 2500) {
                ir = salarioBruto * 0.10;
                } else {
                ir = salarioBruto * 0.20;
                }

                totalDescontos = ir + inss + (salarioBruto * 0.03);
                salarioLiquido = salarioBruto - totalDescontos;

                System.out.printf("Salário bruto (%.2f * %.2f): R$ %.2f%n", valorHora, horasTrabalhadas, salarioBruto);
                System.out.printf("(–) IR (%.0f%%): R$ %.2f%n", (ir/salarioBruto)*100, ir);
                System.out.printf("(–) INSS (10%%): R$ %.2f%n", inss);
                System.out.printf("FGTS (11%%): R$ %.2f%n", fgts);
                System.out.printf("Total de descontos: R$ %.2f%n", totalDescontos);
                System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);
                }
                }

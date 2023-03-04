import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numConta = leia.nextInt();

        System.out.println("Digite o saldo da conta: ");
        double saldo = leia.nextDouble();

        System.out.println("Digite o débito da conta: ");
        double debito = leia.nextDouble();

        System.out.println("Digite o crédito da conta: ");
        double credito = leia.nextDouble();

        double saldoAtual = saldo - debito + credito;

        System.out.println("O saldo atual da conta número " + numConta + " é: " + saldoAtual);

    }
}
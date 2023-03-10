import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        int numeroAtual = 1;
        int numeroAnterior = 0;
        int proximoNumero;
        int numeroLimite;

        System.out.println("Digite um número limite para que seja gerada uma sequência Fibonacci até o valor escolhido: ");
        numeroLimite = leia.nextInt();

        while(numeroAtual <= numeroLimite){
            System.out.print(numeroAtual + ", ");
            proximoNumero = numeroAnterior + numeroAtual;
            numeroAnterior = numeroAtual;
            numeroAtual = proximoNumero;

        }
    }
}
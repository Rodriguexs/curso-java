import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a hora do início do jogo: ");
        int horaInicio = leia.nextInt();

        System.out.println("Digite a hora do fim do jogo: ");
        int horaFinal = leia.nextInt();

        int duracao = 0;

        if(horaInicio < horaFinal){
            duracao = horaFinal - horaInicio;
        } else {
            duracao = 24 - horaInicio + horaFinal;
        }

        System.out.println("A duração do jogo foi de " + duracao + " horas");
    }
}
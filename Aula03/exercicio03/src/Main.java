import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int idade;
        int tempoTrabalho;

        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();

        System.out.println("Informe seu tempo de serviço em anos: ");
        tempoTrabalho = leia.nextInt();

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)){
            System.out.println("Parabéns, você já pode se aposentar!");
        } else {
            System.out.println("Rai trabaia vagabundo!");
        }

    }
}
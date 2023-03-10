import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int quantidadeAlunos;
        int alunos;
        int adultos = 0;

        for(alunos = 1; alunos <= 20; alunos++){
            System.out.println("Digite a idade de cada um dos 20 alunos: " );
            quantidadeAlunos = leia.nextInt();

            if (quantidadeAlunos >= 18){
                adultos++;
            }
        }

        System.out.println("Nesta classe tem " + adultos + " alunos maiores de idade.");
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int quantidadePerguntas;
        int idade;
        int menorIdade = 2147483647;
        String nome;
        String nomeMenorIdade = "";

        for (quantidadePerguntas = 1; quantidadePerguntas <= 10; quantidadePerguntas++) {
            System.out.println("Digite o nome: ");
            nome = leia.next();

            System.out.println("Digite a idade: ");
            idade = leia.nextInt();

            if (idade < menorIdade || quantidadePerguntas == 1){
                menorIdade = idade;
                nomeMenorIdade = nome;
            }
        }

        System.out.println("O " + nomeMenorIdade + " é o mais novo, com " + menorIdade + " anos.");
    }
}
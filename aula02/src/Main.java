import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();

        if (idade >= 18){
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
    }
}
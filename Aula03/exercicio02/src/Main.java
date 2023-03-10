import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = leia.nextInt();

        if (idade <= 10){
            System.out.println("Você deverá pagar R$ 30,00");
        } else if (idade > 10 && idade <= 29){
            System.out.println("Você deverá pagar R$ 60,00");
        } else if (idade > 29 && idade <= 45) {
            System.out.println("Você deverá pagar R$ 120,00");
        } else if (idade > 45 && idade <= 59) {
            System.out.println("Você deverá pagar R$ 150,00");
        } else {
            System.out.println("Você deverá pagar R$ 300,00");
        }


    }
}
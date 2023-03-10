import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int totalA = 0;
        int totalB = 0;
        int totalC = 0;
        String elevador = "";

        for (int i = 1; i <= 10; i++){
            System.out.println("Morador " + i + ", qual elevador está usando? (A, B ou C)");
            elevador = leia.next();

            switch (elevador){
                case "A":
                    totalA++; break;
                case "B":
                    totalB++; break;
                case "C":
                    totalC++; break;
                default:
                    System.out.println("Opção inválida."); i--; break;
            }
        }

        System.out.println("Total de pessoas que usam o elevador A: " + totalA);
        System.out.println("Total de pessoas que usam o elevador B: " + totalB);
        System.out.println("Total de pessoas que usam o elevador C: " + totalC);
    }
}

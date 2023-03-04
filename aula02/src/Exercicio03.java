import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        int codigoProduto = leia.nextInt();

        switch (codigoProduto){
            case 1: {
                System.out.println("Alimento não-perecível"); break;
            }
            case 2:
            case 3:
            case 4: {
                System.out.println("Alimento perecível"); break;
            }
            case 5:
            case 6: {
                System.out.println("Vestuário"); break;
            }
            case 7: {
                System.out.println("Higiene Pessoal");
            }
            case 8:
            case 9:
            case 10: {
                System.out.println("Utensílios domésticos"); break;
            }

            default: {
                System.out.println("Código inválido"); break;
            }
        }

    }
}

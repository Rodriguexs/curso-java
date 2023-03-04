import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double primeiroProduto;
        double segundoProduto;
        double terceiroProduto;

        System.out.println("Informe o valor do primeiro produto: ");
        primeiroProduto = leia.nextDouble();

        System.out.println("Informe o valor do segundo produto: ");
        segundoProduto = leia.nextDouble();

        System.out.println("Informe o valor do terceiro produto: ");
        terceiroProduto = leia.nextDouble();

        if (primeiroProduto < segundoProduto && primeiroProduto < terceiroProduto){
            System.out.println("Você deve comprar o primeiro produto!");
        } else if (segundoProduto < primeiroProduto && segundoProduto < terceiroProduto) {
            System.out.println("Você deve comprar o segundo produto!");
        } else {
            System.out.println("Você deve comprar o terceiro produto");
        }
    }
}
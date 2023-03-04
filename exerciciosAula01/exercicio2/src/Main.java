public class Main {
    public static void main(String[] args) {
        double alturaMarido = 1.89;
        double alturaEsposa = 1.64;
        double pesoIdealMarido = (72.7 * alturaMarido) - 58;
        double pesoIdealEsposa = (62.1 * alturaEsposa) - 44.7;

        String pesoIdealFormatadoHomem = String.format("%.1f", pesoIdealMarido);
        System.out.println("O peso ideal para o homem é: " + pesoIdealFormatadoHomem + "kg");

        String pesoIdealFormatadoMulher = String.format("%.1f", pesoIdealEsposa);
        System.out.println("O peso ideal para a mulher é: " + pesoIdealFormatadoMulher + "kg");
    }
}
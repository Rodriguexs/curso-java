public class Decrescente {
    public static void main(String[] args) {

        int numero = 100;

        System.out.println("Usando Do: ");

        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 0);

        System.out.println("Usando While: ");

        numero = 100;

        while (numero >= 0){
            System.out.println(numero);
            numero--;
        }

        System.out.println("Usando for: ");

        for (int contador = 100; contador >= 0; contador--){
            System.out.println(contador);
        }
    }
}

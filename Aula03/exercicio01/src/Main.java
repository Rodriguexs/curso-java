public class Main {
    public static void main(String[] args) {
        int numero = 0;

        do{
            System.out.println(numero);
            numero++;
        }while (numero <= 100);

        while (numero <= 100){
            System.out.println(numero);
            numero++;
        }

        for (int contador = 0; contador <= 100; contador++){
            System.out.println(contador);
        }
    }
}
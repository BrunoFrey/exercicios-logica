import java.util.Random;

public class Exercicio6 {
    public static void main(String[] args) {
        Random random = new Random();

        int maior = 0;
        int menor = 100;

        System.out.println("Números gerados:");

        for (int i = 1; i <= 10; i++) {
            int numero = random.nextInt(101);
            System.out.print(numero + " ");

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println();
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}

import java.util.Random;

public class Exercicio6 {
    public static void main(String[] args) {
        Random random = new Random(); // gera números aleatórios

        int maior = 0;
        int menor = 100;

        System.out.println("Números gerados:");

        for (int i = 1; i <= 10; i++) {
            int numero = random.nextInt(101); // nao tem o +1 pq é 0 a 100
            System.out.print(numero + " ");

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println(); // pula linha
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}

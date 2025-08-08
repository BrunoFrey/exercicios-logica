import java.util.Scanner;

public class Exercício9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número limite para a sequência: ");
        int limite = scanner.nextInt();

        int primeiro = 0;
        int segundo = 1;

        System.out.println("Série de Fibonacci até " + limite + ":"); // !

        while (primeiro <= limite) {
            System.out.print(primeiro + " ");

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        scanner.close();
    }
}

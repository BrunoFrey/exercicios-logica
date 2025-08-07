import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos números da sequência deseja ver: ");
        int numero = scanner.nextInt();

        int primeiro = 0;
        int segundo = 1;

        System.out.println("Série de Fibonacci:");

        for (int i = 0; i < numero; i++) {
            System.out.print(primeiro + " ");

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        scanner.close();
    }
}

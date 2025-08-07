import java.util.Scanner;

public class Exercício8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        while (numero != 10) {
            System.out.print("Digite um número:");
            numero = scanner.nextInt();
        }

        System.out.println("Você digitou 10. Programa encerrado.");
        scanner.close();
    }
}

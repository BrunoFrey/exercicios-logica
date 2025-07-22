import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt(); // le um número inteiro digitado

        if (idade >= 18) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade.");
        }

        sc.close();
    }
}


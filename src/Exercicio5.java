import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}

// for é responsável por repetir
// declara a variavel i como int e coloca i <= 10; pra for fazer repetir de 1 a 10
// i++ , significa que ele começa como 1 e vai repetindo 1,2,3,4,5... ate o 10
// quando o i++ chega no 11 ele para, por conta do i <= 10;

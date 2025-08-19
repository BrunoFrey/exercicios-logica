import java.util.Scanner;

public class Exercício13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = calcularMedia(nota1, nota2);     // M1

        System.out.println("Média: " + media);

        verificarStatus(media);                        // M2

        scanner.close();
    }


    public static double calcularMedia(double a, double b) {
        return (a + b) / 2;    //resultado pro M media
    }


    public static void verificarStatus(double media) {
        if (media > 6) {
            System.out.println("Aprovado");
        } else if (media >= 4) {
            System.out.println("Verificação Suplementar");
        } else {
            System.out.println("Reprovado");
        }
    }
}

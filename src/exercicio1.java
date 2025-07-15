import java.util.Scanner; //usada para ler as entradas do usuario //biblioteca

public class exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // cria o scanner, para ler oque o usuario digita no teclado

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt(); // le um número inteiro digitado

        if (idade >= 18) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade.");
        }

        entrada.close(); // fecha o scanner
    }
}


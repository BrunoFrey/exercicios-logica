import java.util.Scanner;
import java.util.Random;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Digite 1 para Pedra");
        System.out.println("Digite 2 para Papel");
        System.out.println("Digite 3 para Tesoura");
        int jogador = sc.nextInt(); // espere o usuario digitar um numero e apertar enter// o numero digitado sera armazenado na variavel jogador

        int maquina = r.nextInt(3) + 1; // 1, 2 ou 3 aleatório // apos o usuario escolher 1 2 3 a maquina vai gerar um numero 1,2 ou 3

        if (maquina == 1) {
            System.out.println("Máquina jogou Pedra");
        }
        if (maquina == 2) {
            System.out.println("Máquina jogou Papel");
        }
        if (maquina == 3) {
            System.out.println("Máquina jogou Tesoura");
        }

        if (jogador == maquina) {
            System.out.println("Empate");
        } else if (jogador == 1 && maquina == 3) {
            System.out.println("Você ganhou! Pedra quebra Tesoura");
        } else if (jogador == 2 && maquina == 1) {
            System.out.println("Você ganhou! Papel embrulha Pedra");
        } else if (jogador == 3 && maquina == 2) {
            System.out.println("Você ganhou! Tesoura corta Papel");
        } else if (jogador >= 1 && jogador <= 3) {
            System.out.println("Você perdeu!");
        } else {
            System.out.println("Opção inválida");
        }

        sc.close();
    }
}

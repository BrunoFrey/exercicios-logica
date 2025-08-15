import java.util.Random;

public class Exercício11 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numeros = new int[100];


        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1; // 1 a 100
        }

        // bubble sort
        for (int i = 0; i < numeros.length - 1; i++) {          //  for 1 quantas passadas do vetor serao feitas , 1
            for (int j = 0; j < numeros.length - 1 - i; j++) {  // for 2 numeros j é o numero atual , compara os pares vizinhos
                if (numeros[j] > numeros[j + 1]) {              // significa que estao na ordem errada e devem ser trocados
                    int temp = numeros[j];          //
                    numeros[j] = numeros[j + 1];    // para o maior numero subir para o final
                    numeros[j + 1] = temp;          //
                }
            }
        }


        System.out.println("Vetor ordenado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}

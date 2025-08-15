import java.util.Random;

public class Exercício12 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetor1 = new int[50];
        int[] vetor2 = new int[50];


        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = random.nextInt(100) + 1;    //v1
        }

        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = random.nextInt(100) + 1;        //v2
        }

        bubbleSort(vetor1);     //ord.
        bubbleSort(vetor2);


        int[] vetorFinal = new int[100];    //final


        for (int i = 0; i < vetor1.length; i++) {       //copiando vetor 1 para final
            vetorFinal[i] = vetor1[i];
        }


        for (int i = 0; i < vetor2.length; i++) {       //copiando vetor 2 para o final
            vetorFinal[i + vetor1.length] = vetor2[i];
        }

        bubbleSort(vetorFinal);

        System.out.println("Vetor final ordenado:");
        for (int i = 0; i < vetorFinal.length; i++) {
            System.out.print(vetorFinal[i] + " ");
        }
    }

    public static void bubbleSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {    //blubble sort
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}

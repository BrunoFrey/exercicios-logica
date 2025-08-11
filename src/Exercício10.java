public class Exercício10 {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int somaDiagonal = 0;

        // soma diagonal
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonal += matriz[i][i];
        }

        System.out.println("A soma da diagonal principal é: " + somaDiagonal);
    }
}

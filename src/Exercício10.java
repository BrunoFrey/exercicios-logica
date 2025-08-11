public class Exercício10 {
    public static void main(String[] args) {
        // Matriz já preenchida (3x3)
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int somaDiagonal = 0;

        // Soma da diagonal principal
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonal += matriz[i][i]; // pega posições [0][0], [1][1], [2][2]
        }

        System.out.println("A soma da diagonal principal é: " + somaDiagonal);
    }
}

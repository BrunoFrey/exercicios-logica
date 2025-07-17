import java.util.Scanner; // abre o scanner

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // !

        System.out.println("Nome do produto:");
        String nome = sc.nextLine(); //string pq o usuario vai digitar letras

        System.out.println("Preço do produto:");
        double preco = sc.nextDouble(); // double para numeros com vrgula

        System.out.println("Quantidade comprada:");
        int qtd = sc.nextInt(); // numeros inteiros

        double total = preco * qtd;
        double desconto = 0; //desconto igual a zero

        if (qtd <= 10) {
            desconto = 0;
        } else if (qtd <= 20) {
            desconto = 0.1;
        } else if (qtd <= 50) {
            desconto = 0.2;
        } else {
            desconto = 0.25;
        }

        double valorFinal = total - (total * desconto); // o total menos o em ()

        System.out.println("Produto: "+ nome);
        System.out.println("Valor a pagar: R$ " + valorFinal);

        sc.close();
    }
}

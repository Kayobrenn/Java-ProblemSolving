import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.print("Digite o nome do produto: ");
        produto.nome = sc.nextLine();

        System.out.print("Digite a quantidade do produto: ");
        produto.quantidade = sc.nextDouble();

        System.out.print("Digite o valor do produto: ");
        produto.preco = sc.nextDouble();

        System.out.println("======\ MENU SISTEMA /=======");
        System.out.println("1 - Adicionar produto ao Estoque");
        System.out.println("2 - Vender Produto");
        System.out.println("3 - Exibir Estoque do Produto");
        produto.opcao = sc.nextInt();

        while (produto.opcao != 3) {}

    }
}

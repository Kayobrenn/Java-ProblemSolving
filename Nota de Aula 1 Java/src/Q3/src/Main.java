import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        do {
            System.out.println("\n====== MENU SISTEMA =======");
            System.out.println("1 - Adicionar produto ao Estoque");
            System.out.println("2 - Vender Produto");
            System.out.println("3 - Exibir Estoque do Produto");
            System.out.println("4 - Sair do Programa");
            System.out.print("Digite a opção desejada:");
            produto.opcao = sc.nextInt();

            sc.nextLine();

            switch (produto.opcao) {
                case 1:
                    System.out.println("=======Cadastramento de Produto=======");

                    System.out.print("\nDigite o nome do produto: ");
                    produto.setNome(sc.nextLine());

                    System.out.print("Digite a quantidade do produto: ");
                    produto.setQuantidade(sc.nextInt());

                    System.out.print("Digite o valor da produto: ");
                    produto.setPreco(sc.nextDouble());

                    System.out.println("\nProduto cadastrado com sucesso!");
                    break;
                case 2:
                    break;
                case 3:
                    if (Produto.getNome() == null || Produto.getNome().isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("===== PRODUTO CADASTRADO =====");
                        System.out.println("Produto cadastrado: " + Produto.getNome());
                        System.out.println("Quantidade em Estoque:" + produto.getQuantidade());
                        System.out.println("Valor Cadastrado:" + produto.getPreco());
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar o programa!");
                    break;
            }
        } while (produto.opcao != 4);
    }
}

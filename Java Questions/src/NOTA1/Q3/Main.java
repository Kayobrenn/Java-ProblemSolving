package NOTA1.Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        int opcao;

        System.out.println("\n__________________________INICIANDO SISTEMA PDV__________________________");

        do {
            System.out.println("\n=========> MENU SISTEMA <==========");
            System.out.println("\n1 - Adicionar produto ao Estoque");
            System.out.println("2 - Vender Produto");
            System.out.println("3 - Exibir Estoque do Produto");
            System.out.println("4 - Sair do Programa");
            System.out.print("\nDigite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n______________________________________________________________");
                    System.out.println("======================CADASTRO DE PRODUTO======================");
                    System.out.print("\nDigite o nome do produto: ");
                    produto.setNome(sc.nextLine());
                    System.out.print("Digite a quantidade do produto: ");
                    produto.setQuantidade(sc.nextInt());
                    System.out.print("Digite o valor do produto: ");
                    produto.setPreco(sc.nextDouble());
                    System.out.println("\nProduto cadastrado com sucesso!");
                    System.out.println("______________________________________________________________");
                    break;
                case 2:
                    if (produto.getNome() == null || produto.getNome().isEmpty()) {
                        System.out.println("\nNenhum produto cadastrado!!!");
                    } else {
                        System.out.println("\n______________________________________________________________");
                        System.out.println("========================VENDER PRODUTO========================");
                        System.out.print("\nDigite a quantidade a ser vendida: ");
                        produto.setQuantidadevenda(sc.nextInt());

                        if (produto.getQuantidade() >= produto.getQuantidadevenda()) {
                            produto.multiplicar();
                            produto.setQuantidade(produto.getQuantidade() - produto.getQuantidadevenda());
                            System.out.println("\nValor unitário: R$" + produto.getPreco());
                            System.out.println("O valor total da venda: R$" + produto.getResultado());
                            System.out.println("\nVenda concluída com sucesso!");
                            System.out.println("\n______________________________________________________________");
                        } else {
                            System.out.println("Quantidade insuficiente no estoque!");
                        }
                    }
                    break;
                case 3:
                    if (produto.getNome() == null || produto.getNome().isEmpty()) {
                        System.out.println("\nNenhum produto cadastrado!!!");
                    } else {
                        System.out.println("\n______________________________________________________________");
                        System.out.println("======================PRODUTO EM ESTOQUE======================");
                        System.out.println("\nProduto: " + produto.getNome());
                        System.out.println("Quantidade em Estoque: " + produto.getQuantidade());
                        System.out.println("Valor Unitário: R$" + produto.getPreco());
                        System.out.println("\n______________________________________________________________");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar o programa!");
                    break;
                default:
                    System.out.println("Opção inválida! Digite novamente.");
            }
        } while (opcao != 4);

        sc.close();
    }
}


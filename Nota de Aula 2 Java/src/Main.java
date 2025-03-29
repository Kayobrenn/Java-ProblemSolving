import java.util.Scanner;

//Utilizando conceitos de orientação a objetos, métodos e modificadores de acesso, crie:
//Um sistema para controle de um produto com atributos código, nome, tamanho/peso, cor, valor e quantidade no estoque.
//O sistema deve permitir o cadastro dos dados, além de realizar a venda e fazer o controle do estoque.
//Para o pagamento, temos os seguintes benefícios:
//Pix, Espécie, Transferência ou Débito, 5% de desconto.
//Crédito, parcelar em 3x sem juros.
//Observação: Espécie, caso o valor pago seja maior que o valor do produto, informar o troco.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        int opcao;
        int opcao2;

        System.out.println("\n__________________________INICIANDO SISTEMA EMPRESARIAL__________________________");

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
                    System.out.print("Digite o código do produto: ");
                    produto.setCodprod(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Digite o tamanho/peso do produto: ");
                    produto.setTamanho_peso(sc.nextLine());
                    System.out.print("Digite a cor do produto: ");
                    produto.setColor(sc.nextLine());
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
                        System.out.print("\nDigite a quantidade de " + produto.getNome() + " a ser vendida: ");
                        produto.setQuantidadevenda(sc.nextInt());

                        if (produto.getQuantidade() >= produto.getQuantidadevenda()) {
                            produto.calcularTotalVenda();
                            produto.reduzir_estoque();
                            System.out.println("\nValor unitário: R$" + produto.getPreco());
                            System.out.println("\nO valor total da venda: R$" + produto.getResultado());
                        } else {
                            System.out.println("\nQuantidade insuficiente no estoque!");
                        }


                        System.out.println("\n=========> FORMAS DE PAGAMENTO <==========");
                        System.out.println("\n1 - Espécie");
                        System.out.println("2 - PIX");
                        System.out.println("3 - Tranferencia");
                        System.out.println("4 - Débito");
                        System.out.print("5 - Crédito");
                        System.out.print("\nDigite a opção desejada: ");
                        opcao2 = sc.nextInt();
                        sc.nextLine();

                        switch (opcao2) {
                            case 1:
                                System.out.println("\n______________________________________________________________");
                                System.out.println("\nForma de pagamento selecionada: Especíe");
                                System.out.print("\nSerá aplicado 5% desconto nessa modalidade!");
                                System.out.println("\n______________________________________________________________");

                                produto.desconto();
                                System.out.println("\nO valor total com desconto: R$" + String.format("%.2f", produto.getResultado()));
                                System.out.print("\nDigite o valor do pagamento em Espécie:");
                                produto.setValorpago(sc.nextDouble());

                                if (produto.getValorpago() > produto.getResultado()) {
                                    System.out.println("\nPagamento realizado com sucesso!");
                                    produto.troco();
                                    System.out.println("\nVenda Finalizada. Obrigado!");
                                    break;
                                } else if (produto.getValorpago() == produto.getResultado()) {
                                    System.out.println("Pagamento realizado com sucesso! Não há troco.");
                                    break;
                                } else {
                                    System.out.println("Valor pago é insuficiente! Falta R$" + (produto.getResultado() - produto.getValorpago()));
                                }

                                break;
                            case 2:
                                System.out.println("\n______________________________________________________________");
                                System.out.println("\nForma de pagamento selecionada: PIX");
                                System.out.print("\nSerá aplicado 5% desconto nessa modalidade!");
                                System.out.println("\n______________________________________________________________");

                                produto.desconto();
                                System.out.println("\nO valor total com desconto: R$" + String.format("%.2f", produto.getResultado()));
                                System.out.print("\nDigite o valor do pagamento em PIX:");
                                produto.setValorpago(sc.nextDouble());

                                if (produto.getValorpago() > produto.getResultado()) {
                                    System.out.println("\nPagamento realizado com sucesso!");
                                    produto.troco();
                                    System.out.println("\nVenda Finalizada. Obrigado!");
                                    break;
                                } else if (produto.getValorpago() == produto.getResultado()) {
                                    System.out.println("Pagamento realizado com sucesso! Não há troco.");
                                    break;
                                } else {
                                    System.out.println("Valor pago é insuficiente! Falta R$" + (produto.getResultado() - produto.getValorpago()));
                                }
                                break;
                            case 3:
                                System.out.println("\n______________________________________________________________");
                                System.out.println("\nForma de pagamento selecionada: Tranferencia");
                                System.out.print("\nSerá aplicado 5% desconto nessa modalidade!");
                                System.out.println("\n______________________________________________________________");

                                produto.desconto();
                                System.out.println("\nO valor total com desconto: R$" + String.format("%.2f", produto.getResultado()));
                                System.out.print("\nDigite o valor do pagamento em PIX:");
                                produto.setValorpago(sc.nextDouble());

                                if (produto.getValorpago() > produto.getResultado()) {
                                    System.out.println("\nPagamento realizado com sucesso!");
                                    produto.troco();
                                    System.out.println("\nVenda Finalizada. Obrigado!");
                                    break;
                                } else if (produto.getValorpago() == produto.getResultado()) {
                                    System.out.println("Pagamento realizado com sucesso! Não há troco.");
                                    break;
                                } else {
                                    System.out.println("Valor pago é insuficiente! Falta R$" + (produto.getResultado() - produto.getValorpago()));
                                }
                                break;
                            case 4:
                                System.out.println("\n______________________________________________________________");
                                System.out.println("\nForma de pagamento selecionada: Débito");
                                System.out.print("\nSerá aplicado 5% desconto nessa modalidade!");
                                System.out.println("\n______________________________________________________________");

                                produto.desconto();
                                System.out.println("\nO valor total com desconto: R$" + String.format("%.2f", produto.getResultado()));
                                System.out.print("\nDigite o valor do pagamento em Débito:");
                                produto.setValorpago(sc.nextDouble());

                                if (produto.getValorpago() > produto.getResultado()) {
                                    System.out.println("\nPagamento realizado com sucesso!");
                                    produto.troco();
                                    System.out.println("\nVenda Finalizada. Obrigado!");
                                    break;
                                } else if (produto.getValorpago() == produto.getResultado()) {
                                    System.out.println("Pagamento realizado com sucesso! Não há troco.");
                                    break;
                                } else {
                                    System.out.println("Valor pago é insuficiente! Falta R$" + (produto.getResultado() - produto.getValorpago()));
                                }
                                break;
                            case 5:
                                System.out.println("\n______________________________________________________________");
                                System.out.println("\nForma de pagamento selecionada: Crédito");
                                System.out.println("______________________________________________________________");

                                System.out.println("\nO valor total com desconto: R$" + produto.getResultado());

                                System.out.println("\nDeseja parcelar o valor?");
                                System.out.println("1 - À vista");
                                System.out.println("2 - Parcelado em 2x sem juros");
                                System.out.println("3 - Parcelado em 3x sem juros");
                                System.out.print("\nDigite a opção desejada: ");

                                int parcelas = sc.nextInt();

                                if (parcelas == 1) {
                                    System.out.print("\nDigite o valor do pagamento em Débito: ");
                                    produto.setValorpago(sc.nextDouble());

                                    if (produto.getValorpago() >= produto.getResultado()) {
                                        System.out.println("\nPagamento realizado com sucesso!");
                                        if (produto.getValorpago() > produto.getResultado()) {
                                            produto.troco();
                                        }
                                        System.out.println("\nVenda Finalizada. Obrigado!");
                                    } else {
                                        System.out.println("Valor pago é insuficiente! Falta R$" + (produto.getResultado() - produto.getValorpago()));
                                    }
                                } else if (parcelas == 2 || parcelas == 3) {
                                    double valorParcela = produto.getResultado() / parcelas;
                                    System.out.printf("\nO valor será parcelado em %dx de R$ %.2f sem juros.\n", parcelas, valorParcela);
                                    System.out.println("\nPagamento aprovado. Venda Finalizada. Obrigado!");
                                } else {
                                    System.out.println("\nOpção inválida! Voltando ao menu.");
                                }
                                break;




                        }

                    }
                    break;
                case 3:
                    if (produto.getNome() == null || produto.getNome().isEmpty()) {
                        System.out.println("\nNenhum produto cadastrado!!!");
                    } else {
                        System.out.println("\n______________________________________________________________");
                        System.out.println("======================PRODUTO EM ESTOQUE======================");
                        System.out.println("\nCódigo do produto: " + produto.getCodprod());
                        System.out.println("Produto: " + produto.getNome());
                        System.out.println("Quantidade em Estoque: " + produto.getQuantidade());
                        System.out.println("Tamanho/Peso do produto: " + produto.getTamanho_peso());
                        System.out.println("Cor do produto:" + produto.getColor());
                        System.out.println("Valor Unitário: R$" + produto.getPreco());
                        System.out.println("\n______________________________________________________________");
                    }
                    break;
                case 4:
                    System.out.println("\n______________________________________________________________");
                    System.out.println("Obrigado por utilizar o programa!");
                    System.out.println("______________________________________________________________");
                    break;
                default:
                    System.out.println("Opção inválida! Digite novamente.");
            }
        } while (opcao != 4);

        sc.close();
    }
}



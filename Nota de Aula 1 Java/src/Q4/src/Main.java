import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        int opcao;

        System.out.println("\n__________________________INICIANDO SISTEMA BANCÁRIO__________________________");

        do {
            System.out.println("\n=========> MENU SISTEMA <==========");
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Consultar Saldo");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Sair");
            System.out.print("\nDigite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n=========================== DEPÓSITO ===========================");
                    System.out.print("\nDigite o valor do depósito: ");
                    cliente.setSaldo(cliente.getSaldo() + sc.nextDouble()); // Agora soma ao saldo atual
                    System.out.println("\nO valor de R$" + cliente.getSaldo() + " foi depositado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n======================= CONSULTAR SALDO ========================");
                    System.out.println("\nSaldo atual da conta: R$" + cliente.getSaldo());
                    break;

                case 3:
                    System.out.println("\n============================= SAQUE ============================");
                    System.out.print("\nDigite o valor do saque: ");
                    double saque = sc.nextDouble();
                    if (cliente.getSaldo() >= saque) {
                        cliente.setSaldo(cliente.getSaldo() - saque);
                        System.out.println("\nSaque de R$" + saque + " realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente para saque!");
                    }
                    break;

                case 4:
                    System.out.println("\n========================== TRANSFERÊNCIA =======================");
                    System.out.print("\nDigite o valor da transferência: ");
                    double transferencia = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Digite o nome do destinatário: ");
                    String destinatario = sc.nextLine();
                    if (cliente.getSaldo() >= transferencia) {
                        cliente.setSaldo(cliente.getSaldo() - transferencia);
                        System.out.println("\nTransferência de R$" + transferencia + " realizada para " + destinatario + " com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente para transferência!");
                    }
                    break;

                case 5:
                    System.out.println("\nObrigado por utilizar nosso sistema!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        } while (opcao != 5);

        sc.close();
    }
}

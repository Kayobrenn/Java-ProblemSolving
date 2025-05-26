package ProjectJava;

import ProjectJava.controller.FuncionarioController;
import ProjectJava.controller.SetorController;
import ProjectJava.controller.UsuarioController;
import ProjectJava.enums.Sexo;
import ProjectJava.model.Setor;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static SetorController setorController = new SetorController();
    private static FuncionarioController funcionarioController = new FuncionarioController();
    private static UsuarioController usuarioController = new UsuarioController();

    public static void main(String[] args) throws InterruptedException {

        System.out.println("======================================================");
        System.out.println("             🚀  BEM-VINDO AO SISTEMA                 ");
        System.out.println("                     RH MANAGER                       ");
        System.out.println("------------------------------------------------------");
        System.out.println("      Sistema de Gestão de Funcionários e Setores     ");
        System.out.println("------------------------------------------------------");
        System.out.println(" Desenvolvido por: Kayo Brenno Gomes Cunha            ");
        System.out.println(" Versão: 1.0                                           ");
        System.out.println("======================================================");
        System.out.println();

        System.out.println("Iniciando Sistema...");
        Thread.sleep(5000); // Espera 2 segundos
        System.out.println();

        System.out.println("=========================================================");
        System.out.println("                    🔐  TELA DE LOGIN                    ");
        System.out.println("---------------------------------------------------------");
        System.out.println("    Informe seu usuário e senha para acessar o sistema.  ");
        System.out.println("=========================================================");
        System.out.println();

        boolean autenticado = false;
        int tentativas = 0;

        while (!autenticado && tentativas < 3) {
            System.out.print("Usuário: ");
            String username = scanner.nextLine();
            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            if (usuarioController.login(username, senha)) {
                autenticado = true;
                System.out.println("Login bem-sucedido! ✅");
                System.out.println();
                menuPrincipal();
            } else {
                System.out.println("Usuário ou senha inválidos. ❌");
                tentativas++;
            }
        }

        if (!autenticado) {
            System.out.println("Número de tentativas excedido. Encerrando sistema.");
        }
    }

    private static void menuPrincipal() {
        boolean sair = false;

        while (!sair) {
            System.out.println("=========================================================");
            System.out.println("                        📋 MENU                          ");
            System.out.println("---------------------------------------------------------");
            System.out.println(" [1] ➕ Cadastrar Setor                                   ");
            System.out.println(" [2] 📑 Listar Setores                                    ");
            System.out.println(" [3] ➕ Cadastrar Funcionário                             ");
            System.out.println(" [4] 📑 Listar Funcionários                               ");
            System.out.println(" [5] ➕ Cadastrar Novo Usuário                             ");
            System.out.println(" [6] 📑 Listar Usuários                                   ");
            System.out.println("---------------------------------------------------------");
            System.out.println(" [0] ❌ Sair                                              ");
            System.out.println("=========================================================");
            System.out.print(" 🔸 Escolha uma opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    cadastrarSetor();
                    break;
                case "2":
                    setorController.listarSetores();
                    break;
                case "3":
                    cadastrarFuncionario();
                    break;
                case "4":
                    funcionarioController.listarFuncionarios();
                    break;
                case "5":
                    cadastrarUsuario();
                    break;
                case "6":
                    usuarioController.listarUsuarios();
                    break;
                case "0":
                    sair = true;
                    System.out.println("\nSaindo do sistema... Obrigado por utilizar o RH Manager!");
                    System.out.println("Até a próxima! 👋\n");

                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    private static void cadastrarSetor() {
        System.out.println("=========================================================");
        System.out.println("                🏢 CADASTRO DE SETOR                     ");
        System.out.println("---------------------------------------------------------");
        System.out.println("   Preencha as informações para cadastrar um novo setor. ");
        System.out.println("=========================================================");
        System.out.println();
        System.out.print("🔸 Digite o nome do setor: ");
        String nome = scanner.nextLine();
        System.out.print("🔸 Digite a descrição do setor: ");
        String descricao = scanner.nextLine();

        setorController.cadastrarSetor(nome, descricao);
    }

    private static void cadastrarFuncionario() {
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite o RG: ");
        String rg = scanner.nextLine();

        System.out.print("Digite a data de nascimento: ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade;
        try {
            idade = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Idade inválida!");
            return;
        }

        System.out.print("Digite o Estado Civil: ");
        String estadoCivil = scanner.nextLine();

        System.out.print("Digite o Cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Digite o Data de Admissão: ");
        String dataAdmissao = scanner.nextLine();

        System.out.print("Digite o Salario:");
        double salario = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite o Tipo de Pagamento: ");
        String tipoPagamento = scanner.nextLine();

        System.out.print("Digite o e-mail: ");
        String email = scanner.nextLine();

        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Digite o sexo (MASCULINO, FEMININO, OUTRO): ");
        Sexo sexo;
        try {
            sexo = Sexo.valueOf(scanner.nextLine().toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Sexo inválido!");
            return;
        }

        System.out.print("Digite o nome do setor do funcionário: ");
        String nomeSetor = scanner.nextLine();
        Setor setor = setorController.buscarSetorPorNome(nomeSetor);

        funcionarioController.cadastrarFuncionario(nome, cpf, rg, idade, dataNascimento, email, telefone, sexo,
                                                    setor, cargo, dataAdmissao, salario, tipoPagamento, estadoCivil);
    }

    private static void cadastrarUsuario() {
        System.out.print("Digite o nome de usuário: ");
        String username = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        usuarioController.cadastrarUsuario(username, senha);
    }
}

package ProjectJava;

import ProjectJava.controller.FuncionarioController;
import ProjectJava.controller.SetorController;
import ProjectJava.controller.UsuarioController;
import ProjectJava.enums.Sexo;
import ProjectJava.model.Setor;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
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
        Thread.sleep(5000);
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
                System.out.println("\nLogin bem-sucedido! ✅");
                System.out.println();
                Thread.sleep(2000);
                menuPrincipal();
            } else {
                System.out.println("Usuário ou senha inválidos. ❌");
                tentativas++;
            }
        }

        if (!autenticado) {
            System.out.println("Número de tentativas excedido. Encerrando sistema...");
        }
    }

    private static void menuPrincipal() {
        boolean sair = false;

        while (!sair) {
            System.out.println("==========================================================");
            System.out.println("                        📋 MENU                           ");
            System.out.println("----------------------------------------------------------");
            System.out.println(" [1] ➕ Cadastro de Setores                               ");
            System.out.println(" [2] ➕ Cadastro de Funcionários                          ");
            System.out.println(" [3] ➕ Cadastrar Novo Usuário                            ");
            System.out.println(" [7] 📑 Listar Usuários                                   ");
            System.out.println("----------------------------------------------------------");
            System.out.println(" [0] ❌ Sair                                              ");
            System.out.println("==========================================================");
            System.out.print(" 🔸 Escolha uma opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    menuSetor();
                    break;
                case "2":
                    menuFuncionario();
                    break;
                case "3":
                    cadastrarUsuario();
                    break;
                case "4":
                    usuarioController.listarUsuarios();
                    break;
                case "0":
                    sair = true;
                    System.out.println("\nSaindo do sistema... Obrigado por utilizar o RH Manager!");
                    System.out.println("Até a próxima! 👋\n");
                    break;
                default:
                    System.out.println("\n❌ Opção inválida! Tente novamente.\n");
            }
        }
    }

    private static void menuSetor() {
        System.out.println("=========================================================");
        System.out.println("                   🏢 MENU SETOR                         ");
        System.out.println("---------------------------------------------------------");
        System.out.println(" [1] ➕ Cadastrar Setor                                   ");
        System.out.println(" [2] ❌ Excluir Setor                                     ");
        System.out.println(" [3] 📄 Listar Setores                                    ");
        System.out.println(" [0] 🔙 Voltar ao menu principal                          ");
        System.out.println("=========================================================");
        System.out.print(" 🔸 Escolha uma opção: ");

        String opcao = scanner.nextLine();

        switch (opcao) {
            case "1":
                cadastrarSetor();
                break;
            case "2":
                excluirSetor();
                break;
            case "3":
                setorController.listarSetores();
                break;
            case "0":
                menuPrincipal();
                break;
            default:
                System.out.println("\n❌ Opção inválida! Tente novamente.\n");
        }
    }


    private static void excluirSetor() {
        System.out.println("=========================================================");
        System.out.println("                   ❌ EXCLUIR SETOR                      ");
        System.out.println("---------------------------------------------------------");
        System.out.print("🔸 Digite o nome do setor que deseja excluir: ");
        String nomeSetor = scanner.nextLine();

        boolean excluido = setorController.excluirSetor(nomeSetor);
        if (excluido) {
            System.out.println("\n✅ Setor excluído com sucesso!\n");
        } else {
            System.out.println("\n❌ Setor com nome informado não encontrado.\n");
        }
    }


    private static void cadastrarSetor() {
        System.out.println("===========================================================");
        System.out.println("                🏢 CADASTRO DE SETOR                       ");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Preencha as informações para cadastrar ou excluir um setor.");
        System.out.println("===========================================================");
        System.out.println();
        System.out.print("🔸 Digite o nome do setor: ");
        String nome = scanner.nextLine();

        System.out.print("🔸 Digite a descrição do setor: ");
        String descricao = scanner.nextLine();

        setorController.cadastrarOuExcluirSetor(nome, descricao);
    }

    private static void menuFuncionario() {
        System.out.println("=========================================================");
        System.out.println("                 👨‍💼 MENU FUNCIONÁRIO                     ");
        System.out.println("---------------------------------------------------------");
        System.out.println(" [1] ➕ Cadastrar Funcionário                             ");
        System.out.println(" [2] ❌ Excluir Funcionário                               ");
        System.out.println(" [3] 📄 Listar Funcionários                               ");
        System.out.println(" [0] 🔙 Voltar ao menu principal                          ");
        System.out.println("=========================================================");
        System.out.print(" 🔸 Escolha uma opção: ");

        String opcao = scanner.nextLine();

        switch (opcao) {
            case "1":
                cadastrarFuncionario();
                break;
            case "2":
                excluirFuncionario();
                break;
            case "3":
                funcionarioController.listarFuncionarios();
                break;
            case "0":
                menuPrincipal();
                break;
            default:
                System.out.println("\n❌ Opção inválida! Tente novamente.\n");
        }
    }


    private static void cadastrarFuncionario() {
        System.out.println("=========================================================");
        System.out.println("              👨‍💼 CADASTRO DE FUNCIONÁRIO                 ");
        System.out.println("---------------------------------------------------------");
        System.out.println("  Preencha as informações para cadastrar um funcionário. ");
        System.out.println("=========================================================");
        System.out.println();

        System.out.print("🔸 Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("🔸 Digite o CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("🔸 Digite o RG: ");
        String rg = scanner.nextLine();

        System.out.print("🔸 Digite a data de nascimento: ");
        String dataNascimento = scanner.nextLine();

        System.out.print("🔸 Digite a idade: ");
        int idade;
        try {
            idade = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Idade inválida!");
            return;
        }

        System.out.print("🔸 Digite o Estado Cívil: ");
        String estadoCivil = scanner.nextLine();

        System.out.print("🔸 Digite o Cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("🔸 Digite a data de admissão (dd/MM/yyyy): ");
        String dataAdmissao = scanner.nextLine();

        System.out.print("🔸 Digite o salário: ");
        String salario = scanner.nextLine();

        System.out.print("🔸 Tipo de pagamento (Mensal ou Quinzenal): ");
        String tipoPagamento = scanner.nextLine();

        System.out.print("🔸 Digite o email: ");
        String email = scanner.nextLine();

        System.out.print("🔸 Digite o telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("🔸 Digite o sexo: (Masculino, Feminino ou Outros): ");
        Sexo sexo;
        try {
            sexo = Sexo.valueOf(scanner.nextLine().toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Sexo inválido!");
            return;
        }

        System.out.print("🔸 Informe o nome do setor que ele pertence: ");
        String nomeSetor = scanner.nextLine();
        Setor setor = setorController.buscarSetorPorNome(nomeSetor);

        funcionarioController.cadastrarFuncionario(nome, cpf, rg, idade, dataNascimento, email, telefone, sexo,
                                                    setor, cargo, dataAdmissao, salario, tipoPagamento, estadoCivil);
    }

    private static void excluirFuncionario() {
        System.out.println("=========================================================");
        System.out.println("              ❌ EXCLUIR FUNCIONÁRIO                     ");
        System.out.println("---------------------------------------------------------");
        System.out.print("🔸 Digite o CPF do funcionário que deseja excluir: ");
        String cpf = scanner.nextLine();

        boolean sucesso = funcionarioController.excluirFuncionario(cpf);
        if (sucesso) {
            System.out.println("\n✅ Funcionário excluído com sucesso!\n");
        } else {
            System.out.println("\n❌ Funcionário não encontrado.\n");
        }
    }


    private static void cadastrarUsuario() {
        System.out.println("=========================================================");
        System.out.println("                 👤 CADASTRO DE USUÁRIO                   ");
        System.out.println("---------------------------------------------------------");
        System.out.println("    Preencha as informações para cadastrar um usuário.   ");
        System.out.println("=========================================================");
        System.out.println();

        System.out.print("🔸 Digite o nome do usuário: ");
        String username = scanner.nextLine();
        System.out.print("🔸 Digite a senha: ");
        String senha = scanner.nextLine();

        usuarioController.cadastrarUsuario(username, senha);
    }
}

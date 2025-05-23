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

    public static void main(String[] args) {

        System.out.println("===== LOGIN =====");

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
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar Setor");
            System.out.println("2 - Listar Setores");
            System.out.println("3 - Cadastrar Funcionário");
            System.out.println("4 - Listar Funcionários");
            System.out.println("5 - Cadastrar Novo Usuário");
            System.out.println("6 - Listar Usuários");
            System.out.println("0 - Sair");
            System.out.print("Escolha a opção: ");

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
                    System.out.println("Encerrando aplicação.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    private static void cadastrarSetor() {
        System.out.print("Digite o nome do setor: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a descrição do setor: ");
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

        System.out.print("Digite o email: ");
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

        funcionarioController.cadastrarFuncionario(nome, cpf, idade, email, telefone, sexo, setor);
    }

    private static void cadastrarUsuario() {
        System.out.print("Digite o nome de usuário: ");
        String username = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        usuarioController.cadastrarUsuario(username, senha);
    }
}

package ProjectJava.controller;

import ProjectJava.enums.Sexo;
import ProjectJava.model.Funcionario;
import ProjectJava.model.Setor;
import ProjectJava.service.FuncionarioService;
import java.util.List;

public class FuncionarioController {
    private FuncionarioService funcionarioService = new FuncionarioService();

    public void cadastrarFuncionario(String nome, String cpf, String rg, int idade, String dataNascimento,
                                     String email, String telefone, Sexo sexo,
                                     Setor setor, String cargo, String dataAdmissao,
                                     double salario, String tipoPagamento, String estadoCivil) {
        if (setor == null) {
            System.out.println("Setor inválido. Cadastro não realizado.");
            return;
        }

        Funcionario funcionario = new Funcionario(nome, cpf, rg, idade, dataNascimento, email, telefone, sexo, setor,
                                                    cargo, dataAdmissao, salario, tipoPagamento, estadoCivil);
        funcionarioService.cadastrarFuncionario(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public void listarFuncionarios() {
        List<Funcionario> funcionarios = funcionarioService.listarFuncionarios();
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Funcionario f : funcionarios) {
                f.exibirDados();
            }
        }
    }
}


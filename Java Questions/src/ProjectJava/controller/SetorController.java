package ProjectJava.controller;

import ProjectJava.model.Setor;
import ProjectJava.service.SetorService;

import java.util.List;

public class SetorController {
    private SetorService setorService = new SetorService();

    public void cadastrarSetor(String nome, String descricao) {
        Setor setor = new Setor(nome, descricao);
        setorService.cadastrarSetor(setor);
        System.out.println("Setor cadastrado com sucesso!");
    }

    public void listarSetores() {
        List<Setor> setores = setorService.listarSetores();
        if (setores.isEmpty()) {
            System.out.println("Nenhum setor cadastrado.");
        } else {
            for (Setor s : setores) {
                s.exibirDados();
            }
        }
    }

    public Setor buscarSetorPorNome(String nome) {
        return setorService.buscarPorNome(nome);
    }
}


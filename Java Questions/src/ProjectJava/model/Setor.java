package ProjectJava.model;

import ProjectJava.model.interfaces.Cadastravel;

public class Setor implements Cadastravel {
    private String nome;
    private String descricao;

    public Setor(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public void exibirDados() {
        System.out.println("Setor: " + nome + " | Descrição: " + descricao);
    }

    @Override
    public String toString() {
        return "Setor{nome='" + nome + "', descricao='" + descricao + "'}";
    }
}


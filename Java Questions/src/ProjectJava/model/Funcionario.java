package ProjectJava.model;
import ProjectJava.model.interfaces.Cadastravel;
import ProjectJava.enums.Sexo;

public class Funcionario implements Cadastravel {
    private String nome;
    private String cpf;
    private int idade;
    private String email;
    private String telefone;
    private Sexo sexo;
    private Setor setor;

    public Funcionario(String nome, String cpf, int idade, String email, String telefone, Sexo sexo, Setor setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.sexo = sexo;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    @Override
    public void exibirDados() {
        System.out.println("__________________________________");
        System.out.println("Funcionário: " + nome);
        System.out.println("----------------------------------");
        System.out.println("CPF      : " + cpf);
        System.out.println("Idade    : " + idade);
        System.out.println("Email    : " + email);
        System.out.println("Telefone : " + telefone);
        System.out.println("Sexo     : " + sexo);
        System.out.println("Setor    : " + setor.getNome());
        System.out.println("__________________________________");
        System.out.println();

    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor.getNome() +
                '}';
    }
}

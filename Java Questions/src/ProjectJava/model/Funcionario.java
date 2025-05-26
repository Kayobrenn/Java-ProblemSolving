package ProjectJava.model;
import ProjectJava.model.interfaces.Cadastravel;
import ProjectJava.enums.Sexo;

public class Funcionario implements Cadastravel {
    private String nome;
    private String cpf;
    private String rg;
    private String dataNascimento;
    private int idade;
    private String email;
    private String telefone;
    private Sexo sexo;
    private Setor setor;
    private String cargo;
    private String dataAdmissao;
    private double salario;
    private String tipoPagamento;
    private String estadoCivil;

    public Funcionario(String nome, String cpf, String rg, int idade, String dataNascimento,
                       String email, String telefone, Sexo sexo,
                       Setor setor, String cargo, String dataAdmissao,
                       double salario, String tipoPagamento,  String estadoCivil) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.sexo = sexo;
        this.setor = setor;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.tipoPagamento = tipoPagamento;
        this.estadoCivil = estadoCivil;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public void exibirDados() {
        System.out.println("__________________________________");
        System.out.println("Funcionário: " + nome);
        System.out.println("----------------------------------");
        System.out.println("CPF             : " + cpf);
        System.out.println("RG              : " + rg);
        System.out.println("Idade           : " + idade);
        System.out.println("Email           : " + email);
        System.out.println("Data Nascimento : " + dataNascimento);
        System.out.println("Estado Civíl    : " + estadoCivil);
        System.out.println("Telefone        : " + telefone);
        System.out.println("Sexo            : " + sexo);
        System.out.println("Setor           : " + setor.getNome());
        System.out.println("Cargo           : " + cargo);
        System.out.println("Data Admissão   : " + dataAdmissao);
        System.out.println("Salário         : R$ " + salario);
        System.out.println("Pagamento       : " + tipoPagamento);
        System.out.println("__________________________________\n");

    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", sexo=" + sexo + '\'' +
                ", setor=" + setor.getNome() + '\'' +
                ", cargo='" + cargo + '\'' +
                ", dataAdmissao=" + dataAdmissao + '\'' +
                ", salario=" + salario + '\'' +
                ", tipoPagamento='" + tipoPagamento + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}

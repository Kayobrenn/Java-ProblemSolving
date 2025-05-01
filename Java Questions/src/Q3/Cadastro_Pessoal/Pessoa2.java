package Q3.Cadastro_Pessoal;

class Pessoa2 {
    private String nome;
    private int idade;
    private double altura;
    private String rg;
    private String cpf;
    private String sexo;
    private String email;
    private String nasc;

    public String getNasc() { return nasc; }
    public void setNasc(String nasc) { this.nasc = nasc; }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {this.nome = nome;}

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCPF(String s) {
        return cpf;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    void fazAniversario() {
        idade++;
    }
}

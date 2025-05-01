package Q5;

public class Aluno extends Pessoa{
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public Aluno(String nome, int mat){
        super(nome);
        this.matricula = mat;
    }
}

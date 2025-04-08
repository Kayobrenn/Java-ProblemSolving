public class Aluno extends Pessoa{
    private int matricula;
    private double nota1, nota2, nota3, media;
    public Cargo cargo;

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void calcularMedia(){
        media=(nota1+nota2+nota3)/3;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", media=" + media +
                ", cargo=" + cargo +
                ", nome='" + nome + '\'' +
                ", rg='" + rg + '\'' +
                ", cpf='" + cpf + '\'' +
                ", sexo='" + sexo + '\'' +
                ", email='" + email + '\'' +
                ", nasc='" + nasc + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
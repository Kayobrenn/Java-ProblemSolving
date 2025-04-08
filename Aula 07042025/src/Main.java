import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa persona = new Pessoa();
        Aluno aluno = new Aluno();
        Disciplina disciplina = new Disciplina();
        Professor professor = new Professor();

        System.out.print("Digite o seu nome: ");
        aluno.setNome (sc.nextLine());

        System.out.print("Digite a sua idade: ");
        aluno.setIdade(sc.nextInt());
        sc.nextLine();

        System.out.print("Digite a sua altura: ");
        aluno.setAltura (sc.nextDouble());
        sc.nextLine();

        System.out.print("Digite sua data de nascimento: ");
        aluno.setNasc (sc.nextLine());

        System.out.print("Digite seu RG: ");
        aluno.setRg (sc.nextLine());

        System.out.print("Digite seu CPF: ");
        aluno.setCpf (sc.nextLine());

        System.out.print("Digite seu sexo: ");
        aluno.setSexo (sc.nextLine());

        System.out.print("Digite seu E-mail: ");
        aluno.setEmail (sc.nextLine());

        System.out.print("Digite sua primeira nota:");
        aluno.setNota1 (sc.nextDouble());

        System.out.print("Digite sua Segunda nota:");
        aluno.setNota2 (sc.nextDouble());

        System.out.print("Digite sua Terceira nota:");
        aluno.setNota3 (sc.nextDouble());

        System.out.println(Cargo.Aluno);


        System.out.println(aluno);













        /*

        System.out.println("\n=====> Disciplina <=====");

        System.out.println("\nDigite o nome da Disciplina:");
        disciplina.setNome (sc.nextLine());
        System.out.println("Digite o nome do professor:");
        professor.setNome (sc.nextLine());









        System.out.println("=====> Dados do Cadastro <=====");
        System.out.println();
        System.out.println("Nome:" + persona.getNome());
        System.out.println("RG:" + persona.getRg());
        System.out.println("Data de Nascimento:" + persona.getNasc());
        System.out.println("CPF:" + persona.getCpf());
        System.out.println("Sexo:" + persona.getSexo());
        System.out.println("E-mail:" + persona.getEmail());
        System.out.println("Altura:" + persona.getAltura());
        aluno.calcularMedia();
        System.out.println("Média das notas: " + aluno.getMedia());
        System.out.println("Idade antes do aniversário: " + persona.getIdade());
        persona.fazAniversario();
        System.out.println("Idade após o aniversário: " + persona.getIdade());

        System.out.println(persona.toString());



 */

        sc.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa persona = new Pessoa();

        System.out.print("Digite o seu nome: ");
        persona.setNome (sc.nextLine());

        System.out.print("Digite a sua idade: ");
        persona.setIdade(sc.nextInt());
        sc.nextLine();

        System.out.print("Digite a sua altura: ");
        persona.setAltura (sc.nextDouble());
        sc.nextLine();

        System.out.print("Digite seu RG: ");
        persona.setRg (sc.nextLine());

        System.out.print("Digite seu CPF: ");
        persona.setCpf (sc.nextLine());

        System.out.print("Digite seu sexo: ");
        persona.setSexo (sc.nextLine());

        System.out.print("Digite seu E-mail: ");
        persona.setEmail (sc.nextLine());

        System.out.println("=====> Dados do Cadastro <=====");
        System.out.println();
        System.out.println("Nome:" + persona.getNome());
        System.out.println("RG:" + persona.getRg());
        System.out.println("CPF:" + persona.getCpf());
        System.out.println("Sexo:" + persona.getSexo());
        System.out.println("E-mail:" + persona.getEmail());
        System.out.println("Altura:" + persona.getAltura());
        System.out.println("Idade antes do aniversário: " + persona.getIdade());
        persona.fazAniversario();
        System.out.println("Idade após o aniversário: " + persona.getIdade());



        sc.close();
    }
}
import controller.ProfessorController;
import model.Professor;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ProfessorController professorController = new ProfessorController();
        Professor p = new Professor();

        System.out.println("Digite o nome do professor:");
        p.setNome(sc.nextLine());
        System.out.println("Digite a idade do professor:");
        p.setIdade(sc.nextInt());
        System.out.println("Digite a especialização do professor:");
        p.setEspecialização(sc.nextLine());
        sc.nextLine();

        professorController.cadastrarProfessor(p);

        List<Professor> professores = professorController.listarProfessores();

        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");

        }else{
            for(Professor p:professores){
                System.out.println("Nome: " + p.getNome());
                System.out.println("Idade: " + p.getIdade());
                System.out.println("Especialização" + p.getEspecialização());
            }
        }
    }
}
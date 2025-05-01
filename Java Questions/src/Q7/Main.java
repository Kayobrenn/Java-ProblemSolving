package Q7;

import Q7.controller.ProfessorController;
import Q7.model.Professor;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ProfessorController professorController = new ProfessorController();
        Professor professor = new Professor();

        System.out.println("Digite o nome do professor:");
        professor.setNome(sc.nextLine());
        System.out.println("Digite a idade do professor:");
        professor.setIdade(sc.nextInt());
        System.out.println("Digite a especialização do professor:");
        professor.setEspecialização(sc.nextLine());
        sc.nextLine();

        professorController.cadastrarProfessor(professor);

        List<Professor> professores = professorController.listarProfessores();

        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");

        }else{
            for(Professor p:professores){
                System.out.println("Nome: " + p.getNome());
                System.out.println("Idade: " + p.getIdade());
                System.out.println("Especialização" + p.getEspecialização());
            }

            System.out.print("Digite o nome do professor a ser atualizado: ");
            String nomeAntigo = sc.nextLine();
            System.out.print("Digite o novo nome do professor: ");
            String novoNome = sc.nextLine();

            professorController.atualizarProfessor(nomeAntigo, novoNome);

            System.out.print("Digite o nome do professor a ser deletado: ");
            String nomeDeletar = sc.nextLine();

            professorController.deletarProfessor(nomeDeletar);
        }
    }
}
package Q7.controller;

import Q7.model.Professor;
import Q7.service.ProfessorService;

import java.util.List;

public class ProfessorController {
    private ProfessorService professorService = new ProfessorService();

    public void cadastrarProfessor(Professor professor) {
        professorService.cadastrarProfessor(professor);
    }
    public List<Professor> listarProfessores() {
        return professorService.listarProfessores();
    }
    public void atualizarProfessor(String nome, String novoNome) {
        professorService.atualizarProfessor(nome, novoNome);
    }
    public void deletarProfessor(String nome) {
        professorService.deletarProfessor(nome);
    }
}

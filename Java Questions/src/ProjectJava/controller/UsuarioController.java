package ProjectJava.controller;

import ProjectJava.model.Usuario;
import ProjectJava.service.UsuarioService;

public class UsuarioController {
    private UsuarioService usuarioService = new UsuarioService();

    public boolean login(String username, String senha) {
        return usuarioService.autenticar(username, senha);
    }

    public void cadastrarUsuario(String username, String senha) {
        Usuario usuario = new Usuario(username, senha);
        usuarioService.cadastrarUsuario(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void listarUsuarios() {
        for (Usuario u : usuarioService.listarUsuarios()) {
            System.out.println("Usuário: " + u.getUsername());
        }
    }
}


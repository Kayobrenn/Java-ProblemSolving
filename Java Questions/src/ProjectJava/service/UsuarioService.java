package ProjectJava.service;

import ProjectJava.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();

    public UsuarioService() {
        // Usuário padrão do sistema
        usuarios.add(new Usuario("Kayo", "123"));
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public boolean autenticar(String username, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username) && usuario.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}


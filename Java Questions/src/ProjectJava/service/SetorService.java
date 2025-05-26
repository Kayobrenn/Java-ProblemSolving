package ProjectJava.service;

import ProjectJava.model.Setor;
import java.util.ArrayList;
import java.util.List;

public class SetorService {
    private List<Setor> setores = new ArrayList<>();

    public void cadastrarSetor(Setor setor) {
        setores.add(setor);
    }

    public List<Setor> listarSetores() {
        return setores;
    }

    public Setor buscarPorNome(String nome) {
        for (Setor setor : setores) {
            if (setor.getNome().equalsIgnoreCase(nome)) {
                return setor;
            }
        }
        return null;
    }

    public boolean excluirSetor(Setor setor) {
        return setores.remove(setor);
    }
}


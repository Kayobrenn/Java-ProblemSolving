package Q7.model;

import Q7.enums.Classificacao;
import model.interfaces.Folha;

public final class Professor extends Pessoa implements Folha {
    private String especialização;

    public String getEspecialização() {
        return especialização;
    }

    public void setEspecialização(String especialização) {
        this.especialização = especialização;
    }

    @Override
    public void quem_sou_eu() {
        System.out.println(Classificacao.Professor);
    }
    @Override
    public String toString() {
        return super.toString()+ "especialização=" + especialização;
    }
    @Override
    public void calculaSalario() {
        System.out.println("(horas trabalhadas x valor hora)");
    }
}

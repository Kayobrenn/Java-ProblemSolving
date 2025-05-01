package NOTA3;

public class Main {
    public static void main(String[] args) {

        Cavalo cavalo = new Cavalo();
        cavalo.raca = "Mangalarga";
        cavalo.comer();
        cavalo.fugir();

        Leao leao = new Leao();
        leao.juba = true;
        leao.comer();
        leao.cacar();

        ClinicoGeral clinico = new ClinicoGeral();
        clinico.trabalhaNoHospital = true;
        clinico.tratarPaciente();
        clinico.receitar();

        Cirurgiao cirurgiao = new Cirurgiao();
        cirurgiao.trabalhaNoHospital = true;
        cirurgiao.tratarPaciente();
        cirurgiao.fazerIncisao();
    }
}

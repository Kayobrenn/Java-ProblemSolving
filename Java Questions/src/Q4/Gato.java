package Q4;

public class Gato extends Animal implements Estimacao {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Miau!");
    }

    @Override
    public void brincar() {
        System.out.println(nome + " está brincando com um novelo de lã!");
    }
}

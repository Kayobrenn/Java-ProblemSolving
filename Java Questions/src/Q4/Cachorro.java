package Q4;

public class Cachorro extends Animal implements Estimacao{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Au au!");
    }

    @Override
    public void brincar() {
        System.out.println(nome + " está brincando com a bolinha!");
    }
}

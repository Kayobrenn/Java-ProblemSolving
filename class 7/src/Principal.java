public class Principal {
    public static void main(String[] args) {

        Animal meuCachorro = new Cachorro("Ticú", 3);
        Animal meuGato = new Gato("KiKi", 2);


        meuCachorro.emitirSom();
        ((Estimacao) meuCachorro).brincar();

        meuGato.emitirSom();
        ((Estimacao) meuGato).brincar();
    }
}

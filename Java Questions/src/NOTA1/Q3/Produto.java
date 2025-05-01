package NOTA1.Q3;

class Produto {
    private String nome;
    private int quantidade;
    private double preco;
    private int quantidadevenda;
    private double resultado;


    public void multiplicar() {resultado = quantidadevenda*preco;}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadevenda(int quantidadevenda) {
        this.quantidadevenda = quantidadevenda;
    }

    public int getQuantidadevenda() {
        return quantidadevenda;
    }

    public double getResultado() {
        return resultado;
    }
}
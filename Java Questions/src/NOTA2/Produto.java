package NOTA2;

class Produto {
    private String nome;
    private int quantidade;
    private double preco;
    private int quantidadevenda;
    private double resultado;
    private int codprod;
    private String Tamanho_peso;
    private String color;
    private Double valorpago;

    public void calcularTotalVenda() {
        resultado = quantidadevenda * preco;
    }

    public void reduzir_estoque() {
        quantidade -= quantidadevenda;
    }
    public void desconto() {
        resultado -= resultado * 0.05;
    }

    public void troco() {
        double troco = valorpago - resultado;
        System.out.println("Troco R$ " + String.format("%.2f", troco));
    }


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

    public int getQuantidadevenda() {
        return quantidadevenda;
    }

    public void setQuantidadevenda(int quantidadevenda) {
        this.quantidadevenda = quantidadevenda;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getCodprod() {
        return codprod;
    }

    public void setCodprod(int codprod) {
        this.codprod = codprod;
    }

    public String getTamanho_peso() {
        return Tamanho_peso;
    }

    public void setTamanho_peso(String tamanho_peso) {
        Tamanho_peso = tamanho_peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getValorpago() {
        return valorpago;
    }

    public void setValorpago(Double valorpago) {
        this.valorpago = valorpago;
    }
}
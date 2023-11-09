package br.com.fiap.beans;

public class Produto {
    private int codigo;
    private String tipo;
    private String marca;

    private int quantidade;

    private double valor;

    // Construtor vazio
    public Produto() {

    }

    // Como criar um constructor
    public Produto(int codigo, String tipo, String marca, int quantidade, double valor) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.marca = marca;
        this.quantidade = quantidade;
        this.valor = valor;
    }


    // Getters and Setter do codigo
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int Codigo) {
        this.codigo = codigo;
    }

    // Getter e Setter do TIPO
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // getter e Setter Marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    // getter e Setter Quantidade
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    // getter e Setter Valor
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    // passar o tipo da variavel de retorno
    public double valorCalculado() {
        double valorCalc = valor * 2;
        return valorCalc;
    }

}

package entity;

import java.sql.SQLOutput;

public class Automovel {
    private String marca;
    private int anoDeFabricacao;
    private String modelo;

    public Automovel(String marca, int anoDeFabricacao, String modelo) {
        this.marca = marca;
        this.anoDeFabricacao = anoDeFabricacao;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void Ligar() {
        System.out.println("O automóvel está ligado");
    }

    public void Desligar() {
        System.out.println("O automóvel está desligado");
    }

}

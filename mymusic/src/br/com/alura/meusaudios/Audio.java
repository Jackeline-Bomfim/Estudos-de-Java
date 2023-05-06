package br.com.alura.meusaudios;

public class Audio {

    private String titulo;
    private double duracao;
    private int totalDeReproducoes;

    private int curtidas;

    private int classificacao;

    private boolean toca = false;

    //setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    //getters

    public String getTitulo() {
        return titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    //métodos

    public void tocaSom(){
        System.out.println("Você está ouvindo: " + this.getTitulo());
        toca = true;
        if(toca){
            this.totalDeReproducoes += 1;
        }
    }

    public void curti(){
        this.curtidas += 1;
    }









}

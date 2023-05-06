package br.com.alura.meusaudios;

public class Podcast extends Audio{

    private String programa;

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public int getClassificacao() {
        if(this.getCurtidas() > 1000){
            return 10;
        } else {
            return 5;
        }
    }
}

package br.com.alura.meusaudios;

public class Musica extends Audio{

    private String album;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeReproducoes() > 200) {
            return 10;
        } else {
            return 5;
        }
    }
}

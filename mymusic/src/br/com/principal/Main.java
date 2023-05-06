package br.com.principal;

import br.com.alura.meusaudios.Musica;
import br.com.alura.meusaudios.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica();
        musica1.setTitulo("Drive - Incubus");
        musica1.setDuracao(3.52);

        musica1.tocaSom();
        musica1.tocaSom();
        musica1.tocaSom();
        musica1.tocaSom();
        musica1.tocaSom();
        musica1.curti();
        musica1.curti();
        System.out.println(musica1.getTotalDeReproducoes());
        System.out.println(musica1.getCurtidas());
        System.out.println(musica1.getClassificacao());

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("A vida não está fácil!");
        podcast1.setDuracao(35.0);

        podcast1.tocaSom();
        podcast1.tocaSom();
        podcast1.tocaSom();
        podcast1.curti();
        System.out.println(podcast1.getTotalDeReproducoes());
        System.out.println(podcast1.getCurtidas());
        System.out.println(podcast1.getClassificacao());
    }
}
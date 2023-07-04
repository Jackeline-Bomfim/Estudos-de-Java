package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(7);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(9);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2002);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item);
            if(item instanceof Filme filme){
                System.out.println("Classificação do filme: " + filme.getClassificacaoad());
            }

        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jackeline");
        buscaPorArtista.add("Maria Eduarda");
        buscaPorArtista.add("Clarice");
        buscaPorArtista.add("José");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de títulos ordenadas:");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenado por ano de lançamento");
        System.out.println(lista);
    }
}

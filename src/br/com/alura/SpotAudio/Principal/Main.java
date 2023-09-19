package br.com.alura.SpotAudio.Principal;

import br.com.alura.SpotAudio.Modelos.Musica.Musica;
import br.com.alura.SpotAudio.Modelos.Podcast.EpisodioPodcast;
import br.com.alura.SpotAudio.Modelos.Podcast.Podcast;
import br.com.alura.SpotAudio.Modelos.Recomendacao;
import br.com.alura.SpotAudio.Modelos.Serie.AudioSerie;
import br.com.alura.SpotAudio.Modelos.Serie.EpisodioSerie;

import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        Podcast nerdcast = new Podcast();
        EpisodioPodcast fofoca = new EpisodioPodcast();
        AudioSerie francaLabirinto = new AudioSerie();
        EpisodioSerie primeiro = new EpisodioSerie();

        minhaMusica.setDuracao(425);
        minhaMusica.setAlbum("Dark Side of The Moon");
        minhaMusica.setTitulo("Time");
        minhaMusica.setAnoDeLancamento(1973);

        nerdcast.setTitulo("NerdCast");
        nerdcast.setApresentador("Alexandre Ottoni e Deive Pazos");
        nerdcast.setDescricao("Um podcast sobre assuntos diversos com mutias risadas!");

        fofoca.setPodcast(nerdcast);
        fofoca.setTitulo("Como é bom fofocar!");
        fofoca.setNumDoEpisodio(899);

        francaLabirinto.setTotalDeEpisodios(13);
        francaLabirinto.setTotalDeTemporadas(1);
        francaLabirinto.setTitulo("França e o Labirinto");

        primeiro.setNumEpisodio(1);
        primeiro.setNumTemporada(1);
        primeiro.setTitulo("Um Corpo na Noite");
        primeiro.setSerie(francaLabirinto);

        for (int i = 0; i <= 3000 ; i++) {
            minhaMusica.reprouz();
        }

        for (int i = 0; i < 2000; i++) {
            fofoca.curte();
        }

        for (int i = 0; i < 300; i++) {
            francaLabirinto.avalia(new Random().nextInt(10));
        }

        for (int i = 0; i < 2000; i++) {
            primeiro.reprouz();
        }

        Recomendacao minhaRecomendacao = new Recomendacao();

        minhaRecomendacao.inclui(minhaMusica);
        minhaRecomendacao.inclui(fofoca);
        minhaRecomendacao.inclui(primeiro);

    }
}
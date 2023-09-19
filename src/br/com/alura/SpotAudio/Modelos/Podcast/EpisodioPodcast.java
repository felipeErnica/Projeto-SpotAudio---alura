package br.com.alura.SpotAudio.Modelos.Podcast;

import br.com.alura.SpotAudio.Modelos.Audio;

public class EpisodioPodcast extends Audio  {

    private int numDoEpisodio;
    private Podcast podcast;

    public int getNumDoEpisodio() {
        return numDoEpisodio;
    }

    public void setNumDoEpisodio(int numDoEpisodio) {
        this.numDoEpisodio = numDoEpisodio;
    }

    public Podcast getPodcast() {
        return podcast;
    }

    public void setPodcast(Podcast podcast) {
        this.podcast = podcast;
    }

    @Override
    public String getTitulo() {
        return podcast.getTitulo() + " #" + this.numDoEpisodio + " - " + super.getTitulo();
    }

    public int getClassificacao() {

        if (this.getNumCurtidas() >=4000){
            return 10;
        } else if (this.getNumCurtidas() >=1000) {
            return 7;
        } else if (this.getNumCurtidas() >=800) {
            return 6;
        } else {
            return 4;
        }
    }
}

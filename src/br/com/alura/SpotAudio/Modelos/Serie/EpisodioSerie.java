package br.com.alura.SpotAudio.Modelos.Serie;

import br.com.alura.SpotAudio.Modelos.Audio;

public class EpisodioSerie extends Audio {

    AudioSerie serie;
    int numEpisodio;
    int numTemporada;

    public AudioSerie getSerie() {
        return serie;
    }

    @Override
    public String getTitulo() {
        return serie.getTitulo() + ": " + this.numEpisodio + " - " + super.getTitulo();
    }

    public void setSerie(AudioSerie serie) {
        this.serie = serie;
    }

    public int getNumTemporada() {
        return numTemporada;
    }

    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }

    public int getNumEpisodio() {
        return numEpisodio;
    }

    public void setNumEpisodio(int numEpisodio) {
        this.numEpisodio = numEpisodio;
    }

    public int getClassificacao() {

        int indiceClassifica = (int) (this.getNumReproducoes()*serie.getClassificacao());

        if (indiceClassifica >=10000){
            return 10;
        } else if (indiceClassifica >=8000) {
            return 7;
        } else if (indiceClassifica >=6500) {
            return 6;
        } else {
            return 5;
        }
    }
}

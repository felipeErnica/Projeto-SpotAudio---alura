package br.com.alura.SpotAudio.Modelos.Serie;

import br.com.alura.SpotAudio.Modelos.Audio;

public class AudioSerie extends Audio  {

    private int totalDeEpisodios;
    private int totalDeTemporadas;

    public int getTotalDeEpisodios() {
        return totalDeEpisodios;
    }

    public void setTotalDeEpisodios(int totalDeEpisodios) { this.totalDeEpisodios = totalDeEpisodios; }

    public int getTotalDeTemporadas() {
        return totalDeTemporadas;
    }

    public void setTotalDeTemporadas(int totalDeTemporadas) {
        this.totalDeTemporadas = totalDeTemporadas;
    }

}

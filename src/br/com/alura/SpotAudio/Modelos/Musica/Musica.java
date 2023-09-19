package br.com.alura.SpotAudio.Modelos.Musica;

import br.com.alura.SpotAudio.Modelos.Audio;

public class Musica extends Audio {

    private String nomeArtista;
    private String album;
    private String genero;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    @Override
    public int getClassificacao() {

        if (this.getNumReproducoes() >=3000){
            return 10;
        } else if (this.getNumReproducoes() >=2000) {
            return 7;
        } else {
            return 5;
        }
    }
}

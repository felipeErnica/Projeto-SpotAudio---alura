package br.com.alura.SpotAudio.Modelos.Podcast;
import br.com.alura.SpotAudio.Modelos.Audio;

public class Podcast  extends Audio {

    private String apresentador;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}

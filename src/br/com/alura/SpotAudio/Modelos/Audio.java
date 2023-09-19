package br.com.alura.SpotAudio.Modelos;

public class Audio {

    private int duracao;
    private String titulo;
    private int anoDeLancamento;
    private int avaliacaoTotal;
    private int numAvaliacoes;
    private int numCurtidas;
    private int numReproducoes;

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {

        this.duracao = duracao;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getNumCurtidas() {
        return numCurtidas;
    }

    public int getNumReproducoes() {

        return numReproducoes;
    }

    public void curte(){

        numCurtidas++;
    }

    public void reprouz(){
        numReproducoes++;
    }

    public void avalia (int avaliacao) {
        avaliacaoTotal += avaliacao;
        numAvaliacoes++;
    }

    public int getClassificacao(){
        return avaliacaoTotal /numAvaliacoes;
    }
}

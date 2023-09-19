package br.com.alura.SpotAudio.Modelos;

import org.jetbrains.annotations.NotNull;

public class Recomendacao {
    public void inclui (Audio recomendado) {

        if (recomendado.getClassificacao() >=8) {
            System.out.println( recomendado.getTitulo() +" é um dos maiores sucessos do momento!");
        } else if (recomendado.getClassificacao() >=6) {
            System.out.println( recomendado.getTitulo() + " é bem recomendado!");
        } else {
            System.out.println("Guarde " + recomendado.getTitulo() + " para assitir depois!");
        }

    }
}

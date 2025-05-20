package Modelo;

import java.io.Serializable;

public class Portao extends Personagem implements Serializable {
    protected String chave;

    public Portao(String sNomeImagemPng, String chave) {
        super(sNomeImagemPng);
        this.chave = chave;
    }

    public void colisao(Personagem hero) {
        if (((Hero)hero).temItem(this.chave)) {
            // abrir
        }
    }
}

package Modelo;

import java.io.Serializable;

public class Item extends Personagem implements Serializable {
    protected String id;

    public Item(String sNomeImagemPNG, String id) {
        super(sNomeImagemPNG);
        this.id = id;
        this.bColisao = true;
        this.bTransponivel = true;
        this.bMortal = true;
    }

    public String getId() {
        return id;
    }

    public void colisao(Personagem hero) {
        ((Hero)hero).coletar(this);
    }
}

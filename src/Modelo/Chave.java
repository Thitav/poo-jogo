package Modelo;

import java.io.Serializable;

public class Chave extends Item implements Serializable {
   public Chave(String sNomeImagemPng) {
       super(sNomeImagemPng, "chave", false);
   }

    public void autoDesenho() {
        super.autoDesenho();
    }
}

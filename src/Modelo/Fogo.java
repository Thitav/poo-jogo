package Modelo;

import Auxiliar.Desenho;
import Auxiliar.Direcao;

import java.io.Serializable;

public class Fogo extends Personagem implements Serializable{

    public Fogo(String sNomeImagePNG, Direcao direcao) { // novo parametro
        super(sNomeImagePNG, true);
        this.bMortal = true;
        this.setDirecao(direcao);
    }

    @Override
    public void autoDesenho() {
        super.autoDesenho();

        Direcao direcao = this.getDirecao();
        if (direcao == Direcao.DIREITA) { // faz andar pra direita
            if (!this.moveRight()) {
                Desenho.acessoATelaDoJogo().removePersonagem(this);
            }
        } else if (direcao == Direcao.ESQUERDA) { // faz andar pra esquerda (n está funcionando)
            if (!this.moveLeft()) {
                Desenho.acessoATelaDoJogo().removePersonagem(this);
            }
        }
    }
    
}

package Modelo;

import Auxiliar.Direcao;

import java.io.Serializable;

public class BichinhoVaiVemHorizontal extends Personagem implements Serializable {
    int iContador;

    public BichinhoVaiVemHorizontal(String sNomeImagePNG) {
        super(sNomeImagePNG, true);
        iContador = 0;
    }

    public void autoDesenho() {
        if (iContador == 5) {
            iContador = 0;
            if (this.direcao == Direcao.DIREITA) {
                this.moveRight();
                // this.setPosicao(pPosicao.getLinha(), pPosicao.getColuna() + 1);
            } else {
                this.moveLeft();
                // this.setPosicao(pPosicao.getLinha(), pPosicao.getColuna() - 1);
            }

            this.viraDirecao();
        }
        super.autoDesenho();
        iContador++;
    }
}

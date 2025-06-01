package Modelo;

import Auxiliar.Desenho;
import Controler.Tela;
import java.awt.Graphics;
import java.io.Serializable;

public class Fogo extends Personagem implements Serializable{

    private String direcao; // direcao da bola de fogo: esq ou dir

    public Fogo(String sNomeImagePNG, String direcao) { // novo parametro
        super(sNomeImagePNG);
        this.bMortal = true;
        this.direcao = direcao; // atribui aq
    }

    @Override
    public void autoDesenho() {
        super.autoDesenho();

        if(!this.moveRight())
            Desenho.acessoATelaDoJogo().removePersonagem(this);

        if (direcao.equals("dir")) { // faz andar pra direita
            this.pPosicao.setPosicao(this.pPosicao.getLinha(), this.pPosicao.getColuna() + 1);
        } else if (direcao.equals("esq")) { // faz andar pra esquerda (n está funcionando)
            this.pPosicao.setPosicao(this.pPosicao.getLinha(), this.pPosicao.getColuna() - 1);
        }
    }
    
}

package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenho;
import Auxiliar.Direcao;

import java.io.Serializable;

public class Caveira extends Personagem implements Serializable{
    private int iContaIntervalos;
    
    public Caveira(String sNomeImagePNG) {
        super(sNomeImagePNG, false);
        this.bTransponivel = false;
        bMortal = false;
        this.iContaIntervalos = 0;
    }

    public void autoDesenho() {
        super.autoDesenho();

        this.iContaIntervalos++;
        if(this.iContaIntervalos == Consts.TIMER){
            this.iContaIntervalos = 0;
            Fogo f = new Fogo("Tiro_Terra.png", Direcao.DIREITA);
            f.moveRight();
            // f.setPosicao(pPosicao.getLinha(),pPosicao.getColuna()+1);
            Desenho.acessoATelaDoJogo().addPersonagem(f);
        }
    }    
}

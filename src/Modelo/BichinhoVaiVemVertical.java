
package Modelo;

import Auxiliar.Desenho;
import java.util.Random;

public class BichinhoVaiVemVertical extends Personagem{
    boolean bUp;
    public BichinhoVaiVemVertical(String sNomeImagePNG) {
        super(sNomeImagePNG, false);
        bUp = true;
    }

    public void autoDesenho(){
        if(bUp)
            this.moveUp();
            // this.setPosicao(pPosicao.getLinha()-1, pPosicao.getColuna());
        else
            this.moveDown();
            // this.setPosicao(pPosicao.getLinha()+1, pPosicao.getColuna());

        super.autoDesenho();
        bUp = !bUp;
    }  
}

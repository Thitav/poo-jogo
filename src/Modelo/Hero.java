package Modelo;

import Auxiliar.Desenho;
import Auxiliar.Direcao;

import java.io.Serializable;
import java.util.ArrayList;

public class Hero extends Personagem implements Serializable{
    private ArrayList<Item> inventario;

    public Hero(String sNomeImagePNG)
    {
        super(sNomeImagePNG, true);
        this.inventario = new ArrayList<>();
    }

    public void coletar(Item item) {
        this.inventario.add(item);
    }

    public boolean temItem(String id) {
        return this.inventario.stream().anyMatch(i -> i.getId().equals(id));
    }

    public void voltaAUltimaPosicao(){
        this.pPosicao.volta();
    }
    
    public boolean setPosicao(int linha, int coluna) {
        if(this.pPosicao.setPosicao(linha, coluna)){
            if (!Desenho.acessoAFase().ehPosicaoValida(this.getPosicao())) {
                this.voltaAUltimaPosicao();
            }
            return true;
        }
        return false;       
    }

    /*TO-DO: este metodo pode ser interessante a todos os personagens que se movem*/
    private boolean validaPosicao(){
        if (!Desenho.acessoAFase().ehPosicaoValida(this.getPosicao())) {
            this.voltaAUltimaPosicao();
            return false;
        }
        return true;       
    }
    
    public boolean moveUp() {
        if(super.moveUp())
            return validaPosicao();
        return false;
    }

    public boolean moveDown() {
        if(super.moveDown())
            return validaPosicao();
        return false;
    }

    public boolean moveRight() {
        this.setDirecao(Direcao.DIREITA);
        if(super.moveRight())
            return validaPosicao();
        return false;
    }

    public boolean moveLeft() {
        this.setDirecao(Direcao.ESQUERDA);
        if(super.moveLeft())
            return validaPosicao();
        return false;
    }

    public void atiraFogo(){ // Metodo pro heroi atirar fogo
        Fogo tiro;

        if (this.direcao == Direcao.DIREITA) {
            tiro = new Fogo("Tiro_Lava.png", Direcao.DIREITA);
            tiro.setPosicao(pPosicao.getLinha(), pPosicao.getColuna() + 1);
        } else {
            tiro = new Fogo("Tiro_Lava.png", Direcao.ESQUERDA);
            tiro.setPosicao(pPosicao.getLinha(), pPosicao.getColuna() - 1);
        }
        Desenho.acessoAFase().addPersonagem(tiro);
    }
}

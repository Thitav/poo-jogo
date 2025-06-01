package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenho;
import Auxiliar.Posicao;
import Controler.ControleDeJogo;
import Controler.Tela;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Hero extends Personagem implements Serializable{
    private ArrayList<Item> inventario;
    private int ContadorDeIntervalos;

    public Hero(String sNomeImagePNG)
    {
        super(sNomeImagePNG);
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
            if (!Desenho.acessoATelaDoJogo().ehPosicaoValida(this.getPosicao())) {
                this.voltaAUltimaPosicao();
            }
            return true;
        }
        return false;       
    }

    /*TO-DO: este metodo pode ser interessante a todos os personagens que se movem*/
    private boolean validaPosicao(){
        if (!Desenho.acessoATelaDoJogo().ehPosicaoValida(this.getPosicao())) {
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
        if(super.moveRight())
            return validaPosicao();
        return false;
    }

    public boolean moveLeft() {
        if(super.moveLeft())
            return validaPosicao();
        return false;
    }

    public void atiraFogo(){ // Metodo pro heroi atirar fogo

        System.out.println(">> Fogo disparado pelo herói"); //debug

        this.ContadorDeIntervalos++;
        Fogo tiro;

        if (this.getImagem().contains("dir")) {
            tiro = new Fogo("Tiro_Lava.png", "dir");
            tiro.setPosicao(pPosicao.getLinha(), pPosicao.getColuna() + 1);
        } else {
            tiro = new Fogo("Tiro_Lava.png", "esq");
            tiro.setPosicao(pPosicao.getLinha(), pPosicao.getColuna() - 1);
        }
        Desenho.acessoATelaDoJogo().addPersonagem(tiro);
    }
}

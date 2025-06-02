package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenho;
import Auxiliar.Posicao;
import Auxiliar.Direcao;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.ImageIcon;

public abstract class Personagem implements Serializable {

    protected ImageIcon iImage;
    protected ImageIcon iImageMirror;
    protected Direcao direcao;
    protected Posicao pPosicao;
    protected boolean bTransponivel; /*Pode passar por cima?*/
    protected boolean bMortal;       /*Se encostar, morre?*/
    protected boolean bColisao;      /*Item processa colisao?*/
    protected String sNomeImagePNG;


    public boolean isbColisao() {
        return bColisao;
    }

    public boolean isbMortal() {
        return bMortal;
    }

    public String getImagem() { // retorna imagem
        return this.sNomeImagePNG;
    }


    protected Personagem(String sNomeImagePNG, boolean temDirecao) {
        this.pPosicao = new Posicao(1, 1);
        this.bTransponivel = true;
        this.bMortal = false;
        this.bColisao = false;
        try {
            iImage = new ImageIcon(new java.io.File(".").getCanonicalPath() + Consts.PATH + sNomeImagePNG);
            Image img = iImage.getImage();
            BufferedImage bi = new BufferedImage(Consts.CELL_SIDE, Consts.CELL_SIDE, BufferedImage.TYPE_INT_ARGB);
            Graphics g = bi.createGraphics();
            g.drawImage(img, 0, 0, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
            g.dispose();

            this.iImage = new ImageIcon(bi);

            if (temDirecao) {
                AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
                tx.translate(-bi.getWidth(), 0);
                AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
                BufferedImage biMirror = new BufferedImage(Consts.CELL_SIDE, Consts.CELL_SIDE, BufferedImage.TYPE_INT_ARGB);
                op.filter(bi, biMirror);

                this.iImageMirror = new ImageIcon(biMirror);
            } else {
                this.iImageMirror = this.iImage;
            }

            this.direcao = Direcao.DIREITA;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Posicao getPosicao() {
        /*TODO: Retirar este método para que objetos externos nao possam operar
         diretamente sobre a posição do Personagem*/
        return pPosicao;
    }

    public void setImagem(String imagemNova) { // Atribuir imagem
        this.sNomeImagePNG = imagemNova;
        try {
            iImage = new ImageIcon(
                    new java.io.File(".").getCanonicalPath() + Consts.PATH + sNomeImagePNG
            );

            Image img = iImage.getImage();
            BufferedImage bi = new BufferedImage(Consts.CELL_SIDE, Consts.CELL_SIDE, BufferedImage.TYPE_INT_ARGB);
            Graphics g = bi.createGraphics();
            g.drawImage(img, 0, 0, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
            iImage = new ImageIcon(bi);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public boolean isbTransponivel() {
        return bTransponivel;
    }

    public void setbTransponivel(boolean bTransponivel) {
        this.bTransponivel = bTransponivel;
    }

    public void autoDesenho(){
        ImageIcon icon = this.iImage;
        if (iImageMirror != null && this.direcao == Direcao.ESQUERDA) {
            icon = this.iImageMirror;
        }
        Desenho.desenhar(icon, this.pPosicao.getColuna(), this.pPosicao.getLinha());
    }

    public boolean setPosicao(int linha, int coluna) {
        return pPosicao.setPosicao(linha, coluna);
    }

    public Direcao getDirecao() {
        return direcao;
    }
    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    public void viraDirecao() {
        if (this.direcao == Direcao.ESQUERDA) {
            this.setDirecao(Direcao.DIREITA);
        } else {
            this.setDirecao(Direcao.ESQUERDA);
        }
    }

    public boolean moveUp() {
        return this.pPosicao.moveUp();
    }

    public boolean moveDown() {
        return this.pPosicao.moveDown();
    }

    public boolean moveRight() {
        return this.pPosicao.moveRight();
    }

    public boolean moveLeft() {
        return this.pPosicao.moveLeft();
    }

    public void colisao(Personagem p) {}
}

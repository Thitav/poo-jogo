package Fases;

import Auxiliar.Consts;
import Modelo.*;

public class Fase1 extends Fase {
    public void construir() {
        Hero hero = new Hero("Kratos.png");
        hero.setPosicao(1, 8);
        this.addPersonagem(hero);

        ZigueZague zz = new ZigueZague("Tiro_Ceu.png");
        zz.setPosicao(5, 5);
        this.addPersonagem(zz);

        BichinhoVaiVemHorizontal bBichinhoH = new BichinhoVaiVemHorizontal("Inimigo_Terra.png");
        bBichinhoH.setPosicao(3, 3);
        this.addPersonagem(bBichinhoH);

        BichinhoVaiVemHorizontal bBichinhoH2 = new BichinhoVaiVemHorizontal("Inimigo_Terra.png");
        bBichinhoH2.setPosicao(6, 6);
        this.addPersonagem(bBichinhoH2);

        BichinhoVaiVemVertical bVv = new BichinhoVaiVemVertical("Inimigo_Terra.png");
        bVv.setPosicao(10, 10);
        this.addPersonagem(bVv);

        Caveira bV = new Caveira("Deus_Terra.png");
        bV.setPosicao(9, 1);
        this.addPersonagem(bV);

        Chave c = new Chave("Chave.png");
        c.setPosicao(5, 5);
        this.addPersonagem(c);

        Portao p = new Portao("Portao.png", "chave");
        p.setPosicao(28, 8);
        this.addPersonagem(p);

        Chaser chase = new Chaser("Tiro_Lava.png");
        chase.setPosicao(12, 12);
        this.addPersonagem(chase);

        // Parede no topo e base
        for (int col = 0; col < Consts.MUNDO_LARGURA; col++) {
            Parede paredeTopo = new Parede("Parede_Terra.png");
            paredeTopo.setPosicao(0, col);
            this.addPersonagem(paredeTopo);

            Parede paredeBase = new Parede("Parede_Terra.png");
            paredeBase.setPosicao(29, col);
            this.addPersonagem(paredeBase);
        }

        // Parede nas laterais esquerda e direita
        for (int l = 1; l < Consts.MUNDO_ALTURA; l++) {
            Parede paredeEsquerda = new Parede("Parede_Terra.png");
            paredeEsquerda.setPosicao(l, 0);
            this.addPersonagem(paredeEsquerda);

            Parede paredeDireita = new Parede("Parede_Terra.png");
            paredeDireita.setPosicao(l, 16);
            this.addPersonagem(paredeDireita);
        }
    }
}

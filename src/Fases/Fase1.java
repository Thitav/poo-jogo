package Fases;

import Auxiliar.Consts;
import Modelo.*;

public class Fase1 extends Fase {
    public void construir() {
        Hero hero = new Hero("Kratos.png");
        hero.setPosicao(1, 8);
        this.addPersonagem(hero);

        ZigueZague zz = new ZigueZague("Tiro_Ceu.png");
        zz.setPosicao(23, 8);
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
        bV.setPosicao(19, 8);
        this.addPersonagem(bV);

        Chave c1 = new Chave("Chave.png");
        c1.setPosicao(6, 2);
        this.addPersonagem(c1);

        Chave c2 = new Chave("Chave.png");
        c2.setPosicao(6, 14);
        this.addPersonagem(c2);

        Chave c3 = new Chave("Chave.png");
        c3.setPosicao(17, 8);
        this.addPersonagem(c3);

        Chave c4 = new Chave("Chave.png");
        c4.setPosicao(26, 8);
        this.addPersonagem(c4);

        Portao p = new Portao("Portao.png", "chave");
        p.setPosicao(28, 8);
        this.addPersonagem(p);

        Chaser chase = new Chaser("Chaser.png");
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

        int[][] paredesInternas1 = {

                {3, 2}, {3, 3}, {3, 4}, {3, 6}, {3, 10}, {3, 12}, {3, 13}, {3, 14},
                {4, 1}, {4, 5}, {4, 11}, {4, 15},
                {5, 6}, {5, 10},
                {6, 6}, {6, 10},
                {7, 6}, {7, 10},
                {8, 3}, {8, 6}, {8, 10}, {8, 13},
                {9, 2}, {9, 6}, {9, 10}, {9, 14},
                {10, 1}, {10, 6}, {10, 10}, {10, 15},
                {11, 4}, {11, 5}, {11, 11}, {11, 12},
                {15, 3}, {15, 8}, {15, 13},
                {16, 2}, {16, 4}, {16, 7}, {16, 9}, {16, 12}, {16, 14},
                {17, 3}, {17, 6}, {17, 10}, {17, 13},
                {18, 4}, {18, 5}, {18, 11}, {18, 12},
                {22, 5}, {22, 6}, {22, 10}, {22, 11},
                {23, 4}, {23, 7}, {23, 9}, {23, 10},
                {24, 3}, {24, 8}, {24, 13},
                {25, 4}, {25, 6}, {25, 9}, {25, 11}, {25, 12},
                {26, 5}, {26, 6}, {26, 10},
                {27, 1}, {27, 15},
                {28, 1}, {28, 2}, {28, 14}, {28, 15}
        };

        for (int[] pos : paredesInternas1) {
            Parede parede = new Parede("Parede_Terra.png");
            parede.setPosicao(pos[0], pos[1]);
            this.addPersonagem(parede);
        }
    }
}

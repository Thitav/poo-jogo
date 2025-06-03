package Fases;

import Auxiliar.Consts;
import Modelo.*;

public class Fase4 extends Fase {
    public void construir() {
        Hero hero = new Hero("Kratos.png");
        hero.setPosicao(1, 8);
        this.addPersonagem(hero);

        /*
        CHAVES: {4,8}, {20,8}, {28,1}, {28,15}
        INIMIGOS HORIZONTAIS: {8,8}, {15,8},
        INIMIGOS VERTICAIS: {20,1}, {20,15}
        INIMIGOS PERAMBULANTES: {12,2}, {12,14}
        DEUS: {22,8}
        */

        ZigueZague zz = new ZigueZague("Tiro_Ceu.png");
        zz.setPosicao(27, 8);
        this.addPersonagem(zz);

        BichinhoVaiVemHorizontal bBichinhoH1 = new BichinhoVaiVemHorizontal("Inimigo_Gelo.png");
        bBichinhoH1.setPosicao(8, 8);
        this.addPersonagem(bBichinhoH1);

        BichinhoVaiVemHorizontal bBichinhoH2 = new BichinhoVaiVemHorizontal("Inimigo_Gelo.png");
        bBichinhoH2.setPosicao(15, 8);
        this.addPersonagem(bBichinhoH2);

        BichinhoVaiVemHorizontal bBichinhoH5 = new BichinhoVaiVemHorizontal("Inimigo_Gelo.png");
        bBichinhoH5.setPosicao(25, 14);
        this.addPersonagem(bBichinhoH5);

        BichinhoVaiVemVertical bVv1 = new BichinhoVaiVemVertical("Inimigo_Gelo.png");
        bVv1.setPosicao(20, 1);
        this.addPersonagem(bVv1);

        BichinhoVaiVemVertical bVv2 = new BichinhoVaiVemVertical("Inimigo_Gelo.png");
        bVv2.setPosicao(20, 15);
        this.addPersonagem(bVv2);

        Caveira bV = new Caveira("Deus_Gelo.png");
        bV.setPosicao(22, 8);
        this.addPersonagem(bV);

        Chave c1 = new Chave("Chave.png");
        c1.setPosicao(4, 8);
        this.addPersonagem(c1);

        Chave c2 = new Chave("Chave.png");
        c2.setPosicao(20, 8);
        this.addPersonagem(c2);

        Chave c3 = new Chave("Chave.png");
        c3.setPosicao(28, 1);
        this.addPersonagem(c3);

        Portao p = new Portao("Portao.png", "chave");
        p.setPosicao(28, 15);
        this.addPersonagem(p);

        Chaser chase = new Chaser("Chaser.png");
        chase.setPosicao(18, 8);
        this.addPersonagem(chase);

        // Parede no topo e base
        for (int col = 0; col < Consts.MUNDO_LARGURA; col++) {
            Parede paredeTopo = new Parede("Parede_Gelo.png");
            paredeTopo.setPosicao(0, col);
            this.addPersonagem(paredeTopo);

            Parede paredeBase = new Parede("Parede_Gelo.png");
            paredeBase.setPosicao(29, col);
            this.addPersonagem(paredeBase);
        }

        // Parede nas laterais esquerda e direita
        for (int l = 1; l < Consts.MUNDO_ALTURA; l++) {
            Parede paredeEsquerda = new Parede("Parede_Gelo.png");
            paredeEsquerda.setPosicao(l, 0);
            this.addPersonagem(paredeEsquerda);

            Parede paredeDireita = new Parede("Parede_Gelo.png");
            paredeDireita.setPosicao(l, 16);
            this.addPersonagem(paredeDireita);
        }



        int[][] paredesInternas4 = {

                {1,1}, {1,2}, {1,14}, {1,15},
                {2,1}, {2,6}, {2,10}, {2,15},
                {3,3}, {3,7}, {3,8}, {3,9}, {3,13},
                {4,4}, {4,5}, {4,6}, {4,10}, {4,11}, {4,12},
                {5,1}, {5,4}, {5,12}, {5,15},
                {6,1}, {6,3}, {6,5}, {6,6}, {6,10}, {6,11}, {6,13}, {6,15},
                {7,3}, {7,5}, {7,6}, {7,10}, {7,11}, {7,13},
                {8,2}, {8,3}, {8,13}, {8,14},
                {9,2}, {9,3}, {9,7}, {9,9}, {9,13}, {9,14},
                {10,4}, {10,6}, {10,10}, {10,12},
                {11,5}, {11,6}, {11,10}, {11,11},
                {12,6}, {12,8}, {12,10},
                {13,1}, {13,2}, {13,6}, {13,8}, {13,10}, {13,14}, {13,15},
                {14,3}, {14,6}, {14,10}, {14,13},
                {16,3}, {16,8}, {16,13},
                {17,4}, {17,5}, {17,6}, {17,10}, {17,11}, {17,12},
                {18,3}, {18,8}, {18,13},
                {19,3}, {19,8}, {19,13},
                {20,3}, {20,7}, {20,9}, {20,13},
                {21,3}, {21,6}, {21,10}, {21,13},
                {22,2}, {22,6}, {22,10}, {22,14},
                {23,3}, {23,5}, {23,6}, {23,10}, {23,11}, {23,13},
                {24,3}, {24,13},
                {25,3}, {25,13},
                {26,1}, {26,3}, {26,5}, {26,11}, {26,13}, {26,15},
                {27,1}, {27,3}, {27,4}, {27,6}, {27,10}, {27,12}, {27,13}, {27,15},
                {28,3}, {28,13},

        };
        for (int[] pos : paredesInternas4) {
            Parede parede = new Parede("Parede_Gelo.png");
            parede.setPosicao(pos[0], pos[1]);
            this.addPersonagem(parede);
        }
    }
}

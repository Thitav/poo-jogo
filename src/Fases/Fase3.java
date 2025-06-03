package Fases;

import Auxiliar.Consts;
import Modelo.*;

public class Fase3 extends Fase {
    public void construir() {
        Hero hero = new Hero("Kratos.png");
        hero.setPosicao(1, 8);
        this.addPersonagem(hero);

        /*
        CHAVES: {11,1}, {11,15}, {22,8}
        INIMIGOS HORIZONTAIS: {6,4}, {6,12}, {11,8}, {25,2}, {25, 14} (TODOS ANDAM 2 PRA DIREITA E 2 PRA ESQUERDA)
        INIMIGOS VERTICAIS: {16,5}, {16,11} (ANDAM 2 PRA CIMA E 1 PRA BAIXO)
        DEUS: {23,8}
         */

        ZigueZague zz = new ZigueZague("Tiro_Ceu.png");
        zz.setPosicao(18, 8);
        this.addPersonagem(zz);

        BichinhoVaiVemHorizontal bBichinhoH1 = new BichinhoVaiVemHorizontal("Inimigo_Deserto.png");
        bBichinhoH1.setPosicao(6, 4);
        this.addPersonagem(bBichinhoH1);

        BichinhoVaiVemHorizontal bBichinhoH2 = new BichinhoVaiVemHorizontal("Inimigo_Deserto.png");
        bBichinhoH2.setPosicao(6, 12);
        this.addPersonagem(bBichinhoH2);

        BichinhoVaiVemHorizontal bBichinhoH3 = new BichinhoVaiVemHorizontal("Inimigo_Deserto.png");
        bBichinhoH3.setPosicao(11, 8);
        this.addPersonagem(bBichinhoH3);

        BichinhoVaiVemHorizontal bBichinhoH4 = new BichinhoVaiVemHorizontal("Inimigo_Deserto.png");
        bBichinhoH4.setPosicao(25, 2);
        this.addPersonagem(bBichinhoH4);

        BichinhoVaiVemHorizontal bBichinhoH5 = new BichinhoVaiVemHorizontal("Inimigo_Deserto.png");
        bBichinhoH5.setPosicao(25, 14);
        this.addPersonagem(bBichinhoH5);

        BichinhoVaiVemVertical bVv1 = new BichinhoVaiVemVertical("Inimigo_Deserto.png");
        bVv1.setPosicao(16, 5);
        this.addPersonagem(bVv1);

        BichinhoVaiVemVertical bVv2 = new BichinhoVaiVemVertical("Inimigo_Deserto.png");
        bVv2.setPosicao(16, 11);
        this.addPersonagem(bVv2);

        Caveira bV = new Caveira("Deus_Deserto.png");
        bV.setPosicao(23, 8);
        this.addPersonagem(bV);

        Chave c1 = new Chave("Chave.png");
        c1.setPosicao(11, 1);
        this.addPersonagem(c1);

        Chave c2 = new Chave("Chave.png");
        c2.setPosicao(11, 15);
        this.addPersonagem(c2);

        Chave c3 = new Chave("Chave.png");
        c3.setPosicao(22, 8);
        this.addPersonagem(c3);

        Portao p = new Portao("Portao.png", "chave");
        p.setPosicao(28, 8);
        this.addPersonagem(p);

        Chaser chase = new Chaser("Chaser.png");
        chase.setPosicao(18, 8);
        this.addPersonagem(chase);

        // Parede no topo e base
        for (int col = 0; col < Consts.MUNDO_LARGURA; col++) {
            Parede paredeTopo = new Parede("Parede_Deserto.png");
            paredeTopo.setPosicao(0, col);
            this.addPersonagem(paredeTopo);

            Parede paredeBase = new Parede("Parede_Deserto.png");
            paredeBase.setPosicao(29, col);
            this.addPersonagem(paredeBase);
        }

        // Parede nas laterais esquerda e direita
        for (int l = 1; l < Consts.MUNDO_ALTURA; l++) {
            Parede paredeEsquerda = new Parede("Parede_Deserto.png");
            paredeEsquerda.setPosicao(l, 0);
            this.addPersonagem(paredeEsquerda);

            Parede paredeDireita = new Parede("Parede_Deserto.png");
            paredeDireita.setPosicao(l, 16);
            this.addPersonagem(paredeDireita);
        }

        int[][] paredesInternas3 = {

                {1,4}, {1,12},
                {3,2}, {3,6}, {3,10}, {3,14},
                {4,3}, {4,4}, {4,5}, {4,11}, {4,12}, {4,13},
                {5,3}, {5,4}, {5,5}, {5,11}, {5,12}, {5,13},
                {7,7}, {7,8}, {7,9},
                {8,4}, {8,5}, {8,6}, {8,10}, {8,11}, {8,12},
                {9,6}, {9,10},
                {10,1}, {10,2}, {10,14}, {10,15},
                {11,3}, {11,13},
                {12,3}, {12,13},
                {13,4}, {13,5}, {13,8}, {13,11}, {13,12},
                {14,8},
                {15,2}, {15,6}, {15,7}, {15,8}, {15,9}, {15,10}, {15,14},
                {16,2}, {16,14},
                {17,2}, {17,3}, {17,13}, {17,14},
                {18,4}, {18,5}, {18,6}, {18,10}, {18,11}, {18,12},
                {20,7}, {20,8}, {20,9},
                {21,1}, {21,4}, {21,5}, {21,6}, {21,7}, {21,8}, {21,9}, {21,10}, {21,11}, {21,12}, {21,15},
                {22,4}, {22,12},
                {23,3}, {23,13},
                {25,7}, {25,9},
                {26,4}, {26,5}, {26,11}, {26,12}

        };
        for (int[] pos : paredesInternas3) {
            Parede parede = new Parede("Parede_Deserto.png");
            parede.setPosicao(pos[0], pos[1]);
            this.addPersonagem(parede);
        }
    }
}

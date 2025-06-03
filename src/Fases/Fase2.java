package Fases;

import Auxiliar.Consts;
import Modelo.*;

public class Fase2 extends Fase {
    public void construir() {
        Hero hero = new Hero("Kratos.png");
        hero.setPosicao(1, 8);
        this.addPersonagem(hero);

        ZigueZague zz = new ZigueZague("Tiro_Ceu.png");
        zz.setPosicao(12, 8);
        this.addPersonagem(zz);

        BichinhoVaiVemHorizontal bBichinhoH = new BichinhoVaiVemHorizontal("Inimigo_Ceu.png");
        bBichinhoH.setPosicao(3, 3);
        this.addPersonagem(bBichinhoH);

        BichinhoVaiVemHorizontal bBichinhoH2 = new BichinhoVaiVemHorizontal("Inimigo_Ceu.png");
        bBichinhoH2.setPosicao(6, 6);
        this.addPersonagem(bBichinhoH2);

        BichinhoVaiVemVertical bVv = new BichinhoVaiVemVertical("Inimigo_Ceu.png");
        bVv.setPosicao(10, 10);
        this.addPersonagem(bVv);

        Caveira bV = new Caveira("Deus_Ceu.png");
        bV.setPosicao(23, 8);
        this.addPersonagem(bV);

        Chave c1 = new Chave("Chave.png");
        c1.setPosicao(17, 4);
        this.addPersonagem(c1);

        Chave c2 = new Chave("Chave.png");
        c2.setPosicao(17, 12);
        this.addPersonagem(c2);

        Chave c3 = new Chave("Chave.png");
        c3.setPosicao(20, 8);
        this.addPersonagem(c3);

        Chave c4 = new Chave("Chave.png");
        c4.setPosicao(22, 8);
        this.addPersonagem(c4);

        Portao p = new Portao("Portao.png", "chave");
        p.setPosicao(28, 8);
        this.addPersonagem(p);

        Chaser chase = new Chaser("Chaser.png");
        chase.setPosicao(12, 12);
        this.addPersonagem(chase);

        // Parede no topo e base
        for (int col = 0; col < Consts.MUNDO_LARGURA; col++) {
            Parede paredeTopo = new Parede("Parede_Ceu.png");
            paredeTopo.setPosicao(0, col);
            this.addPersonagem(paredeTopo);

            Parede paredeBase = new Parede("Parede_Ceu.png");
            paredeBase.setPosicao(29, col);
            this.addPersonagem(paredeBase);
        }

        // Parede nas laterais esquerda e direita
        for (int l = 1; l < Consts.MUNDO_ALTURA; l++) {
            Parede paredeEsquerda = new Parede("Parede_Ceu.png");
            paredeEsquerda.setPosicao(l, 0);
            this.addPersonagem(paredeEsquerda);

            Parede paredeDireita = new Parede("Parede_Ceu.png");
            paredeDireita.setPosicao(l, 16);
            this.addPersonagem(paredeDireita);
        }

        int[][] paredesInternas2 = {

                {1,1}, {1,2}, {1,14}, {1,15},
                {2,1}, {2,15},
                {3,5}, {3,6}, {3,7}, {3,9}, {3,10}, {3,11},
                {4,4}, {4,12},
                {5,3}, {5,4}, {5,12}, {5,13},
                {6,7}, {6,9},
                {7,1}, {7,15},
                {8,2}, {8,3}, {8,7}, {8,9}, {8,13}, {8,14},
                {11,3}, {11,4}, {11,5}, {11,11}, {11,12}, {11,13},
                {12,5}, {12,6}, {12,7}, {12,9}, {12,10}, {12,11},
                {13,1}, {13,5}, {13,11}, {13,15},
                {14,2}, {14,5}, {14,7}, {14,9}, {14,11}, {14,14},
                {15,5}, {15,11},
                {16,4}, {16,5}, {16,7}, {16,8}, {16,9}, {16,11}, {16,12},
                {17,3}, {17,5}, {17,11}, {17,13},
                {18,5}, {18,6}, {18,7}, {18,9}, {18,10}, {18,11},
                {19,1}, {19,5}, {19,11}, {19,15},
                {20,2}, {20,5}, {20,11}, {20,14},
                {21,5}, {21,6}, {21,7}, {21,8}, {21,9}, {21,10}, {21,11},
                {22,7}, {22,9},
                {23,6}, {23,10},
                {24,4}, {24,5}, {24,11}, {24,12},
                {26,8},
                {27,3}, {27,13},
                {28,4}, {28,5}, {28,11}, {28,12},

        };
        for (int[] pos : paredesInternas2) {
            Parede parede = new Parede("Parede_Deserto.png");
            parede.setPosicao(pos[0], pos[1]);
            this.addPersonagem(parede);
        }


    }
}

package Fases;

import Auxiliar.Consts;
import Modelo.*;

public class Fase5 extends Fase {
    public void construir() {
        Hero hero = new Hero("Kratos.png");
        hero.setPosicao(1, 8);
        this.addPersonagem(hero);

        /*
        CHAVES: {5,8}, {10,1}, {10,15}, {22,8}
        INIMIGOS HORIZONTAIS: {2,3}, {2,13}, {7,8}, {9,8}, {12,4}, {12,12}, {16,8}, {26,8}
        INIMIGOS PERAMBULANTES: {22,2}, {22,14}
        DEUS: {23,8}
         */

        ZigueZague zz = new ZigueZague("Tiro_Ceu.png");
        zz.setPosicao(5, 5);
        this.addPersonagem(zz);

        BichinhoVaiVemHorizontal bBichinhoH1 = new BichinhoVaiVemHorizontal("Inimigo_Lava.png");
        bBichinhoH1.setPosicao(2, 3);
        this.addPersonagem(bBichinhoH1);

        BichinhoVaiVemHorizontal bBichinhoH2 = new BichinhoVaiVemHorizontal("Inimigo_Lava.png");
        bBichinhoH2.setPosicao(2, 13);
        this.addPersonagem(bBichinhoH2);

        BichinhoVaiVemHorizontal bBichinhoH3 = new BichinhoVaiVemHorizontal("Inimigo_Lava.png");
        bBichinhoH3.setPosicao(7, 8);
        this.addPersonagem(bBichinhoH3);

        BichinhoVaiVemHorizontal bBichinhoH4 = new BichinhoVaiVemHorizontal("Inimigo_Lava.png");
        bBichinhoH4.setPosicao(9, 8);
        this.addPersonagem(bBichinhoH4);

        BichinhoVaiVemHorizontal bBichinhoH5 = new BichinhoVaiVemHorizontal("Inimigo_Lava.png");
        bBichinhoH5.setPosicao(12, 4);
        this.addPersonagem(bBichinhoH5);

        BichinhoVaiVemHorizontal bBichinhoH6 = new BichinhoVaiVemHorizontal("Inimigo_Lava.png");
        bBichinhoH6.setPosicao(12, 12);
        this.addPersonagem(bBichinhoH6);

        BichinhoVaiVemHorizontal bBichinhoH7 = new BichinhoVaiVemHorizontal("Inimigo_Lava.png");
        bBichinhoH7.setPosicao(16, 8);
        this.addPersonagem(bBichinhoH7);

        BichinhoVaiVemHorizontal bBichinhoH8 = new BichinhoVaiVemHorizontal("Inimigo_Lava.png");
        bBichinhoH8.setPosicao(26, 8);
        this.addPersonagem(bBichinhoH8);

        Caveira bV = new Caveira("Deus_Lava.png");
        bV.setPosicao(23, 8);
        this.addPersonagem(bV);

        Chave c1 = new Chave("Chave.png");
        c1.setPosicao(5, 8);
        this.addPersonagem(c1);

        Chave c2 = new Chave("Chave.png");
        c2.setPosicao(10, 1);
        this.addPersonagem(c2);

        Chave c3 = new Chave("Chave.png");
        c3.setPosicao(10, 15);
        this.addPersonagem(c3);

        Chave c4 = new Chave("Chave.png");
        c4.setPosicao(22, 8);
        this.addPersonagem(c4);

        Portao p = new Portao("Portao.png", "chave");
        p.setPosicao(28, 15);
        this.addPersonagem(p);

        Chaser chase = new Chaser("Chaser.png");
        chase.setPosicao(18, 8);
        this.addPersonagem(chase);

        // Parede no topo e base
        for (int col = 0; col < Consts.MUNDO_LARGURA; col++) {
            Parede paredeTopo = new Parede("Parede_Lava.png");
            paredeTopo.setPosicao(0, col);
            this.addPersonagem(paredeTopo);

            Parede paredeBase = new Parede("Parede_Lava.png");
            paredeBase.setPosicao(29, col);
            this.addPersonagem(paredeBase);
        }

        // Parede nas laterais esquerda e direita
        for (int l = 1; l < Consts.MUNDO_ALTURA; l++) {
            Parede paredeEsquerda = new Parede("Parede_Lava.png");
            paredeEsquerda.setPosicao(l, 0);
            this.addPersonagem(paredeEsquerda);

            Parede paredeDireita = new Parede("Parede_Lava.png");
            paredeDireita.setPosicao(l, 16);
            this.addPersonagem(paredeDireita);
        }



        int[][] paredesInternas5 = {

                {1,1}, {1,2}, {1,14}, {1,15},
                {2,1}, {2,6}, {2,10}, {2,15},
                {3,5}, {3,8}, {3,11},
                {4,4}, {4,7}, {4,9}, {4,12},
                {5,1}, {5,3}, {5,6}, {5,10}, {5,13}, {5,15},
                {6,5}, {6,11},
                {7,2}, {7,3}, {7,4}, {7,12}, {7,13}, {7,14},
                {8,4}, {8,8}, {8,12},
                {9,1}, {9,2}, {9,14}, {9,15},
                {10,2}, {10,7}, {10,9}, {10,14},
                {11,3}, {11,4}, {11,5}, {11,11}, {11,12}, {11,13},
                {12,5}, {12,8}, {12,11},
                {13,1}, {13,4}, {13,7}, {13,9}, {13,12}, {13,15},
                {14,3}, {14,6}, {14,10}, {14,13},
                {15,2}, {15,3}, {15,5}, {15,11}, {15,13}, {15,14},
                {16,3}, {16,13},
                {17,1}, {17,3}, {17,8}, {17,13}, {17,15},
                {18,3}, {18,7}, {18,9}, {18,13},
                {19,2}, {19,6}, {19,10}, {19,14},
                {20,8}, {20,9},
                {21,1}, {21,2}, {21,3}, {21,4}, {21,8}, {21,12}, {21,13}, {21,14}, {21,15},
                {22,7}, {22,9},
                {23,4}, {23,5}, {23,6}, {23,10}, {23,11}, {23,12},
                {24,6}, {24,10},
                {25,1}, {25,6}, {25,10}, {25,15},
                {26,1}, {26,2}, {26,3}, {26,13}, {26,14}, {26,15},
                {27,3}, {27,13},
                {28,3}, {28,4}, {28,12}, {28,13}

        };
        for (int[] pos : paredesInternas5) {
            Parede parede = new Parede("Parede_Lava.png");
            parede.setPosicao(pos[0], pos[1]);
            this.addPersonagem(parede);
        }
    }
}

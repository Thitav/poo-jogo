package Controler;

import Modelo.Chaser;
import Modelo.Personagem;
import Modelo.Hero;
import Auxiliar.Posicao;
import java.util.ArrayList;
import Modelo.Item;

public class ControleDeJogo {
    
    public void desenhaTudo(ArrayList<Personagem> e) {
        for (int i = 0; i < e.size(); i++) {
            e.get(i).autoDesenho();
        }
    }
    
    public void processaTudo(ArrayList<Personagem> umaFase) {
        Hero hero = (Hero) umaFase.get(0);
        Personagem pIesimoPersonagem;
        for (int i = 1; i < umaFase.size(); i++) {
            pIesimoPersonagem = umaFase.get(i);
            if (hero.getPosicao().igual(pIesimoPersonagem.getPosicao())) {
                if (pIesimoPersonagem.isbTransponivel()) /*TO-DO: verificar se o personagem eh mortal antes de retirar*/ {
                    if (pIesimoPersonagem.isbMortal()) {
                        umaFase.remove(pIesimoPersonagem);
                    }
                }
                if (pIesimoPersonagem.isbColisao()) {
                    pIesimoPersonagem.colisao(hero);
                }
            }
        }
        for (int i = 1; i < umaFase.size(); i++) {
            pIesimoPersonagem = umaFase.get(i);
            if (pIesimoPersonagem instanceof Chaser) {
                ((Chaser) pIesimoPersonagem).computeDirection(hero.getPosicao());
            }
        }
    }
}

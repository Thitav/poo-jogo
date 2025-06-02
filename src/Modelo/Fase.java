package Modelo;

import Auxiliar.Posicao;
import Controler.ControleDeJogo;
import Controler.Tela;

import java.util.ArrayList;

public abstract class Fase {
    protected ArrayList<Personagem> personagens = new ArrayList<>();

    public abstract void construir();

    public void removePersonagem(Personagem umPersonagem) {
        this.personagens.remove(umPersonagem);
    }

    public ArrayList<Personagem> getPersonagens() {
        return personagens;
    }

    public boolean ehPosicaoValida(Posicao p) {
        /*Retorna true se a posicao p é válida para Hero com relacao a todos os personagens no array*/
            Personagem pIesimoPersonagem;
            for (int i = 1; i < this.personagens.size(); i++) {
                pIesimoPersonagem = this.personagens.get(i);
                if (!pIesimoPersonagem.isbTransponivel()) {
                    if (pIesimoPersonagem.getPosicao().igual(p)) {
                        return false;
                    }
                }
            }
            return true;
    }

    public void salvar() {

    }

    public void limpar() {
        this.personagens.clear();
    }

    public Hero getHero() {
        return (Hero)this.personagens.getFirst();
    }

    public void addPersonagem (Personagem personagem) {
        this.personagens.add(personagem);
    }

}

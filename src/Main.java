import Controler.Tela;
import Fases.Fase1;
import Modelo.Fase;

public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Fase fase1 = new Fase1();
                Tela tTela = new Tela();
                tTela.setFaseAtual(fase1);
                tTela.setVisible(true);
                tTela.createBufferStrategy(2);
                tTela.go();
            }
        });
    }
}


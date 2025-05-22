/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Auxiliar.Desenho;
import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.ImageIcon;

public class Parede extends Personagem implements Serializable {

    public Parede(String sNomeImagePNG) {
        super(sNomeImagePNG); // exemplo: "nuvem.png"
        this.bTransponivel = false;
        bMortal = false;
    }

    
    public void autoDesenho(Graphics g) {
        super.autoDesenho();
    }
    
    public boolean ehTransponivel() {
        return false; // Jogador não pode passar por cima da parede
    }
}

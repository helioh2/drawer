/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktop;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import model.Desenhador;
import model.Figura;
import model.Retangulo;

/**
 *
 * @author helio
 */
public class DesenhadorRetanguloAWT implements Desenhador {

    private JPanel tela;  //usando composição em vez de herança
    private BufferedImage imagemAtual;

    public DesenhadorRetanguloAWT(JPanel tela, BufferedImage imagemAtual) {
        this.tela = tela;
        this.imagemAtual = imagemAtual;
    }
    
    @Override
    public void desenha(Figura f) {
        Graphics2D g = imagemAtual.createGraphics();
        g.setColor(Color.BLACK);
        Retangulo ret = (Retangulo) f;
        g.drawRect(ret.getPosicao().getX(), ret.getPosicao().getY(), 
                ret.getLargura(), ret.getAltura());
        g.drawImage(imagemAtual, 0, 0, null); // Redesenha o que já foi desenhado
        tela.repaint();
    
    }
    
}

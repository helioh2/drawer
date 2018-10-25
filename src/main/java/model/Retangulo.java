/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;

/**
 *
 * @author helio
 */
public class Retangulo extends Figura implements AreaCalculavel {
    
    private int largura;
    private int altura;
    
    public Retangulo(int x, int y, int largura, int altura, Desenhador desenhador) {
        super(x, y, desenhador);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public String desenhar() {
        
        desenhador.desenha(this);
        
        return "Retangulo("+this.getPosicao()
                +", largura="+this.largura
                +", altura="+this.altura + ")";
    }

    @Override
    public void mover(int dx, int dy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void redimensionar(int dx, int dy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCor(Color cor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPreenchido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setContorno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double calculaArea() {
        return 50.;
    }

    @Override
    public int compareTo(AreaCalculavel outro) {
        return this.calculaArea().intValue() 
                - outro.calculaArea().intValue();
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }
    
    

 
}

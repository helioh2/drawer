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
public abstract class Figura  {
    
    private int id;
    private Point posicao;
    private Color cor; 
    private boolean preenchido;
    protected Desenhador desenhador;

    public Figura(int x, int y, Desenhador desenhador) {
        this.posicao = new Point(x, y);
        this.desenhador = desenhador;
    }

    
    
    public Point getPosicao() {
        return posicao;
    }

    public void setPosicao(Point posicao) {
        this.posicao = posicao;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor){
        this.cor = cor;
    }

    public boolean isPreenchido() {
        return preenchido;
    }
  
    public void setPreenchido(){
        this.preenchido = true;
    }
    
    public void setContorno() {
        this.preenchido = false;
    }
    
    public abstract String desenhar();
    public abstract void mover(int dx, int dy);
    public abstract void redimensionar(int dx, int dy);
    
    
    
}

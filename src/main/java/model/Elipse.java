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
public class Elipse implements Figura, AreaCalculavel {

    private int id;
    
    
    @Override
    public String desenhar() {
        // CHAMA DESENHADOR DE TELA...
//        AWT...
        return "Elipse(id="+id+"...";
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
        return 90.;
    }

    @Override
    public int compareTo(AreaCalculavel outro) {
        return this.calculaArea().intValue() 
                - outro.calculaArea().intValue();
    }
    
}
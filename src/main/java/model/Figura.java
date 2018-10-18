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
public interface Figura  {
    String desenhar();
    void mover(int dx, int dy);
    void redimensionar(int dx, int dy);
    void setCor(Color cor);
    void setPreenchido();
    void setContorno();
    
    
}

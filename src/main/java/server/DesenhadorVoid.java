/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import model.Desenhador;
import model.Figura;

/**
 *
 * @author helio
 */
class DesenhadorVoid implements Desenhador {

    @Override
    public void desenha(Figura f) {
        System.out.println("Simula desenho");
    }
    
}

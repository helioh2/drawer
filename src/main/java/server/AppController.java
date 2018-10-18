
package server;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import model.Figura;


/**
 *
 * @author helio
 */
public class AppController {

    private String nome;
    private List<Figura> figuras;
    
    public void novoProjeto() {
        figuras = new LinkedList<>();
    }
    
    public List<String> desenhaTudo() {
        List<String> lista = new ArrayList<>();
        for (Figura figura: figuras) {
            String resultado = figura.desenhar();
            lista.add(resultado);
        }
        return lista;
    }
   
}

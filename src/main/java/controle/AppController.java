
package controle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import model.Desenhador;
import model.Figura;
import model.Retangulo;


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

    public void addFigura(Figura figura) {
        figuras.add(figura);
    }
    
    public void criaRetangulo(int x, int y, int largura, int altura, Desenhador desenhador) {
         Figura figura = new Retangulo(x, y, largura, altura, desenhador);
         this.addFigura(figura);
         
         System.out.println(desenhaTudo());
    }
    
   
}

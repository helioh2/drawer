package server;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import model.AreaCalculavel;
import model.Elipse;
import model.Retangulo;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Retangulo ret1 = new Retangulo();
        Elipse el1 = new Elipse();
        System.out.println(ret1.compareTo(el1)+" "+el1.compareTo(ret1));
        
        List<AreaCalculavel> lista = Arrays.asList(el1, ret1);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(Collections.min(lista));
        System.out.println(Collections.max(lista));
        System.out.println(lista);
        
        System.out.println(lista.stream().sorted(
                (x1, x2) -> x1.calculaArea().intValue() - x2.calculaArea().intValue()));
        for (AreaCalculavel x: lista) {
            System.out.println(x.calculaArea());
        }
//        
//        System.out.println("Iniciando servidor");
//        Servidor servidor = new Servidor();
//        servidor.iniciar();
        
        
    }
}
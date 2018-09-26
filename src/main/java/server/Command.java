/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 * Command interface definition
 * @author helio
 */
public enum Command {
    
    NOVO_PROJETO("novo-projeto"),
    NOVA_FIGURA("nova-figura");
    
    
    private String label;
    
    private Command(String label){
        this.label = label;
    }
    
    @Override
    public String toString(){
        return label;
    }
    
}

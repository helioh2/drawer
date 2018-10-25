/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author helio
 */
public enum OutputMessage {
    
    SUCCESS("ok"),
    INVALID_COMMAND("comando-invalido"), 
    NOT_ALLOWED("nao-permitido"),
    NOTHING("nada"),
    EMPTY("vazio");
    
    
    private String label;
    
    private OutputMessage(String label){
        this.label = label;
    }
    
    @Override
    public String toString(){
        return label;
    }
    
}

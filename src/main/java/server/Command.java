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
    NOVA_FIGURA("nova-figura"),
    MOVER_FIGURA("move-figura"),
    GET_ESTADO_PROJETO("get-estado-projeto");
    
    
    private String label;
    
    private Command(String label){
        this.label = label;
    }
    
    @Override
    public String toString(){
        return label;
    }
    
    static Command fromLabel(String x) throws Exception {
    for (Command currentType : Command.values()) {
      if (x.equals(currentType.toString())) {
        return currentType;
      }
    }
    throw new Exception("Unmatched Type: " + x);
  }
    
}

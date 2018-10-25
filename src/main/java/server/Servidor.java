package server;

import controle.AppController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Desenhador;
import model.Figura;
import model.Retangulo;

public class Servidor {
    
    private static final int PORTA = 1234;
    private AppController controlador;
    private DesenhadorVoid desenhador; //desenhador que não faz nada para uso na interface textual
    
    public void iniciar() throws IOException {
        ServerSocket socket = new ServerSocket(PORTA);
        controlador = new AppController();

        try {
            while (true) {
                atenderCliente(socket.accept());
            }
        } finally {
            socket.close();
        }
    }
    
    private void atenderCliente(final Socket cliente) {        
        // A ideia basica para atender um cliente é
        //   - ler comando
        //   - processar comando
        //   - escrever resposta
        
        new Thread() {

            @Override
            public void run() {
                
                ArrayList<String> outList; //Lista de retorno
        
                String command = null;
                
                try {
                    command = readLine(cliente.getInputStream());
                } catch (IOException ex) {
                    Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                }

                outList = handleCommand(command); 
                
                try {
                    for (String line: outList){
                        writeLine(cliente.getOutputStream(), line);
                    }
                    cliente.close();
                } catch (IOException ex) {
                    Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
        }.start(); 
    }
    
    private static String readLine(InputStream in) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        return reader.readLine();
    }
    
    private static void writeLine(OutputStream out, String linhas) throws IOException {
        out.write(linhas.getBytes());
        out.write('\n');
    }


    private ArrayList<String> handleCommand(String command){
        
        ArrayList<String> outList = new ArrayList<String>();
        if (command == null){
            outList.add(OutputMessage.INVALID_COMMAND.toString());
            return outList;
        }
        String commandTypeStr = command.split(" ")[0];
        Command commandType;
        
        try {
            commandType = Command.fromLabel(commandTypeStr);
        } catch (Exception ex) {
            outList.add(OutputMessage.INVALID_COMMAND.toString());
            return outList;
        }
        
        //INSIRAM CÓDIGO A PARTIR DAQUI:
        switch (commandType) {
            case NOVO_PROJETO:
                //TODO
                controlador.novoProjeto();
                outList.add(OutputMessage.SUCCESS.toString());
//                System.out.println("cheguei aqui");
                break;
            case GET_ESTADO_PROJETO:
                List<String> resultado = controlador.desenhaTudo();
                if (resultado.isEmpty()) {
                    outList.add(OutputMessage.EMPTY.toString());
                }
                for (String figuraStr: resultado) {
                    outList.add(figuraStr);
                }
                break;
            case NOVO_RETANGULO:
                if (command.split(" ").length != 5) {
                    outList.add(OutputMessage.NOT_ALLOWED.toString());
                    break;
                    //O QUE FAZER FICA A CRITERIO DE VOCES
                }
                String x = command.split(" ")[1];
                String y = command.split(" ")[2];
                String largura = command.split(" ")[3];
                String altura = command.split(" ")[4];
               
                controlador.criaRetangulo(Integer.parseInt(x),
                                        Integer.parseInt(y),
                                        Integer.parseInt(largura),
                                        Integer.parseInt(altura),
                                        desenhador);
           
                outList.add(OutputMessage.SUCCESS.toString());
                
                break;
            //COLOCAR TODOS OS COMANDOS
            default:
                break;
        }
        
//        if (commandType.equals(Command.NOVO_PROJETO.toString())){
//           // TODO
//            
//        } else if (commandType.equals(Command.NOVA_FIGURA.toString())){
//            // TODO
//        }
//        //TODO...
        
        return outList;

    }

 
    
}
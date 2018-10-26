/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktop;

import controle.AppController;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
import model.Desenhador;

/**
 *
 * @author helio
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    Opcao opcaoAtual = Opcao.SELECAO; 
    AppController controlador;
    int xInicial;
    int yInicial;
    Desenhador desenhadorRetangulo;
    /**
     * Creates new form NewJFrame
     */
    public JanelaPrincipal() {
        initComponents();
        this.controlador = new AppController();
        this.controlador.novoProjeto();
        desenhadorRetangulo = new DesenhadorRetanguloAWT(telaDesenho);
//        telaDesenhoController = new TelaDesenhoController(telaDesenho);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaDesenho = new javax.swing.JPanel();
        botaoRetangulo = new javax.swing.JButton();
        botaoElipse = new javax.swing.JButton();
        botaoLinhaReta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        telaDesenho.setBackground(new java.awt.Color(254, 254, 254));
        telaDesenho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        telaDesenho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                telaDesenhoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                telaDesenhoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout telaDesenhoLayout = new javax.swing.GroupLayout(telaDesenho);
        telaDesenho.setLayout(telaDesenhoLayout);
        telaDesenhoLayout.setHorizontalGroup(
            telaDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        telaDesenhoLayout.setVerticalGroup(
            telaDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        botaoRetangulo.setText("Retangulo");
        botaoRetangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRetanguloActionPerformed(evt);
            }
        });

        botaoElipse.setText("Elipse");

        botaoLinhaReta.setText("Linha Reta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(telaDesenho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(botaoRetangulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoElipse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoLinhaReta)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(telaDesenho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoRetangulo)
                    .addComponent(botaoElipse)
                    .addComponent(botaoLinhaReta))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRetanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRetanguloActionPerformed
        System.out.println("Ola mundo");
//        JOptionPane.showMessageDialog(rootPane, "Ola mundo");
        opcaoAtual = Opcao.RETANGULO;
    }//GEN-LAST:event_botaoRetanguloActionPerformed

    private void telaDesenhoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telaDesenhoMousePressed
        xInicial = evt.getX();
        yInicial = evt.getY();
    
    }//GEN-LAST:event_telaDesenhoMousePressed

    private void telaDesenhoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telaDesenhoMouseReleased
        int xFinal = evt.getX();
        int yFinal = evt.getY();
        switch (opcaoAtual){
            case RETANGULO:
                controlador.criaRetangulo(xInicial, yInicial, 
                        xFinal - xInicial, yFinal - yInicial,
                        desenhadorRetangulo);
                break;
            case SELECAO:
                break;
            case ELIPSE:
                break;
        }
        
    }//GEN-LAST:event_telaDesenhoMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoElipse;
    private javax.swing.JButton botaoLinhaReta;
    private javax.swing.JButton botaoRetangulo;
    private javax.swing.JPanel telaDesenho;
    // End of variables declaration//GEN-END:variables
}

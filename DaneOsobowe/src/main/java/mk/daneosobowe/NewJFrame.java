/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mk.daneosobowe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author CP24
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        addKeyListenerTojTFWzrost();
        addKeyListenerTojTFWaga();
        addKeyListenerTojTFMail();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGlowny = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFMail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFWzrost = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFWaga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDataChooser = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formularz");
        setResizable(false);

        jPanelGlowny.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setText("Podaj swoj login");

        jLabel2.setText("Podaj swoj email");

        jLabel3.setText("Wzrost(cm)");

        jLabel4.setText("Waga(kg)");

        jLabel5.setText("Wybierz date urodzenia");

        jButton1.setText("Zapisz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelGlownyLayout = new javax.swing.GroupLayout(jPanelGlowny);
        jPanelGlowny.setLayout(jPanelGlownyLayout);
        jPanelGlownyLayout.setHorizontalGroup(
            jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGlownyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jDataChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jTFLogin)
                            .addComponent(jLabel2)
                            .addComponent(jTFMail)
                            .addComponent(jLabel3)
                            .addComponent(jTFWzrost)
                            .addComponent(jLabel4)
                            .addComponent(jTFWaga, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addComponent(jLabel5)))
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanelGlownyLayout.setVerticalGroup(
            jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGlownyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelGlownyLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanelGlownyLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFWzrost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFWaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDataChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGlowny, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelGlowny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File f=new File("Dane.txt");
        String login = jTFLogin.getText();
        String mail = jTFMail.getText();
        String wzrost = jTFWzrost.getText();
        String waga = jTFWaga.getText();
        Date data= jDataChooser.getDate();
        try{
            FileWriter fw= new FileWriter(f);
            fw.write(login+";"+mail+";"+wzrost+";"+waga+";"+data+";");
            fw.close();
        }catch(IOException e){
            System.out.println("ERROR "+e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    private void addKeyListenerTojTFWzrost(){
        jTFWzrost.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char chCyfry = e.getKeyChar();
                if ((chCyfry >= '0' && chCyfry <= '9' || chCyfry==KeyEvent.VK_BACK_SPACE)) {
                    jTFWzrost.setEditable(true);
                } else {
                    jTFWzrost.setEditable(false);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    }
    private void addKeyListenerTojTFWaga(){
        jTFWaga.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char chCyfry = e.getKeyChar();
                if ((chCyfry >= '0' && chCyfry <= '9' || chCyfry==KeyEvent.VK_BACK_SPACE)) {
                    jTFWaga.setEditable(true);
                } else {
                    jTFWaga.setEditable(false);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    }
    private void addKeyListenerTojTFMail(){
        jTFMail.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String temp=jTFMail.getText();
                char ch=e.getKeyChar();
                if((ch=='@' || ch>='a' && ch<='z')){
                    jTFMail.setEditable(true);
                }
                else{
                    jTFMail.setEditable(false);
                }
                if(temp.contains("@")){
                   if(ch >= 'a' && ch <= 'z' || ch == '.'){
                        jTFMail.setEditable(true);
                    }
                   else{
                       jTFMail.setEditable(false);
                   }
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    }
    private void SimpleDateFormat(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDataChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanelGlowny;
    private javax.swing.JTextField jTFLogin;
    private javax.swing.JTextField jTFMail;
    private javax.swing.JTextField jTFWaga;
    private javax.swing.JTextField jTFWzrost;
    // End of variables declaration//GEN-END:variables
}
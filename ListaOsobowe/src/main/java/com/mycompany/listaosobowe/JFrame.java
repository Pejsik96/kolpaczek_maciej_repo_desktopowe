package com.mycompany.listaosobowe;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class JFrame extends javax.swing.JFrame {
    private ArrayList<Student> dataList;
    private DefaultListModel dlm;
    private int dialogMode;
    private FileManager fileManager;
    
    public JFrame() {
        initComponents();
        dataList = new ArrayList<>();
        dlm = new DefaultListModel();
        fileManager = new FileManager("data.txt");
        read();
    }
    
    public void add(Student student) {
        int id = dataList.size();
        dataList.add(id, student);
        dlm.add(id, dataList.get(id).getObjectName());
        list.setModel(dlm);
    }
    
    public void remove() {
        aaaLabel.setText(dataList.get(list.getSelectedIndex()).getObjectName());
        warning.setVisible(true);
    }
    
    public void modify(Student student) {
        int id = list.getSelectedIndex();
        dataList.set(id, student);
        dlm.set(id, dataList.get(id).getObjectName());
        list.setModel(dlm);
    }
    
    private void save() {
        String text = "";
        for(int i=0; i<dataList.size(); i++) text += dataList.get(i).toString();
        fileManager.writeTextToFile(text);
    }
    
    private void read() {
        String [] lines = fileManager.readFromFile().split("\n");
        for(int i=0; i<lines.length; i++) {
            String [] s = lines[i].split(";"); // line splitted
            add(new Student(s[0], s[1], s[2], s[3]));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new javax.swing.JPopupMenu();
        delete = new javax.swing.JMenuItem();
        modify = new javax.swing.JMenuItem();
        dialog = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        dialogImie = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dialogNazwisko = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dialogKlasa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dialogRok = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        warning = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        aaaLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        button = new javax.swing.JButton();

        popup.setBorderPainted(false);
        popup.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                popupPopupMenuWillBecomeVisible(evt);
            }
        });

        delete.setText("Usuń");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        popup.add(delete);

        modify.setText("Modyfikuj");
        modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyActionPerformed(evt);
            }
        });
        popup.add(modify);

        dialog.setLocationByPlatform(true);
        dialog.setMinimumSize(new java.awt.Dimension(398, 285));
        dialog.setModal(true);

        jLabel1.setText("Imię");

        dialogImie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dialogKlasaKeyPressed(evt);
            }
        });

        jLabel2.setText("Nazwisko");

        dialogNazwisko.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dialogKlasaKeyPressed(evt);
            }
        });

        jLabel3.setText("Klasa");

        dialogKlasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dialogKlasaKeyPressed(evt);
            }
        });

        jLabel4.setText("Rok");

        dialogRok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dialogKlasaKeyPressed(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogLayout = new javax.swing.GroupLayout(dialog.getContentPane());
        dialog.getContentPane().setLayout(dialogLayout);
        dialogLayout.setHorizontalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogLayout.createSequentialGroup()
                .addGroup(dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogLayout.createSequentialGroup()
                                .addComponent(dialogImie, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(dialogLayout.createSequentialGroup()
                                .addComponent(dialogKlasa, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(dialogLayout.createSequentialGroup()
                                .addComponent(dialogRok, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(dialogLayout.createSequentialGroup()
                                .addComponent(dialogNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))))
                    .addGroup(dialogLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        dialogLayout.setVerticalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dialogImie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dialogNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dialogKlasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dialogRok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        warning.setMinimumSize(new java.awt.Dimension(210, 205));
        warning.setModal(true);
        warning.setResizable(false);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Potwierdź usunięcie");

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        aaaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aaaLabel.setText("aaa");

        javax.swing.GroupLayout warningLayout = new javax.swing.GroupLayout(warning.getContentPane());
        warning.getContentPane().setLayout(warningLayout);
        warningLayout.setHorizontalGroup(
            warningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warningLayout.createSequentialGroup()
                .addGroup(warningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(warningLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(warningLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(warningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aaaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        warningLayout.setVerticalGroup(
            warningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warningLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(aaaLabel)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        list.setComponentPopupMenu(popup);
        jScrollPane1.setViewportView(list);

        button.setText("Dodaj");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void popupPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_popupPopupMenuWillBecomeVisible
        int id = list.getSelectedIndex();
        if(id > -1) {
            delete.setEnabled(true);
            modify.setEnabled(true);
        }
    }//GEN-LAST:event_popupPopupMenuWillBecomeVisible

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        remove();
        save();
    }//GEN-LAST:event_deleteActionPerformed

    private void modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyActionPerformed
        Student student = dataList.get(list.getSelectedIndex());
        
        dialogImie.setText(student.imie);
        dialogNazwisko.setText(student.nazwisko);
        dialogKlasa.setText(student.klasa);
        dialogRok.setText(student.rok);
        dialogMode = 1;
        dialog.setVisible(true);
    }//GEN-LAST:event_modifyActionPerformed

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        dialogImie.setText("");
        dialogNazwisko.setText("");
        dialogKlasa.setText("");
        dialogRok.setText("");
        dialogMode = 0;
        dialog.setVisible(true);
    }//GEN-LAST:event_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dialogProceed();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dialogKlasaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dialogKlasaKeyPressed

    }//GEN-LAST:event_dialogKlasaKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int id = list.getSelectedIndex();
        dataList.remove(id);
        dlm.remove(id);
        list.setModel(dlm);
        warning.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void dialogProceed() {
        dialog.setVisible(false);
        Student student = new Student(dialogImie.getText(), dialogNazwisko.getText(), dialogKlasa.getText(), dialogRok.getText());
        
        if(dialogMode == 0) add(student);
        if(dialogMode == 1) modify(student);
        save();
    }
    
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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aaaLabel;
    private javax.swing.JButton button;
    private javax.swing.JMenuItem delete;
    private javax.swing.JDialog dialog;
    private javax.swing.JTextField dialogImie;
    private javax.swing.JTextField dialogKlasa;
    private javax.swing.JTextField dialogNazwisko;
    private javax.swing.JTextField dialogRok;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list;
    private javax.swing.JMenuItem modify;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JDialog warning;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.CardLayout;

/**
 *
 * @author LENOVO
 */
public class PenampilGambarComboBox extends javax.swing.JFrame {

    /**
     * Creates new form PenampilGambarComboBox
     */
    public PenampilGambarComboBox() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCardLayout = new javax.swing.JPanel();
        Lg1 = new javax.swing.JLabel();
        Lg2 = new javax.swing.JLabel();
        Lg3 = new javax.swing.JLabel();
        Pilihan = new javax.swing.JLabel();
        pilihan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pCardLayout.setLayout(new java.awt.CardLayout());

        Lg1.setIcon(new javax.swing.ImageIcon("D:\\2. PERKULIAHAN SEMESTER IV\\PEMROGRAMAN BERBASIS OBJEK 1\\nyoba\\PenampilGambar\\image\\blue1.jpg")); // NOI18N
        Lg1.setLabelFor(pilihan);
        pCardLayout.add(Lg1, "0");

        Lg2.setIcon(new javax.swing.ImageIcon("D:\\2. PERKULIAHAN SEMESTER IV\\PEMROGRAMAN BERBASIS OBJEK 1\\nyoba\\PenampilGambar\\image\\blue2.jpg")); // NOI18N
        Lg2.setLabelFor(pilihan);
        pCardLayout.add(Lg2, "1");

        Lg3.setIcon(new javax.swing.ImageIcon("D:\\2. PERKULIAHAN SEMESTER IV\\PEMROGRAMAN BERBASIS OBJEK 1\\nyoba\\PenampilGambar\\image\\blue3.jpg")); // NOI18N
        Lg3.setLabelFor(pilihan);
        pCardLayout.add(Lg3, "2");

        Pilihan.setText("Pilih Gambar");

        pilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gambar 1", "Gambar 2", "Gambar 3" }));
        pilihan.setSelectedItem(pilihan);
        pilihan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pilihanItemStateChanged(evt);
            }
        });
        pilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pilihan)
                    .addComponent(pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pilihanItemStateChanged
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout)(pCardLayout.getLayout());
        c1.show(pCardLayout, String.valueOf(pilihan.getSelectedIndex()));
    }//GEN-LAST:event_pilihanItemStateChanged

    private void pilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilihanActionPerformed

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
            java.util.logging.Logger.getLogger(PenampilGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PenampilGambarComboBox().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lg1;
    private javax.swing.JLabel Lg2;
    private javax.swing.JLabel Lg3;
    private javax.swing.JLabel Pilihan;
    private javax.swing.JPanel pCardLayout;
    private javax.swing.JComboBox<String> pilihan;
    // End of variables declaration//GEN-END:variables
}

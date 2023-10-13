/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class Game2 extends javax.swing.JFrame {

    public Game2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_logo = new javax.swing.JLabel();
        combo_pilihan = new javax.swing.JComboBox<>();
        btn_hitung = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Output = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(4, 1, 10, 10));

        txt_logo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_logo.setText("PERMAINAN, BATU, GUNTING, KERTAS");
        getContentPane().add(txt_logo);

        combo_pilihan.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        combo_pilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Batu", "Gunting", "Kertas" }));
        combo_pilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pilihanActionPerformed(evt);
            }
        });
        getContentPane().add(combo_pilihan);

        btn_hitung.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_hitung.setText("MAIN");
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hitung);

        Output.setColumns(20);
        Output.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Output.setRows(5);
        jScrollPane1.setViewportView(Output);

        getContentPane().add(jScrollPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
       
    }//GEN-LAST:event_btn_hitungActionPerformed

    private void combo_pilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pilihanActionPerformed
        String pilihan = (String) combo_pilihan.getSelectedItem();
        String[] computer = {"Batu", "Gunting", "Kertas"};
        int computerchoice = (int) (Math.random() * 3);
        String computerchoiceStr = computer[computerchoice];
        
        if (pilihan.equals(computerchoiceStr)){
            if (computer.equals(computerchoice)){
                Output.setText("anda menang");
            }else if(computer.equals(computerchoice)){
                Output.setText("hasil imbang");
            }else if(computer.equals(computerchoice)){
                Output.setText("anda kalah");
            }
            
        }else if (pilihan.equals("Gunting")){
            Output.setText("anda kalah");
        }else if (pilihan.equals("kertas")){
            Output.setText("hasil imbang");
        }    
    }//GEN-LAST:event_combo_pilihanActionPerformed

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
            java.util.logging.Logger.getLogger(Game2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Output;
    private javax.swing.JButton btn_hitung;
    private javax.swing.JComboBox<String> combo_pilihan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txt_logo;
    // End of variables declaration//GEN-END:variables
}

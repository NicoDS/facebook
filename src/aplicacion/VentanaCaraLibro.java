/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author Administrator
 */
public class VentanaCaraLibro extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCaraLibro
     */
    public VentanaCaraLibro() {
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

        f_icono = new javax.swing.JLabel();
        lupa = new javax.swing.JButton();
        busca_personas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        f_icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FacebookWebIcon.png"))); // NOI18N
        f_icono.setText("jLabel2");
        getContentPane().add(f_icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 70));

        lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono_lupa.gif"))); // NOI18N
        lupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupaActionPerformed(evt);
            }
        });
        getContentPane().add(lupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 40, -1));

        busca_personas.setText("Busca personas, lugares y cosas");
        getContentPane().add(busca_personas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDO_FACEBOOK.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lupaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCaraLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCaraLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCaraLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCaraLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCaraLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField busca_personas;
    private javax.swing.JLabel f_icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lupa;
    // End of variables declaration//GEN-END:variables
}

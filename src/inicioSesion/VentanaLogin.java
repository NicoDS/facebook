/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicioSesion;

/**
 *
 * @author Administrator
 */
public class VentanaLogin extends javax.swing.JFrame {

    /**
     * Creates new form VentanaLogin
     */
    public VentanaLogin() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        boton_entrar = new javax.swing.JButton();
        correo_electronico = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        pon_correo = new javax.swing.JTextField();
        pon_contraseña = new javax.swing.JTextField();
        contraseña_olvidada = new javax.swing.JTextField();
        facebook = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        registrarte = new javax.swing.JLabel();
        registrate = new javax.swing.JTextField();
        es_gratis = new javax.swing.JTextField();
        terminado = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        mes = new javax.swing.JComboBox();
        año = new javax.swing.JComboBox();
        dia = new javax.swing.JComboBox();
        nombre = new javax.swing.JTextField();
        opc1 = new javax.swing.JRadioButton();
        opc2 = new javax.swing.JRadioButton();
        apellidos = new javax.swing.JTextField();
        orreo_elec = new javax.swing.JTextField();
        vuelva_a_introducir = new javax.swing.JTextField();
        contraseña_nueva = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        no_cerrar_sesión1 = new javax.swing.JTextField();
        fecha1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_entrar.setBackground(new java.awt.Color(0, 102, 255));
        boton_entrar.setText("ENTRAR");
        boton_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton_entrarMousePressed(evt);
            }
        });
        getContentPane().add(boton_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 80, 20));

        correo_electronico.setForeground(new java.awt.Color(255, 255, 255));
        correo_electronico.setText("Correo electrónico o teléfono:");
        getContentPane().add(correo_electronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 150, -1));

        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setText("Contraseña:");
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 68, -1));
        getContentPane().add(pon_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 130, -1));
        getContentPane().add(pon_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 100, -1));

        contraseña_olvidada.setBackground(new java.awt.Color(0, 102, 255));
        contraseña_olvidada.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        contraseña_olvidada.setForeground(new java.awt.Color(255, 255, 255));
        contraseña_olvidada.setText("¿Has olvidado tu contraseña?");
        contraseña_olvidada.setBorder(null);
        getContentPane().add(contraseña_olvidada, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 140, 20));

        facebook.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        facebook.setForeground(new java.awt.Color(255, 255, 255));
        facebook.setText("facebook");
        getContentPane().add(facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, 58));

        jCheckBox1.setText("No cerrar sesión");
        jCheckBox1.setBorder(null);
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 110, 20));

        registrarte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDO_FACEBOOK.jpeg"))); // NOI18N
        registrarte.setText("jLabel4");
        getContentPane().add(registrarte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 70));

        registrate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registrate.setText("Registrarte");
        getContentPane().add(registrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, 30));

        es_gratis.setText("Es gratis y lo será siempre.");
        getContentPane().add(es_gratis, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 140, -1));

        terminado.setBackground(new java.awt.Color(51, 153, 0));
        terminado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        terminado.setForeground(new java.awt.Color(255, 255, 255));
        terminado.setText("Terminado");
        getContentPane().add(terminado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 80, 30));

        fecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fecha.setText("Fecha de nacimiento");
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 130, -1));

        mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mes", "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" }));
        getContentPane().add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        año.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Año", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", " " }));
        getContentPane().add(año, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Día", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        nombre.setText("Nombre");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 80, -1));

        opc1.setText("Mujer");
        getContentPane().add(opc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 60, 20));

        opc2.setText("Hombre");
        getContentPane().add(opc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 70, 20));

        apellidos.setText("Apellidos");
        getContentPane().add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 150, -1));

        orreo_elec.setText("Correo electrónico o número de móvill");
        getContentPane().add(orreo_elec, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 240, -1));

        vuelva_a_introducir.setText("vuelva a entroducir el correo electrónico o el ...");
        getContentPane().add(vuelva_a_introducir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 240, -1));

        contraseña_nueva.setText("Contraseña nueva");
        getContentPane().add(contraseña_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 240, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxresdefault.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jLabel1, org.jdesktop.beansbinding.ObjectProperty.create(), jLabel1, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 290, 330));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        no_cerrar_sesión1.setBackground(new java.awt.Color(0, 0, 255));
        no_cerrar_sesión1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        no_cerrar_sesión1.setForeground(new java.awt.Color(255, 255, 255));
        no_cerrar_sesión1.setText("No cerrar sesión");
        getContentPane().add(no_cerrar_sesión1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 80, -1));

        fecha1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fecha1.setText("Fecha de nacimiento");
        getContentPane().add(fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mitadizq_fondo_facebook.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 280, 330));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_entrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_entrarMousePressed
      String usuario = pon_correo.getText();
      String password =pon_contraseña.getText();
      
      if ((usuario.equalsIgnoreCase("yo")) && (password.equals("1234"))) {
        new aplicacion.VentanaCaraLibro().setVisible(true);
        
    }
          else{
                  
        new LoginIncorrecto().setVisible(true);
    }//GEN-LAST:event_boton_entrarMousePressed
    }
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
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JComboBox año;
    private javax.swing.JButton boton_entrar;
    private javax.swing.JLabel contraseña;
    private javax.swing.JTextField contraseña_nueva;
    private javax.swing.JTextField contraseña_olvidada;
    private javax.swing.JLabel correo_electronico;
    private javax.swing.JComboBox dia;
    private javax.swing.JTextField es_gratis;
    private javax.swing.JLabel facebook;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField fecha1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox mes;
    private javax.swing.JTextField no_cerrar_sesión1;
    private javax.swing.JTextField nombre;
    private javax.swing.JRadioButton opc1;
    private javax.swing.JRadioButton opc2;
    private javax.swing.JTextField orreo_elec;
    private javax.swing.JTextField pon_contraseña;
    private javax.swing.JTextField pon_correo;
    private javax.swing.JLabel registrarte;
    private javax.swing.JTextField registrate;
    private javax.swing.JTextField terminado;
    private javax.swing.JTextField vuelva_a_introducir;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

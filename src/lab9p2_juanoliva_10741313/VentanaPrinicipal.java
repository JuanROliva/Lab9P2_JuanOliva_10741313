package lab9p2_juanoliva_10741313;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;

public class VentanaPrinicipal extends javax.swing.JFrame {

    public VentanaPrinicipal() {
        initComponents();
        jd_Login.pack();
        jd_Login.setLocationRelativeTo(null);
        jd_Login.setVisible(true);
        poblarUsuario();
        cargaInicialTablaUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Login = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jt_Usuario_Login = new javax.swing.JTextField();
        jpass_Login = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jb_Aceptar_Login = new javax.swing.JButton();
        jb_Cancelar_Login = new javax.swing.JButton();
        jd_AgregarUsuario = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jt_Edad_Registro = new javax.swing.JTextField();
        jt_Usuario_Registro = new javax.swing.JTextField();
        jt_Nombre_Registro = new javax.swing.JTextField();
        jpass_Registro = new javax.swing.JPasswordField();
        jb_Cancelar_Registro = new javax.swing.JButton();
        jb_Aceptar_Registro = new javax.swing.JButton();
        jd_Administrador = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jt_Nombre_Gestion = new javax.swing.JTextField();
        jt_Contrasena_Gestion = new javax.swing.JTextField();
        jt_Usuario_Gestion = new javax.swing.JTextField();
        jt_Edad_Gestion = new javax.swing.JTextField();
        cb_Tipo_Gestion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_GestionUsuario = new javax.swing.JTable();
        jb_AgregarUsuario_Gestion = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        jLabel4.setText("¿No tienes Cuenta? Registrarse ");

        jb_Aceptar_Login.setText("Aceptar");
        jb_Aceptar_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_Aceptar_LoginActionPerformed(evt);
            }
        });

        jb_Cancelar_Login.setText("Cancelar");

        javax.swing.GroupLayout jd_LoginLayout = new javax.swing.GroupLayout(jd_Login.getContentPane());
        jd_Login.getContentPane().setLayout(jd_LoginLayout);
        jd_LoginLayout.setHorizontalGroup(
            jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_LoginLayout.createSequentialGroup()
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_LoginLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jd_LoginLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jb_Cancelar_Login)
                            .addGap(47, 47, 47)
                            .addComponent(jb_Aceptar_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_LoginLayout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jt_Usuario_Login)
                                .addComponent(jpass_Login)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jd_LoginLayout.setVerticalGroup(
            jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_LoginLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jt_Usuario_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jpass_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Cancelar_Login)
                    .addComponent(jb_Aceptar_Login))
                .addGap(32, 32, 32))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Registro");

        jLabel6.setText("Usuario");

        jLabel7.setText("Constraseña");

        jLabel8.setText("Nombre");

        jLabel9.setText("Edad");

        jb_Cancelar_Registro.setText("Cancelar");

        jb_Aceptar_Registro.setText("Aceptar");

        javax.swing.GroupLayout jd_AgregarUsuarioLayout = new javax.swing.GroupLayout(jd_AgregarUsuario.getContentPane());
        jd_AgregarUsuario.getContentPane().setLayout(jd_AgregarUsuarioLayout);
        jd_AgregarUsuarioLayout.setHorizontalGroup(
            jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel5))))
                    .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(44, 44, 44)
                                    .addComponent(jt_Nombre_Registro))
                                .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(jpass_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                                    .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel9))
                                    .addGap(46, 46, 46)
                                    .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jt_Edad_Registro, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                        .addComponent(jt_Usuario_Registro))))
                            .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jb_Cancelar_Registro)
                                .addGap(61, 61, 61)
                                .addComponent(jb_Aceptar_Registro)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jd_AgregarUsuarioLayout.setVerticalGroup(
            jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jt_Usuario_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jpass_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jt_Nombre_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jt_Edad_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Cancelar_Registro)
                    .addComponent(jb_Aceptar_Registro))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jd_Administrador.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jd_AdministradorWindowClosed(evt);
            }
        });

        jLabel10.setText("Nombre");

        jLabel11.setText("Usuario");

        jLabel12.setText("Contraseña");

        jLabel13.setText("Edad");

        jLabel14.setText("Tipo");

        cb_Tipo_Gestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personal", "Cliente" }));

        jtable_GestionUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtable_GestionUsuario);

        jb_AgregarUsuario_Gestion.setText("Agregar");
        jb_AgregarUsuario_Gestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AgregarUsuario_GestionActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Gestionar Usuario");

        jButton2.setText("Aceptar");

        javax.swing.GroupLayout jd_AdministradorLayout = new javax.swing.GroupLayout(jd_Administrador.getContentPane());
        jd_Administrador.getContentPane().setLayout(jd_AdministradorLayout);
        jd_AdministradorLayout.setHorizontalGroup(
            jd_AdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AdministradorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(jd_AdministradorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jd_AdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_AdministradorLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jd_AdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jt_Edad_Gestion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jt_Nombre_Gestion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jt_Contrasena_Gestion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jt_Usuario_Gestion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_AgregarUsuario_Gestion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_Tipo_Gestion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jd_AdministradorLayout.setVerticalGroup(
            jd_AdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AdministradorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_AdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jd_AdministradorLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_Nombre_Gestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_Contrasena_Gestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_Usuario_Gestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_Edad_Gestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_Tipo_Gestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jb_AgregarUsuario_Gestion)))
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_Aceptar_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_Aceptar_LoginActionPerformed
        if (!jt_Usuario_Login.getText().isEmpty()&& jpass_Login.getPassword().length>0) {
            if (acceso()) {
                jd_Login.setVisible(false);
                if (esAdministrador()) {
                    jd_Administrador.pack();
                    jd_Administrador.setLocationRelativeTo(jd_Login);
                    jd_Administrador.setVisible(true);
                }
            }else{
                JOptionPane.showMessageDialog(jd_Login, "Acceso Denegano, favor revisar usuario y contraseña");
            }
        }else{
            JOptionPane.showMessageDialog(jd_Login, "Favor revisar la informacion ingresada");
        }
        
    }//GEN-LAST:event_jb_Aceptar_LoginActionPerformed

    private void jb_AgregarUsuario_GestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AgregarUsuario_GestionActionPerformed
        String n = jt_Nombre_Gestion.getText();
        String u = jt_Usuario_Gestion.getText();
        String p = jt_Contrasena_Gestion.getText();
        String e = jt_Edad_Gestion.getText();
        String t = cb_Tipo_Gestion.getSelectedItem().toString();
        boolean c1 = !n.isEmpty();
        boolean c2 = u.length()>0 & disponiblidadUsuario(u);
        boolean c3 = !p.isEmpty();
        boolean c4 = !e.isEmpty();
        boolean condicion = c1&c2&c3&c4;
        if (condicion) {
            Usuario nuevo = new Usuario(u, n, p, Integer.parseInt(e), t);
            this.agregarTablaLista(nuevo);
        }else{
            JOptionPane.showMessageDialog(jd_Administrador, "Favor complete todos los campos");
        }
    }//GEN-LAST:event_jb_AgregarUsuario_GestionActionPerformed

    private void jd_AdministradorWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jd_AdministradorWindowClosed
            System.exit(0);
    }//GEN-LAST:event_jd_AdministradorWindowClosed

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
            java.util.logging.Logger.getLogger(VentanaPrinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrinicipal().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_Tipo_Gestion;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jb_Aceptar_Login;
    private javax.swing.JButton jb_Aceptar_Registro;
    private javax.swing.JButton jb_AgregarUsuario_Gestion;
    private javax.swing.JButton jb_Cancelar_Login;
    private javax.swing.JButton jb_Cancelar_Registro;
    private javax.swing.JDialog jd_Administrador;
    private javax.swing.JDialog jd_AgregarUsuario;
    private javax.swing.JDialog jd_Login;
    private javax.swing.JPasswordField jpass_Login;
    private javax.swing.JPasswordField jpass_Registro;
    private javax.swing.JTextField jt_Contrasena_Gestion;
    private javax.swing.JTextField jt_Edad_Gestion;
    private javax.swing.JTextField jt_Edad_Registro;
    private javax.swing.JTextField jt_Nombre_Gestion;
    private javax.swing.JTextField jt_Nombre_Registro;
    private javax.swing.JTextField jt_Usuario_Gestion;
    private javax.swing.JTextField jt_Usuario_Login;
    private javax.swing.JTextField jt_Usuario_Registro;
    private javax.swing.JTable jtable_GestionUsuario;
    // End of variables declaration//GEN-END:variables

    // variables login
    private Usuario sesion;
    private boolean sesionActiva;
    
    //variables generales
    private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    
    // Metodos Generales
    private String stringPassword(JPasswordField p){
        return String.valueOf(p.getPassword());
    }
    
    // metodo para comprobar credenciales
    private boolean  acceso(){
        boolean b = false;
        for (Usuario temp : listaUsuarios) {
            if (jt_Usuario_Login.getText().equals(temp.getUsuario())&&
                    stringPassword(jpass_Login).equals(temp.getPass())) {
                b = true;
                sesion = temp;
                sesionActiva = true;
                break;
            }else{
                b = false;
            }
        }
        return b;
    }
    
    private boolean esAdministrador(){
        if (sesion.equals(listaUsuarios.get(0))) {
            return true;
        }else{
            return false;
        }
    }
    
    private void poblarUsuario(){
        Usuario administrador = new Usuario("juanOliva", "Juan Oliva", "1234", 31, "Administrador");
        Usuario c1 = new Usuario("panchito", "Franciso", "1234", 15, "Cliente");
        Usuario c2 = new Usuario("maria", "Maria", "1234", 18, "Cliente");
        Usuario c3 = new Usuario("lapresi", "Xiomara", "1234", 40, "Personal");
        Usuario c4 = new Usuario("expresi", "Jony", "1234", 40, "Personal");
        listaUsuarios.add(administrador);
        listaUsuarios.add(c1);
        listaUsuarios.add(c2);
        listaUsuarios.add(c3);
        listaUsuarios.add(c4);
    }
    
    public void cargaInicialTablaUsuarios(){
        DefaultTableModel modelo = new DefaultTableModel();
        String[]titulos = {"Usuario","Nombre","Constraseña","Edad","Tipo"};
        modelo.setColumnIdentifiers(titulos);
        for (Usuario temp : listaUsuarios) {
            modelo.addRow(temp.usuarioArreglo());
        }
        jtable_GestionUsuario.setModel(modelo);
    }
    
    public void agregarTablaLista(Usuario u){
        DefaultTableModel modelo = (DefaultTableModel) jtable_GestionUsuario.getModel();
        modelo.addRow(u.usuarioArreglo());
        listaUsuarios.add(u);
        jtable_GestionUsuario.setModel(modelo);
    }
    
    public void eliminarTablaLista(int index){
        DefaultTableModel modelo = (DefaultTableModel) jtable_GestionUsuario.getModel();
        modelo.removeRow(index);
        listaUsuarios.remove(index);
        jtable_GestionUsuario.setModel(modelo);
    }
    
    public boolean disponiblidadUsuario(String usuario){
        boolean condicion = true;
        for (Usuario temp : listaUsuarios) {
            if (usuario.equals(temp.getUsuario())) {
                condicion = false;
                break;
            }
        }
        return condicion;
    }
}

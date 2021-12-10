package lab9p2_juanoliva_10741313;

import java.util.ArrayList;
import javax.swing.JPasswordField;

public class VentanaPrinicipal extends javax.swing.JFrame {

    public VentanaPrinicipal() {
        initComponents();
        jd_Login.pack();
        jd_Login.setLocationRelativeTo(null);
        jd_Login.setVisible(true);
        
        poblarUsuario();
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
            jd_Login.setVisible(!acceso());
            
        }
        
    }//GEN-LAST:event_jb_Aceptar_LoginActionPerformed

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
                new VentanaPrinicipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jb_Aceptar_Login;
    private javax.swing.JButton jb_Aceptar_Registro;
    private javax.swing.JButton jb_Cancelar_Login;
    private javax.swing.JButton jb_Cancelar_Registro;
    private javax.swing.JDialog jd_AgregarUsuario;
    private javax.swing.JDialog jd_Login;
    private javax.swing.JPasswordField jpass_Login;
    private javax.swing.JPasswordField jpass_Registro;
    private javax.swing.JTextField jt_Edad_Registro;
    private javax.swing.JTextField jt_Nombre_Registro;
    private javax.swing.JTextField jt_Usuario_Login;
    private javax.swing.JTextField jt_Usuario_Registro;
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
    
}

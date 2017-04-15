/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_de_datos_educativo;

import VentanaProfesor.VentanaProfesor;
import VentanaEstudiante.VentanaEstudiante;
import VentanaAdmin.VentanaAdministrador;
import com.sun.glass.events.KeyEvent;
import java.util.Date;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Colegio colegio;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);//para centrar ventanas
        this.colegio = new Colegio();
        colegio.AgregaProfesor("Frander", "Fallas", "fafa@ulacit.ed.cr", "mate", 26, 3, new Date());
        colegio.AgregaProfesor("Andres", "Fallas", "andres.fallas@ulacit.ed.cr", "mate", 26, 3, new Date());
        colegio.AgregaProfesor("Julio", "Fallas", "julio.fallas@ulacit.ed.cr", "mate", 26, 3, new Date());
        colegio.AgregaProfesor("Cesar", "Fallas", "andres.fallas@ulacit.ed.cr", "mate", 26, 3, new Date());
        
        colegio.agregaEstudiantes("Aldo", "Bolanos", "Vanessa", "aldo.bola@ulacit.ed.cr", "8989-7162", 12, "Sexto año");
        colegio.agregaEstudiantes("David", "Alvarado", "Juan", "@", "2000-7262", 11, "Cuarto año");
        colegio.agregaEstudiantes("Diego", "Nunez", "Andres", "@", "8984-7262", 10, "Tercer año");
        colegio.agregaEstudiantes("Dorlan", "Donineli", "Gaby", "@", "9892-7262", 9, "Segundo año");

        colegio.agregaMateria("Matematica", 10, "2-3", 25);
        colegio.agregaMateria("Sociales", 11, "2-3", 25);
        colegio.agregaMateria("Estructura de datos", 12, "5-6", 25);
        colegio.agregaProfeAmateria(1, "Matematica");



        colegio.agregaAdmin("admin", "admin");


//        System.out.println(colegio.imprimeMateria());

        //System.out.println(colegio.imprimeUsuario());
        
        //System.out.println(colegio.imprimeMateria());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 200));

        jLabel1.setText("Usuario: ");

        jLabel2.setText("Contraseña:");

        btnInicio.setText("Iniciar Sesión");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        btnInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnInicioKeyPressed(evt);
            }
        });

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(txtUsuario))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnInicio)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed

        String nombreUsuario = txtUsuario.getText();
        String pass = new String(txtPassword.getPassword());
        Usuario usuario = colegio.validaUsuario(nombreUsuario, pass);

        if (usuario != null) {
            if (usuario.getRol().equalsIgnoreCase("Estudiante")) {
                VentanaEstudiante ventanaEstud = new VentanaEstudiante(colegio, usuario.getEstudiante());
                ventanaEstud.setVisible(true);
            } else if (usuario.getRol().equalsIgnoreCase("Profesor")) {
                VentanaProfesor ventanaProf = new VentanaProfesor(colegio, usuario.getProfesor());
                ventanaProf.setVisible(true);
            } else if (usuario.getRol().equalsIgnoreCase("Administrador")) {
                VentanaAdministrador admin = new VentanaAdministrador(colegio);
                admin.setVisible(true);
            }
            this.setVisible(false);

    }//GEN-LAST:event_btnInicioActionPerformed
        else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña invalido");
        }

    }

    private void btnInicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnInicioKeyPressed
        System.out.println("lalalalalalala");
    }//GEN-LAST:event_btnInicioKeyPressed

    //Accion que activa la tecla enter para iniciar cesion
    //-------------
    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        char cTeclaEnter = evt.getKeyChar();
        if (cTeclaEnter == KeyEvent.VK_ENTER) {
            btnInicio.doClick();
            
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        char cTeclaEnter = evt.getKeyChar();
        if (cTeclaEnter == KeyEvent.VK_ENTER) {
            btnInicio.doClick();
        }
    }//GEN-LAST:event_txtPasswordKeyTyped
//-------
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package sistema;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Jesus Emmanuel Lopez
 */
public class ActualizarUsuarios extends javax.swing.JInternalFrame {
    /**
     * Creates new form ActualizarUsuarios
     */
    public ActualizarUsuarios() {
        initComponents();
        this.cargarUsuarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAcPassword = new javax.swing.JTextField();
        txtAcCPassword = new javax.swing.JTextField();
        btnAcGuardar = new javax.swing.JButton();
        btnAcCerrar = new javax.swing.JButton();
        cbAcTipo = new javax.swing.JComboBox<>();
        txtAcNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbAcUsuarios = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Actualizar Usuario");

        jLabel1.setText("Actualizar Usuarios");

        jLabel2.setText("Usuario :");

        jLabel3.setText("Tipo :");

        jLabel4.setText("Password :");

        jLabel5.setText("Confirm Password");

        txtAcCPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcCPasswordActionPerformed(evt);
            }
        });

        btnAcGuardar.setText("Guardar");
        btnAcGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcGuardarActionPerformed(evt);
            }
        });

        btnAcCerrar.setText("Cerrar");
        btnAcCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcCerrarActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre  :");

        cbAcUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));
        cbAcUsuarios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAcUsuariosItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAcPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbAcTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 396, Short.MAX_VALUE)
                            .addComponent(txtAcCPassword)
                            .addComponent(txtAcNombre)
                            .addComponent(cbAcUsuarios, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnAcGuardar)
                        .addGap(117, 117, 117)
                        .addComponent(btnAcCerrar)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbAcUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbAcTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAcNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAcGuardar)
                            .addComponent(btnAcCerrar))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAcPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAcCPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcGuardarActionPerformed
        String usuario = this.cbAcUsuarios.getSelectedItem().toString();
        String txtpassword = this.txtAcPassword.getText();
        String txtconPassword = this.txtAcCPassword.getText();
        String nombre = this.txtAcNombre.getText();
        String nombrerol = this.cbAcTipo.getSelectedItem().toString();
        String user = "root";
        String url = "jdbc:mysql://localhost:3306/";
        String password = "root";
        String bd = "requerimientos";
        String driver = "com.mysql.cj.jdbc.Driver";
        if((!usuario.equals("Selecciona") && (txtpassword.equals(txtconPassword)))){
           try{
                    Class.forName(driver);
                    Connection conexion = DriverManager.getConnection(url+bd,user,password);
                    int idRol = this.buscarRoles(conexion,nombrerol);
                    System.out.println(idRol);
                    String sql = "UPDATE usuarios SET id_tipo_usuarios = " + idRol + ",nombre = '" + nombre + "',"
                                 + "contrasena = '" + txtpassword + "' WHERE usuario = '" + usuario + "';";
                    PreparedStatement consulta = conexion.prepareStatement(sql);
                    consulta.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Usuario : " + usuario + " Actualizado Correctamente");
                    conexion.close();
                }catch(ClassNotFoundException | SQLException mensaje){
                    JOptionPane.showMessageDialog(null, "Ocurrio un error al actualizar el Usuario : " + usuario);
                    Logger.getLogger(ActualizarUsuarios.class.getName()).log(Level.SEVERE,"Ocurrio un error en la consulta",mensaje);
                }
        }else{
            JOptionPane.showMessageDialog(null, "Usuarios no seleccinado, o, Las contraseñas no coinciden");
        }
    }//GEN-LAST:event_btnAcGuardarActionPerformed

    private void txtAcCPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcCPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcCPasswordActionPerformed

    private void btnAcCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcCerrarActionPerformed
       this.hide();
    }//GEN-LAST:event_btnAcCerrarActionPerformed

    private void cbAcUsuariosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAcUsuariosItemStateChanged
        String user = "root";
        String url = "jdbc:mysql://localhost:3306/";
        String password = "root";
        String bd = "requerimientos";
        String driver = "com.mysql.cj.jdbc.Driver";
        String usuario = "";
        if(evt.getStateChange() == 1){
            usuario = evt.getItem().toString();
            if(usuario.equals("Selecciona")){
                JOptionPane.showMessageDialog(null, "Selecciona algun usuario");
            }else{
                String sql = "SELECT t.nombre,u.usuario,u.nombre,u.contrasena FROM usuarios as u INNER JOIN tipo_usuarios as t"
                             + " ON u.id_tipo_usuarios = t.id WHERE u.usuario = '" + usuario + "';";
                try{
                    Class.forName(driver);
                    Connection conexion = DriverManager.getConnection(url+bd,user,password);
                    Statement consulta = conexion.createStatement();
                    ResultSet respuesta = consulta.executeQuery(sql);
                    while(respuesta.next()){
                        this.cbAcTipo.removeAllItems();
                        this.cbAcTipo.addItem(respuesta.getString(1));
                        this.getRoles(conexion, respuesta.getString(1));
                        this.txtAcNombre.setText(respuesta.getString(3));
                        this.txtAcPassword.setText(respuesta.getString(4));
                        this.txtAcCPassword.setText(respuesta.getString(4));
                    }
                    conexion.close();
                }catch(ClassNotFoundException | SQLException mensaje){
                    Logger.getLogger(ActualizarUsuarios.class.getName()).log(Level.SEVERE,"Ocurrio un error en la consulta",mensaje);
                }
            }
        }
            
    }//GEN-LAST:event_cbAcUsuariosItemStateChanged

    //precarga los usuarios de la bd
    private void cargarUsuarios(){
        String sql = "SELECT usuario FROM usuarios;";
        String user = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/";
        String bd = "requerimientos";
        String driver = "com.mysql.cj.jdbc.Driver";
        ResultSet respuesta = null;
        try{
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(url+bd,user,password);
            Statement consulta = conexion.createStatement();
            respuesta = consulta.executeQuery(sql);
            while(respuesta.next()){
                this.cbAcUsuarios.addItem(respuesta.getString(1));
            }
        conexion.close();
        }catch(ClassNotFoundException | SQLException mensaje){
            Logger.getLogger(ActualizarUsuarios.class.getName()).log(Level.SEVERE,"Ocurrio algun error al momento de la consulta",mensaje);
        }
    }
    
    //obtiene los roles del usuario al momento de la busqueda y los añade al combo box
    public void getRoles(Connection conexion,String rolUsuarioSeleccionado){
        String sql = "SELECT nombre FROM tipo_usuarios WHERE nombre <> '"+ rolUsuarioSeleccionado +"';";
        try{
            Statement consulta = conexion.createStatement();
            ResultSet respuesta = consulta.executeQuery(sql);
            while(respuesta.next()){
                this.cbAcTipo.addItem(respuesta.getString(1));
            }
        }catch(SQLException mensaje){
            Logger.getLogger(ActualizarUsuarios.class.getName()).log(Level.SEVERE,"Ocurrio algun error al momento de la consulta",mensaje);
        }
        
    }
    
    public int buscarRoles(Connection conexion, String rol){
        String sql = "SELECT id FROM tipo_usuarios WHERE nombre = '" + rol + "';";
        int idRol = 0;
        try{
            Statement consulta = conexion.createStatement();
            ResultSet respuesta = consulta.executeQuery(sql);
            while(respuesta.next()){
                idRol = respuesta.getInt(1);
            }
        }catch(SQLException mensaje){
            Logger.getLogger(ActualizarUsuarios.class.getName()).log(Level.SEVERE,"Ocurrio algun error al momento de la consulta",mensaje);
        }
        return idRol;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcCerrar;
    private javax.swing.JButton btnAcGuardar;
    private javax.swing.JComboBox<String> cbAcTipo;
    private javax.swing.JComboBox<String> cbAcUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAcCPassword;
    private javax.swing.JTextField txtAcNombre;
    private javax.swing.JTextField txtAcPassword;
    // End of variables declaration//GEN-END:variables
}
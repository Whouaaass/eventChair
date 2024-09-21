/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;


import domain.User;
import drivers.UserStoreService;
import javax.swing.JFrame;
import org.passay.PasswordData;
import utilities.PasswordManager;

/**
 *
 * @author julia
 */
public class ViewSignIn extends javax.swing.JFrame {
    private UserStoreService objUserStoreService; 
    /**
     * Creates new form viewRegistrarUsuario
     */
    public ViewSignIn(UserStoreService objUserStoreService) {
        initComponents();
        this.objUserStoreService=objUserStoreService;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelCenter = new javax.swing.JPanel();
        jButtonSignIn = new javax.swing.JButton();
        jButtonYaTengoUnaCuenta = new javax.swing.JButton();
        jPanelFormInput = new javax.swing.JPanel();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelMail = new javax.swing.JLabel();
        jTextFieldMail = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jPanelUp = new javax.swing.JPanel();
        jLabelRegistroUsuario = new javax.swing.JLabel();
        jPanelDown = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Usuario");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanelCenter.setBackground(new java.awt.Color(27, 40, 56));

        jButtonSignIn.setBackground(new java.awt.Color(26, 23, 33));
        jButtonSignIn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonSignIn.setForeground(new java.awt.Color(199, 213, 224));
        jButtonSignIn.setText("Registrarse");
        jButtonSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignInActionPerformed(evt);
            }
        });

        jButtonYaTengoUnaCuenta.setBackground(new java.awt.Color(199, 213, 224));
        jButtonYaTengoUnaCuenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonYaTengoUnaCuenta.setForeground(new java.awt.Color(30, 61, 155));
        jButtonYaTengoUnaCuenta.setText("Ya tengo una cuenta");
        jButtonYaTengoUnaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYaTengoUnaCuentaActionPerformed(evt);
            }
        });

        jPanelFormInput.setBackground(new java.awt.Color(27, 40, 56));
        java.awt.GridBagLayout jPanelFormInputLayout = new java.awt.GridBagLayout();
        jPanelFormInputLayout.columnWidths = new int[] {100};
        jPanelFormInput.setLayout(jPanelFormInputLayout);

        jLabelId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(199, 213, 224));
        jLabelId.setText("Identificación");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanelFormInput.add(jLabelId, gridBagConstraints);

        jTextFieldId.setText("0");
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 114;
        jPanelFormInput.add(jTextFieldId, gridBagConstraints);

        jLabelName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(199, 213, 224));
        jLabelName.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanelFormInput.add(jLabelName, gridBagConstraints);

        jTextFieldName.setText(".");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 117;
        jPanelFormInput.add(jTextFieldName, gridBagConstraints);

        jLabelLastName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelLastName.setForeground(new java.awt.Color(199, 213, 224));
        jLabelLastName.setText("Apellido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanelFormInput.add(jLabelLastName, gridBagConstraints);

        jTextFieldLastName.setText(".");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 117;
        jPanelFormInput.add(jTextFieldLastName, gridBagConstraints);

        jLabelMail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMail.setForeground(new java.awt.Color(199, 213, 224));
        jLabelMail.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanelFormInput.add(jLabelMail, gridBagConstraints);

        jTextFieldMail.setText("@gmail.com");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 117;
        jPanelFormInput.add(jTextFieldMail, gridBagConstraints);

        jLabelPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(199, 213, 224));
        jLabelPassword.setText("Contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanelFormInput.add(jLabelPassword, gridBagConstraints);

        jPasswordFieldPassword.setText("ContraSegura123");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 114;
        jPanelFormInput.add(jPasswordFieldPassword, gridBagConstraints);

        javax.swing.GroupLayout jPanelCenterLayout = new javax.swing.GroupLayout(jPanelCenter);
        jPanelCenter.setLayout(jPanelCenterLayout);
        jPanelCenterLayout.setHorizontalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCenterLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jButtonYaTengoUnaCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(jButtonSignIn)
                .addGap(28, 28, 28))
            .addGroup(jPanelCenterLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jPanelFormInput, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCenterLayout.setVerticalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenterLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanelFormInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSignIn)
                    .addComponent(jButtonYaTengoUnaCuenta))
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanelCenter, java.awt.BorderLayout.CENTER);

        jPanelUp.setBackground(new java.awt.Color(42, 71, 94));

        jLabelRegistroUsuario.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabelRegistroUsuario.setForeground(new java.awt.Color(199, 213, 224));
        jLabelRegistroUsuario.setText("REGISTRO DE USUARIO");

        javax.swing.GroupLayout jPanelUpLayout = new javax.swing.GroupLayout(jPanelUp);
        jPanelUp.setLayout(jPanelUpLayout);
        jPanelUpLayout.setHorizontalGroup(
            jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabelRegistroUsuario)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanelUpLayout.setVerticalGroup(
            jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelRegistroUsuario)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelUp, java.awt.BorderLayout.PAGE_START);

        jPanelDown.setBackground(new java.awt.Color(42, 71, 94));
        jPanelDown.setPreferredSize(new java.awt.Dimension(0, 10));

        javax.swing.GroupLayout jPanelDownLayout = new javax.swing.GroupLayout(jPanelDown);
        jPanelDown.setLayout(jPanelDownLayout);
        jPanelDownLayout.setHorizontalGroup(
            jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanelDownLayout.setVerticalGroup(
            jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelDown, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Asociar servicio almacenamiento de usuario
    public void associateUserStoreService(UserStoreService objUserService)
    {
        this.objUserStoreService=objUserService;
    }

    //Registro de usuario
    private void jButtonSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignInActionPerformed
        String varName;
        String varLastName;
        int varId;
        String varIdString;
        String varEmail;
        
        try{
            //Trae datos de la vista y las pasa a variables locales
            varName=this.jTextFieldName.getText();
            varLastName=this.jTextFieldLastName.getText();
            char[] arrayPassword=this.jPasswordFieldPassword.getPassword();
            String varPassword=new String(arrayPassword); 
            //Validacion de contraseña
            PasswordData objPassword = new PasswordData(varPassword);
            PasswordManager objPasswordManager = new PasswordManager(varPassword);
            if(!objPasswordManager.validPassword(objPassword)){
                System.out.println("La contreaseña debe contener entre 8 y 16 caracteres; almenos 1 caracter en mayusculas, 1 en minusculas y 1 numero");
                return;
            }
            varEmail=this.jTextFieldMail.getText();
            varIdString=this.jTextFieldId.getText();
            varId=Integer.parseInt(varIdString);
            //Pasamos las variables locales a un objeto
            User objUser = new User(varId,varName,varLastName,varPassword,varEmail);
            //El objeto se manda a través de un servicio de almacenamiento
            boolean varFlag = this.objUserStoreService.storeUser(objUser);
            if (varFlag) {
                System.out.println("El registro de usuario fue exitoso - Registro exitoso");
            } else {
                System.out.println("El registro de usuario no se realizó - Error en el registro");
            }
        }catch(Exception e){
            System.out.println("Error en el registro de datos");
        }
    }//GEN-LAST:event_jButtonSignInActionPerformed
    //Te redirecciona al inicio de sesión de usuario
    private void jButtonYaTengoUnaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYaTengoUnaCuentaActionPerformed
        ViewLogIn objViewLogIn = new ViewLogIn(this.objUserStoreService);
        objViewLogIn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        objViewLogIn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonYaTengoUnaCuentaActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSignIn;
    private javax.swing.JButton jButtonYaTengoUnaCuenta;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelMail;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelRegistroUsuario;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelDown;
    private javax.swing.JPanel jPanelFormInput;
    private javax.swing.JPanel jPanelUp;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}

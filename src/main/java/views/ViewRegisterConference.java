/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import context.AppContext;
import dataAccess.paperReview.RepositoryArrayListPaperReview;
import dataAccess.user.RepositoryArrayListUser;
import domain.Conference;
import domain.PaperReview;
import domain.User;
import drivers.ConferenceStoreService;
import drivers.PaperReviewStoreService;
import drivers.UserStoreService;

import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import static utilities.Utilities.setAlert;

/**
 *
 * @author julia
 */
public class ViewRegisterConference extends javax.swing.JFrame {
    private User objAdminUser;
    private ConferenceStoreService objConferenceStoreService;
    /**
     * Creates new form ViewRegisterConference
     */
    public ViewRegisterConference() {
        initComponents();
        AppContext appContext = AppContext.getInstance();
        this.objAdminUser=appContext.getLoggedUser();
        this.objConferenceStoreService=new ConferenceStoreService(appContext.getRepositoryConference());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelUp = new javax.swing.JPanel();
        jLabelTituloConferencia = new javax.swing.JLabel();
        jPanelDown = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelDescripción = new javax.swing.JLabel();
        jLabelCiudad = new javax.swing.JLabel();
        jButtonRegister = new javax.swing.JButton();
        jTextFieldCiudadConferencia = new javax.swing.JTextField();
        jTextFieldTituloConferencia = new javax.swing.JTextField();
        jTextFieldDescripcionConferencia = new javax.swing.JTextField();
        jLabelFecha = new javax.swing.JLabel();
        jTextFieldDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelUp.setBackground(new java.awt.Color(199, 213, 224));
        jPanelUp.setForeground(new java.awt.Color(199, 213, 224));

        jLabelTituloConferencia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTituloConferencia.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTituloConferencia.setText("REGISTRO DE CONFERENCIA");

        javax.swing.GroupLayout jPanelUpLayout = new javax.swing.GroupLayout(jPanelUp);
        jPanelUp.setLayout(jPanelUpLayout);
        jPanelUpLayout.setHorizontalGroup(
            jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabelTituloConferencia)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanelUpLayout.setVerticalGroup(
            jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelTituloConferencia)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelUp, java.awt.BorderLayout.PAGE_START);

        jPanelDown.setBackground(new java.awt.Color(244, 240, 216));

        jLabelNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombre.setText("Titulo:");

        jLabelDescripción.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDescripción.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDescripción.setText("Descripción:");

        jLabelCiudad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCiudad.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCiudad.setText("Ciudad:");

        jButtonRegister.setText("Registrar");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jLabelFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFecha.setText("Fecha:");

        javax.swing.GroupLayout jPanelDownLayout = new javax.swing.GroupLayout(jPanelDown);
        jPanelDown.setLayout(jPanelDownLayout);
        jPanelDownLayout.setHorizontalGroup(
            jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDownLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonRegister)
                    .addGroup(jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelDownLayout.createSequentialGroup()
                            .addComponent(jLabelNombre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldTituloConferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(jLabelCiudad)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldCiudadConferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelDownLayout.createSequentialGroup()
                            .addGroup(jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelDescripción)
                                .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldDescripcionConferencia, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(jTextFieldDate)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanelDownLayout.setVerticalGroup(
            jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDownLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelCiudad)
                    .addComponent(jTextFieldCiudadConferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTituloConferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDescripcionConferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescripción))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelFecha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRegister)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanelDown, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegisterActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        String varTitle;
        String varDescription;
        String varCity;
        Date objDate = null;       
                        
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        //Valida la fecha
        String varDate = this.jTextFieldDate.getText();
        if(varDate.isBlank()){
             setAlert("Fecha nula","Agregue una fecha");
             return;
        }
        try {
            objDate=formatter.parse(varDate);
            
        }catch(ParseException ex){
            setAlert("Formato de fecha","incorrecto");
            return;
        }
        try{
            //Trae datos de la vista y las pasa a variables locales
            varTitle=this.jTextFieldTituloConferencia.getText();
            varDescription=this.jTextFieldDescripcionConferencia.getText();
            varCity=this.jTextFieldCiudadConferencia.getText();
            
            if(varTitle.isBlank() || varDescription.isBlank() || varCity.isBlank()){
                setAlert("Campos nulos","Por favor llena toda la información solicitadada");
                return;
            }
            
            //Pasamos las variables locales a un objeto
            Conference objConference = new Conference(varTitle,objDate,varDescription,varCity,this.objAdminUser);
            //El objeto se manda a través de un servicio de almacenamiento
            boolean varFlag = this.objConferenceStoreService.storeConference(objConference);
            if (varFlag) {
                System.out.println("El registro de conferencia fue exitoso - Registro exitoso");
                setAlert("Registro exitoso","");
            } else {
                System.out.println("El registro de conferencia no se realizó - Error en el registro");
                setAlert("Registro rechazado","");
            }
        }catch(Exception e){
            System.out.println("Error en el registro de datos");
        }
    }//GEN-LAST:event_jButtonRegisterActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelDescripción;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTituloConferencia;
    private javax.swing.JPanel jPanelDown;
    private javax.swing.JPanel jPanelUp;
    private javax.swing.JTextField jTextFieldCiudadConferencia;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldDescripcionConferencia;
    private javax.swing.JTextField jTextFieldTituloConferencia;
    // End of variables declaration//GEN-END:variables
}

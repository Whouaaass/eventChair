/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import context.AppContext;
import domain.Paper;
import domain.User;
import drivers.PaperStoreService;
import infra.Observer;
import infra.Subject;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 * @author julia
 */
public class ViewMyPapers extends javax.swing.JFrame implements Observer {
    private User objUser;//User logeado
    private PaperStoreService objPaperStoreService;//Todos los papers

    /**
     * Creates new form ViewMyPapers
     */
    public ViewMyPapers() {
        initComponents();
        AppContext appContext = AppContext.getInstance();
        this.objUser = appContext.getLoggedUser();
        this.objPaperStoreService = appContext.getPaperStoreService();
        objPaperStoreService.addObserver(this);
        InitTable();
        fillTable();
    }

    private void InitTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Titulo");
        model.addColumn("Descripción");
        this.jTableMyPapers.setModel(model);
    }

    //Limpia una tabla
    public void cleanTable() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTableMyPapers.getModel();
        int filas = this.jTableMyPapers.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
        }
    }

    //Llenar tabla
    private void fillTable() {
        cleanTable();
        DefaultTableModel model = (DefaultTableModel) this.jTableMyPapers.getModel();
        ArrayList<Paper> papersList
                = (ArrayList<Paper>) this.objPaperStoreService.listPapersOf(objUser);

        for (int i = 0; i < papersList.size(); i++) {
            //Solo añade la fila si el usuario Id coincide con el del usuario logeado
            Object[] row = {
                    papersList.get(i).getAuthor().getUserName(),
                    papersList.get(i).getDescription(),
            };
            model.addRow(row);

        }

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
        jLabelTituloMyPapers = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMyPapers = new javax.swing.JTable();
        jButtonRefreshMyPapers = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(199, 213, 224));

        jLabelTituloMyPapers.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTituloMyPapers.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTituloMyPapers.setText("MIS PAPERS");

        jTableMyPapers.setBackground(new java.awt.Color(172, 156, 124));
        jTableMyPapers.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String[]{
                        "Titulo", "Descripcion"
                }
        ));
        jScrollPane2.setViewportView(jTableMyPapers);
        if (jTableMyPapers.getColumnModel().getColumnCount() > 0) {
            jTableMyPapers.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        jButtonRefreshMyPapers.setText("Actualizar");
        jButtonRefreshMyPapers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshMyPapersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(159, 159, 159)
                                                .addComponent(jLabelTituloMyPapers)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jButtonRefreshMyPapers, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(16, Short.MAX_VALUE)
                                .addComponent(jLabelTituloMyPapers)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonRefreshMyPapers, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(244, 240, 216));
        jPanel2.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 437, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRefreshMyPapersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshMyPapersActionPerformed
        fillTable();
    }//GEN-LAST:event_jButtonRefreshMyPapersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRefreshMyPapers;
    private javax.swing.JLabel jLabelTituloMyPapers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMyPapers;

    @Override
    public void update(Object o) {
        fillTable();
    }
    // End of variables declaration//GEN-END:variables
}

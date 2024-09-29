/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package views;

import domain.User;
import drivers.ConferenceStoreService;
import drivers.PaperReviewStoreService;
import drivers.PaperStoreService;
import drivers.UserStoreService;
import javax.swing.JFrame;

import context.AppContext;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author julia
 */
public class ViewMainMenu extends javax.swing.JFrame {

    //Usuario logeado
    User fldUser;
    //Repositorios de guardado
    private UserStoreService objUserStoreService;
    private ConferenceStoreService objConferenceStoreService;
    private PaperReviewStoreService objPaperReviewStoreService;
    private PaperStoreService objPaperStoreService;
    
    //helpers
    private Map<String, Component> tabIndexes;

    public ViewMainMenu() {
        initComponents();
        AppContext appContext = AppContext.getInstance();
        this.fldUser = appContext.getLoggedUser();
        this.objUserStoreService = new UserStoreService(appContext.getRepositoryUser());
        this.objConferenceStoreService = new ConferenceStoreService(appContext.getRepositoryConference());
        this.objPaperReviewStoreService = new PaperReviewStoreService(appContext.getRepositoryPaperReview());
        this.objPaperStoreService = new PaperStoreService(appContext.getRepositoryPaper());
        
        this.tabIndexes = new HashMap<>();
        
        this.setLocationRelativeTo(null);
        System.out.println("objUserStoreService:" + this.objUserStoreService.listUsers().getFirst().getUserName());
    }

    public User getFldUser() {
        return fldUser;
    }

    public void setFldUser(User fldUser) {
        this.fldUser = fldUser;
    }

    private void addTab(String title, Component component) {
        
        if (tabIndexes.containsKey(title)) {
            int tmpIdx = this.jTabbedMainPane.indexOfTabComponent(tabIndexes.get(title));
            this.jTabbedMainPane.setSelectedIndex(tmpIdx);
            return;
        }
        
        int index = this.jTabbedMainPane.getTabCount();
        
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(component, BorderLayout.CENTER);

        // Añadir la pestaña al JTabbedPane
        this.jTabbedMainPane.add(panel);

        // Crear el panel del encabezado de la pestaña que incluye el título y el botón de cerrar
        JPanel tabHeader = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        tabHeader.setOpaque(false);

        JLabel tabTitle = new JLabel(title);
        JButton closeButton = new JButton("x");

        // Establecer propiedades del botón de cerrar
        closeButton.setPreferredSize(new Dimension(16, 16));
        closeButton.setBorder(BorderFactory.createEmptyBorder());
        closeButton.setContentAreaFilled(false);

        
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeTab(title, tabHeader);
            }
        });
        this.jTabbedMainPane.setSelectedIndex(index);

        tabHeader.add(tabTitle);
        tabHeader.add(closeButton);

        // Asignar el encabezado personalizado a la pestaña recién agregada
        this.jTabbedMainPane.setTabComponentAt(index, tabHeader);
        
        this.tabIndexes.put(title, tabHeader);
        this.pack();

    }

    private void closeTab(String title, Component tabComponent) {
        int index = this.jTabbedMainPane.indexOfTabComponent(tabComponent);
        
        if (index != -1) {
            this.jTabbedMainPane.remove(index); // Elimina la pestaña
            tabIndexes.remove(title);            
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

        jPanelMainMenu = new javax.swing.JPanel();
        jTabbedMainPane = new javax.swing.JTabbedPane();
        DefauldTabPane = new javax.swing.JPanel();
        jLabelImgLogo = new javax.swing.JLabel();
        jMenuBarOptions = new javax.swing.JMenuBar();
        jMenuPerfil = new javax.swing.JMenu();
        jMenuItemLookUserProfile = new javax.swing.JMenuItem();
        jMenuItemModifyProfileUser = new javax.swing.JMenuItem();
        jMenuItemLogOut = new javax.swing.JMenuItem();
        jMenuConferences = new javax.swing.JMenu();
        JmenuItemRegisterConference = new javax.swing.JMenuItem();
        jMenuItemMyConferences = new javax.swing.JMenuItem();
        jMenuItemAssistantConference = new javax.swing.JMenuItem();
        jMenuMyPapers = new javax.swing.JMenu();
        jMenuItemMyPapers = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMainMenu.setBackground(new java.awt.Color(244, 240, 216));
        jPanelMainMenu.setLayout(new java.awt.BorderLayout());

        DefauldTabPane.setLayout(new java.awt.BorderLayout());

        jLabelImgLogo.setForeground(new java.awt.Color(60, 63, 65));
        jLabelImgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/PosibleLogo.jpg"))); // NOI18N
        jLabelImgLogo.setMaximumSize(new java.awt.Dimension(20, 20));
        jLabelImgLogo.setMinimumSize(new java.awt.Dimension(10, 10));
        DefauldTabPane.add(jLabelImgLogo, java.awt.BorderLayout.PAGE_END);

        jTabbedMainPane.addTab("Home", DefauldTabPane);

        jPanelMainMenu.add(jTabbedMainPane, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanelMainMenu, java.awt.BorderLayout.CENTER);

        jMenuBarOptions.setBackground(new java.awt.Color(199, 213, 224));
        jMenuBarOptions.setForeground(new java.awt.Color(27, 40, 56));

        jMenuPerfil.setText("Perfil");
        jMenuPerfil.setFocusable(false);
        jMenuPerfil.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuItemLookUserProfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemLookUserProfile.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemLookUserProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user_7099740.png"))); // NOI18N
        jMenuItemLookUserProfile.setText("Ver perfil");
        jMenuItemLookUserProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLookUserProfileActionPerformed(evt);
            }
        });
        jMenuPerfil.add(jMenuItemLookUserProfile);

        jMenuItemModifyProfileUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemModifyProfileUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemModifyProfileUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/profile_14551139.png"))); // NOI18N
        jMenuItemModifyProfileUser.setText("Editar perfil");
        jMenuItemModifyProfileUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModifyProfileUserActionPerformed(evt);
            }
        });
        jMenuPerfil.add(jMenuItemModifyProfileUser);

        jMenuItemLogOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/log-out_10024482.png"))); // NOI18N
        jMenuItemLogOut.setText("Salir");
        jMenuItemLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLogOutActionPerformed(evt);
            }
        });
        jMenuPerfil.add(jMenuItemLogOut);

        jMenuBarOptions.add(jMenuPerfil);

        jMenuConferences.setBackground(new java.awt.Color(102, 192, 244));
        jMenuConferences.setForeground(new java.awt.Color(27, 40, 56));
        jMenuConferences.setText("Conferencias");
        jMenuConferences.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        JmenuItemRegisterConference.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        JmenuItemRegisterConference.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JmenuItemRegisterConference.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/square_14034302.png"))); // NOI18N
        JmenuItemRegisterConference.setText("Registrar conferencia");
        JmenuItemRegisterConference.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmenuItemRegisterConferenceActionPerformed(evt);
            }
        });
        jMenuConferences.add(JmenuItemRegisterConference);

        jMenuItemMyConferences.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemMyConferences.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemMyConferences.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/public-speaking_5455385.jpg"))); // NOI18N
        jMenuItemMyConferences.setText("Mis conferencias");
        jMenuItemMyConferences.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMyConferencesActionPerformed(evt);
            }
        });
        jMenuConferences.add(jMenuItemMyConferences);

        jMenuItemAssistantConference.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemAssistantConference.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemAssistantConference.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/presentation_426378.jpg"))); // NOI18N
        jMenuItemAssistantConference.setText("Conferencias a las que asisto");
        jMenuItemAssistantConference.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAssistantConferenceActionPerformed(evt);
            }
        });
        jMenuConferences.add(jMenuItemAssistantConference);

        jMenuBarOptions.add(jMenuConferences);

        jMenuMyPapers.setBackground(new java.awt.Color(102, 192, 244));
        jMenuMyPapers.setForeground(new java.awt.Color(27, 40, 56));
        jMenuMyPapers.setText("Mis trabajos");
        jMenuMyPapers.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuItemMyPapers.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemMyPapers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/completed-task_1632670 (1).png"))); // NOI18N
        jMenuItemMyPapers.setText("Mis trabajos");
        jMenuItemMyPapers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMyPapersActionPerformed(evt);
            }
        });
        jMenuMyPapers.add(jMenuItemMyPapers);

        jMenuBarOptions.add(jMenuMyPapers);

        setJMenuBar(jMenuBarOptions);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemMyConferencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMyConferencesActionPerformed
        // TODO add your handling code here:
        ViewMyConferences objViewMyConferences = new ViewMyConferences();
        /*
        objViewMyConferences.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        objViewMyConferences.setVisible(true);
         */

        this.addTab("Mis Conferencias", objViewMyConferences.getContentPane());
    }//GEN-LAST:event_jMenuItemMyConferencesActionPerformed

    private void JmenuItemRegisterConferenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmenuItemRegisterConferenceActionPerformed
        // TODO add your handling code here:
        ViewRegisterConference objViewRegisterConference = new ViewRegisterConference();
        /*
        objViewRegisterConference.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        objViewRegisterConference.setVisible(true);
*/
        this.addTab("Registrar Conferencia", objViewRegisterConference.getContentPane());
    }//GEN-LAST:event_JmenuItemRegisterConferenceActionPerformed

    private void jMenuItemAssistantConferenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAssistantConferenceActionPerformed
        // TODO add your handling code here:
        ViewAssistantConference objViewAssistantConference = new ViewAssistantConference();
        /*
        objViewAssistantConference.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        objViewAssistantConference.setVisible(true);
*/
        this.addTab("Asistencia a Conferencias", objViewAssistantConference.getContentPane());
    }//GEN-LAST:event_jMenuItemAssistantConferenceActionPerformed

    private void jMenuItemLookUserProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLookUserProfileActionPerformed
        // TODO add your handling code here:
        ViewMyProfile objViewMyProfile = new ViewMyProfile();
        /*
        objViewMyProfile.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        objViewMyProfile.setVisible(true);
*/
        this.addTab("Perfil de usuario", objViewMyProfile.getContentPane());
    }//GEN-LAST:event_jMenuItemLookUserProfileActionPerformed

    private void jMenuItemModifyProfileUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModifyProfileUserActionPerformed
        // TODO add your handling code here:
        ViewModifyMyProfile objViewModifyMyProfile = new ViewModifyMyProfile();
        /*
        objViewModifyMyProfile.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        objViewModifyMyProfile.setVisible(true);
*/
        this.addTab("Modificar perfil", objViewModifyMyProfile.getContentPane());
    }//GEN-LAST:event_jMenuItemModifyProfileUserActionPerformed

    private void jMenuItemMyPapersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMyPapersActionPerformed
        // TODO add your handling code here:
        ViewMyPapers objViewMyPapers = new ViewMyPapers();
        /*
        objViewMyPapers.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        objViewMyPapers.setVisible(true);
*/
        this.addTab("Mis articulos", objViewMyPapers.getContentPane());
    }//GEN-LAST:event_jMenuItemMyPapersActionPerformed

    private void jMenuItemLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogOutActionPerformed
        // TODO add your handling code here:
        ViewLogIn objViewLogIn = new ViewLogIn();
        this.setVisible(false);
        objViewLogIn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        objViewLogIn.setVisible(true);
    }//GEN-LAST:event_jMenuItemLogOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DefauldTabPane;
    private javax.swing.JMenuItem JmenuItemRegisterConference;
    private javax.swing.JLabel jLabelImgLogo;
    private javax.swing.JMenuBar jMenuBarOptions;
    private javax.swing.JMenu jMenuConferences;
    private javax.swing.JMenuItem jMenuItemAssistantConference;
    private javax.swing.JMenuItem jMenuItemLogOut;
    private javax.swing.JMenuItem jMenuItemLookUserProfile;
    private javax.swing.JMenuItem jMenuItemModifyProfileUser;
    private javax.swing.JMenuItem jMenuItemMyConferences;
    private javax.swing.JMenuItem jMenuItemMyPapers;
    private javax.swing.JMenu jMenuMyPapers;
    private javax.swing.JMenu jMenuPerfil;
    private javax.swing.JPanel jPanelMainMenu;
    private javax.swing.JTabbedPane jTabbedMainPane;
    // End of variables declaration//GEN-END:variables
}

class MyCloseActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}

/*
* This JFrame allows the user to enter app information and 
* submit the request
*/

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class RequestJFrame extends javax.swing.JFrame {

    /**
     * Creates new form RequestJFrame
     */
    public RequestJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);

        Border bd = BorderFactory.createMatteBorder(3, 3, 3, 3, Color.white);
        jPanel1.setBorder(bd);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_portal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel_minimizeWindow = new javax.swing.JLabel();
        jPanel_newAppInfo = new javax.swing.JPanel();
        jLabel_name = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jLabel_description = new javax.swing.JLabel();
        jScrollPane_description = new javax.swing.JScrollPane();
        jTextArea_description = new javax.swing.JTextArea();
        jLabel_organization = new javax.swing.JLabel();
        jTextField_organization = new javax.swing.JTextField();
        jLabel_platform = new javax.swing.JLabel();
        jTextField_platform = new javax.swing.JTextField();
        jLabel_version = new javax.swing.JLabel();
        jTextField_version = new javax.swing.JTextField();
        jLabel_link = new javax.swing.JLabel();
        jTextField_link = new javax.swing.JTextField();
        jLabel_price = new javax.swing.JLabel();
        jTextField_price = new javax.swing.JTextField();
        jButton_submit = new javax.swing.JButton();
        jButton_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(2, 48, 71));
        jPanel1.setAutoscrolls(true);

        jPanel_portal.setBackground(new java.awt.Color(235, 183, 3));

        jLabel1.setBackground(new java.awt.Color(235, 183, 55));
        jLabel1.setFont(new java.awt.Font("Gurmukhi MN", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(61, 90, 128));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Application Form");

        javax.swing.GroupLayout jPanel_portalLayout = new javax.swing.GroupLayout(jPanel_portal);
        jPanel_portal.setLayout(jPanel_portalLayout);
        jPanel_portalLayout.setHorizontalGroup(
            jPanel_portalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_portalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_portalLayout.setVerticalGroup(
            jPanel_portalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_portalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        jLabel_close.setBackground(new java.awt.Color(2, 48, 71));
        jLabel_close.setFont(new java.awt.Font("Lucida Grande", 0, 28)); // NOI18N
        jLabel_close.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_close.setText("x");
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.setOpaque(true);
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
        });

        jLabel_minimizeWindow.setBackground(new java.awt.Color(2, 48, 71));
        jLabel_minimizeWindow.setFont(new java.awt.Font("Lucida Grande", 0, 28)); // NOI18N
        jLabel_minimizeWindow.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_minimizeWindow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_minimizeWindow.setText("-");
        jLabel_minimizeWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimizeWindow.setOpaque(true);
        jLabel_minimizeWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeWindowMouseClicked(evt);
            }
        });

        jPanel_newAppInfo.setBackground(new java.awt.Color(2, 48, 71));

        jLabel_name.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel_name.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_name.setText("Name");
        jLabel_name.setToolTipText("");

        jTextField_name.setBackground(new java.awt.Color(240, 239, 235));
        jTextField_name.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel_description.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel_description.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_description.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_description.setText("Description");

        jTextArea_description.setBackground(new java.awt.Color(240, 239, 235));
        jTextArea_description.setColumns(20);
        jTextArea_description.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jTextArea_description.setRows(5);
        jScrollPane_description.setViewportView(jTextArea_description);

        jLabel_organization.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel_organization.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_organization.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_organization.setText("Organization");

        jTextField_organization.setBackground(new java.awt.Color(240, 239, 235));
        jTextField_organization.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel_platform.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel_platform.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_platform.setText("Platform");

        jTextField_platform.setBackground(new java.awt.Color(240, 239, 235));
        jTextField_platform.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel_version.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel_version.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_version.setText("Version");

        jTextField_version.setBackground(new java.awt.Color(240, 239, 235));
        jTextField_version.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel_link.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel_link.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_link.setText("Link");

        jTextField_link.setBackground(new java.awt.Color(240, 239, 235));
        jTextField_link.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel_price.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel_price.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_price.setText("Price");

        jTextField_price.setBackground(new java.awt.Color(240, 239, 235));
        jTextField_price.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jButton_submit.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton_submit.setText("Submit request");
        jButton_submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_submitMouseClicked(evt);
            }
        });
        jButton_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_submitActionPerformed(evt);
            }
        });

        jButton_cancel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton_cancel.setText("Cancel");
        jButton_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_newAppInfoLayout = new javax.swing.GroupLayout(jPanel_newAppInfo);
        jPanel_newAppInfo.setLayout(jPanel_newAppInfoLayout);
        jPanel_newAppInfoLayout.setHorizontalGroup(
            jPanel_newAppInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_newAppInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_newAppInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_newAppInfoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel_description)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane_description, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE))
                    .addGroup(jPanel_newAppInfoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel_name, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_name))
                    .addGroup(jPanel_newAppInfoLayout.createSequentialGroup()
                        .addComponent(jLabel_organization)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_organization))
                    .addGroup(jPanel_newAppInfoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel_newAppInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_version)
                            .addComponent(jLabel_platform)
                            .addComponent(jLabel_link)
                            .addComponent(jLabel_price))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_newAppInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_platform)
                            .addComponent(jTextField_version)
                            .addComponent(jTextField_link)
                            .addComponent(jTextField_price)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_newAppInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
        jPanel_newAppInfoLayout.setVerticalGroup(
            jPanel_newAppInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_newAppInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_newAppInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_newAppInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_description, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane_description))
                .addGap(23, 23, 23)
                .addGroup(jPanel_newAppInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_organization, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_organization, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_newAppInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_platform, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_platform, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_newAppInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_version, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_version, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_newAppInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_link, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_link, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_newAppInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_price, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel_newAppInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_newAppInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_portal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel_minimizeWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_minimizeWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_portal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_newAppInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>                        

    /*
    * Close window
    */
    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {                                          
        System.exit(0);
    }                                         

    /*
    * Minimize window
    */
    private void jLabel_minimizeWindowMouseClicked(java.awt.event.MouseEvent evt) {                                                   
        this.setState(JFrame.ICONIFIED);
    }                                                  

    /*
    * User submits application request by clicking submit button.
    * Check that all input are valid before adding the app request to the database.
    */
    private void jButton_submitActionPerformed(java.awt.event.ActionEvent evt) {                                               
        String name = jTextField_name.getText();
        String description = jTextArea_description.getText();
        String organization = jTextField_organization.getText();
        String platform = jTextField_platform.getText();
        String version = jTextField_version.getText();
        String link = jTextField_link.getText();
        String tempPrice = jTextField_price.getText();
        
        //Check for null properties
        if (name.trim().equals("") || description.trim().equals("") || 
                organization.trim().equals("") ||platform.trim().equals("") || 
                version.trim().equals("") || link.trim().equals("") || tempPrice.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Fields cannot be blank.");
        } else if (!isNumeric(tempPrice)) {
            JOptionPane.showMessageDialog(null, "Invalid input on [Price]");
        } else if (checkApp(name) ) {
            JOptionPane.showMessageDialog(null, "App already existed.");
        } else {
            double price = Double.parseDouble(tempPrice);
            Application app = new Application(name, description, organization, platform, version, link, price);
            app.requestApp(name);
        }
    }                                              

    /*
    * Display DashboardJFrane and dispose this
    */
    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {                                               
        DashboardJFrame dashboard = new DashboardJFrame();
        dashboard.setVisible(true);
        dashboard.pack();
        dashboard.setLocationRelativeTo(null);
        dashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); 
    }                                              

    /*
    * A helper method that connects to the database and check if the app
    * already exists in the database.
    * Returns true if app already exists, and false otherwise.
    */
    public boolean checkApp(String name) {
        PreparedStatement ps;
        ResultSet rs;
        boolean appExist = false;
        
        String query = "SELECT * FROM `AppInfo` WHERE `name`=?";
        try {
            ps = ConnectData.getConnection().prepareStatement(query);
            ps.setString(1, name); 
            rs = ps.executeQuery();
            
            if(rs.next()) {
                appExist = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RequestJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return appExist;
    }
    
    /*
    * A helper method that checks wether if the input is a number. 
    * Return true if input is numeric, and false otherwise. 
    */
    public static boolean isNumeric(String input) {
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) 
                return false;
        }
        
        return true;
    }
    
    private void jButton_submitMouseClicked(java.awt.event.MouseEvent evt) {                                            

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
            java.util.logging.Logger.getLogger(RequestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RequestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RequestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RequestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RequestJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JButton jButton_submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_description;
    private javax.swing.JLabel jLabel_link;
    private javax.swing.JLabel jLabel_minimizeWindow;
    private javax.swing.JLabel jLabel_name;
    private javax.swing.JLabel jLabel_organization;
    private javax.swing.JLabel jLabel_platform;
    private javax.swing.JLabel jLabel_price;
    private javax.swing.JLabel jLabel_version;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_newAppInfo;
    private javax.swing.JPanel jPanel_portal;
    private javax.swing.JScrollPane jScrollPane_description;
    private javax.swing.JTextArea jTextArea_description;
    private javax.swing.JTextField jTextField_link;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_organization;
    private javax.swing.JTextField jTextField_platform;
    private javax.swing.JTextField jTextField_price;
    private javax.swing.JTextField jTextField_version;
    // End of variables declaration                   
}

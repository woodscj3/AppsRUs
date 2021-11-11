
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suzy Doan
 */
public class DashboardJFrame extends javax.swing.JFrame {

    /**
     * Creates new form DashboardJFrame
     */
    public DashboardJFrame() {
        initComponents();
        this.setLocationRelativeTo(null); //Center
        
        // Add white borders
        Border bd = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.white);
        jPanel1.setBorder(bd);
        
//        bd = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(247, 127, 0));
//        jLabel_appName.setBorder(bd);
        
        // jTable
        filterApps(); // Connect with database
        jTable_appsTable.setSelectionBackground(new Color(2,48,71));
        jTable_appsTable.setSelectionForeground(new Color(235,183,3));
        jTable_appsTable.setBackground(new Color(240, 239, 235));
        jTable_appsTable.setRowHeight(50);
        jTable_appsTable.getTableHeader().setBackground(new Color(240, 239, 235));
        jTable_appsTable.getTableHeader().setFont(new Font("Lucida Grande", Font.BOLD, 15));
        
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
        jPanel_sidePanel = new javax.swing.JPanel();
        jLabel_home = new javax.swing.JLabel();
        jLabel_user = new javax.swing.JLabel();
        jLabel_logIn = new javax.swing.JLabel();
        jLabel_register = new javax.swing.JLabel();
        jLabel_welcome = new javax.swing.JLabel();
        jPanel_topPanel = new javax.swing.JPanel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jTextField_searchField = new javax.swing.JTextField();
        jButton_search = new javax.swing.JButton();
        jLabel_appName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_appsTable = new javax.swing.JTable();
        jButton_request = new javax.swing.JButton();
        jButton_viewRequest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(2, 48, 71));

        jPanel_sidePanel.setBackground(new java.awt.Color(235, 183, 3));

        jLabel_home.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel_home.setForeground(new java.awt.Color(2, 48, 71));
        jLabel_home.setText("HOME");

        jLabel_user.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel_user.setForeground(new java.awt.Color(2, 48, 71));
        jLabel_user.setText("USER");

        jLabel_logIn.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel_logIn.setForeground(new java.awt.Color(2, 48, 71));
        jLabel_logIn.setText("Log in");
        jLabel_logIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_logIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_logInMouseClicked(evt);
            }
        });

        jLabel_register.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel_register.setForeground(new java.awt.Color(2, 48, 71));
        jLabel_register.setText("Register");
        jLabel_register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_registerMouseClicked(evt);
            }
        });

        jLabel_welcome.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jLabel_welcome.setForeground(new java.awt.Color(2, 48, 71));
        jLabel_welcome.setText("WELCOME!");

        javax.swing.GroupLayout jPanel_sidePanelLayout = new javax.swing.GroupLayout(jPanel_sidePanel);
        jPanel_sidePanel.setLayout(jPanel_sidePanelLayout);
        jPanel_sidePanelLayout.setHorizontalGroup(
            jPanel_sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_sidePanelLayout.createSequentialGroup()
                .addGroup(jPanel_sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_sidePanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel_welcome))
                    .addGroup(jPanel_sidePanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel_sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_home)
                            .addComponent(jLabel_user)
                            .addGroup(jPanel_sidePanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel_sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_register, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_logIn))))))
                .addGap(0, 58, Short.MAX_VALUE))
        );
        jPanel_sidePanelLayout.setVerticalGroup(
            jPanel_sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_sidePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel_welcome)
                .addGap(33, 33, 33)
                .addComponent(jLabel_home)
                .addGap(18, 18, 18)
                .addComponent(jLabel_user)
                .addGap(18, 18, 18)
                .addComponent(jLabel_logIn)
                .addGap(18, 18, 18)
                .addComponent(jLabel_register)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        jPanel_topPanel.setBackground(new java.awt.Color(235, 183, 3));
        jPanel_topPanel.setName(""); // NOI18N

        jLabel_minimize.setFont(new java.awt.Font("Lucida Grande", 0, 30)); // NOI18N
        jLabel_minimize.setForeground(new java.awt.Color(2, 48, 71));
        jLabel_minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_minimize.setText("-");
        jLabel_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
        });

        jLabel_close.setFont(new java.awt.Font("Lucida Grande", 0, 30)); // NOI18N
        jLabel_close.setForeground(new java.awt.Color(2, 48, 71));
        jLabel_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_close.setText("x");
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
        });

        jTextField_searchField.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jTextField_searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_searchFieldActionPerformed(evt);
            }
        });

        jButton_search.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jButton_search.setForeground(new java.awt.Color(2, 48, 71));
        jButton_search.setText("Search");
        jButton_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jLabel_appName.setFont(new java.awt.Font("Gurmukhi MN", 0, 32)); // NOI18N
        jLabel_appName.setForeground(new java.awt.Color(2, 48, 71));
        jLabel_appName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_appName.setText("Apps-R-Us");

        javax.swing.GroupLayout jPanel_topPanelLayout = new javax.swing.GroupLayout(jPanel_topPanel);
        jPanel_topPanel.setLayout(jPanel_topPanelLayout);
        jPanel_topPanelLayout.setHorizontalGroup(
            jPanel_topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_topPanelLayout.createSequentialGroup()
                .addComponent(jLabel_appName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel_topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_topPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel_topPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton_search)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel_topPanelLayout.setVerticalGroup(
            jPanel_topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_topPanelLayout.createSequentialGroup()
                        .addGroup(jPanel_topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_minimize)
                            .addComponent(jLabel_close))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(jPanel_topPanelLayout.createSequentialGroup()
                        .addGap(0, 36, Short.MAX_VALUE)
                        .addGroup(jPanel_topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_topPanelLayout.createSequentialGroup()
                                .addComponent(jButton_search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField_searchField))))
                .addContainerGap())
            .addComponent(jLabel_appName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTable_appsTable.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable_appsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Organization", "Platform", "Version", "Link", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_appsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable_appsTable);

        jButton_request.setText("Request Application");
        jButton_request.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_requestMouseClicked(evt);
            }
        });
        jButton_request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_requestActionPerformed(evt);
            }
        });

        jButton_viewRequest.setText("View Application Requests");
        jButton_viewRequest.setContentAreaFilled(false);
        jButton_viewRequest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_viewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_viewRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jButton_request, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(jButton_viewRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel_topPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_viewRequest, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(jButton_request, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23))))
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
    }// </editor-fold>                        

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {                                             
        this.setState(JFrame.ICONIFIED);
    }                                            

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {                                          
        System.exit(0);
    }                                         

    private void jLabel_logInMouseClicked(java.awt.event.MouseEvent evt) {                                          
        Login_JFrame loginForm = new Login_JFrame();
        loginForm.setVisible(true);
        loginForm.pack();
        loginForm.setLocationRelativeTo(null);
        loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); //Terminate dashboard if login form is clicked
    }                                         

    private void jLabel_registerMouseClicked(java.awt.event.MouseEvent evt) {                                             
        Register_JFrame registerForm = new Register_JFrame();
        registerForm.setVisible(true);
        registerForm.pack();
        registerForm.setLocationRelativeTo(null);
        registerForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); //Terminate dashboard if register form is clicked 
    }                                            

    private void jTextField_searchFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {                                               
        filterApps();
    }                                              

    private void jButton_requestActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void jButton_requestMouseClicked(java.awt.event.MouseEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jButton_viewRequestActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    /**
     * Method that performs the filtering
     */
    public ArrayList<Application> listApps(String input) {
        ArrayList<Application> appsArr = new ArrayList<Application>();
        PreparedStatement ps;
        Statement st;

        try {
            Connection con = ConnectData.getConnection();
            st = con.createStatement();
            ResultSet rs;
            String searchQuery = "SELECT * FROM `AppInfo` WHERE CONCAT(`name`) LIKE '%" + input + "%'";
            
            rs = st.executeQuery(searchQuery);
            Application app;
            
            while(rs.next()) {
                String name = rs.getString("name");
                String description = rs.getString("description");
                String organization = rs.getString("organization");
                String platform = rs.getString("platform");
                String version = rs.getString("version");
                String link = rs.getString("link");
                float price = rs.getFloat("price");
                
                app = new Application(name, description, organization, platform, version, link, price);
                appsArr.add(app);
            }
            
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return appsArr;
    }
    /**
     * Method that displays the filtered results 
     */
    public void filterApps() {
        ArrayList<Application> appsArr = listApps(jTextField_searchField.getText());
        DefaultTableModel tb = new DefaultTableModel();
        
        tb.setColumnIdentifiers(new Object[]{"Name", "Description",
                                "Organization", "Platform", "Version", 
                                "Link", "Price"}); 
        
        Object[] newObj = new Object[7];
        for(int i = 0; i < appsArr.size(); i++) {
            newObj[0] = appsArr.get(i).appName;
            newObj[1] = appsArr.get(i).description;
            newObj[2] = appsArr.get(i).organization;
            newObj[3] = appsArr.get(i).platform;
            newObj[4] = appsArr.get(i).version;
            newObj[5] = appsArr.get(i).linkToStore;
            newObj[6] = appsArr.get(i).price;
            tb.addRow(newObj);
        }
        jTable_appsTable.setModel(tb);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton_request;
    private javax.swing.JButton jButton_search;
    private javax.swing.JButton jButton_viewRequest;
    private javax.swing.JLabel jLabel_appName;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_home;
    private javax.swing.JLabel jLabel_logIn;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JLabel jLabel_register;
    private javax.swing.JLabel jLabel_user;
    public javax.swing.JLabel jLabel_welcome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_sidePanel;
    private javax.swing.JPanel jPanel_topPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_appsTable;
    private javax.swing.JTextField jTextField_searchField;
    // End of variables declaration                   
}

package com.mycompany.warehouse_management;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


//import com.apache.commons.dbutils.DbUtils; // Assuming you're using DbUtils for resultSetToTableModel

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lyeschl
 */
public class Dashboard extends javax.swing.JFrame {
    
    /**
     * Creates new form Dashboard
     */

    public Dashboard() {
        initComponents();

    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        exitTicketOption = new javax.swing.JMenuItem();
        returnTicketOption = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        accountSettingsButton = new javax.swing.JToggleButton();
        helpButton = new javax.swing.JToggleButton();
        advancedSearchButton = new javax.swing.JToggleButton();
        exitTicketButton = new javax.swing.JToggleButton();
        returnTicketButton = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        movesTable = new javax.swing.JTable();
        movesLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        articleTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        newMove = new javax.swing.JToggleButton();
        dashboardLabel = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        logoLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dashboardLogo = new javax.swing.JLabel();

        exitTicketOption.setText("Exit Ticket");
        exitTicketOption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTicketOptionMouseClicked(evt);
            }
        });

        returnTicketOption.setText("Return Ticket");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        accountSettingsButton.setBackground(new java.awt.Color(51, 51, 51));
        accountSettingsButton.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        accountSettingsButton.setForeground(new java.awt.Color(153, 153, 153));
        accountSettingsButton.setText("Account");
        accountSettingsButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
        accountSettingsButton.setContentAreaFilled(false);
        accountSettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountSettingsButtonActionPerformed(evt);
            }
        });

        helpButton.setBackground(new java.awt.Color(51, 51, 51));
        helpButton.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        helpButton.setForeground(new java.awt.Color(153, 153, 153));
        helpButton.setText("Help");
        helpButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
        helpButton.setContentAreaFilled(false);
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        advancedSearchButton.setBackground(new java.awt.Color(51, 51, 51));
        advancedSearchButton.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        advancedSearchButton.setForeground(new java.awt.Color(153, 153, 153));
        advancedSearchButton.setText("Advanced Search");
        advancedSearchButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
        advancedSearchButton.setContentAreaFilled(false);
        advancedSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedSearchButtonActionPerformed(evt);
            }
        });

        exitTicketButton.setBackground(new java.awt.Color(51, 51, 51));
        exitTicketButton.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        exitTicketButton.setForeground(new java.awt.Color(153, 153, 153));
        exitTicketButton.setText("Create Exit Ticket");
        exitTicketButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
        exitTicketButton.setContentAreaFilled(false);
        exitTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitTicketButtonActionPerformed(evt);
            }
        });

        returnTicketButton.setBackground(new java.awt.Color(51, 51, 51));
        returnTicketButton.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        returnTicketButton.setForeground(new java.awt.Color(153, 153, 153));
        returnTicketButton.setText("Create Return Ticket");
        returnTicketButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
        returnTicketButton.setContentAreaFilled(false);
        returnTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnTicketButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(advancedSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(accountSettingsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addComponent(helpButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(exitTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(advancedSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(accountSettingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(helpButton)
                .addGap(55, 55, 55))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(700, 10, 150, 450);

        movesTable.setForeground(new java.awt.Color(153, 204, 255));
        movesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        movesTable.setGridColor(new java.awt.Color(51, 102, 255));
        movesTable.setSelectionBackground(new java.awt.Color(102, 153, 255));
        movesTable.setSelectionForeground(new java.awt.Color(102, 102, 255));
        jScrollPane1.setViewportView(movesTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 150, 270, 100);

        movesLabel.setBackground(new java.awt.Color(255, 255, 255));
        movesLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        movesLabel.setForeground(new java.awt.Color(255, 255, 255));
        movesLabel.setText("Movements");
        getContentPane().add(movesLabel);
        movesLabel.setBounds(20, 130, 72, 14);

        articleTable.setForeground(new java.awt.Color(153, 204, 255));
        articleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        articleTable.setGridColor(new java.awt.Color(51, 102, 255));
        articleTable.setSelectionBackground(new java.awt.Color(102, 153, 255));
        articleTable.setSelectionForeground(new java.awt.Color(102, 102, 255));
        articleTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                articleTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(articleTable);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 280, 280, 110);

        jLabel3.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Articles");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 260, 47, 14);

        newMove.setBackground(new java.awt.Color(51, 51, 51));
        newMove.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        newMove.setForeground(new java.awt.Color(153, 153, 153));
        newMove.setText("New Move +");
        newMove.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
        newMove.setContentAreaFilled(false);
        newMove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newMoveMousePressed(evt);
            }
        });
        newMove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMoveActionPerformed(evt);
            }
        });
        getContentPane().add(newMove);
        newMove.setBounds(20, 80, 90, 32);

        dashboardLabel.setBackground(new java.awt.Color(255, 255, 255));
        dashboardLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 24)); // NOI18N
        dashboardLabel.setForeground(new java.awt.Color(255, 255, 255));
        dashboardLabel.setText("Dashboard");
        getContentPane().add(dashboardLabel);
        dashboardLabel.setBounds(20, 10, 150, 40);

        welcomeLabel.setBackground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 24)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText("Welcome");
        getContentPane().add(welcomeLabel);
        welcomeLabel.setBounds(330, 10, 170, 40);

        logoLabel1.setBackground(new java.awt.Color(255, 255, 255));
        logoLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/output-onlinepngtools(1).png"))); // NOI18N
        getContentPane().add(logoLabel1);
        logoLabel1.setBounds(20, 410, 45, 65);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sunset-gradient-hd-wallpaper(1).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 870, 530);

        dashboardLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_icon.png"))); // NOI18N
        getContentPane().add(dashboardLogo);
        dashboardLogo.setBounds(30, 20, 30, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitTicketOptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTicketOptionMouseClicked
        // TODO add your handling code here:
        dispose();
        ExitTicket eti = new ExitTicket();
        eti.setVisible(true);
    }//GEN-LAST:event_exitTicketOptionMouseClicked

    private void newMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newMoveActionPerformed

    private void newMoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newMoveMousePressed
        // TODO add your handling code here:
        jPopupMenu2.show(newMove, 0, newMove.getHeight());
    }//GEN-LAST:event_newMoveMousePressed

    private void advancedSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advancedSearchButtonActionPerformed
        // TODO add your handling code here:
        dispose();

        AdvancedSearch advs = new AdvancedSearch();
        advs.setVisible(true);
    }//GEN-LAST:event_advancedSearchButtonActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpButtonActionPerformed

    private void accountSettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountSettingsButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        AccountSettings as = new AccountSettings();
        as.setVisible(true);
    }//GEN-LAST:event_accountSettingsButtonActionPerformed

    private void exitTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitTicketButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        ExitTicket et = new ExitTicket();
        et.setVisible(true);
    }//GEN-LAST:event_exitTicketButtonActionPerformed

    private void returnTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnTicketButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        ReturnTicket rt = new ReturnTicket();
        rt.setVisible(true);
    }//GEN-LAST:event_returnTicketButtonActionPerformed

    private void articleTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_articleTableMouseClicked
        // TODO add your handling code here:
        DataBaseUtils.populateArticleTable(articleTable);
        articleTable.revalidate();
        articleTable.repaint();
        // Call the populateArticleTable method to fill the results table with data from the Article table
        DataBaseUtils.populateArticleTable(articleTable);

//        // Get the count of articles
//        int articleCount = DataBaseUtils.countArticles();
//
//        // Set the count in the text field
//        articleCountTextField.setText(Integer.toString(articleCount));
    }//GEN-LAST:event_articleTableMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton accountSettingsButton;
    private javax.swing.JToggleButton advancedSearchButton;
    private javax.swing.JTable articleTable;
    private javax.swing.JLabel dashboardLabel;
    private javax.swing.JLabel dashboardLogo;
    private javax.swing.JToggleButton exitTicketButton;
    private javax.swing.JMenuItem exitTicketOption;
    private javax.swing.JToggleButton helpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel logoLabel1;
    private javax.swing.JLabel movesLabel;
    private javax.swing.JTable movesTable;
    private javax.swing.JToggleButton newMove;
    private javax.swing.JToggleButton returnTicketButton;
    private javax.swing.JMenuItem returnTicketOption;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}

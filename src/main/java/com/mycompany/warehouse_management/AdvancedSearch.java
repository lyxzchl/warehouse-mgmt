package com.mycompany.warehouse_management;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lyeschl
 */
public class AdvancedSearch extends javax.swing.JFrame {

    /**
     * Crpubliceates new form AdvancedSearch
     */
    public AdvancedSearch() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        searchBar = new javax.swing.JTextField();
        codeRadio = new javax.swing.JRadioButton();
        classRadio = new javax.swing.JRadioButton();
        familyRadio = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultsTabel = new javax.swing.JTable();
        logoLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        desigRadio = new javax.swing.JRadioButton();
        searchLogoLabel = new javax.swing.JLabel();
        articleCount = new javax.swing.JLabel();
        articleCountTextField = new javax.swing.JTextField();
        searchButton1 = new javax.swing.JButton();
        measureUnitRadio = new javax.swing.JRadioButton();
        rayonRadio = new javax.swing.JRadioButton();
        casierRadio = new javax.swing.JRadioButton();
        valueRadio = new javax.swing.JRadioButton();
        stockQRadio = new javax.swing.JRadioButton();
        stockMinRadio = new javax.swing.JRadioButton();
        stockMaxRadio = new javax.swing.JRadioButton();
        stockSecRadio = new javax.swing.JRadioButton();
        observRadio = new javax.swing.JRadioButton();
        activeRadio = new javax.swing.JRadioButton();
        dormantRadio = new javax.swing.JRadioButton();
        deadRadio = new javax.swing.JRadioButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        searchBar.setBackground(new java.awt.Color(102, 102, 102));
        searchBar.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        searchBar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });

        codeRadio.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(codeRadio);
        codeRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
        codeRadio.setForeground(new java.awt.Color(153, 153, 153));
        codeRadio.setText("Code");
        codeRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeRadioActionPerformed(evt);
            }
        });

        classRadio.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(classRadio);
        classRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
        classRadio.setForeground(new java.awt.Color(153, 153, 153));
        classRadio.setText("Class");
        classRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classRadioActionPerformed(evt);
            }
        });

        familyRadio.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(familyRadio);
        familyRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
        familyRadio.setForeground(new java.awt.Color(153, 153, 153));
        familyRadio.setText("Family");
        familyRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familyRadioActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 102));

        resultsTabel.setBackground(new java.awt.Color(102, 102, 102));
        resultsTabel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
        resultsTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        resultsTabel.setGridColor(new java.awt.Color(153, 153, 153));
        resultsTabel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        resultsTabel.setShowGrid(true);
        resultsTabel.setShowVerticalLines(false);
        jScrollPane2.setViewportView(resultsTabel);

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/output-onlinepngtools(1).png"))); // NOI18N

        backButton.setBackground(new java.awt.Color(51, 51, 51));
        backButton.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(153, 153, 153));
        backButton.setText("<<Back");
        backButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
        backButton.setContentAreaFilled(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        desigRadio.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(desigRadio);
        desigRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
        desigRadio.setForeground(new java.awt.Color(153, 153, 153));
        desigRadio.setText("Designation");
        desigRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desigRadioActionPerformed(evt);
            }
        });

        searchLogoLabel.setIcon(new javax.swing.ImageIcon("/run/media/lyeschl/ssd/main/dox/study/l3si/pfe/thesis/images/icons/search_icon.png")); // NOI18N

        articleCount.setBackground(new java.awt.Color(0, 0, 0));
        articleCount.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        articleCount.setForeground(new java.awt.Color(153, 153, 153));
        articleCount.setText("Article count: ");

        articleCountTextField.setBackground(new java.awt.Color(51, 51, 51));
        articleCountTextField.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 11)); // NOI18N
        articleCountTextField.setForeground(new java.awt.Color(153, 153, 153));
        articleCountTextField.setText("69420");
        articleCountTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        articleCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                articleCountTextFieldActionPerformed(evt);
            }
        });

        searchButton1.setBackground(new java.awt.Color(51, 51, 51));
        searchButton1.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 11)); // NOI18N
        searchButton1.setForeground(new java.awt.Color(153, 153, 153));
        searchButton1.setText("Search");
        searchButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
        searchButton1.setContentAreaFilled(false);
        searchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton1ActionPerformed(evt);
            }
        });

        measureUnitRadio.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(measureUnitRadio);
        measureUnitRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
        measureUnitRadio.setForeground(new java.awt.Color(153, 153, 153));
        measureUnitRadio.setText("Measure Unit");
        measureUnitRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                measureUnitRadioActionPerformed(evt);
            }
        });

        rayonRadio.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rayonRadio);
        rayonRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
        rayonRadio.setForeground(new java.awt.Color(153, 153, 153));
        rayonRadio.setText("Rayon");
        rayonRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rayonRadioActionPerformed(evt);
            }
        });

        casierRadio.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(casierRadio);
        casierRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
        casierRadio.setForeground(new java.awt.Color(153, 153, 153));
        casierRadio.setText("Casier");
        casierRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casierRadioActionPerformed(evt);
            }
        });

        valueRadio.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(valueRadio);
        valueRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
        valueRadio.setForeground(new java.awt.Color(153, 153, 153));
        valueRadio.setText("Value");
        valueRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueRadioActionPerformed(evt);
            }
        });

        stockQRadio.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(stockQRadio);
        stockQRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
        stockQRadio.setForeground(new java.awt.Color(153, 153, 153));
        stockQRadio.setText("Stock Quantity");
        stockQRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockQRadioActionPerformed(evt);
            }
        });

        stockMinRadio.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(stockMinRadio);
        stockMinRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
        stockMinRadio.setForeground(new java.awt.Color(153, 153, 153));
        stockMinRadio.setText("Minimum Stock");
        stockMinRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockMinRadioActionPerformed(evt);
            }
        });

        stockMaxRadio.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(stockMaxRadio);
        stockMaxRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
        stockMaxRadio.setForeground(new java.awt.Color(153, 153, 153));
        stockMaxRadio.setText("Maximum Stock");
        stockMaxRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockMaxRadioActionPerformed(evt);
            }
        });

        stockSecRadio.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(stockSecRadio);
        stockSecRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
        stockSecRadio.setForeground(new java.awt.Color(153, 153, 153));
        stockSecRadio.setText("Secure Stock");
        stockSecRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockSecRadioActionPerformed(evt);
            }
        });

        observRadio.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(observRadio);
        observRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
        observRadio.setForeground(new java.awt.Color(153, 153, 153));
        observRadio.setText("Observation");
        observRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observRadioActionPerformed(evt);
            }
        });

        activeRadio.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(activeRadio);
        activeRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
        activeRadio.setForeground(new java.awt.Color(153, 153, 153));
        activeRadio.setText("Active");
        activeRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activeRadioActionPerformed(evt);
            }
        });

        dormantRadio.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(dormantRadio);
        dormantRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
        dormantRadio.setForeground(new java.awt.Color(153, 153, 153));
        dormantRadio.setText("Dormant");
        dormantRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dormantRadioActionPerformed(evt);
            }
        });

        deadRadio.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(deadRadio);
        deadRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
        deadRadio.setForeground(new java.awt.Color(153, 153, 153));
        deadRadio.setText("Dead");
        deadRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deadRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(searchLogoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(codeRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(classRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(familyRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(desigRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(measureUnitRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rayonRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(casierRadio))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(valueRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(stockQRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(stockMinRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stockMaxRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stockSecRadio))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(observRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(activeRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dormantRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deadRadio)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(articleCount)
                                .addGap(18, 18, 18)
                                .addComponent(articleCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoLabel)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(searchLogoLabel))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codeRadio)
                            .addComponent(classRadio)
                            .addComponent(familyRadio)
                            .addComponent(desigRadio)
                            .addComponent(measureUnitRadio)
                            .addComponent(rayonRadio)
                            .addComponent(casierRadio)))
                    .addComponent(logoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueRadio)
                    .addComponent(stockQRadio)
                    .addComponent(stockMinRadio)
                    .addComponent(stockMaxRadio)
                    .addComponent(stockSecRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(observRadio)
                    .addComponent(activeRadio)
                    .addComponent(dormantRadio)
                    .addComponent(deadRadio))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(articleCount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(articleCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarActionPerformed

    private void codeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeRadioActionPerformed

    private void classRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classRadioActionPerformed

    private void familyRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familyRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_familyRadioActionPerformed

    private void desigRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desigRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desigRadioActionPerformed

    private void articleCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articleCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_articleCountTextFieldActionPerformed

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
        String searchColumn = "";
        String searchValue = searchBar.getText().trim();

        if (codeRadio.isSelected()) {
            searchColumn = "code_art";
        } else if (classRadio.isSelected()) {
            searchColumn = "code_class";
        } else if (familyRadio.isSelected()) {
            searchColumn = "desig_class"; // Assuming you want to search by the class description
        } else if (desigRadio.isSelected()) {
            searchColumn = "desig_art";
        } else if (measureUnitRadio.isSelected()) {
            searchColumn = "unite_mes";
        } else if (rayonRadio.isSelected()) {
            searchColumn = "rayon";
        } else if (casierRadio.isSelected()) {
            searchColumn = "casier";
        } else if (valueRadio.isSelected()) {
            searchColumn = "valeur";
        } else if (stockQRadio.isSelected()) {
            searchColumn = "qte_st";
        } else if (stockMinRadio.isSelected()) {
            searchColumn = "stock_mini";
        } else if (stockMaxRadio.isSelected()) {
            searchColumn = "stock_max";
        } else if (stockSecRadio.isSelected()) {
            searchColumn = "stock_secu";
        } else if (observRadio.isSelected()) {
            searchColumn = "observation";
        } else if (activeRadio.isSelected()) {
            searchColumn = "actif";
        } else if (dormantRadio.isSelected()) {
            searchColumn = "dormant";
        } else if (deadRadio.isSelected()) {
            searchColumn = "mort";
        }

        if (!searchColumn.isEmpty() && !searchValue.isEmpty()) {
            DataBaseUtils.populateArticleTable(resultsTabel, searchColumn, searchValue);
            resultsTabel.revalidate();
            resultsTabel.repaint();
        }
        // Get the count of articles
        int articleCount;
        try {
            articleCount = DataBaseUtils.countArticles();
            // Set the count in the text field
            articleCountTextField.setText(Integer.toString(articleCount));
        } catch (SQLException ex) {
            Logger.getLogger(AdvancedSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_searchButton1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        
        Dashboard db = new Dashboard();
        db.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void measureUnitRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_measureUnitRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_measureUnitRadioActionPerformed

    private void rayonRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rayonRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rayonRadioActionPerformed

    private void casierRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casierRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casierRadioActionPerformed

    private void valueRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueRadioActionPerformed

    private void stockQRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockQRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockQRadioActionPerformed

    private void stockMinRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockMinRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockMinRadioActionPerformed

    private void stockMaxRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockMaxRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockMaxRadioActionPerformed

    private void stockSecRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockSecRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockSecRadioActionPerformed

    private void observRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_observRadioActionPerformed

    private void activeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activeRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activeRadioActionPerformed

    private void dormantRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dormantRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dormantRadioActionPerformed

    private void deadRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deadRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deadRadioActionPerformed

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
            java.util.logging.Logger.getLogger(AdvancedSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdvancedSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdvancedSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdvancedSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdvancedSearch().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton activeRadio;
    private javax.swing.JLabel articleCount;
    private javax.swing.JTextField articleCountTextField;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton casierRadio;
    private javax.swing.JRadioButton classRadio;
    private javax.swing.JRadioButton codeRadio;
    private javax.swing.JRadioButton deadRadio;
    private javax.swing.JRadioButton desigRadio;
    private javax.swing.JRadioButton dormantRadio;
    private javax.swing.JRadioButton familyRadio;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JRadioButton measureUnitRadio;
    private javax.swing.JRadioButton observRadio;
    private javax.swing.JRadioButton rayonRadio;
    private javax.swing.JTable resultsTabel;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton1;
    private javax.swing.JLabel searchLogoLabel;
    private javax.swing.JRadioButton stockMaxRadio;
    private javax.swing.JRadioButton stockMinRadio;
    private javax.swing.JRadioButton stockQRadio;
    private javax.swing.JRadioButton stockSecRadio;
    private javax.swing.JRadioButton valueRadio;
    // End of variables declaration//GEN-END:variables
}

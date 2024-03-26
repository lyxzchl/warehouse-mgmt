/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.warehouse_management;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author lyeschl
 */
public class DataBaseUtils {
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/spare_parts_warehouse";
    private static final String DB_USER = "lyeschl";
    private static final String DB_PASSWORD = "lyessou1213";

    public static void populateArticleTable(JTable table) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Article")) {

            // Get the metadata of the result set
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Create a default table model to store the data
            DefaultTableModel model = new DefaultTableModel();

            // Add column names
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnName(i));
            }

            // Add data rows
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }

            // Set the table model
            table.setModel(model);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
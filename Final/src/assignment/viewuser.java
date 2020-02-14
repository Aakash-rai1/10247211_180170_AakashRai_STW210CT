/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import assignment.database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aakas
 */
public class viewuser extends JFrame{
    JFrame a;
    JTable j;
    JButton back;
    DefaultTableModel defaultTableModel;

    // Constructor 
    viewuser() {
        // Frame initiallization 
        a = new JFrame();
        a.setTitle("user table"); 
        j = new JTable();
        j.setBounds(30, 100, 800, 100);
        JScrollPane sp = new JScrollPane(j);
        a.add(sp);
        a.setSize(800, 800);
        a.setVisible(true);
        loadUserData();
    }

    public void loadUserData() {
        database db = new database();
        defaultTableModel = (DefaultTableModel) j.getModel();
        defaultTableModel.setColumnCount(0);
        
        defaultTableModel.addColumn("Id");
        defaultTableModel.addColumn("name");
        defaultTableModel.addColumn("email");
        defaultTableModel.addColumn("password");
        defaultTableModel.addColumn("token");
        defaultTableModel.setRowCount(0);

        try {
            for (users userTemp : db.getUserDetail()) {
                   defaultTableModel.addRow(new String[]{
                       String.valueOf(userTemp.getId()),userTemp.getname(),userTemp.getemail(),userTemp.getpassword(),userTemp.gettoken()
                   });
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

    }

    // Driver  method 

    public static void main(String[] args) {
        new viewuser();
    }

}

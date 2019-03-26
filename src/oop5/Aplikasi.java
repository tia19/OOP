/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop5;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Aplikasi {
    public static void main(String[] args){
        JFrame frame = new JFrame("halo");
        frame.setSize(300, 200);
        
        frame.setLayout(new BorderLayout());
        
        JLabel lblNama = new JLabel();
        lblNama.setText("tia sulistiana safitri");
        //frame.add(lblNama, BorderLayout.WEST);
        JLabel lblNim = new JLabel();
        lblNim.setText("17090037");
        
        
        JButton btnSimpan = new JButton("Simpan");
        frame.add(btnSimpan, BorderLayout.EAST);
        
        JPanel westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(3,1));
        frame.add(westPanel, BorderLayout.WEST);
        westPanel.add(lblNama);
        westPanel.add(lblNim);
        
        frame.setVisible(true);
    }
    
}

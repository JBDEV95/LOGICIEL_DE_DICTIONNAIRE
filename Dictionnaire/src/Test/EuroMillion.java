/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author JBDEV95
 */
public class EuroMillion {

    private JPanel panelGenerale;
    private JLabel lblTitre,lblBoule1,lbl1,lbl2,lbl3,lbl4,lbl5,lbl6;
    
    public EuroMillion() {
        
        
        //ma Fenetre
        JFrame fenetre  = new JFrame("Gagner 1/2 Millions");
        fenetre.setSize(700,400);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setResizable(false);
        fenetre.setLocationRelativeTo(null);
        
        //Mon titre
        lblTitre = new JLabel("Gagner 1/2 Millions");
        lblTitre.setBounds(70, 20, 30, 10);
        lblTitre.setFont(new Font("Arial", 0, 25));
        
        //Mes Boules 
        lbl1 = new JLabel("Boule chance 1");
        lbl1.setBounds(10, 40, 25, 20);
        //panel centrale 
        panelGenerale = new JPanel();
        panelGenerale.setLayout(null);
        panelGenerale.setBackground(Color.white);
        
        panelGenerale.add(lblTitre);
        panelGenerale.add(lbl1);
        fenetre.add(panelGenerale);
        
        
        
        
        
        
        fenetre.setVisible(true);
    }
    
    
    
    
    public static void main(String[] args) {
        new EuroMillion();
    }
}

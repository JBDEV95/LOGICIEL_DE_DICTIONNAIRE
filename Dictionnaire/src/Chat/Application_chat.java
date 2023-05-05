
package Chat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author JBDEV95
 */
public class Application_chat {
    
    private JLabel lblnom;
    private JTextField txtnom, txtdonne1, txtdonne2;
    private JButton btnEnvoyer, btnActualiser;
    private JTextArea txtMessage;
    private JDialog obj;
    private JMenuBar menue1;
    private JMenu menFile, menHelp;
    private JMenuItem menOpen, menSaveAs;
    private JPanel panel, panelDonne;
    public Application_chat() {
        // creation de ma fentre
        JFrame fenetre = new JFrame("Application de chat");
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        fenetre.setSize(size.width, size.height);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLocationRelativeTo(null);
        
        //creer le menue bar 
        menue1 = new JMenuBar();
        menFile = new JMenu("File");
        menHelp = new JMenu("Help");
        menue1.add(menFile);
        menue1.add(menHelp);
        
        menOpen = new JMenuItem("Open");
        menSaveAs = new JMenuItem("Save as");
        menFile.add(menOpen);
        menFile.add(menSaveAs);
        
        
        //ajouter un panel
        panel = new JPanel();
        lblnom = new JLabel("Entrer Le nom");
        txtnom = new JTextField(10);// va prendre que 10 valeurs 
        btnEnvoyer = new JButton("Send");
        btnActualiser = new JButton("Reset");
        
         //appelons nos variables
        panel.add(lblnom);
        panel.add(txtnom);
        panel.add(btnEnvoyer);
        panel.add(btnActualiser);
        
        
        panelDonne = new JPanel(new GridLayout(10, 1));
        txtdonne1 = new JTextField(15);
        txtdonne2 = new JTextField(15);
        
        panelDonne.add(txtdonne1);
        panelDonne.add(txtdonne2);
        // lui on laisse tous seul
        txtMessage = new JTextArea();
        
        
        
        
        fenetre.getContentPane().add(BorderLayout.NORTH, menue1);
        fenetre.getContentPane().add(BorderLayout.SOUTH,panel);
        fenetre.getContentPane().add(BorderLayout.EAST, panelDonne);
        fenetre.getContentPane().add(BorderLayout.CENTER, txtMessage);
        fenetre.setVisible(true);
    }
    
    
    
    
    public static void main(String[] args) {
         new Application_chat();
        
    }
}

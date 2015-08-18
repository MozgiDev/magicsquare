package View;

import Controller.Calculator;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Jerome
 */
public class MainWindow extends JFrame {
    
    Object matrice[][] = new Object[4][4];
    Calculator ctrl = new Calculator();
    
    public MainWindow() {
        
        this.setSize(800, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout());
        genererUI();
        GenererCarre(ctrl.calcul(38));
        
    }

    /**
     *
     */
    class myhandler implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            GenererCarre(ctrl.calcul(Integer.valueOf(e.getActionCommand())));
            
        }
        
    }
    
    public void genererUI() {
        JPanel pane = new JPanel();
        JTextField textfield1 = new JTextField("Entrez un nombre : ");
        textfield1.setSize(50, 10);
        JButton bt = new JButton("Valider");
        myhandler handler = new myhandler();
        bt.addActionListener(handler);
        
        pane.add(textfield1);
        pane.add(bt);
        this.add(pane);
        
    }
    
    public void GenererCarre(Object matrice[][]) {
        Object columns[] = new Object[matrice.length];
        for (int i = 0; i < matrice.length; i++) {
            columns[i] = "";
        }
        
        JTable carre = new JTable(matrice, columns);
        carre.setEnabled(false);
        carre.setRowHeight(150);
        //Centrer les valeurs du tableau
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        carre.setDefaultRenderer(Object.class, centerRenderer);

        // On définit la police et la taille
        carre.setFont(new Font("Segoe UI", Font.BOLD, 20));
        JScrollPane panel = new JScrollPane(carre);
        
        this.add(panel, BorderLayout.CENTER);
        
    }
    
}

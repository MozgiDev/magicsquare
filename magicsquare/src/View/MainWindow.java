package View;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Jerome
 */
public class MainWindow extends JFrame {

    Object matrice[][] = new Object[4][4];

    
    public MainWindow() {
        
        this.setSize(800, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fullfillCarre(matrice);
        
        
    }

    
    public void fullfillCarre(Object matrice[][]) {
        Object columns[] = new Object[matrice.length];
        for (int i = 0; i < matrice.length; i++) {
            columns[i] = "";
        }

        JTable carre = new JTable(matrice, columns);
        JScrollPane panel = new JScrollPane(carre);

        this.add(panel);
    }
    
    
    
}

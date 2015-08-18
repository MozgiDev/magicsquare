package Controller;

import View.MainWindow;
import java.util.Arrays;

/**
 *
 * @author Jerome
 */
public class Calculator {

    Integer matrice[][] = {
        {1, 15, 14, 4},
        {12, 6, 7, 9},
        {8, 10, 11, 5},
        {13, 3, 2, 16}
    };

    public void init() {
        MainWindow fenetre = new MainWindow();
        fenetre.setVisible(true);
    }

    public Object[][] calcul(int n) {
        int a = (n - 34) / 4;
        Integer magicSquare[][] = matrice;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                magicSquare[i][j] = matrice[i][j] + a;
            }
        }
        Object[][] x = Arrays.copyOf(magicSquare, magicSquare.length, Integer[][].class);
        return x;
    }

    public boolean isPossible(int n) {
        int a = n - 34;
        if (0 == a % 4) {
            return true;
        } else {
            return false;
        }
    }
}

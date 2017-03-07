package proyectofina.laberinto;

import java.util.Scanner;

public class ProyectofinaLaberinto {

    public static void main(String[] args) {
        mapa og = new mapa();
        og.setLocationRelativeTo(null);
        og.setVisible(true);
    }

     static String[][] llenado(int bloq) {
        int y, x, u = 0;
        String[][] mapa = new String[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                mapa[i][j] = " ";
            }
        }
        while (u < bloq) {
            y = (int) (Math.random() * 12 + 0);
            x = (int) (Math.random() * 12 + 0);
            while (mapa[y][x].equals(".")) {
                y = (int) (Math.random() * 12 + 0);
                x = (int) (Math.random() * 12 + 0);
            }
            mapa[y][x] = ".";
            u++;
        }
        return mapa;
    }
}

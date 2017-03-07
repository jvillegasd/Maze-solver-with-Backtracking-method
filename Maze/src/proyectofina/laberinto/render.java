package proyectofina.laberinto;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class render extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
        /* Esta clase es para cambiar el color segun la condicion,donde las casillas negras son
        las bloqueadas. Cabe destacar de que no hay que darle setvalueat a la jtable,con estos condicionales,
        se colorearan las celdas de la jtable equivalente a la posicion de la matriz usada*/
        String[][] mapa2 = mapa.prueba;
        if (mapa2[row][column].equals(".")) {
            this.setOpaque(true);
            this.setBackground(Color.BLACK);
        } else {
            this.setOpaque(true);
            this.setBackground(Color.WHITE);
        }
        if (mapa2[row][column].equals("O")) {
            this.setOpaque(true);
            this.setBackground(Color.GREEN);
        } else if (mapa2[row][column].equals("X")) {
            this.setOpaque(true);
            this.setBackground(Color.RED);
        }
        if (mapa2[row][column].equals("a")) {
            this.setOpaque(true);
            this.setBackground(Color.BLUE);
        }
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        return this;
    }
}

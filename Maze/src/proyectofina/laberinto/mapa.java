package proyectofina.laberinto;

import java.awt.Color;
import static java.lang.Math.sqrt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.InternationalFormatter;

public class mapa extends javax.swing.JFrame {

    static String[][] prueba = new String[12][12];
    static int[] caminoX = new int[144];
    static int[] caminoY = new int[144];
    boolean confirmar = false;
    int contvec = 0, switche = 0, x, y, z, w, sw = 0, c = 0;

    public mapa() {
        initComponents();
        this.setTitle("Laberinto");
        mapajt.setVisible(false);
        generarbt.setEnabled(false);
        puestosbt.setEnabled(false);
        iniciarbt.setEnabled(false);
        mapajt.getTableHeader().setVisible(false);//quitar la barrita de arriba
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mapajt = new javax.swing.JTable();
        generarbt = new javax.swing.JButton();
        bloqtf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        puestosbt = new javax.swing.JButton();
        titulolb = new javax.swing.JLabel();
        inciolb = new javax.swing.JLabel();
        empezarlb = new javax.swing.JLabel();
        iniciarbt = new javax.swing.JButton();
        resetlb = new javax.swing.JLabel();
        resetbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mapajt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mapajt.setGridColor(new java.awt.Color(0, 0, 0));
        mapajt.setRowSelectionAllowed(false);
        mapajt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mapajtMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mapajt);
        mapajt.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        generarbt.setText("Generar Laberinto");
        generarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarbtActionPerformed(evt);
            }
        });

        bloqtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bloqtfKeyTyped(evt);
            }
        });

        jLabel1.setText("No de Casillas Bloqueadas:");

        puestosbt.setText("Puestos");
        puestosbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puestosbtActionPerformed(evt);
            }
        });

        titulolb.setText("Laberinto");

        inciolb.setText("Colocar puestos:");

        empezarlb.setText("Iniciar Recorrido:");

        iniciarbt.setText("Iniciar");
        iniciarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarbtActionPerformed(evt);
            }
        });

        resetlb.setText("Reiniciar:");

        resetbt.setText("Reiniciar");
        resetbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inciolb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(puestosbt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(empezarlb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iniciarbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resetlb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(resetbt))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(bloqtf, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(generarbt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(titulolb)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(titulolb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inciolb)
                            .addComponent(puestosbt))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empezarlb)
                            .addComponent(iniciarbt))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resetlb)
                            .addComponent(resetbt))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloqtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generarbt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarbtActionPerformed
        try {
            if (Long.parseLong(bloqtf.getText()) > 72) {
                JOptionPane.showMessageDialog(null, "El valor debe estar entre 0 y 72");
                bloqtf.setText(null);
                generarbt.setEnabled(false);
                mapajt.setVisible(false);
            } else {
                prueba = ProyectofinaLaberinto.llenado(Integer.parseInt(bloqtf.getText()));
                mapajt.setDefaultRenderer(Object.class, new render());
                mapajt.setVisible(true);
                mapajt.updateUI();
                puestosbt.setEnabled(true);
                bloqtf.setEditable(false);
                sw = 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El valor debe estar entre 0 y 72");
            bloqtf.setText(null);
            generarbt.setEnabled(false);
            mapajt.setVisible(false);
        }
        /*el setdefaultrenderer es la forma con la que se llama la clase render
          donde en parametros el object.class toma cualquier cosa y el new render es la clase render.*/
    }//GEN-LAST:event_generarbtActionPerformed

    private void bloqtfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bloqtfKeyTyped
        char capt = evt.getKeyChar();
        if (sw == 0) {
            if (!Character.isDigit(capt) && capt != evt.VK_BACK_SPACE && capt != evt.VK_ENTER) {
                JOptionPane.showMessageDialog(null, "Deben ser solo numeros!");
                evt.consume();
                bloqtf.setText(null);
                generarbt.setEnabled(false);
            } else {
                generarbt.setEnabled(true);
            }
            if (capt == evt.VK_BACK_SPACE && bloqtf.getText().isEmpty()) {
                generarbt.setEnabled(false);
            }
            if (capt == evt.VK_ENTER && bloqtf.getText().isEmpty()) {
                generarbt.setEnabled(false);
            }
            if (capt == evt.VK_ENTER && !bloqtf.getText().isEmpty()) {
                generarbt.doClick();
            }
        }
        /*isEmpty() sirve para saber si el jtextfield esta vacio*/
    }//GEN-LAST:event_bloqtfKeyTyped

    private void mapajtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapajtMouseClicked
        int fila = mapajt.rowAtPoint(evt.getPoint());
        int columna = mapajt.columnAtPoint(evt.getPoint());
        if (confirmar == true) {
            if (c == 0) {
                if (prueba[fila][columna].equals(".")) {
                    JOptionPane.showMessageDialog(null, "Casilla bloqueada, por favor defina de nuevo el puesto");
                } else {
                    prueba[fila][columna] = "O";
                    y = fila;
                    x = columna;
                    mapajt.setValueAt(prueba[fila][columna], fila, columna);
                    c++;
                    JOptionPane.showMessageDialog(null, "Defina puesto de Meta");
                }
            } else if (c == 1) {
                if (prueba[fila][columna].equals(".") || prueba[fila][columna].equals(prueba[y][x])) {
                    JOptionPane.showMessageDialog(null, "Casilla bloqueada, por favor defina de nuevo el puesto");
                } else {
                    prueba[fila][columna] = "X";
                    w = fila;
                    z = columna;
                    mapajt.setValueAt(prueba[fila][columna], fila, columna);
                    c++;
                    iniciarbt.setEnabled(true);
                }
            }
        }
        mapajt.updateUI();
    }//GEN-LAST:event_mapajtMouseClicked

    private void puestosbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puestosbtActionPerformed
        generarbt.setEnabled(false);
        confirmar = true;
        JOptionPane.showMessageDialog(null, "Toque el mapa para empezar a seleccionar los puestos");
        JOptionPane.showMessageDialog(null, "Defina puesto de Inicio");
        puestosbt.setEnabled(false);
    }//GEN-LAST:event_puestosbtActionPerformed

    public void agregarvector(int i, int j) {
        caminoX[contvec] = j;
        caminoY[contvec] = i;
        contvec++;
    }

    public void regresar(int i, int j) {
        prueba[i][j] = "z";
        contvec--;
    }

    public boolean camino1(int i, int indi) {
        if (indi == 1 && i < 12) {//sur
            return true;
        } else if (indi == 2 && i > -1) {//norte
            return true;
        } else if (indi == 3 && i < 12) {//este
            return true;
        } else if (indi == 4 && i > -1) {//oeste
            return true;
        } else {
            return false;
        }
    }

    public boolean resolv(int i, int j, int devol) {
        if (i == w && j == z) {
            System.out.println("Camino Encontrado en: Fila: " + i + " Columna: " + j);
            return true;
        } else {
            try {
                if (camino1(i - 1, 2) == true) {
                    if (prueba[i - 1][j].equals(" ") || prueba[i - 1][j].equals("X")) {
                        System.out.println("Norte en Fila: " + (i - 1) + " Columna: " + j);
                        prueba[i - 1][j] = "a";
                        agregarvector(i, j);
                        return resolv(i = i - 1, j, 0);
                    }
                }
                if (camino1(j + 1, 3) == true) {
                    if (prueba[i][j + 1].equals(" ") || prueba[i][j + 1].equals("X")) {
                        System.out.println("Este en Fila: " + i + " Columna: " + (j + 1));
                        prueba[i][j + 1] = "a";
                        agregarvector(i, j);
                        return resolv(i, j = j + 1, 0);
                    }
                }
                if (camino1(i + 1, 1) == true) {
                    if (prueba[i + 1][j].equals(" ") || prueba[i + 1][j].equals("X")) {
                        System.out.println("Sur en Fila: " + (i + 1) + " Columna: " + j);
                        prueba[i + 1][j] = "a";
                        agregarvector(i, j);
                        return resolv(i = i + 1, j, 0);
                    }
                }
                if (camino1(j - 1, 4) == true) {
                    if (prueba[i][j - 1].equals(" ") || prueba[i][j - 1].equals("X")) {
                        System.out.println("Oeste en Fila: " + i + " Columna: " + (j - 1));
                        prueba[i][j - 1] = "a";
                        agregarvector(i, j);
                        return resolv(i, j = j - 1, 0);
                    }
                }
                if (devol == 0) {
                    regresar(i, j);
                    System.out.println("Me devuelvo a Fila: " + caminoY[contvec] + " Columna: " + caminoX[contvec]);
                    return resolv(caminoY[contvec], caminoX[contvec], 0);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Camino no Econtrado");
                System.out.println("No encontro");
                switche = 1;
                return false;
            }
        }
        return true;
    }

    private void iniciarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarbtActionPerformed
        iniciarbt.setEnabled(false);
        mapajt.setVisible(true);
        System.out.println("Punto Inicial: Fila: " + y + " Columna: " + x + " || Punto Final: Fila: " + w + " Columna " + z);
        resolv(y, x, 0);
        prueba[y][x] = "O";
        if (switche == 0) {
            prueba[w][z] = "X";
            mapajt.updateUI();
            JOptionPane.showMessageDialog(null, "Camino Econtrado");
        }
    }//GEN-LAST:event_iniciarbtActionPerformed

    private void resetbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtActionPerformed
        contvec = 0;
        mapajt.setVisible(false);
        puestosbt.setEnabled(false);
        confirmar = false;
        iniciarbt.setEnabled(false);
        generarbt.setEnabled(false);
        bloqtf.setText(null);
        bloqtf.setEditable(true);
        sw = 0;
        switche = 0;
        c = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                mapajt.setValueAt(prueba[i][j] = " ", i, j);
            }
        }
    }//GEN-LAST:event_resetbtActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mapa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mapa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mapa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mapa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloqtf;
    private javax.swing.JLabel empezarlb;
    private javax.swing.JButton generarbt;
    private javax.swing.JLabel inciolb;
    private javax.swing.JButton iniciarbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mapajt;
    private javax.swing.JButton puestosbt;
    private javax.swing.JButton resetbt;
    private javax.swing.JLabel resetlb;
    private javax.swing.JLabel titulolb;
    // End of variables declaration//GEN-END:variables
}


import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alvar
 */
public class FramePrincipal_Explorador extends javax.swing.JFrame {

    DefaultTableModel modelo;//Creamos el modelo por defecto
    String dirpath;
    JFileChooser jfc;
    String nombre;
    long tamanio;
    String extension;
    String tipo;

    public FramePrincipal_Explorador() {
        initComponents();
        modelo = new DefaultTableModel(); //Inicializamos modelo al inicio de la app y lo aplicamos a la tabla que vamos a tratar.
        tablaVisu.setModel(modelo);
        modelo.addColumn("Nombre");
        modelo.addColumn("Extension");
        modelo.addColumn("Tamaño");
        modelo.addColumn("Tipo");

        // Con este método controlamos cuando pinchamos en la tabla.
        tablaVisu.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                // -1 es lo que devuelve getSelectedRow para saber si ha sido seleccionada alguna celda
                if (tablaVisu.getSelectedRow() != -1) {

                    // Para coger un dato de la tabla, congetValueAt y pasandole la la fila y la columna seleccionada 
                    JOptionPane.showMessageDialog(null, tablaVisu.getColumnName(tablaVisu.getSelectedColumn()) + ": " + tablaVisu.getValueAt(tablaVisu.getSelectedRow(), tablaVisu.getSelectedColumn()));
                }
            }
        });
        if (txtRuta.getText().length() == 0) {
            txtExtension.setEnabled(false);
            bExtension.setEnabled(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRuta = new javax.swing.JTextField();
        txtExtension = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVisu = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        bExtension = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtRuta.setEditable(false);

        txtExtension.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExtensionKeyTyped(evt);
            }
        });

        tablaVisu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaVisu);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bExtension.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        bExtension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExtensionActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione una ruta");

        jLabel2.setText("Indique la extensión a filtrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtExtension, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                            .addComponent(txtRuta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bExtension, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jButton1))
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bExtension)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(jLabel2)))
                    .addComponent(txtExtension, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //limpiamos filas para que no se amontonen en cada busqueda
        modelo.setRowCount(0);
        jfc = new JFileChooser(".");
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int select = jfc.showOpenDialog(jfc);
        if (select == JFileChooser.APPROVE_OPTION) {
            dirpath = jfc.getSelectedFile().getAbsolutePath();
            txtRuta.setText(dirpath);
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado una ruta valida");
        }
        //Creamos un objeto File pasandole la ruta que obtenemos
        try {
            File f = new File(dirpath);
            if (f.exists()) { //si existe, comprobamos cada objeto file extrayendole el tamaño, nombre extension y tipo
                for (File file : f.listFiles()) {
                    nombre = file.getName();
                    tamanio = file.length();
                    //usamos substring en el nombre para sacar la extencion
                    try {
                        extension = nombre.substring(nombre.lastIndexOf("."));
                    } catch (Exception e) {
                    }
                    if (file.isDirectory()) {
                        tipo = "Directorio";
                        extension = "";
                    } else {
                        tipo = "Archivo";
                    }
                    modelo.addRow(new Object[]{nombre, extension, tamanio, tipo});
                    txtExtension.setEnabled(true);
                    bExtension.setEnabled(true);
                }
            }

        } catch (NullPointerException npe) {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bExtensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExtensionActionPerformed
        modelo.setRowCount(0);//reseteamos tabla
        dirpath = txtRuta.getText();
        File f = new File(dirpath);
        if (f.exists()) {
            for (File file : f.listFiles()) {
                nombre = file.getName();
                tamanio = file.length();
                extension = nombre.substring(nombre.lastIndexOf(".")+1);//Con esto evitamos tener que poner "." al teclear la extension
                if (file.isFile()) {
                     tipo = "Archivo";
                }               
                if (extension.endsWith(txtExtension.getText())) {
                    modelo.addRow(new Object[]{nombre, extension, tamanio, tipo});
                }
            }

        }

    }//GEN-LAST:event_bExtensionActionPerformed

    private void txtExtensionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExtensionKeyTyped
  char validar = evt.getKeyChar();
  
        if(Character.isDigit(validar) || validar == '.' || validar == ','){
            getToolkit().beep();
            evt.consume();
        }        
    }//GEN-LAST:event_txtExtensionKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(FramePrincipal_Explorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal_Explorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal_Explorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal_Explorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal_Explorador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bExtension;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVisu;
    private javax.swing.JTextField txtExtension;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}

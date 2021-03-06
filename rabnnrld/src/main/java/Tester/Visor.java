/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;
import TwoDimensionalLists.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author alumno
 */
public class Visor extends javax.swing.JFrame {

    /**
     * Creates new form Visor
     */
    private TwoDimensionalLists tabla;
    private String instruccion,texto, matriz; //= "¡HOLA MUNDO!";// ="DERECHA:4-250_ARRIBA:4-150_ABAJO:4-105_IZQUIERDA:4-125/VIEW", 
    
    private int columnas, filas;
    private char encendido, apagado;
    
    public Visor() {
        initComponents();
        //instruccion = "10;50;⬛;⬜;789;RIGHT:4-500_UP:4-1000_DOWN:4-250_LEFT:4-125/VIEW";
    }
    
    public Visor(String instruccion) {
        initComponents();
        this.instruccion = instruccion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton_Reproducir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton_AbrirArchivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        jTextPane1.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 680, 280);

        jButton_Reproducir.setText("REPRODUCIR");
        jButton_Reproducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReproducirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Reproducir);
        jButton_Reproducir.setBounds(10, 40, 680, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(128, 10, 560, 25);

        jButton_AbrirArchivo.setBackground(new java.awt.Color(204, 204, 204));
        jButton_AbrirArchivo.setText("Abrir Archivo");
        jButton_AbrirArchivo.setBorderPainted(false);
        jButton_AbrirArchivo.setContentAreaFilled(false);
        jButton_AbrirArchivo.setOpaque(true);
        jButton_AbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AbrirArchivoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_AbrirArchivo);
        jButton_AbrirArchivo.setBounds(10, 10, 110, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton_ReproducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReproducirActionPerformed
        //jTextPane1.setText(tabla.getMatrix());
        /*jTextPane1.setText(
                "" + matriz
                + "" + instruccion
        );*/
        tabla = new TwoDimensionalLists(filas,columnas, encendido, apagado);
        tabla.setMatrix(matriz);
        jTextPane1.setText(tabla.getText());
        
    }//GEN-LAST:event_jButton_ReproducirActionPerformed

    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    private String AbrirArchivo(File archivo){
        String documento = "";
        try{
            entrada = new FileInputStream(archivo);
            int ascci;
            while((ascci=entrada.read())!=-1){
                char caracter = (char)ascci;
                documento+=caracter;
            }
        }catch(Exception e){
            
        }
        return documento;
    }
    
    private void jButton_AbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AbrirArchivoActionPerformed
        if(seleccionar.showDialog(null, "Abrir")== JFileChooser.APPROVE_OPTION){
            archivo = seleccionar.getSelectedFile();
            if(archivo.getName().endsWith("bl")){
                jLabel1.setText(archivo.toString());
                String leerDatos = AbrirArchivo(archivo);
                String[] parameters = leerDatos.split("<-->");
                filas = Integer.parseInt(parameters[0]);
                columnas = Integer.parseInt(parameters[1]);
                encendido = parameters[2].charAt(0);
                apagado = parameters[3].charAt(0);
                texto = parameters[4];
                matriz = parameters[5];
                instruccion = parameters[6];
                /*tabla = new TwoDimensionalLists(filas,columnas, encendido, apagado);
                tabla.setText(texto);
                jTextPane1.setText(tabla.getText());*/
            }else{
                JOptionPane.showMessageDialog(null, "Archivo no compatible.");
            }
        }
    }//GEN-LAST:event_jButton_AbrirArchivoActionPerformed

  
    
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
            java.util.logging.Logger.getLogger(Visor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AbrirArchivo;
    private javax.swing.JButton jButton_Reproducir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}

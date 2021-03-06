/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import LedAnimations.BannerLed;
//import BannerLedCore.BannerLeds;
import TwoDimensionalLists.*;
import FileMananger.FileMananger;

import java.io.*;
import javax.swing.*;
import FileMananger.*;
import static FileMananger.FileMananger.AbrirArchivo;
import Listas.Aleatoria;
import java.awt.*;
import java.awt.event.ItemEvent;
import javax.swing.border.Border;
import java.awt.datatransfer.*;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author OmarR
 */
public class BannerLedPlayer extends javax.swing.JFrame {

    /**
     * Creates new form BannerLedPlayer
     */
    public BannerLedPlayer() {
        initComponents();
    }
    
    private ITwoDimensionalLists tabla;
    private BannerLed graficador;
    private Action buttonAction;
    
    private int columnas, filas;
    private char encendido, apagado;
    private String instruccion, modo, texto, matriz;
    private String leerArchivo;
    public boolean archivoAbierto = false;

    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    
    private String key = "";
    
    private int tamañoFuente = 16, styleFont = 0;
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton_Info = new javax.swing.JButton();
        jButton_Editar = new javax.swing.JButton();
        jButton_AbrirArchivo = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jSpinner_TamañoFuente = new javax.swing.JSpinner();
        jSlider_TamañoFuente = new javax.swing.JSlider();
        jPanel14 = new javax.swing.JPanel();
        jLabel_NombreArchivo = new javax.swing.JLabel();
        jToggleButton_Reproducir = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane_Pantalla = new javax.swing.JTextPane();
        jPanel11 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BannerLed Player");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(700, 400));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setOpaque(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton_Info.setBackground(new java.awt.Color(245, 245, 245));
        jButton_Info.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info.png"))); // NOI18N
        jButton_Info.setToolTipText("");
        jButton_Info.setBorder(null);
        jButton_Info.setBorderPainted(false);
        jButton_Info.setContentAreaFilled(false);
        jButton_Info.setDoubleBuffered(true);
        jButton_Info.setFocusable(false);
        jButton_Info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Info.setOpaque(true);
        jButton_Info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_InfoMouseEntered(evt);
            }
            private void jButton_InfoMouseEntered(java.awt.event.MouseEvent evt) {
                jButton_Info.setBackground(new java.awt.Color(200, 200, 200));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_InfoMouseExited(evt);
            }
            private void jButton_InfoMouseExited(java.awt.event.MouseEvent evt) {
                jButton_Info.setBackground(new java.awt.Color(245, 245, 245));
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_InfoMousePressed(evt);
            }
            private void jButton_InfoMousePressed(java.awt.event.MouseEvent evt) {
                jButton_Info.setBackground(new java.awt.Color(180, 180, 180));
            }
        });

        buttonAction = new AbstractAction("", jButton_Info.getIcon()) {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButton_InfoActionPerformed(evt);
            }
            private void jButton_InfoActionPerformed(java.awt.event.ActionEvent evt) {

            }
        };
        jButton_Info.setAction(buttonAction);
        jButton_Info.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK), key);
        jButton_Info.getActionMap().put(key, buttonAction);
        jButton_Info.setToolTipText("Detalles del Archivo");

        jButton_Editar.setBackground(new java.awt.Color(245, 245, 245));
        jButton_Editar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editar.png"))); // NOI18N
        jButton_Editar.setToolTipText("");
        jButton_Editar.setBorder(null);
        jButton_Editar.setBorderPainted(false);
        jButton_Editar.setContentAreaFilled(false);
        jButton_Editar.setDoubleBuffered(true);
        jButton_Editar.setFocusable(false);
        jButton_Editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Editar.setOpaque(true);
        jButton_Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_EditarMouseEntered(evt);
            }
            private void jButton_EditarMouseEntered(java.awt.event.MouseEvent evt) {
                jButton_Editar.setBackground(new java.awt.Color(200, 200, 200));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_EditarMouseExited(evt);
            }
            private void jButton_EditarMouseExited(java.awt.event.MouseEvent evt) {
                jButton_Editar.setBackground(new java.awt.Color(245, 245, 245));
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_EditarMousePressed(evt);
            }
            private void jButton_EditarMousePressed(java.awt.event.MouseEvent evt) {
                jButton_Editar.setBackground(new java.awt.Color(180, 180, 180));
            }
        });

        buttonAction = new AbstractAction("", jButton_Editar.getIcon()) {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButton_EditarActionPerformed(evt);
            }
            private void jButton_EditarActionPerformed(java.awt.event.ActionEvent evt) {
                AbrirEditor();
            }
        };
        jButton_Editar.setAction(buttonAction);
        jButton_Editar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK), key);
        jButton_Editar.getActionMap().put(key, buttonAction);
        jButton_Editar.setToolTipText("Editar Archivo");

        jButton_AbrirArchivo.setBackground(new java.awt.Color(245, 245, 245));
        jButton_AbrirArchivo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton_AbrirArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abrirArchivo.png"))); // NOI18N
        jButton_AbrirArchivo.setToolTipText("");
        jButton_AbrirArchivo.setBorder(null);
        jButton_AbrirArchivo.setBorderPainted(false);
        jButton_AbrirArchivo.setContentAreaFilled(false);
        jButton_AbrirArchivo.setDoubleBuffered(true);
        jButton_AbrirArchivo.setFocusable(false);
        jButton_AbrirArchivo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_AbrirArchivo.setOpaque(true);

        jSpinner_TamañoFuente.setModel(new javax.swing.SpinnerNumberModel(16, 0, 100, 5));
        jSpinner_TamañoFuente.setValue(16);
        jSpinner_TamañoFuente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner_TamañoFuenteStateChanged(evt);
            }
        });

        jSlider_TamañoFuente.setValue(16);
        jSlider_TamañoFuente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_TamañoFuenteStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jSlider_TamañoFuente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSpinner_TamañoFuente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider_TamañoFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner_TamañoFuente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jLabel_NombreArchivo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel_NombreArchivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_NombreArchivo.setText("Archivo no cargado");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_NombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel_NombreArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        jToggleButton_Reproducir.setBackground(new java.awt.Color(245, 245, 245));
        jToggleButton_Reproducir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/play.png"))); // NOI18N
        jToggleButton_Reproducir.setBorder(null);
        jToggleButton_Reproducir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton_Reproducir.setOpaque(true);
        jToggleButton_Reproducir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jToggleButton_ReproducirMouseEntered(evt);
            }
            private void jToggleButton_ReproducirMouseEntered(java.awt.event.MouseEvent evt) {
                jToggleButton_Reproducir.setBackground(new java.awt.Color(200, 200, 200));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jToggleButton_ReproducirMouseExited(evt);
            }
            private void jToggleButton_ReproducirMouseExited(java.awt.event.MouseEvent evt) {
                jToggleButton_Reproducir.setBackground(new java.awt.Color(245, 245, 245));
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton_ReproducirMousePressed(evt);
            }
            private void jToggleButton_ReproducirMousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton_Reproducir.setBackground(new java.awt.Color(180, 180, 180));
            }
        });

        buttonAction = new AbstractAction("", jToggleButton_Reproducir.getIcon()) {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jToggleButton_ReproducirActionPerformed(evt);
            }
            private void jToggleButton_ReproducirActionPerformed(java.awt.event.ActionEvent evt) {
                ReproducirArchivoBL();
            }
        };
        jToggleButton_Reproducir.setAction(buttonAction);
        jToggleButton_Reproducir.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK), key);
        jToggleButton_Reproducir.getActionMap().put(key, buttonAction);
        jToggleButton_Reproducir.setToolTipText("Abrir(Ctrl+Q)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_AbrirArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jButton_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jButton_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jToggleButton_Reproducir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_AbrirArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Editar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton_Reproducir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Info, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );

        jButton_AbrirArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_AbrirArchivoMouseEntered(evt);
            }
            private void jButton_AbrirArchivoMouseEntered(java.awt.event.MouseEvent evt) {
                jButton_AbrirArchivo.setBackground(new java.awt.Color(200, 200, 200));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_AbrirArchivoMouseExited(evt);
            }
            private void jButton_AbrirArchivoMouseExited(java.awt.event.MouseEvent evt) {
                jButton_AbrirArchivo.setBackground(new java.awt.Color(245, 245, 245));
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_AbrirArchivoMousePressed(evt);
            }
            private void jButton_AbrirArchivoMousePressed(java.awt.event.MouseEvent evt) {
                jButton_AbrirArchivo.setBackground(new java.awt.Color(180, 180, 180));
            }
        });

        buttonAction = new AbstractAction("", jButton_AbrirArchivo.getIcon()) {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButton_AbrirArchivoActionPerformed(evt);
            }
            private void jButton_AbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {
                AbrirArchivoBL();
            }
        };
        jButton_AbrirArchivo.setAction(buttonAction);
        jButton_AbrirArchivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK), key);
        jButton_AbrirArchivo.getActionMap().put(key, buttonAction);
        jButton_AbrirArchivo.setToolTipText("Abrir Archivo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jTextPane_Pantalla.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextPane_Pantalla.setDoubleBuffered(true);
        jTextPane_Pantalla.setFocusable(false);
        jScrollPane2.setViewportView(jTextPane_Pantalla);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2)
                .addGap(5, 5, 5))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(334, 334, 334)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(435, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(193, 193, 193)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(294, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider_TamañoFuenteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider_TamañoFuenteStateChanged
        tamañoFuente = jSlider_TamañoFuente.getValue();
        jSpinner_TamañoFuente.setValue(tamañoFuente);
        jTextPane_Pantalla.setFont(new java.awt.Font("Monospaced", styleFont, tamañoFuente));
    }//GEN-LAST:event_jSlider_TamañoFuenteStateChanged

    private void jSpinner_TamañoFuenteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner_TamañoFuenteStateChanged
        tamañoFuente = Integer.parseInt(jSpinner_TamañoFuente.getValue().toString());
        jSlider_TamañoFuente.setValue(tamañoFuente);
        jTextPane_Pantalla.setFont(new java.awt.Font("Monospaced", styleFont, tamañoFuente));
    }//GEN-LAST:event_jSpinner_TamañoFuenteStateChanged

  //--------------------------------------------------------------------------------------------------------------------  
    private void AbrirArchivoBL(){
        if("".equals(instruccion)){}
        else{
            try{
                graficador.stopFile();
            }catch(Exception e){}
        }
        seleccionar.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivo BannerLed" , "bl", "bnrld", "mbl", "mbnrld", "gbl", "pryctbl"));
        if(seleccionar.showDialog(null, "Abrir")== JFileChooser.APPROVE_OPTION){
            archivo = seleccionar.getSelectedFile();
            if(archivo.getName().endsWith("bl")){
                //jButton_Reproducir.setEnabled(true);
                //jButton_Reproducir.setVisible(true);
                this.setTitle("BannerLed Player - " + archivo.getName());
                jLabel_NombreArchivo.setText(archivo.getName());
                //url.setText(archivo.toString());
                leerArchivo = AbrirArchivo(archivo);

                String[] parameters = leerArchivo.split("<-->");
                filas = Integer.parseInt(parameters[0]);
                columnas = Integer.parseInt(parameters[1]);
                encendido = parameters[2].charAt(0);
                apagado = parameters[3].charAt(0);
                String elementoGrafico = parameters[4];
                texto = elementoGrafico;
                if(elementoGrafico.contains("figures:")){
                    elementoGrafico = "Figura graficada: \"";
                    elementoGrafico += texto.replaceAll("figures:", "") + "\"";
                }else if(elementoGrafico.contains("text:")){
                    elementoGrafico = "Texto graficado: \"";
                    elementoGrafico += texto.replaceAll("text:", "") + "\"";
                }
                matriz = parameters[5];
                instruccion =  parameters[6];
                modo = parameters[6].split("/")[1];
                //info.setText("   Nombre del archivo: " + archivo.getName() +".   Dimensiones: " + columnas + "x" + filas + ".   Filas: " + filas + ".   Columnas: " + columnas + ".   Led encendido: \"" + encendido + "\".   Led apagado: \"" + apagado + "\".   "+ elementoGrafico + ".    Modo de reproducción: "+modo + ".");
                tabla = new TwoDimensionalLists(filas,columnas, encendido, apagado);
                tabla.setMatrix(matriz);
                jTextPane_Pantalla.setText(tabla.getText());
                archivoAbierto = true;
            }else{
                JOptionPane.showMessageDialog(null, "Archivo no compatible.");
            }
                
        }
    }
        
    private void ReproducirArchivoBL(){
        if("".equals(instruccion)){JOptionPane.showMessageDialog(null, "Este archivo no cuenta con animaciones disponibles. Abra uno e intentelo otra vez.","ARCHIVO SIN ANIMACIONES", 0);}
        else{
            if(archivoAbierto){
                if(jToggleButton_Reproducir.isSelected()){
                    jToggleButton_Reproducir.setIcon(new ImageIcon(getClass().getResource("/pause.png")));
                    //
                    graficador = new BannerLed(filas, columnas, jTextPane_Pantalla, instruccion, encendido, apagado, texto);
                }else{
                    jToggleButton_Reproducir.setIcon(new ImageIcon(getClass().getResource("/play.png")));
                    graficador.stopFile();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Para iniciar la animación del archivo es necesario abrir el archivo deseado.","NO SE HA HABIERTO NINGÚN ARCHIVO", 1);
            }
            
        }
    }
    
    private void AbrirEditor(){
        try{
            leerArchivo = leerArchivo + "<>" + jLabel_NombreArchivo.getText();
            Editor editor = new Editor(leerArchivo);
            editor.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            editor.setVisible(true);
        }catch(Exception e){
            InicioEditor editor = new InicioEditor(true);
            editor.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            editor.setVisible(true);
        }
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BannerLedPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BannerLedPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BannerLedPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BannerLedPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BannerLedPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AbrirArchivo;
    private javax.swing.JButton jButton_Editar;
    private javax.swing.JButton jButton_Info;
    private javax.swing.JLabel jLabel_NombreArchivo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider_TamañoFuente;
    private javax.swing.JSpinner jSpinner_TamañoFuente;
    private javax.swing.JTextPane jTextPane_Pantalla;
    private javax.swing.JToggleButton jToggleButton_Reproducir;
    // End of variables declaration//GEN-END:variables
}

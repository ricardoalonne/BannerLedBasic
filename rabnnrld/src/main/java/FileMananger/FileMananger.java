/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileMananger;

import java.io.*;
import java.nio.charset.Charset;
import javax.swing.*;

/**
 *
 * @author OmarR
 */
public class FileMananger {
    static FileInputStream entrada;
    static FileOutputStream salida;
    public static String AbrirArchivo(File archivo){
        String documento = "";
        try{/*
            entrada = new FileInputStream(archivo);
            int ascci;
            while((ascci=entrada.read())!=-1){
                char caracter = (char)ascci;
                documento+=caracter;
            }*/
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), "utf-8"));
            String sCadena = "";
            while ((sCadena = in.readLine())!=null) {
                documento+= sCadena;
            } 
            
        }catch(Exception e){
            
        }
        return documento;
    }
    
    public static String GuardarArchivo(File archivo, String documento){
        String mensaje = null;
        try{
            salida = new FileOutputStream(archivo);
            byte[] bytext = documento.getBytes();
            salida.write(bytext);
            mensaje = "Archivo guardado";
        }catch(Exception e){}
        return mensaje;
    }
     public static String GuardarArchivo2(File archivo, String documento){
        String mensaje = null;
        try{
            /*
            FileWriter escribir = new FileWriter(archivo, false);
            escribir.write(documento);
            escribir.close();*/
            /*
            OutputStreamWriter outputStream = new OutputStreamWriter(
                    new FileOutputStream(archivo),
                    Charset.forName("UTF-8").newEncoder() 
            );*/
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo), "utf-8"));
            out.write(documento);
            out.close();
            mensaje = "Archivo guardado";
        }catch(Exception e){}
        return mensaje;
    }
}

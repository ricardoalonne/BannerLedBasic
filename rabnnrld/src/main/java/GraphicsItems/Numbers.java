/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphicsItems;
import Listas.*;
/**
 *
 * @author OmarR
 */
public class Numbers{

    /*
    private final String Zero = "⬜⬜⬜⬜⬜⬜-⬜⬛⬛⬛⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬛⬜⬛⬛⬜-⬜⬛⬛⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬛⬛⬛⬛⬜-⬜⬜⬜⬜⬜⬜";
    private final String One =  "⬜⬜⬜⬜⬜⬜-⬜⬜⬜⬛⬛⬜-⬜⬜⬛⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬜⬜⬜⬜";
    private final String Two =  "⬜⬜⬜⬜⬜⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬜⬜-⬜⬛⬛⬛⬛⬜-⬜⬜⬜⬜⬜⬜";
    private final String Three ="⬜⬜⬜⬜⬜⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬜⬛⬜⬜-⬜⬜⬜⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬜⬜⬜⬜⬜";
    private final String Four = "⬜⬜⬜⬜⬜⬜-⬜⬜⬜⬛⬛⬜-⬜⬜⬛⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬛⬛⬛⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬜⬜⬜⬜";
    private final String Five = "⬜⬜⬜⬜⬜⬜-⬜⬛⬛⬛⬛⬜-⬜⬛⬜⬜⬜⬜-⬜⬛⬛⬛⬜⬜-⬜⬜⬜⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬜⬜⬜⬜⬜";
    private final String Six =  "⬜⬜⬜⬜⬜⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬛⬜⬜⬜⬜-⬜⬛⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬜⬜⬜⬜⬜";
    private final String Seven ="⬜⬜⬜⬜⬜⬜-⬜⬛⬛⬛⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬜⬛⬜⬜-⬜⬜⬛⬜⬜⬜-⬜⬛⬜⬜⬜⬜-⬜⬛⬜⬜⬜⬜-⬜⬜⬜⬜⬜⬜";
    private final String Eight ="⬜⬜⬜⬜⬜⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬜⬜⬜⬜⬜";
    private final String Nine = "⬜⬜⬜⬜⬜⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬜⬜⬜⬜⬜";
    */
    
    public static Aleatoria[] DrawNumber(char character, Aleatoria[] lista, int rows, int columns){
        String codigo = "";
        switch(character){
            case '0': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬛⬛⬛⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬛⬜⬛⬛⬜-⬜⬛⬛⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬛⬛⬛⬛⬜-⬜⬜⬜⬜⬜⬜"; break; 
            case '1': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬜⬜⬛⬛⬜-⬜⬜⬛⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬜⬜⬜⬜"; break; 
            case '2': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬜⬜-⬜⬛⬛⬛⬛⬜-⬜⬜⬜⬜⬜⬜"; break; 
            case '3': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬜⬛⬜⬜-⬜⬜⬜⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬜⬜⬜⬜⬜"; break; 
            case '4': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬜⬜⬛⬛⬜-⬜⬜⬛⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬛⬛⬛⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬜⬜⬜⬜"; break; 
            case '5': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬛⬛⬛⬛⬜-⬜⬛⬜⬜⬜⬜-⬜⬛⬛⬛⬜⬜-⬜⬜⬜⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬜⬜⬜⬜⬜"; break; 
            case '6': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬛⬜⬜⬜⬜-⬜⬛⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬜⬜⬜⬜⬜"; break; 
            case '7': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬛⬛⬛⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬜⬛⬜⬜-⬜⬜⬛⬜⬜⬜-⬜⬛⬜⬜⬜⬜-⬜⬛⬜⬜⬜⬜-⬜⬜⬜⬜⬜⬜"; break; 
            case '8': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬜⬜⬜⬜⬜"; break; 
            case '9': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬜⬜⬜⬜⬜"; break;
            
        }
        String[] filas = codigo.split("-");
        rows = filas.length;
        for(int i = 0; i< rows; i++){
            if(columns == 0){ lista[i] = new Aleatoria(); }
            int k = 0;
            for(int j = columns; j< columns +filas[i].length(); j++){
                lista[i].add(j, filas[i].charAt(k));
                k++;
            }
        }
        return lista;
    }
    
    
    public static Aleatoria DrawNumber(Aleatoria lista, boolean reemplace, char character, int columns){
        String codigo = "";
        switch(character){
            //case '0': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬛⬛⬛⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬛⬜⬛⬛⬜-⬜⬛⬛⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬛⬛⬛⬛⬜-⬜⬜⬜⬜⬜⬜"; break; 
            
//            case '0': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬛⬛⬛⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬛⬜⬛⬛⬜-⬜⬛⬛⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬛⬛⬛⬛⬜-⬜⬜⬜⬜⬜⬜"; break;  
//            case '1': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬜⬜⬛⬛⬜-⬜⬜⬛⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬜⬜⬜⬜"; break; 
//            case '2': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬜⬜-⬜⬛⬛⬛⬛⬜-⬜⬜⬜⬜⬜⬜"; break; 
//            case '3': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬜⬛⬜⬜-⬜⬜⬜⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬜⬜⬜⬜⬜"; break; 
//            case '4': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬜⬜⬛⬛⬜-⬜⬜⬛⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬛⬛⬛⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬜⬜⬜⬜"; break; 
//            case '5': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬛⬛⬛⬛⬜-⬜⬛⬜⬜⬜⬜-⬜⬛⬛⬛⬜⬜-⬜⬜⬜⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬜⬜⬜⬜⬜"; break; 
//            case '6': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬛⬜⬜⬜⬜-⬜⬛⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬜⬜⬜⬜⬜"; break; 
//            case '7': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬛⬛⬛⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬜⬜⬛⬜⬜-⬜⬜⬛⬜⬜⬜-⬜⬛⬜⬜⬜⬜-⬜⬛⬜⬜⬜⬜-⬜⬜⬜⬜⬜⬜"; break; 
//            case '8': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬜⬜⬜⬜⬜"; break; 
//            case '9': codigo = "⬜⬜⬜⬜⬜⬜-⬜⬜⬛⬛⬜⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬛⬜-⬜⬜⬜⬜⬛⬜-⬜⬛⬜⬜⬛⬜-⬜⬜⬛⬛⬜⬜-⬜⬜⬜⬜⬜⬜"; break; 
            
            case '0': codigo = "000000-011110-010010-010110-011010-010010-011110-000000"; break;  
            case '1': codigo = "000000-000110-001010-010010-000010-000010-000010-000000"; break; 
            case '2': codigo = "000000-001100-010010-000010-001100-010000-011110-000000"; break; 
            case '3': codigo = "000000-001100-010010-000100-000010-010010-001100-000000"; break; 
            case '4': codigo = "000000-000110-001010-010010-011110-000010-000010-000000"; break; 
            case '5': codigo = "000000-011110-010000-011100-000010-010010-001100-000000"; break; 
            case '6': codigo = "000000-001100-010010-010000-011100-010010-001100-000000"; break; 
            case '7': codigo = "000000-011110-000010-000100-001000-010000-010000-000000"; break; 
            case '8': codigo = "000000-001100-010010-001100-010010-010010-001100-000000"; break; 
            case '9': codigo = "000000-001100-010010-001110-000010-010010-001100-000000"; break; 
            
        }
        String[] rows = codigo.split("-");
        
        if(reemplace == false){
            for(int i = 0; i < rows.length; i++){
                Lista row; int k = 0;
                if(columns == 0){ row = new Aleatoria();}
                else{ row = (Aleatoria)lista.get(i); }
                for(int j = columns; j<columns + rows[i].length(); j++){
                    row.add(j, rows[i].charAt(k)); k++;
                }
                if(columns == 0){lista.add(i, row);}
            }
        }
        else{
            for(int i = 0; i < rows.length; i++){
                Lista row = (Aleatoria)lista.get(i); int k = 0;
                for(int j = columns; j<columns + rows[i].length(); j++){
                    row.reemplace(j, rows[i].charAt(k)); k++;
                }
            }
        }
        return lista;
    }
    
    public static String DrawNumber(char character){
        String codigo = "";
        switch(character){
            case '0': codigo = "000000-011110-010010-010110-011010-010010-011110-000000"; break;  
            case '1': codigo = "000000-000110-001010-010010-000010-000010-000010-000000"; break; 
            case '2': codigo = "000000-001100-010010-000010-001100-010000-011110-000000"; break; 
            case '3': codigo = "000000-001100-010010-000100-000010-010010-001100-000000"; break; 
            case '4': codigo = "000000-000110-001010-010010-011110-000010-000010-000000"; break; 
            case '5': codigo = "000000-011110-010000-011100-000010-010010-001100-000000"; break; 
            case '6': codigo = "000000-001100-010010-010000-011100-010010-001100-000000"; break; 
            case '7': codigo = "000000-011110-000010-000100-001000-010000-010000-000000"; break; 
            case '8': codigo = "000000-001100-010010-001100-010010-010010-001100-000000"; break; 
            case '9': codigo = "000000-001100-010010-001110-000010-010010-001100-000000"; break; 
            
        }
        return codigo;
    }
    
  
    
}

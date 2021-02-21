/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphicsItems;
import Listas.Aleatoria;
import Listas.Lista;
/**
 *
 * @author OmarR
 */
public class Symbols{

    public static String DrawSymbol(char character){
        String codigo = "";
        switch(character){
            case ' ': codigo  = 
                         "000-"
                      +  "000-"
                      +  "000-"
                      +  "000-"
                      +  "000-"
                      +  "000-"
                      +  "000-"
                      +  "000"; 
            break; 
            case '.': codigo  = 
                        "0000-"
                      + "0000-"
                      + "0000-"
                      + "0000-"
                      + "0000-"
                      + "0110-"
                      + "0110-"
                      + "0000"; 
            break;
            case ',': codigo  = 
                        "0000-"
                      + "0000-"
                      + "0000-"
                      + "0000-"
                      + "0110-"
                      + "0110-"
                      + "0100-"
                      + "0000"; 
            break;
            case ';': codigo  = 
                        "0000-"
                      + "0000-"
                      + "0110-"
                      + "0110-"
                      + "0000-"
                      + "0110-"
                      + "0100-"
                      + "0000"; 
            break;
            case ':': codigo  = 
                        "0000-"
                      + "0000-"
                      + "0110-"
                      + "0110-"
                      + "0000-"
                      + "0110-"
                      + "0110-"
                      + "0000"; 
            break;
            case '"': codigo  = 
                        "00000-"
                      + "01010-"
                      + "01010-"
                      + "01010-"
                      + "00000-"
                      + "00000-"
                      + "00000-"
                      + "00000"; 
            break;
            case '!': codigo  = 
                        "0000-"
                      + "0110-"
                      + "0110-"
                      + "0110-"
                      + "0110-"
                      + "0000-"
                      + "0110-"
                      + "0000"; 
            break;
            case '¡': codigo  = 
                        "0000-"
                      + "0110-"
                      + "0000-"
                      + "0110-"
                      + "0110-"
                      + "0110-"
                      + "0110-"
                      + "0000"; 
            break;
        }
        return codigo;
    }
    
     
    
}
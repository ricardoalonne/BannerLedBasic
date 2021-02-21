/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

//import BannerLed.ConsoleBannerLed;
import java.util.Scanner;

/**
 *
 * @author OmarR
 */
public class VisorConsole {
    public static void main(String[] args) {
       System.out.print("Hay un archivo cargado. ¿Desea reproducirlo?: ");
       Scanner sc = new Scanner(System.in);
       String respuesta = sc.nextLine();
       if(respuesta.toLowerCase().contains("si")|| respuesta.toLowerCase().contains("yes")){
           String intruccion = "10;50;⬛;⬜;777;RIGHT:4-500_UP:4-1000_DOWN:4-250_LEFT:4-125/BUCLE";
           //ConsoleBannerLed bl = new ConsoleBannerLed(intruccion);
           //bl.RunFile();
           /*String intruccion = "RIGHT:4-500_UP:3-1000_DOWN:10-250_LEFT:15-125/VIEW";
           ConsoleBannerLed bl = new ConsoleBannerLed(10, 50, intruccion, '⬛', '⬜', "54545");*/
           /*String intruccion = "RIGHT:4-500_UP:3-1000_DOWN:10-250_LEFT:15-125/VIEW";
           ConsoleBannerLed bl = new  ConsoleBannerLed(intruccion, '⬛', '⬜', "54545");*/
           /*ConsoleBannerLed cbl = new ConsoleBannerLed();
           cbl.RunFile();*/
       }else{System.out.print("Hasta luego!"); return; }
       
    }
}

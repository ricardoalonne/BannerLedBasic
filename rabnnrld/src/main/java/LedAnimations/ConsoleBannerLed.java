/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LedAnimations;

import TwoDimensionalLists.TwoDimensionalLists;
import LedAnimations.SwingGraphicsLedScreen;
/**
 *
 * @author OmarR
 */
public class ConsoleBannerLed {
    
    private String instruction = "RIGHT:4-500_UP:4-1000_DOWN:4-250_LEFT:4-125/BUCLE", text = "0123456789";
    private int rows = 8, columns = 70;
    private char active = 'O', inactive = ' ';
    TwoDimensionalLists twdlist;
    ConsoleGraphicsLedScreen cgls;
    
    public ConsoleBannerLed(){
        twdlist = new TwoDimensionalLists(rows,columns,active,inactive);
        twdlist.setText(text);
        cgls = new ConsoleGraphicsLedScreen(twdlist);
    }
    
    public ConsoleBannerLed(String instruction){
        String[] parameters = instruction.split(";");
        rows = Integer.parseInt(parameters[0]);
        columns = Integer.parseInt(parameters[1]);
        active = parameters[2].charAt(0);
        inactive = parameters[3].charAt(0);
        text = parameters[4];
        this.instruction = parameters[5];
        twdlist = new TwoDimensionalLists(rows,columns,active,inactive);
        twdlist.setText(text);
        cgls = new ConsoleGraphicsLedScreen(twdlist);
    }
    /*
    public ConsoleBannerLed(String text){
        twdlist = new TwoDimensionalLists(rows,columns,active,inactive);
        twdlist.setText(text);
        cgls = new ConsoleGraphicsLedScreen(twdlist);
    }*/
    
    public ConsoleBannerLed(char active, char inactive, String text){
        twdlist = new TwoDimensionalLists(rows,columns,active,inactive);
        twdlist.setText(text);
        cgls = new ConsoleGraphicsLedScreen(twdlist);
    }
    
    public ConsoleBannerLed(char active, char inactive, String instruction, String text){
        this.instruction = instruction;
        twdlist = new TwoDimensionalLists(rows,columns,active,inactive);
        twdlist.setText(text);
        cgls = new ConsoleGraphicsLedScreen(twdlist);
    }
    
    public ConsoleBannerLed(int rows, int columns, char active, char inactive, String instruction, String text){
        this.instruction = instruction;
        twdlist = new TwoDimensionalLists(rows,columns,active,inactive);
        twdlist.setText(text);
        cgls = new ConsoleGraphicsLedScreen(twdlist);
    }
    
    //CONSTRUCTORES DIRECTOS//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public ConsoleBannerLed(String instruction, char active, char inactive, String text){
        twdlist = new TwoDimensionalLists(text,active,inactive);
        cgls = new ConsoleGraphicsLedScreen(twdlist);
        cgls.SequentialAnimation(instruction);
    }
    
    public ConsoleBannerLed(int rows, int columns, String instruction, char active, char inactive, String text){
        twdlist = new TwoDimensionalLists(rows,columns,active,inactive);
        twdlist.setText(text);
        cgls = new ConsoleGraphicsLedScreen(twdlist);
        cgls.SequentialAnimation(instruction);
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setText(String text){
        this.text = text;
    }
    
    public void setSize(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
    }
    
    public void setInstruction(String instruction){
        this.instruction = instruction;
    }
    
    public void setElements(char active, char inactive){
        this.active = active;
        this.inactive = inactive;
    }
    
    public void Update(){
        twdlist = new TwoDimensionalLists(rows,columns,active,inactive);
        cgls = new ConsoleGraphicsLedScreen(twdlist);
    }
    
    public void RunFile(){
        cgls.SequentialAnimation(instruction);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LedAnimations;
import LedAnimations.SwingGraphicsLedScreen;
import TwoDimensionalLists.TwoDimensionalLists;
import javax.swing.JTextPane;
/**
 *
 * @author OmarR
 */

//P1
public class BannerLed {
    
    private JTextPane jtp;
    private String instruction = "RIGHT:4-500_UP:4-1000_DOWN:4-250_LEFT:4-125/BUCLE", text = "0123456789";
    private int rows = 8, columns = 70;
    private char active = '#', inactive = '*';
    TwoDimensionalLists twdlist;
    SwingGraphicsLedScreen sgls;
    
    public BannerLed(JTextPane jtp){
        this.jtp = jtp;
        twdlist = new TwoDimensionalLists(rows,columns,active,inactive);
        twdlist.setText(text);
        sgls = new SwingGraphicsLedScreen(twdlist, this.jtp);
    }
    
    public BannerLed(String instruction, JTextPane jtp){
        this.jtp = jtp;
        String[] parameters = instruction.split(";");
        rows = Integer.parseInt(parameters[0]);
        columns = Integer.parseInt(parameters[1]);
        active = parameters[2].charAt(0);
        inactive = parameters[3].charAt(0);
        text = parameters[4];
        this.instruction = parameters[5];
        twdlist = new TwoDimensionalLists(rows,columns,active,inactive);
        twdlist.setText(text);
        sgls = new SwingGraphicsLedScreen(twdlist, this.jtp);
    }
    
    public BannerLed(JTextPane jtp, String text){
        this.jtp = jtp;
        twdlist = new TwoDimensionalLists(rows,columns,active,inactive);
        twdlist.setText(text);
        sgls = new SwingGraphicsLedScreen(twdlist, this.jtp);
    }
    
    public BannerLed(JTextPane jtp, char active, char inactive, String text){
        this.jtp = jtp;
        twdlist = new TwoDimensionalLists(rows,columns,active,inactive);
        twdlist.setText(text);
        sgls = new SwingGraphicsLedScreen(twdlist, this.jtp);
    }
    
    public BannerLed(JTextPane jtp, char active, char inactive, String instruction, String text){
        this.jtp = jtp; this.instruction = instruction;
        twdlist = new TwoDimensionalLists(rows,columns,active,inactive);
        twdlist.setText(text);
        sgls = new SwingGraphicsLedScreen(twdlist, this.jtp);
    }
    
    public BannerLed(JTextPane jtp,int rows, int columns, char active, char inactive, String instruction, String text){
        this.jtp = jtp; this.instruction = instruction;
        twdlist = new TwoDimensionalLists(rows,columns,active,inactive);
        twdlist.setText(text);
        sgls = new SwingGraphicsLedScreen(twdlist, this.jtp);
    }
    
    //CONSTRUCTORES DIRECTOS//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public BannerLed(JTextPane jtp, String instruction, char active, char inactive, String text){
        twdlist = new TwoDimensionalLists(text,active,inactive);
        sgls = new SwingGraphicsLedScreen(twdlist, jtp);
        sgls.SequentialAnimation(instruction);
    }
    
    public BannerLed(int rows, int columns, JTextPane jtp, String instruction, char active, char inactive, String text){
        twdlist = new TwoDimensionalLists(rows,columns,active,inactive);
        twdlist.setText(text);
        sgls = new SwingGraphicsLedScreen(twdlist, jtp);
        sgls.SequentialAnimation(instruction);
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
        sgls = new SwingGraphicsLedScreen(twdlist, this.jtp);
    }
    
    public void RunFile(){
        sgls.SequentialAnimation(instruction);
    }
    
    public void stopFile(){
        sgls.StopAnimation();
    }
    
}

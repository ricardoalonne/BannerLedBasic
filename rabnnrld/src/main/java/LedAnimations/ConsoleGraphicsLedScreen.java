/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LedAnimations;

import TwoDimensionalLists.TwoDimensionalLists;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author OmarR
 */
public class ConsoleGraphicsLedScreen {
    TwoDimensionalLists twdl;
    public ConsoleGraphicsLedScreen(TwoDimensionalLists twdl){
        this.twdl = twdl;
    }
    
    public void GraphLedDisplay(String text){
        twdl.setText(text);
        System.out.println(twdl.getText());
    }
    
    public void MoveOneStepRight(){
        twdl.MoveRight();
        System.out.println(twdl.getText());
    }
    
    public void MoveOneStepLeft(){
        twdl.MoveLeft();
        System.out.println(twdl.getText());
    }
    
    public void MoveOneStepUp(){
        twdl.MoveUp();
        System.out.println(twdl.getText());
    }
    
    public void MoveOneStepDown(){
        twdl.MoveDown();
        System.out.println(twdl.getText());
    }
    
    
    public void Animation(String direction, int steps, int delay){
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            String d = direction; int i = 0;

            @Override
            public boolean cancel() {
                 //return super.cancel();
                return i == steps;
            }
            
            @Override
            public void run() {
                if(i < steps){
                    switch (direction) {
                        case "UP": twdl.MoveUp();break;
                        case "DOWN": twdl.MoveDown();break;
                        case "LEFT": twdl.MoveLeft();break;
                        case "RIGHT": twdl.MoveRight();break;
                        default: break;
                    }
                    System.out.println(twdl.getText());
                    i++;
                }else{timer.cancel();}
            }
        };
        timer.scheduleAtFixedRate(task, 0, delay);
    }
    
     public void SequentialAnimation(String sequence){
        String[] parametros = sequence.split("/");
        String[] instruction = parametros[0].split("_"); String mode = parametros[1];
        String[] direction = new String[instruction.length]; 
        int[] steps= new int[instruction.length], delay = new int[instruction.length];
        for(int i = 0; i < instruction.length; i++){
            String[] b = instruction[i].split(":");
            direction[i] = b[0];
            String[] c = b[1].split("-");
            steps[i] = Integer.parseInt(c[0]);
            delay[i] = Integer.parseInt(c[1]);
        }
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int x = 0;
            @Override
            public void run() {
                if(x < instruction.length){
                    for(int i = 0; i < instruction.length; i++){
                    int k = 0;
                    while(k < steps[i]){
                        switch (direction[i]) {
                            case "UP": twdl.MoveUp();break;
                            case "DOWN": twdl.MoveDown();break;
                            case "LEFT": twdl.MoveLeft();break;
                            case "RIGHT": twdl.MoveRight();break;
                        }
                        System.out.print(twdl.getText());
                        try {
                            Thread.sleep(delay[i]);
                        }catch(Exception e){}
                        //catch (InterruptedException ex) {
                       //     Logger.getLogger(SwingGraphicsLedScreen.class.getName()).log(Level.SEVERE, null, ex);
                        //}
                        System.out.print("");
                        k++;
                    }
                    if(mode.equals("BUCLE")){
                        x = 0;
                    }else{ x = i+1;}
                    }
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1);
    }
}

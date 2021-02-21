/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LedAnimations;

import java.util.*;
import TwoDimensionalLists.TwoDimensionalLists;
import javax.swing.JTextPane;

/**
 *
 * @author alumno
 */
public class SwingGraphicsLedScreen {
    TwoDimensionalLists twdl; JTextPane jtp;
    public SwingGraphicsLedScreen(TwoDimensionalLists twdl, JTextPane jtp){
        this.twdl = twdl;
        this.jtp = jtp;
    }
    
    public void GraphLedDisplay(String text){
        twdl.setText(text);
        jtp.setText(twdl.getText());
    }
    
    public void MoveOneStepRight(){
        twdl.MoveRight();
        jtp.setText(twdl.getText());
    }
    
    public void MoveOneStepLeft(){
        twdl.MoveLeft();
        jtp.setText(twdl.getText());
    }
    
    public void MoveOneStepUp(){
        twdl.MoveUp();
        jtp.setText(twdl.getText());
    }
    
    public void MoveOneStepDown(){
        twdl.MoveDown();
        jtp.setText(twdl.getText());
    }
    
      
    public void MoveOneStepUpRight(){
        twdl.MoveUp();
        twdl.MoveRight();
        jtp.setText(twdl.getText());
    }
    public void MoveOneStepUpLeft(){
        twdl.MoveUp();
        twdl.MoveLeft();
        jtp.setText(twdl.getText());
    }
    public void MoveOneStepDownRight(){
        twdl.MoveDown();
        twdl.MoveRight();
        jtp.setText(twdl.getText());
    }
    public void MoveOneStepDownLeft(){
        twdl.MoveDown();
        twdl.MoveLeft();
        jtp.setText(twdl.getText());
    }
    
    public void IncreaseTextSize(){
        twdl.IncreaseSize();
        jtp.setText(twdl.getText());
    }
    
    public void IncreaseTextSizeWide(){
        twdl.IncreaseSizeWide();
        jtp.setText(twdl.getText());
    }
    
    public void IncreaseTextSizeLong(){
        twdl.IncreaseSizeLong();
        jtp.setText(twdl.getText());
    }
    
    public void DecreaseTextSize(){
        twdl.DecreaseSize();
        jtp.setText(twdl.getText());
    }
    
    public void DecreaseTextSizeWide(){
        twdl.DecreaseSizeWide();
        jtp.setText(twdl.getText());
    }
    
    public void DecreaseTextSizeLong(){
        twdl.DecreaseSizeLong();
        jtp.setText(twdl.getText());
    }
    
    
    Timer timer;
    TimerTask task;
    public void Animation(String instruccion, int steps, int delay){
        timer = new Timer();
        String[] parametros = instruccion.split("-");
        String direction = parametros[0];
        String repeticion = parametros[1];
        task = new TimerTask() {
            String d = direction; int i = 0;
            @Override
            public void run() {
                if(i < steps){
                    switch (direction) {
                        case "UP": case "ARRIBA": twdl.MoveUp();break;
                            case "DOWN": case "ABAJO": twdl.MoveDown();break;
                            case "LEFT":case "IZQUIERDA": twdl.MoveLeft();break;
                            case "RIGHT":  case "DERECHA":twdl.MoveRight();break;
                            case "UPRIGHT": case "DIAGONALARDE":twdl.MoveUp();twdl.MoveRight(); break;
                            case "UPLEFT":  case "DIAGONALARIZ":twdl.MoveUp();twdl.MoveLeft(); break;
                            case "DOWNRIGHT": case "DIAGONALABDE":twdl.MoveDown();twdl.MoveRight(); break;
                            case "DOWNLEFT": case "DIAGONALABIZ":twdl.MoveDown();twdl.MoveLeft(); break;
                            case "INCREASE":case "INCREMENTAR":twdl.IncreaseSize(); break;
                            case "DECREASE":case "DISMINUIR":twdl.DecreaseSize();break;
                    }
                    jtp.setText(twdl.getText());
                    if(!"BUCLE".equals(repeticion)){i++;}
                    else{ i = 0;}
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
        timer = new Timer();
        task = new TimerTask() {
            int x = 0;int k;

            @Override
            public boolean cancel() {
                x =  instruction.length;
                k =  steps[x-1];
                return super.cancel(); //To change body of generated methods, choose Tools | Templates.
            }
            
            @Override
            public void run() {
                if(x < instruction.length){
                    for(int i = 0; i < instruction.length; i++){
                    k = 0;
                    while(k < steps[i]){
                        switch (direction[i]) {
                            case "UP": case "ARRIBA": twdl.MoveUp();break;
                            case "DOWN": case "ABAJO": twdl.MoveDown();break;
                            case "LEFT":case "IZQUIERDA": twdl.MoveLeft();break;
                            case "RIGHT":  case "DERECHA":twdl.MoveRight();break;
                            case "UPRIGHT": case "DIAGONALARDE":twdl.MoveUp();twdl.MoveRight(); break;
                            case "UPLEFT":  case "DIAGONALARIZ":twdl.MoveUp();twdl.MoveLeft(); break;
                            case "DOWNRIGHT": case "DIAGONALABDE":twdl.MoveDown();twdl.MoveRight(); break;
                            case "DOWNLEFT": case "DIAGONALABIZ":twdl.MoveDown();twdl.MoveLeft(); break;
                            case "INCREASE":case "INCREMENTAR":twdl.IncreaseSize(); break;
                            case "DECREASE":case "DISMINUIR":twdl.DecreaseSize();break;
                        }
                        jtp.setText(twdl.getText());
                        try {
                            Thread.sleep(delay[i]);
                        }catch(Exception e){}
                        //catch (InterruptedException ex) {
                       //     Logger.getLogger(SwingGraphicsLedScreen.class.getName()).log(Level.SEVERE, null, ex);
                        //}
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
     
    public void StopAnimation(){
        try{
            task.cancel();
            timer.cancel();
        }catch(Exception e){}
    }
}

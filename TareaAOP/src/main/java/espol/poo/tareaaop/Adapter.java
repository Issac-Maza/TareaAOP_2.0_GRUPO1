/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.poo.tareaaop;

/**
 *
 * @author maza-
 */
// Adaptador que actúa como puente
public class Adapter implements MediaPlayer{
    private AdvancedPlayer advancedPlayer;
    
    public Adapter(String fileName){
        if(fileName.endsWith(".mp4")){
            advancedPlayer = new AdvancedPlayer();
        }
    }

    @Override
    public void play(String fileName) {
        if (fileName.endsWith(".mp4")){
            advancedPlayer.playMP4(fileName);
        }
    }
    
}

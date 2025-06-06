/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.poo.tareaaop;

/**
 *
 * @author maza-
 */
interface MediaPlayer{
    void play(String fileName);
}
public class AudioPlayer implements MediaPlayer{

    @Override
    public void play(String fileName) {
        if(fileName.endsWith(".mp3")){
            System.out.println("Reproduciendo archivo MP3: " + fileName);
        }else{
            System.out.println("Formato no soportado");
        }
    }
    
}

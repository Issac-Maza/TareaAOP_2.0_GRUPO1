/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.poo.tareaaop;

/**
 *
 * @author maza-
 */
//Clase que reproduce solamente MP3
public class AudioPlayer implements MediaPlayer{

    @Override
    public void play(String fileName) {
        if(fileName.endsWith(".mp3")){
            System.out.println("Reproduciendo archivo MP3: " + fileName);
        }else{
            Adapter adapter = new Adapter(fileName);
            adapter.play(fileName);
        }
    }
    
}
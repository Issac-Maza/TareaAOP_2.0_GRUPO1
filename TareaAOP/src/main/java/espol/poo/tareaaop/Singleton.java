/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.poo.tareaaop;

/**
 *
 * @author maza-
 */
public class Singleton {
    private static Singleton instancia;
    
    private Singleton(){
        
    }
    
    public static Singleton getInstancia(){
        if(instancia == null){
            instancia = new Singleton();
        }
        return instancia;
    }
    
    public void mostrarMensaje(){
        System.out.println("SOY LA INSTANCIA SINGLETON--SOY UN SINGLETON");
    }
    
}

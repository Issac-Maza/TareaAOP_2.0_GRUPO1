/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */
package SecciónC;

/**
 *
 * @author Juancho
 */
public class SingletonAspect {
    
    private Conexiones instancia;
    
    public Conexiones SingletonAspect.getInstance(){
        if(instancia == null){
            instancia = new Conexiones();
        }
        return instancia;
    
    }
    
    pointcut crearConexion(): call(Conexiones.new());
    
    Object around(): crearConexion(){
        return getInstance();
    
    }
  
}

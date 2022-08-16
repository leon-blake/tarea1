package com.juarez;

/**
 *
 * @author Blake
 */
public class Main {
    public static void main(String[] args) {
        
        
        ManagerArchivos manager = new ManagerArchivos();
        try {
            
            
        manager.leerArchivo();
            
        } catch (Exception e) {
            
            System.out.println("ATENCION  ERROR DE ACCESO  PORFAVOR  EJECUTAR PROGRAMA COMO  ADMINISTRADOR");
        }
        
        
        
        
    }
    
    
}

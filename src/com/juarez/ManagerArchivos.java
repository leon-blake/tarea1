package com.juarez;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Blake
 */

public class ManagerArchivos {

public void leerArchivo(){

    try {
        File archivo = new File("C:/archivo.txt");
        
        Scanner obj = new Scanner(archivo);
        
        while (obj.hasNextLine()){
            System.out.println(obj.nextLine());
        }
    } catch (FileNotFoundException ex) {
        Logger.getLogger(ManagerArchivos.class.getName()).log(Level.SEVERE, null, ex);
    }


}    
    
    
    
    
    
}

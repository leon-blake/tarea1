package com.juarez;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Blake
 */
public class ManagerArchivos {

    public void leerArchivo() {
        String ruta= "C:/archivo.txt";
        File archivo = new File(ruta);
        try {

            Scanner obj = new Scanner(archivo);

            while (obj.hasNextLine()) {
                System.out.println(obj.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("el archivo que buscas no esta disponible");
            if (!archivo.exists()) {
                try {
                    
                    String contenido ="esto es un texto de muestra el archivo que solicitaste no  estaba disponible"
                            + "en estos  momentos";
                    archivo.createNewFile();
                    
                    FileWriter write  = new FileWriter(archivo);
                    BufferedWriter lapis = new BufferedWriter(write);
                    lapis.write(contenido);
                    
                    lapis.close();
                } catch (IOException ex1) {
                    Logger.getLogger(ManagerArchivos.class.getName()).log(Level.SEVERE, null, ex1);
                }
                
                
            }
            
            
        } finally {

            System.out.println("");
        }

    }

}

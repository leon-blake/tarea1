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
        String ruta = "C:/Excepciones.txt";
        File archivo = new File(ruta);
        try {

            Scanner obj = new Scanner(archivo);

            while (obj.hasNextLine()) {
                System.out.println(obj.nextLine());
            }
        } catch (Exception ex) {
            System.out.println("el archivo que buscas no esta disponible");
            System.out.println(ex);

            if (!archivo.exists()) {
                try {

                    String contenido = "mensaje de muestra\n"
                            + "mensaje de muestra\n"
                            + "mensaje de muestra\n"
                            + "mensaje de muestra\n"
                            + "mensaje de muestra\n"
                            + "mensaje de muestra\n";
                    archivo.createNewFile();

                    FileWriter write = new FileWriter(archivo);
                    BufferedWriter lapis = new BufferedWriter(write);
                    lapis.write(contenido);

                    lapis.close();
                } catch (IOException ex1) {
                    Logger.getLogger(ManagerArchivos.class.getName()).log(Level.SEVERE, null, ex1);
                }

            }

        } finally {

            System.out.println("-------opeacion finalizada--------------------");
        }

    }

}

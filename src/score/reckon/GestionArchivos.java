/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package score.reckon;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;

/**
 *
 * @author Ignacio Esparza
 */
public class GestionArchivos {
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;

    public GestionArchivos() {
    }
    
    // leer archivo de txt
    public String abrir(File archivo){
        String contenido="";
        try {
            entrada = new FileInputStream(archivo);
            int cont;
            while((cont = entrada.read()) != -1){
                char caracter = (char)cont;
                contenido += caracter; 
            }
        } catch (Exception e) {
        }
        return contenido;
    }
    
    //guardar archivo txt
    public String guardar(File archivo, String contenido){
        String respuesta ="Error al Guardar";
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytetxt = contenido.getBytes();
            salida.write(bytetxt);
            respuesta = "Se guardó con éxito el archivo";
        } catch (Exception e) {
        }
        return respuesta;
    }
}


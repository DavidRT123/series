/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.*;

/**
 *
 * @author mdfda
 */
public class Acceso {
    
    private static File f = new File("series.dat");
    
    public static void guardadrLS(ListShow ls){
        try{
            //Se le pasa un fichero donde se pueda sacar la info
            FileOutputStream fOS = new FileOutputStream(f);
            ObjectOutputStream oOS = new ObjectOutputStream(fOS);
            oOS.writeObject(ls);
        }catch(IOException ex){
            System.err.println("Fallo al guardar el fichero");
        }
    }
    
    public static ListShow cargarLS(){
        ListShow l = new ListShow();
        ObjectInputStream oIS = null;
        try{
            FileInputStream fIS = new FileInputStream(f);
            oIS = new ObjectInputStream(fIS);
            l = (ListShow) oIS.readObject();
            oIS.close();
        }catch(IOException ex){
            System.err.println("Fallo al cargar fichero");
        }finally{
            return l;
        }
    }
}

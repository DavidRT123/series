/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series;

import controlador.Controlador;
import java.util.Iterator;
import modelo.*;
import vista.Frame;

/**
 *
 * @author mdfda
 */
public class Series {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        
        //Crear fichero inicial
        
        /*
        Show s1 = new Show("Breaking Bad", "Vince Guilligan", "Drama", 5, 5);
        Show s2 = new Show("MR. ROBOT", "Sam Smail", "Suspense", 3, 3);
        Show s3 = new Show("Los soprano", "David Chase", "Mafia", 6, 6);
        Show s4 = new Show("Stranger Things", "Duffer Brothers", "Aventura", 3, 3);
        Show s5 = new Show("Boardwalk Empire", "Terence Winter", "Mafia", 5, 5);
        Show s6 = new Show("Peaky Blinders", "Steven Knight", "Mafia", 4, 4);
        Show s7 = new Show("Gravity Falls", "Alex Hirsch", "Aventura", 2, 2);
        
        ListShow lista = new ListShow();
        
        lista.setShow(s1);
        lista.setShow(s2);
        lista.setShow(s3);
        lista.setShow(s4);
        lista.setShow(s5);
        lista.setShow(s6);
        lista.setShow(s7);
        
        Acceso.guardadrLS(lista);
        */
        
        //Recuperar fichero y mostrar
        
        //Show s = null;
        //ListShow l = Acceso.cargarLS();
        
        //En caso de querer hacerlo con iterator y getSeriesList()
        
        /*
        Iterator iL = l.getSeriesList().iterator();
        
        while(iL.hasNext()){
            s = (Show) iL.next();
            System.out.println("*******************************");
            System.out.println("Título: " + s.getTitle());
            System.out.println("Guionista: " + s.getScripWriter());
            System.out.println("Género: " + s.getGenre());
            System.out.println("Temporadas: " + s.getSeasons());
            System.out.println("Vistas: " + s.getViews());
            System.out.println("*******************************");
        }
        */
  
        //En caso de querer hacerlo con el método getShow()
        /*
        int i = 0;
        
        for(; i < l.longitud() ; i++){
            s = l.getShow(i);
            System.out.println("*******************************");
            System.out.println("Título: " + s.getTitle());
            System.out.println("Guionista: " + s.getScripWriter());
            System.out.println("Género: " + s.getGenre());
            System.out.println("Temporadas: " + s.getSeasons());
            System.out.println("Vistas: " + s.getViews());
            System.out.println("*******************************");
        }
        */
        Controlador c = new Controlador();
        Frame f = new Frame(c);
        f.setVisible(true);
    }
    
}

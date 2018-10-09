/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Acceso;
import modelo.ListShow;
import modelo.Show;

/**
 *
 * @author mdfda
 */
public class Controlador {
    private int posicion;
    private ListShow ls;
    
    public Controlador(){
        posicion = 0;
        ls = new ListShow();
        ls = Acceso.cargarLS();
    }
    
    public Show primero(){
        posicion  = 0;
        return ls.getSeriesList().get(posicion);
    }
    
    public Show anterior(){
        if (posicion > 0) {
            posicion--;
        }
        return ls.getSeriesList().get(posicion);
    }
    
    public Show siguiente(){
        if (posicion < ls.getSeriesList().size() - 1) {
            posicion++;
        }
        return ls.getSeriesList().get(posicion);
    }
    
    public Show ultimo(){
        posicion = ls.getSeriesList().size() - 1;
        return ls.getSeriesList().get(posicion);
    }
    
    public void nuevo(Show s){
        ls.setShow(s);
        posicion = ls.longitud() - 1;
        Acceso.guardadrLS(ls);
    }
    
    public Show borrar(){
        ls.getSeriesList().remove(posicion);
        Acceso.guardadrLS(ls);
        return primero();
    }
    
    public void actualizar(Show s){
        ls.getSeriesList().set(posicion, s);
        Acceso.guardadrLS(ls);
    }
}

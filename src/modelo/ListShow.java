/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mdfda
 */
public class ListShow implements Serializable{
    private ArrayList<Show> seriesList;
    
    public ListShow(){
        seriesList = new ArrayList<>();
    }

    public Show getShow(int p){
        return seriesList.get(p);
    }
    
    public void setShow(Show s){
        seriesList.add(s);
    }

    public ArrayList<Show> getSeriesList() {
        return seriesList;
    }

    public void setSeriesList(ArrayList<Show> seriesList) {
        this.seriesList = seriesList;
    }
    
    public int longitud(){
        return seriesList.size();
    }
}

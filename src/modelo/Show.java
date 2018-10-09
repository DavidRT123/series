/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author mdfda
 */
public class Show implements Serializable{
    private String title, scripWriter, genre;
    private int seasons, views;

    public Show() {
        this.title = "";
        this.scripWriter = "";
        this.genre = "";
        this.seasons = 0;
        this.views = 0;
    }
    
    public Show(String title, String scripWriter, String genre, int seasons, int views) {
        this.title = title;
        this.scripWriter = scripWriter;
        this.genre = genre;
        this.seasons = seasons;
        this.views = views;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getScripWriter() {
        return scripWriter;
    }

    public void setScripWriter(String scripWriter) {
        this.scripWriter = scripWriter;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}

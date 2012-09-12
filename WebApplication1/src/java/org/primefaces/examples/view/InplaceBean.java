/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.examples.view;

import java.util.HashMap;  
import java.util.List;
import java.util.Map;  
import javax.faces.bean.ManagedBean;

@ManagedBean
public class InplaceBean {  
  
    private String text = "PrimeFaces";  
  
    public String getText() {  
        return text;  
    }  
  
    public void setText(String text) {  
        this.text = text;  
    }  
    
     private List<String> selectedMovies;  
  
    private Map<String,String> movies;  
  
    public InplaceBean() {  
        movies = new HashMap<String, String>();  
        movies.put("Scarface", "Scarface");  
        movies.put("Goodfellas", "Goodfellas");  
        movies.put("Godfather", "Godfather");  
        movies.put("Carlito's Way", "Carlito's Way");  
    }  
  
    public List<String> getSelectedMovies() {  
        return selectedMovies;  
    }  
    public void setSelectedMovies(List<String> selectedMovies) {  
        this.selectedMovies = selectedMovies;  
    }  
  
    public Map<String, String> getMovies() {  
        return movies;  
    }  
}  
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.examples.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;

import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import org.primefaces.event.RowEditEvent;

@ManagedBean
public class ContasBancarias implements Serializable {

    private final static String[] colors;
    private final static String[] manufacturers;
    private List<Cliente> carsSmall;
    private SelectItem[] manufacturerOptions;
    private List<Cliente> filteredCars;
    private Date date3; 
    private Map<String,String> movies; 
    private List<String> selectedMovies;
    
    
    public ContasBancarias(){
          carsSmall = new ArrayList<Cliente>();
        populateRandomCars(carsSmall, 15);
        manufacturerOptions = createFilterOptions(manufacturers);
         movies = new HashMap<String, String>();  
        movies.put("Vencidas", "Vencidas");  
        movies.put("À Vencer", "À Vencer");  
        movies.put("Em Aberto", "Em Aberto");  
        movies.put("Pagas", "Pagas");  
        movies.put("Todas", "Todas");  
    }
    
    static {
        colors = new String[10];
        colors[0] = "Black";
        colors[1] = "White";
        colors[2] = "Green";
        colors[3] = "Red";
        colors[4] = "Blue";
        colors[5] = "Orange";
        colors[6] = "Silver";
        colors[7] = "Yellow";
        colors[8] = "Brown";
        colors[9] = "Maroon";

        manufacturers = new String[10];
        manufacturers[0] = "Mercedes";
        manufacturers[1] = "BMW";
        manufacturers[2] = "Volvo";
        manufacturers[3] = "Audi";
        manufacturers[4] = "Renault";
        manufacturers[5] = "Opel";
        manufacturers[6] = "Volkswagen";
        manufacturers[7] = "Chrysler";
        manufacturers[8] = "Ferrari";
        manufacturers[9] = "Ford";
    }

    public List<Cliente> getFilteredCars() {
        return filteredCars;
    }

    public void setFilteredCars(List<Cliente> filteredCars) {
        this.filteredCars = filteredCars;
    }
public List<String> complete(String query) {  
        List<String> results = new ArrayList<String>();  
          
        for(int i = 0; i < 10; i++) {  
            results.add(query + i);  
        }  
          
        return results;  
    }  
      
  
    private void populateRandomCars(List<Cliente> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(new Cliente(getRandomModel(), getRandomYear(), getRandomManufacturer(), getRandomColor()));
        }
    }

    public List<Cliente> getCarsSmall() {
        return carsSmall;
    }

    private int getRandomYear() {
        return (int) (Math.random() * 50 + 1960);
    }

    private String getRandomColor() {
        return colors[(int) (Math.random() * 10)];
    }

    private SelectItem[] createFilterOptions(String[] data) {
        SelectItem[] options = new SelectItem[data.length + 1];

        options[0] = new SelectItem("", "Todos");
        for (int i = 0; i < data.length; i++) {
            options[i + 1] = new SelectItem(data[i], data[i]);
        }

        return options;
    }

    private String getRandomManufacturer() {
        return manufacturers[(int) (Math.random() * 10)];
    }

    private String getRandomModel() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

    public String[] getManufacturers() {
        return manufacturers;
    }

    public String[] getColors() {
        return colors;
    }

    public void onEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Cliente Edited", ((Cliente) event.getObject()).getModel());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Cliente Cancelled", ((Cliente) event.getObject()).getModel());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    /**
     * @return the manufacturerOptions
     */
    public SelectItem[] getManufacturerOptions() {
        return manufacturerOptions;
    }

    /**
     * @param manufacturerOptions the manufacturerOptions to set
     */
    public void setManufacturerOptions(SelectItem[] manufacturerOptions) {
        this.manufacturerOptions = manufacturerOptions;
    }

    /**
     * @return the date3
     */
    public Date getDate3() {
        return date3;
    }

    /**
     * @param date3 the date3 to set
     */
    public void setDate3(Date date3) {
        this.date3 = date3;
    }

    /**
     * @return the movies
     */
    public Map<String,String> getMovies() {
        return movies;
    }

    /**
     * @param movies the movies to set
     */
    public void setMovies(Map<String,String> movies) {
        this.movies = movies;
    }

    /**
     * @return the selectedMovies
     */
    public List<String> getSelectedMovies() {
        return selectedMovies;
    }

    /**
     * @param selectedMovies the selectedMovies to set
     */
    public void setSelectedMovies(List<String> selectedMovies) {
        this.selectedMovies = selectedMovies;
    }
}

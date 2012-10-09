package org.primefaces.examples.view;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ManagedBean;


@ManagedBean
public class TabelaClientes {

    private final static String[] colors;
    private final static String[] manufacturers;
    private Cliente[] selectedCars;
    private List<Cliente> carsSmall;
    private List<Cliente> filteredCars;

    static {
        colors = new String[10];
        colors[0] = "Denis";
        colors[1] = "Tiago";
        colors[2] = "Juliana";
        colors[3] = "Carlos";
        colors[4] = "Alberto";
        colors[5] = "Pedro";
        colors[6] = "Silver";
        colors[7] = "Joao";
        colors[8] = "Brown";
        colors[9] = "Maron";

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

    public TabelaClientes() {
        carsSmall = new ArrayList<Cliente>();
        populateRandomCars(carsSmall, 50);
    }

    private void populateRandomCars(List<Cliente> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(new Cliente(getRandomModel(), getRandomYear(), getRandomManufacturer(), getRandomColor()));
        }
    }

    private int getRandomYear() {
        return (int) (Math.random() * 50 + 1960);
    }

    private String getRandomColor() {
        return colors[(int) (Math.random() * 10)];
    }

    private String getRandomManufacturer() {
        return manufacturers[(int) (Math.random() * 10)];
    }

    private String getRandomModel() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

   
    public List<Cliente> getCarsSmall() {
        return this.carsSmall;
    }

    /**
     * @return the selectedCars
     */
    public Cliente[] getSelectedCars() {
        return selectedCars;
    }

    /**
     * @param selectedCars the selectedCars to set
     */
    public void setSelectedCars(Cliente[] selectedCars) {
        this.selectedCars = selectedCars;
    }
    
    
    public List<Cliente> getFilteredCars() {  
        return filteredCars;  
    }  
  
    public void setFilteredCars(List<Cliente> filteredCars) {  
        this.filteredCars = filteredCars;  
    }  
}

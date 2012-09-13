/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.examples.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author dmoreira
 */
@ManagedBean(name="menu")
@SessionScoped
public class Menu {
    
    private String activeIndex = "1";
    
    
    public String forwardTelaPrincipal(){
        activeIndex = "0";
        return "telaPrincipal";
    }

    public String forwardNoticias(){
        activeIndex = "1";
        return "noticias";
    }
     public String forwardCadastros(){
        activeIndex = "2";
        return "cadastros";
    }
    /**
     * @return the activeIndex
     */
    public String getActiveIndex() {
        return activeIndex;
    }

    /**
     * @param activeIndex the activeIndex to set
     */
    public void setActiveIndex(String activeIndex) {
        this.activeIndex = activeIndex;
    }
}

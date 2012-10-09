/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.examples.view;


import javax.faces.bean.ManagedBean;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

@ManagedBean
public class DashboardCadastro  {  
    
    private DashboardModel model;  
      
    public DashboardCadastro() {  
        model = new DefaultDashboardModel();  
        DashboardColumn column1 = new DefaultDashboardColumn();  
          
        column1.addWidget("cadastros");  
  
        model.addColumn(column1);  
    } 
    
    public String forwardClientes(){
        return "clientes";
    }

    public DashboardModel getModel() {  
        return model;  
    }  
}  
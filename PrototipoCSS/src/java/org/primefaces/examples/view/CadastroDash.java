/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.examples.view;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.DashboardReorderEvent;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

@ManagedBean
public class CadastroDash implements Serializable {  
    private DashboardModel model;  
      
    public CadastroDash() {  
        model = new DefaultDashboardModel();  
        DashboardColumn column1 = new DefaultDashboardColumn();  
          
        column1.addWidget("cadastros");  

  
        model.addColumn(column1);  
    }  
    public String forwardClientes(){
        return "clientes";
    }
      
//    public void handleReorder(DashboardReorderEvent event) {  
//        FacesMessage message = new FacesMessage();  
//        message.setSeverity(FacesMessage.SEVERITY_INFO);  
//        message.setSummary("Reordered: " + event.getWidgetId());  
//        message.setDetail("Item index: " + event.getItemIndex() + ", Column index: " + event.getColumnIndex() + ", Sender index: " + event.getSenderColumnIndex());  
//          
//        addMessage(message);  
//    }  
      
      
//    private void addMessage(FacesMessage message) {  
//        FacesContext.getCurrentInstance().addMessage(null, message);  
//    }  
      
    public DashboardModel getModel() {  
        return model;  
    }  
}  
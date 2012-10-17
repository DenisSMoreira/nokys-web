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
public class DashboardFinanceiro  {  
    
    private DashboardModel model;  
      
    public DashboardFinanceiro() {  
        model = new DefaultDashboardModel();  
        DashboardColumn column1 = new DefaultDashboardColumn();  
          
        column1.addWidget("financeiro");  
  
        model.addColumn(column1);  
    } 
    
    public String forwardClientes(){
        return "contasBancarias";
    }
    public String forwardCustos(){
        return "custos";
    }
   public String forwardContasPagar(){
        return "contasPagar";
    }
            public String forwardContasReceber(){
        return "contasReceber";
    }
    public DashboardModel getModel() {  
        return model;  
    }  
}  
package org.primefaces.examples.view;

import java.io.Serializable;  
import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.LineChartSeries;  
  
@ManagedBean
public class GraficoVenda implements Serializable {  
  
 
  
    private CartesianChartModel linearModel;  
  
    public GraficoVenda() {  
              createLinearModel();  
    }  
  
   
    public CartesianChartModel getLinearModel() {  
        return linearModel;  
    }  
  
 
  
    private void createLinearModel() {  
        linearModel = new CartesianChartModel();  
  
        LineChartSeries series1 = new LineChartSeries();  
        series1.setLabel("Filial 1");  
  
        series1.set("Janeiro", 120);  
        series1.set("Feveiro", 100);  
        series1.set("Março", 44);  
        series1.set("Maio", 150);  
        series1.set("Junho", 25);  
  
        LineChartSeries series2 = new LineChartSeries();  
        series2.setLabel("Filial 2");  
        series2.setMarkerStyle("diamond");  
  
        series2.set("Janeiro", 52);  
        series2.set("Feveiro", 60);  
        series2.set("Março", 110);  
        series2.set("Maio", 135);  
        series2.set("Junho", 120);  
  
        linearModel.addSeries(series1);  
        linearModel.addSeries(series2);  
    }  
}  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leyeseyi
 */
public class GratuityTotal {
    
    //Variable declaration
    private double subTotal;
    private double gratuityRate;
    private double gratuity;
    
    //Accessor method

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getGratuityRate() {
        return gratuityRate;
    }

    public void setGratuityRate(double gratuityRate) {
        this.gratuityRate = gratuityRate;
    }
    
    
    //Calculate Gratuity
    public void computeGratuity(){
                
        gratuity = (gratuityRate / 100) * subTotal;
        System.out.println("Gratuity: $" +gratuity);
    }
    
    //Calculate gratuiy
    public void computeTotal(){
        
        double total;
        
        total = gratuity + subTotal;
        
        System.out.println("Total: $" +total);
        
    }
    public static void main(String [] args){
        GratuityTotal gt = new GratuityTotal();
        
        //assign values
        gt.setGratuityRate(15.0);
        gt.setSubTotal(10);
        
        //compute values
        gt.computeGratuity();
        gt.computeTotal();
    }
            
            
}

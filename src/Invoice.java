/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leyeseyi
 */

public class Invoice {
    
    //Variable declaration
    private String part_number;
    private String part_description;
    private int quantity;
    private double price;
    
    
    //Constructor
    public Invoice(String part_number, String part_description, int quantity, double price) {
        this.part_number = part_number;
        this.part_description = part_description;
        this.quantity = quantity;
        this.price = price;
    }
    
    //Set and Get method of each instance variable
    public String getPart_number() {
        return part_number;
    }

    public void setPart_number(String part_number) {
        this.part_number = part_number;
    }

    public String getPart_description() {
        return part_description;
    }

    public void setPart_description(String part_description) {
        this.part_description = part_description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    //method get invoiceAmount
    public double getInvoiceAmount(){
        double amount;
        amount = getQuantity() * getPrice();
        return amount;
    }
    public static void main (String [] args){
        Invoice testing = new Invoice("Buscuit", "33aabb", 10, 1500);
        System.out.println("----Invoice-----");
        System.out.println("Part Description: " +testing.part_description);
        System.out.println("Part Number: "+testing.part_number);
        System.out.println("Price: " +testing.price);
        System.out.println("Quantity: " +testing.quantity);
        System.out.println("Total Invoice Amount: " +testing.getInvoiceAmount());
    }
    
}

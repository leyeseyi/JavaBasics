/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    import java.util.Scanner;
/**
 *
 * @author Leyeseyi
 */
public class HeartRates {
    
    //variable declaration
    private String fname;
    private String lname;
    private Date dateOfBirth;
    
    //constructor
    
    public HeartRates(String fname, String lname, Date dateOfBirth) {
        this.fname = fname;
        this.lname = lname;
        this.dateOfBirth = dateOfBirth;
    }
    
    //setter

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    //getter

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    
    //calculate age
    public int calculateAge(){
    
        return 2018 - dateOfBirth.getYear();
    
    }
    //Maximum Heart Rate
    public int maxHeartRate(){
        return 220 - calculateAge();
    }
    //Target heart rate for 50%
    public double targetHeartRate50(){
        
        return 0.5 * maxHeartRate();
    }
    //Target heart rate for 85%
    public double targetHeartRate85(){
        
        return 0.85 * maxHeartRate();
    }
    
    public static void main(String [] args){
        
        Scanner input = new Scanner (System.in);
        //collect details
        System.out.println("Enter First Name:");
        String fname = input.nextLine();
        System.out.println("Enter Last Name:");
        String lname = input.nextLine();
        System.out.println("Enter Day:");
        int day = input.nextInt();
        System.out.println("Enter Month:");
        int month = input.nextInt();
        System.out.println("Enter Year Of Birth:");
        int year = input.nextInt();
       
        //Create an instance/object of Date class in source program
       Date dob = new Date(day,month,year);
       
       HeartRates rate = new HeartRates(fname, lname, dob);
       System.out.println("Name: " +rate.fname+ " " +rate.lname); 
       System.out.println("Age: "+rate.calculateAge());
       
       //display Maximum heartbeat
        System.out.println("Maximum Heartbeat: " +rate.maxHeartRate()+ "bpm");
        
        //display range
        System.out.println(rate.targetHeartRate50() + " - " + rate.targetHeartRate85());
        
    }
}

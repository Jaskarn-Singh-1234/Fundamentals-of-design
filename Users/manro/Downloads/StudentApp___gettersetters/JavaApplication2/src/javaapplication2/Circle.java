/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author manro
 */
public class Circle {
    private double radius;// valid radius must be >0
    private String color;
    // Constructors
    public Circle(){
        this.radius= 1.0;
        this.color="blue";
    }
    public Circle(double radius, String color){
        setRadius(radius);
        setColor(color);
    }
    //getter and setters
    
    public void setRadius(double radius){
      if(radius>0)
          this.radius= radius;
        else
            System.out.println(radius +" is invalid");
    }
    public double getRadius(){
        return radius;
    
    }
     public void setColor(String color){
         this.color= color;
      
    }
    public String getColor(){
        return color;    
    }   
    
   
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public String toString(){
        String st = "The radius of the circle is " +radius+ "\n";
        st+="The color is " + color +"\n";
        st=st+"The area of the circle is " + getArea();
        return st;
    }
    
    
}

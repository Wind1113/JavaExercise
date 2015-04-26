/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author Administrator
 */
public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    public Triangle( String color , double a , double b , double c ){
        super(color);
        this.setSides(a , b , c);
    }
    public void setSides( double a , double b , double c ){
        if ( a >= b + c || b >= a + c || c >= a + b ){
            System.out.println("error");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public double calPerimeter(){
        return a + b + c;
    }
    @Override
    public String getType(){
        System.out.println("This is a Triangle");
        return "Tringle";
    }
}

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
public abstract class Shape {
    {
        System.out.println("执行Shape的初始化....");
    }
    private String color;
    public abstract double calPerimeter();
    public abstract String getType();
    public Shape(){}
    public Shape( String color ){
        System.out.println("执行Shape的构造器");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}

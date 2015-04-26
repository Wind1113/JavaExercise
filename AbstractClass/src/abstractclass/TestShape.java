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
public class TestShape {
    private static Shape triangle = new Triangle( "red" , 7 , 5 ,3  );
    public static void main( String[] args ){
        triangle.getType();
        triangle.getColor();
        double c = triangle.calPerimeter();
        System.out.println( triangle.calPerimeter() );
    }
}

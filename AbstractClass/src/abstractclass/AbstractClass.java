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
public abstract class AbstractClass {
    public void dog(){
        System.out.println("This is dog method");
    }
//    public static void main(String[] args){
//        AbstractClass dog = new AbstractClass();
//        dog.dog();
//    }
    public abstract void cat();
    public abstract void lion();
}

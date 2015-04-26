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
public class TestAbstract extends AbstractClass{
    @Override
    public void cat(){
        System.out.println("this is cat");
    }
    @Override
    public void lion(){
        System.out.println("this is lion");
    }
    public static void main(String[] args){
        TestAbstract test = new TestAbstract();
        test.dog();
        test.cat();
        test.lion();
    }
    
}

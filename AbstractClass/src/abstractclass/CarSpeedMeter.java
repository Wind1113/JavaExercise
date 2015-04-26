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
public class CarSpeedMeter extends SpeedMeter{
    public double getRadius(){
        return 0.28;
    }
    public static void main( String[] args ){
        CarSpeedMeter csm = new CarSpeedMeter();
        csm.setTurnRate( 15 );
        System.out.println( csm.getSpeed() );
    }
}

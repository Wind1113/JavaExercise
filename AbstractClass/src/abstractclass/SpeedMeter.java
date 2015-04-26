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
public abstract class SpeedMeter {
    private double turnRate;
    public abstract double getRadius();
    public void setTurnRate( double turnRate ){
        this.turnRate = turnRate;
    }
    public double getSpeed(){
        return java.lang.Math.PI * 2 * getRadius() * turnRate;
    }
}

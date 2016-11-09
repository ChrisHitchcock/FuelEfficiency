/*
 * Name:        Chris Hitchcock
 * Date:        November 1, 2016
 * Filename:    HybridCar.java
 * Version:     1.2
 * Description: This program creates a HybridCar object; inheriting from the 
 *              Vehicle class it has a getDistance method with a calculation 
 *              specific to HybridCars.
 */

package fuelefficiency;

/**
 * This program creates a HybridCar object; inheriting from the Vehicle class
 * it has a getDistance method with a calculation specific to HybridCars.
 * @author chhit5249
 */
public class HybridCar extends Vehicle {
    //Variable declaration
    private double dist;
    
    /**
     * Finds the distance the HybridCar can travel with the given # of litres.
     * @param l Number of litres.
     * @return distance that can be travelled.
     */    
    public double getDistance(double l)
    {
        //Calculate, round and return
        dist = l/0.038;
        dist = dist*100;
        dist = Math.round(dist);   
        dist = dist/100;
        return dist;
    }
}

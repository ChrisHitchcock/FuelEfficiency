/*
 * Name:        Chris Hitchcock
 * Date:        November 1, 2016
 * Filename:    Motorcycle.java
 * Version:     1.1
 * Description: This program creates a Motorcycle object; inheriting from the 
 *              Vehicle class it has a getDistance method with a calculation 
 *              specific to Motorcycles.
 */

package fuelefficiency;

/**
 * This program creates a Motorcycle object; inheriting from the Vehicle class
 * it has a getDistance method with a calculation specific to Motorcycles.
 * @author chhit5249
 */
public class Motorcycle extends Vehicle {
    //Variable declaration
    private double dist;
    
    /**
     * Finds the distance the Motorcycle can travel with the given # of litres.
     * @param l Number of litres.
     * @return distance that can be travelled.
     */    
    public double getDistance(double l)
    {
        //Calculate, round and return
        dist = l/0.063;
        dist = dist*100;
        dist = Math.round(dist);
        dist = dist/100;
        return dist;
    }
}

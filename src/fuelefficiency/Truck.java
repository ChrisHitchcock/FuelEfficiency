/*
 * Name:        Chris Hitchcock
 * Date:        November 1, 2016
 * Filename:    Truck.java
 * Version:     1.2
 * Description: This program creates a Truck object; inheriting from the 
 *              Vehicle class it has a getDistance method with a calculation 
 *              specific to Trucks.
 */

package fuelefficiency;

/**
 * This program creates a Truck object; inheriting from the Vehicle class
 * it has a getDistance method with a calculation specific to Trucks.
 * @author chhit5249
 */
public class Truck extends Vehicle {
    //Variable declaration
    private double dist;
    
    /**
     * Finds the distance the Truck can travel with the given # of litres.
     * @param l Number of litres.
     * @return distance that can be travelled.
     */
    public double getDistance(double l)
    {
        //Calculate, round and return
        dist = l/0.141;
        dist = dist*100;
        dist = Math.round(dist);   
        dist = dist/100;
        return dist;
    }
}

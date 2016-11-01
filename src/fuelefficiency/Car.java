/*
 * Name:        Chris Hitchcock
 * Date:        November 1, 2016
 * Filename:    Car.java
 * Version:     1.1
 * Description: This program creates a Car object; inheriting from the 
 *              Vehicle class it has a getDistance method with a calculation 
 *              specific to Cars.
 */

package fuelefficiency;

/**
 * This program creates a Car object; inheriting from the Vehicle class
 * it has a getDistance method with a calculation specific to Cars.
 * @author chhit5249
 */
public class Car extends Vehicle {
    //Variable declaration
    private double dist;

    /**
     * Finds the distance the Car can travel with the given # of litres.
     * @param l Number of litres.
     * @return distance that can be travelled.
     */
    public double getDistance(double l)
    {
        //Calculate, round and return
        dist = l/0.094;
        dist = dist*100;
        dist = Math.round(dist);   
        return dist;
    }
}

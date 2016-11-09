/*
 * Name:        Chris Hitchcock
 * Date:        November 1, 2016
 * Filename:    Vehicle.java
 * Version:     1.2
 * Description: This is the abstract Vehicle superclass, which creates a default 
 *              vehicle and has an abstract method for displaying distance.
 */

package fuelefficiency;

/**
 * This is the abstract Vehicle superclass, which creates a default vehicle and 
 * has an abstract method for displaying distance.
 * @author chhit5249
 */
public abstract class Vehicle {
    /**
     * This method finds out the distance each type of vehicle can drive in 
     * the inputted amount of litres.
     * @param l Amount of litres
     * @return dist - distance the vehicle can travel in l litres.
     */
    public abstract double getDistance(double l);
}

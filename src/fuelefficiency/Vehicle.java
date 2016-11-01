/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

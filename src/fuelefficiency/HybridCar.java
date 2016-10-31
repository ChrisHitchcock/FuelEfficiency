/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

/**
 * This program creates a HybridCar object; inheriting from the Vehicle class
 * it has a getDistance method with a calculation specific to HybridCars.
 * @author chhit5249
 */
public class HybridCar extends Vehicle {
    private double dist;
    
    /**
     * This creates the HybridCar.
     */
    public HybridCar()
    {
        super();
    }
    
    /**
     * Finds the distance the HybridCar can travel with the given # of litres.
     * @param l Number of litres.
     * @return distance that can be travelled.
     */    
    public double getDistance(double l)
    {
        dist = l/0.038;
        return dist;
    }
}

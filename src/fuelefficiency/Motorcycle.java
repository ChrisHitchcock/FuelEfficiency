/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        return dist;
    }
}

/*
 * Name:        Chris Hitchcock
 * Date:        November 1, 2016
 * Filename:    FuelEfficiency.java
 * Version:     1.2
 * Description: This program creates vehicles using the respective classes, and
 *              displays the distance they can drive with an inputted amount
 *              of fuel. It was made to test Polymorphism.
 */

package fuelefficiency;
import java.util.*;
/**
 * This program tests the Vehicle class and those that inherit it.
 * @author chhit5249
 */
public class FuelEfficiency {

    /**
     * Everything happens here.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable/object declaration
        Truck test = new Truck();
        Car test2 = new Car();
        HybridCar test3 = new HybridCar();
        Motorcycle test4 = new Motorcycle();
        double litres;
        Scanner kb = new Scanner(System.in);
        
        //Prompt for amount of litres
        System.out.println("How many litres of gas in the car?");
        litres = kb.nextDouble();
        
        //Output the distances for each vehicle
        System.out.println("On "+litres+"L of gas, the vehicles can drive:");
        System.out.println("Truck = "+test.getDistance(litres)+"km");
        System.out.println("Car = "+test2.getDistance(litres)+"km");
        System.out.println("Hybrid Car = "+test3.getDistance(litres)+"km");
        System.out.println("Motorcycle = "+test4.getDistance(litres)+"km");
    }
    
}

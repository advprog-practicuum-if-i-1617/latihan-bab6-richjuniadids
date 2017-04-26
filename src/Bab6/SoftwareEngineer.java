/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab6;

/**
 *
 * @author richjuniadi
 */
public class SoftwareEngineer extends Employee {
    private double tunjangan = 5500000;
    public SoftwareEngineer(String name, int length){
        super(name, length);
    }
    @Override
    public double getBonus(){
        return (bonus/2)+300000;
    }
    @Override
    public double getGaji(){
        return gajiPokok+getBonus()+tunjangan;  
    }
    
}

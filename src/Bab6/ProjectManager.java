/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab6;

/**
 *
 * @author richjuniadi
 */
public class ProjectManager extends Employee {
    private double tunjangan = 6000000;
    public ProjectManager(String nama, int lamaKerja) {
        super(nama, lamaKerja);
    }
    @Override
    public double getBonus(){
        if(lamaKerja>=120){
            return ((bonus/2)+450000+700000);   
        }else{
            return ((bonus/2)+450000+(350000/2));
        }
    }
    @Override
    public double getGaji(){
        return (gajiPokok)+getBonus()+tunjangan;  
    }
    
}

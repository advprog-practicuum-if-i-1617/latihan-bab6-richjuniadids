/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab6;

/**
 *
 * @author richjuniadi
 */
public class Employee {
    public String nama;
    public int lamaKerja;
    public double gajiPokok= 2500000;
    public double bonus=500000;
    public Employee(String nama, int lamaKerja){
        this.nama=nama;
        this.lamaKerja=lamaKerja*12;
    }
    public String getNama(){
        return nama;
    }
    public int getLamaKerja(){
        return lamaKerja/12;
    }
    public double getBonus(){
        if (lamaKerja>=60){
            return bonus/2;
        }else{
            return 0;
        }
    }
    public double getGaji(){
        return gajiPokok+getBonus();
    }
    
}

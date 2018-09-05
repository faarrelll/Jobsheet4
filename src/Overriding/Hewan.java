/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author ASUS
 */
public class Hewan {
    public void setNama(){
        String hewan = "Tidak Bernama";
        System.out.println("Nama Hewan : "+hewan);
                
    }
    public void setSuara(){
        String suara ="Tidak Bersuara";
        System.out.println("Suara Hewan : "+suara);
    } 
    public void setBerat(){
        double berat = 0.0;
        System.out.println("Berat Hewan : "+berat+"Kg");
    }
}

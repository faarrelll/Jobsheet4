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
public class Kucing extends Hewan{
    @Override
    public void setNama(){
        String kucing = "Caberius";
        System.out.println("Nama Kucing : "+kucing);
    }
    @Override
    public void setSuara(){
        String suara = "jancok";
        System.out.println("Suara kucing : "+suara);
    }
    @Override
    public void setBerat(){
        double berat = 2.0;
        System.out.println("Berat Kucing : "+berat);
        
    }
}

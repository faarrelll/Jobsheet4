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
public class Singa extends Hewan{
     @Override
    public void setNama(){
        String singa = "Diablo";
        System.out.println("Nama Singa : "+singa);
    }
    @Override
    public void setSuara(){
        String suara = "Roaarrrrr";
        System.out.println("Suara Singa : "+suara);
    }
    @Override
    public void setBerat(){
        double berat = 10.0;
        System.out.println("Berat Singa : "+berat);
        
    }
}
